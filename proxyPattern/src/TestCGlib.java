/**
 * CGlib代理应用层
 */
public class TestCGlib {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        IOrderService iOrderService = (IOrderService) new OrderServiceCGLibDynamicProxy(new OrderServiceImpl()).bind();
        iOrderService.saveOrder(order);
    }
}
