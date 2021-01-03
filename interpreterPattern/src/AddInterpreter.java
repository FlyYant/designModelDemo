/**
 * AddInterpreter类（终结符表达式），实现了Interpreter接口
 * TerminalExpression（终结符表达式）：终结符表达式是抽象表达式的子类，
 * 它实现了与文法中的终结符相关联的解释操作，在句子中的每一个终结符都是该类的一个实例。
 * 通常在一个解释器模式中只有少数几个终结符表达式类，它们的实例可以通过非终结符表达式组成较为复杂的句子
 */
public class AddInterpreter implements Interpreter{
    private Interpreter firstExpression,secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    public int interpret() {
        return this.firstExpression.interpret()+this.secondExpression.interpret();
    }

    public String toString(){
        return "+";
    }
}
