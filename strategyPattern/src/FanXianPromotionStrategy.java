/**
 * FanXianPromotionStrategy类（具体策略），返现促销策略类，实现了PromotionStrategy接口
 */
public class FanXianPromotionStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("返现促销，满1000返50");
    }
}
