/**
 * LiJianPromotionStrategy类（具体策略），立减促销策略类，实现了PromotionStrategy接口
 * 具体策略（Concrete Strategy）：实现了抽象策略定义的接口，提供具体的算法实现
 */
public class LiJianPromotionStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("立减促销，减10");
    }
}
