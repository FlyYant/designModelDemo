/**
 * ManJianPromotionStrategy类（具体策略），满减促销策略类，实现了PromotionStrategy接口
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("满减促销，满200减20");
    }
}
