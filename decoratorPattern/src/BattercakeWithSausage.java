/**
 * BattercakeWithSausage类，加香肠的煎饼类，继承了Battercake类
 */
public class BattercakeWithSausage extends Battercake{
    @Override
    public String getDesc() {
        return super.getDesc()+" 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
