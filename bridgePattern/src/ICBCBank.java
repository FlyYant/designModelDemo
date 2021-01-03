/**
 * ICBCBank类（中国工商银行），继承了Bank类，并且将打开账号的行为委托给与自己组合的Account实例
 */
public class ICBCBank extends Bank{
    public ICBCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        //委托行为
        account.openAccount();
        return account;
    }
}
