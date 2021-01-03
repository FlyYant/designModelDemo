/**
 * 应用层
 */
public class Test {
    public static void main(String[] args) {
        User kaven = new User("kaven");
        User yy = new User("yy");

        kaven.sendMessage("Hey! yy! Let's learn Design Pattern");
        yy.sendMessage("OK! kaven");
    }
}
