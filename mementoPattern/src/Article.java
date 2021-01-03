/**
 * Article类（发起者），手记类，saveToMemento()方法创建当前Originator的Memento，undoFromMemento()方法根据得到的Memento来回退Originator。
 * Originator（发起者）：负责创建备忘录，并且可以记录、恢复自身的内部状态。可以根据需要决定Memento保存自身的那些内部状态
 */
public class Article {
    private String title;
    private String content;
    private String imgs;

    public Article(String title, String content ,String imgs){
        this.title = title;
        this.content =content;
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public ArticleMemento saveToMemento(){
        ArticleMemento articleMemento = new ArticleMemento(this.title , this.content , this.imgs);
        return articleMemento;
    }

    public void undoFromMemento(ArticleMemento articleMemento){
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.imgs = articleMemento.getImgs();
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
