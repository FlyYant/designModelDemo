/**
 * 简单工厂模式和策略模式进行结合使用的应用层
 */
public class Test2 {
    public static void main(String[] args) {
        String promotionKey = "MANJIAN";
        PromotionActivity promotionActivity =
                new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
