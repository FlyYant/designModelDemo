/**
 * ShippingService类，物流服务类
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName()+"进入物流系统。");
        String shippingOrderNo = "6666";
        return shippingOrderNo;
    }
}