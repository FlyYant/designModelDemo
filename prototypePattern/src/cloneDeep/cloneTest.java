package cloneDeep;

import java.util.Date;

public class cloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pig pig = new Pig("佩奇",new Date(0L));
        Pig clonePig = (Pig) pig.clone();

        System.out.println(pig);
        System.out.println(clonePig);

        clonePig.getBirthday().setTime(1000000000000L);
        System.out.println(pig);
        System.out.println(clonePig);
    }
    //结果上来看，当修改clonePig的birthday属性时，pig的birthday属性并没有进行改变。
    //这就改进成深克隆了吗？是的，这便是深克隆。
    //其实我们还依赖了Date类本身就实现了深克隆
    //Date类的clone()方法源码如下
    // public Object clone() {
    //        Date d = null;
    //        try {
    //            d = (Date)super.clone();
    //            if (cdate != null) {
    //                d.cdate = (BaseCalendar.Date) cdate.clone();
    //            }
    //        } catch (CloneNotSupportedException e) {} // Won't happen
    //        return d;
    //    }
    //有些引用型没有这种浅克隆的问题，如String或Integer等包装类型，大家可以自己试一试
    //还有就是，final修饰的成员变量是不能进行深度拷贝的
}
