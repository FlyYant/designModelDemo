/**
 * EggDecorator类，实现加鸡蛋业务的具体装饰者，继承AbstractDecorator类
 */
public class EggDecorator extends AbstractDecorator{

    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }
    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
