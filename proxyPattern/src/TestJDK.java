/**
 * jdk动态代理应用层
 */
public class TestJDK {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        IOrderService orderServiceJDKDynamicProxy = (IOrderService) new OrderServiceJDKDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceJDKDynamicProxy.saveOrder(order);
    }
}
