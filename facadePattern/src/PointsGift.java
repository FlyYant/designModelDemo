/**
 * PointsGift类，积分礼品类，为了简单，就不做积分、库存是否满足要求的校验了
 */
public class PointsGift {
    private String name;

    public PointsGift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
