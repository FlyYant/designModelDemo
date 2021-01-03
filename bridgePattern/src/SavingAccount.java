/**
 * SavingAccount类（活期账号），实现了Account接口
 */
public class SavingAccount implements Account{
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
