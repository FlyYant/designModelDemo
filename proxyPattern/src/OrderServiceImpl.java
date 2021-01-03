/**
 * OrderServiceImpl类（Service层实现类）
 */
public class OrderServiceImpl implements IOrderService{
    private IOrderDao iOrderDao;
    public int saveOrder(Order order) {
        // 使用Spring注解会自己注入，这里就直接new了
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
