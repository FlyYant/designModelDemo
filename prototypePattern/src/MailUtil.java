import java.text.MessageFormat;

/**
 * MailUtil类（邮件的工具类），调用sendMail()方法可以发送邮件
 */
public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent = "向 {0} 同学，邮件地址:{1}，邮件内容：{2}，发送邮件成功";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }
}
