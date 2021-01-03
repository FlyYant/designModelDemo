/**
 * 应用层
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+" 销售价格："+battercake.cost());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+" 销售价格："+battercakeWithEgg.cost());

        BattercakeWithSausage battercakeWithSausage = new BattercakeWithSausage();
        System.out.println(battercakeWithSausage.getDesc()+" 销售价格："
                + battercakeWithSausage.cost());

    }
}
//这里提出一个问题，如果我需要加两个鸡蛋、两根香肠的煎饼呢？
//此时，我们就需要再实现一个类来满足需求，但是这样的需求多种多样，显然用普通继承的方法来实现这个例子并不好
//因此进行改进，新增一个抽象类ABattercake
