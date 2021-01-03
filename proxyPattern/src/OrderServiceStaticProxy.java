/**
 * OrderServiceStaticProxy类（Service层的静态代理类）
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order){
        //方法增强，比如分库、校验、安全等处理
        beforeMethod(order);

        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);

        //方法增强，比如释放资源等处理
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order){
        System.out.println("静态代理 before code");
        //根据用户ID % 2 的值进行分库
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到 【db"+dbRouter+"】处理数据");
        //TODO 分库操作
    }

    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
