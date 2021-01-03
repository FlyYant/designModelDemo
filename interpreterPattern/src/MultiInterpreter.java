/**
 * MultiInterpreter类（终结符表达式），实现了Interpreter接口
 */
public class MultiInterpreter implements Interpreter{
    private Interpreter firstExpression,secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    public int interpret() {
        return this.firstExpression.interpret()*this.secondExpression.interpret();
    }

    public String toString(){
        return "*";
    }
}
