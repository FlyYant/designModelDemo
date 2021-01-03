/**
 * 应用层
 */
public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }
}
//这里便实现了一个简单的策略模式例子。
//下面我们将简单工厂模式和策略模式进行结合使用，当然还可以和单例模式、享元模式进行结合使用
//新建EmptyPromotionStrategy
//新建PromotionStrategyFactory
//新建test2