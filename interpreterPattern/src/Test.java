/**
 * 应用层
 */
public class Test {
    public static void main(String[] args) {
        Expression expression = new Expression("6 100 11 + *");
        KavenExpressionParser expressionParser = new KavenExpressionParser();
        int result = expressionParser.parse(expression.getExpression());
        System.out.println("解释器计算结果"+result);
    }
}
