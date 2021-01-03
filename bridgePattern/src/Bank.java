/**
 * Bank抽象类（银行），与Account接口实例进行组合，这是桥接模式的关键所在
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();
}
