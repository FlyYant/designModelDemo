package Clone;

import java.util.Date;

public class cloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pig pig = new Pig("佩奇",new Date(0L));
        Pig clonePig = (Pig) pig.clone();

        System.out.println(pig);
        System.out.println(clonePig);
        System.out.println(pig == clonePig);
    }
    //很显然它们不是指向同一个实例，因为会重新分配一个内存块
}
