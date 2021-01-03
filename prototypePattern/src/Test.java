/**
 * 应用层
 */
public class Test {
    private static String[] name = {"yy","kaven","jack","jojo"};
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < name.length; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName(name[i]);
            mailTemp.setEmailAddress(name[i]+"@lkwyy.com");
            mailTemp.setContent("恭喜您，此次活动中奖了");
            MailUtil.sendMail(mailTemp);
        }
    }
    //Mail mail = new Mail()会调用构造器创建原型实例，调用构造器时会输出Mail Class Constructor，
    // 而每次要发送的邮件都是对这个原型实例的克隆Mail mailTemp = (Mail) mail.clone();，
    // 并且可以发现clone()方法不会调用构造器，对象拷贝时构造器是不会被执行的，
    // Object类的clone()方法的原理是从内存中（具体的说，就是堆内存中）以二进制流的方式进行拷贝，并且会重新分配一个内存块（也是堆内存中），
    // 也就不需要调用构造器了

}
