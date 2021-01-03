/**
 * DepositAccount类（定期账号），实现了Account接口
 */
public class DepositAccount implements Account{
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
