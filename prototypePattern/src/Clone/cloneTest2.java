package Clone;

import java.util.Date;

public class cloneTest2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pig pig = new Pig("佩奇",new Date(0L));
        Pig clonePig = (Pig) pig.clone();

        System.out.println(pig);
        System.out.println(clonePig);

        clonePig.getBirthday().setTime(1000000000000L);
        System.out.println(pig);
        System.out.println(clonePig);
    }
    //为什么我们改变clonePig的birthday属性，pig的birthday属性也会进行改变?
    //不慌，我们观察debug一下
    //debug后不难发现pig（Pig@616）和clonePig（Pig@617）确实不是指向同一个实例，但它们的birthday属性却是指向相同的Date实例(Date@621)，
    // 这就是浅克隆，所以，当修改clonePig的birthday属性时，pig的birthday属性也会进行改变
    //接下来进入cloneDeep看一下深克隆
}
