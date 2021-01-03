/**
 * QualifyService类，校验服务类，就是一个虚设，直接输出满足资格
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 积分资格通过，库存通过。");
        return true;
    }
}
