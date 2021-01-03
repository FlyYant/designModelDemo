/**
 * BattercakeWithEgg类，加鸡蛋的煎饼类，继承了Battercake类
 */
public class BattercakeWithEgg extends Battercake{
    public String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    public int cost() {
        return super.cost()+1;
    }
}
