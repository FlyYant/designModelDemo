/**
 * Expression类（环境类），存储后缀表达式
 * Context（环境类）：环境类又称为上下文类，它用于存储解释器之外的一些全局信息，通常它临时存储了需要解释的语句
 */
public class Expression {
    private  String expression;

    public Expression(String expression) {
        this.expression = expression;
    }

    public  String getExpression() {
        return this.expression;
    }
}
