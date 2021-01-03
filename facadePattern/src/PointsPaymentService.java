/**
 * PointsPaymentService类，积分支付服务类，也是一个虚设，直接输出支付积分成功
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        // 扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功。");
        return true;
    }
}
