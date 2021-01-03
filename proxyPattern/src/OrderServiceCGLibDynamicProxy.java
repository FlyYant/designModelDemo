/**
 * CGLib动态代理
 * JDK实现动态代理需要实现类通过接口定义业务方法，对于没有接口的类，如何实现动态代理呢，
 * 这就需要CGLib了。CGLib采用了非常底层的字节码技术，其原理是通过字节码技术为一个类创建子类，
 * 并在子类中采用方法拦截的技术拦截所有父类方法的调用，顺势织入横切逻辑。但因为采用的是继承，
 * 所以不能对final修饰的类进行代理。JDK动态代理与CGLib动态代理均是实现Spring AOP的基础
 */
public class OrderServiceCGLibDynamicProxy implements MethodInterceptor{
    public OrderServiceImpl bind(){

        Enhancer enhancer = new Enhancer();//生成代理对象
        enhancer.setSuperclass(OrderServiceImpl.class);//设置对谁进行代理
        enhancer.setCallback(this);//代理要做什么
        OrderServiceImpl orderService = (OrderServiceImpl) enhancer.create();//创建代理对象

        return orderService;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        beforeMethod(objects[0]);
        Object object = methodProxy.invokeSuper(o,objects);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object object){
        System.out.println("CGLib动态代理 before code");
        if(object instanceof Order){
            Order order = (Order)object;
            int userId = order.getUserId();
            int dbRouter = userId % 2;
            System.out.println("CGLib动态代理分配到 【db"+dbRouter+"】处理数据");
            //TODO 分库操作
        }
        //TODO 其他类型处理
    }

    private void afterMethod(){
        System.out.println("CGLib动态代理 after code");
    }
}
