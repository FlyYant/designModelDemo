package Ada;

/**
 * 被适配者: Ada.Adaptee ，原有的接口，也是希望被适配的接口
 */
public class Adaptee {
    public void adapterRequest(){
        System.out.println("被适配者的方法");
    }
}
