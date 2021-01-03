import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * OrderServiceDynamicProxy类（Service层的JDK动态代理类）
 * 从静态代理中可以发现，每个代理类只能为一个接口服务，这样程序开发中必然会产生许多的代理类。所以我们想办法通过一个代理类完成全部的代理功能，那么我们就需要用动态代理。
 * 静态代理是在代码编译后就已经确定被代理的对象了。而动态代理是在代码运行时，通过反射机制实现动态代理，并且能够代理各种类型的对象。
 * 在Java中要想实现动态代理机制，需要java.lang.reflect.InvocationHandler接口和java.lang.reflect.Proxy类的支持。
 * 动态代理类只能代理接口（不支持抽象类），代理类都需要实现InvocationHandler类，实现invoke方法。invoke方法就是调用被代理接口的所有方法时需要调用的，返回的值是被代理接口的一个实现类
 */
public class OrderServiceJDKDynamicProxy implements InvocationHandler {
    private Object target;

    public OrderServiceJDKDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader() , cls.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target,args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object object){
        System.out.println("JDK动态代理 before code");
        if(object instanceof Order){
            Order order = (Order)object;
            int userId = order.getUserId();
            int dbRouter = userId % 2;
            System.out.println("JDK动态代理分配到 【db"+dbRouter+"】处理数据");
            //TODO 分库操作
        }
        //TODO 其他类型处理
    }

    private void afterMethod(){
        System.out.println("JDK动态代理 after code");
    }

}
