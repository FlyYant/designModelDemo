/**
 * Approver类（抽象处理者角色），deploy()方法是抽象处理者角色定义的处理请求的接口，
 * approver属性是接下来要处理请求的处理者的引用，不要纠结类名
 * 抽象处理者（BaseHandler）角色：定义处理请求的接口，并且有接下来要处理请求的处理者的引用
 */
public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }
    public abstract void deploy(Course course);
}
