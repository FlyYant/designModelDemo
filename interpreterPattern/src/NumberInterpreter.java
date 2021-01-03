/**
 * NumberInterpreter类（非终结符表达式），实现了Interpreter接口
 * NonterminalExpression（非终结符表达式）：非终结符表达式也是抽象表达式的子类，
 * 它实现了文法中非终结符的解释操作，由于在非终结符表达式中可以包含终结符表达式，也可以继续包含非终结符表达式，因此其解释操作一般通过递归的方式来完成。
 */
public class NumberInterpreter implements Interpreter{
    private int number;
    public NumberInterpreter(int number){
        this.number = number;
    }
    public NumberInterpreter(String number){
        this.number = Integer.parseInt(number);
    }
    public int interpret() {
        return this.number;
    }
}
