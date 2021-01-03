import java.util.Stack;

/**
 * ArticleMementoManager类（备忘录管理者），它负责存储备忘录，
 * 使用栈进行存储备忘录的原因大家应该知道，最新加进去的实例最早出来，并且它可以将备忘录提供给外界
 * Caretaker（备忘录管理者）：负责存储备忘录，不能对备忘录的内容进行操作和访问，只能够将备忘录传递给其他对象
 */
public class ArticleMementoManager {
    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<ArticleMemento>();

    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}
