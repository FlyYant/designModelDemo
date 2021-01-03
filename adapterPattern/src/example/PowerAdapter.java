package example;

/**
 * PowerAdapter类（Adapter类），适配器类，将220v的电压转换成5v的电压
 */
public class PowerAdapter implements DC5{
    private AC220 ac220 = new AC220();

    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();

        //变压器...
        int adapterOutput = adapterInput/44;

        System.out.println("使用PowerAdapter输入AC"+adapterInput+"V"+"输出DC"+adapterOutput+"V");
        return adapterInput;
    }
}
