/**
 * 改进后的应用层
 */
public class Test2 {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc()+" 销售价格："+aBattercake.cost());
    }
}

//一个简单的装饰者模式例子就完成了，这种方法是不是比上一种方法更容易扩展，想加几个鸡蛋、几根香肠都可以，并不需要再添加类，
// 如果煎饼还可以加培根，这里就只需要添加一个加培根业务的具体装饰者即可
