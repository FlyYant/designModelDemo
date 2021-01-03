/**
 * PromotionActivity类（环境），持有一个策略类的引用，最终给应用层调用
 * 环境（Context）：持有一个策略类的引用，最终给应用层调用
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
