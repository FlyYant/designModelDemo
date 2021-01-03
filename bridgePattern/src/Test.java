/**
 * 应用层
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
//这里便完成了一个简单的桥接模式例子。
//大家可以想一想，如果要使用多次继承来实现这个例子会是怎么样？扩展性又如何？