/**
 * 应用层
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("键盘");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.giftExchange(pointsGift);
    }
}
