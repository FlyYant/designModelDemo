package example;

/**
 * AC220类（Adaptee），被适配者类，原有220v的电压
 */
public class AC220 {
    public int outputAC220V(){
        int output = 220;
        System.out.println("输出交流电"+output+"V");
        return output;
    }
}
