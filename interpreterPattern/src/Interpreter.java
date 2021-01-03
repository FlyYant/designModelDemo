/**
 * Interpreter接口（抽象表达式）
 * AbstractExpression（抽象表达式）：在抽象表达式中声明抽象的解释操作，它是所有终结符表达式和非终结符表达式的公共父类
 */
public interface Interpreter {
    int interpret();
}
