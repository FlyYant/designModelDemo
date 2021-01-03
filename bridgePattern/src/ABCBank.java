/**
 * ABCBank类（中国农业银行），继承了Bank类，并且将打开账号的行为委托给与自己组合的Account实例
 */
public class ABCBank extends Bank{
    public ABCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        //委托行为
        account.openAccount();
        return account;
    }
}
