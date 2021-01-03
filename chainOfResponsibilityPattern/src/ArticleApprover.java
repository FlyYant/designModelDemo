/**
 * ArticleApprover类（ 具体处理者角色），继承了Approver类，实现了deploy()方法，检查是否有手记，有手记就将课程给下一个检查的处理者检查
 * 具体处理者（ConcreteHandler）角色：实现抽象处理者角色中处理请求的接口
 */
public class ArticleApprover extends Approver{
    public void deploy(Course course) {
        if(!StringUtils.isEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        }
        else{
            System.out.println(course.getName()+"不包含手记，不批准");
            return ;
        }
    }
}
