/**
 * EmptyPromotionStrategy类，无促销策略类
 */

public class EmptyPromotionStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("无促销");
    }
}
