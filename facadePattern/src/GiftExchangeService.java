/**
 * GiftExchangeService类，礼品兑换服务类，是外观模式的门面对象或者说外观对象，
 * 把上面的这些服务进行组合使用完成复杂的操作，给外部应用提供完成这一功能的接口，隐藏了子系统的复杂性
 */
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private  PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift){
        if(qualifyService.isAvailable(pointsGift)){
            //资格校验通过
            if(pointsPaymentService.pay(pointsGift)){
                //如果支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号是："+shippingOrderNo);
            }
        }
    }
}
