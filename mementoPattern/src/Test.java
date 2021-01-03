/**
 * 应用层
 */
public class Test {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article article = new Article("Java设计模式","手记内容-Java必须要学","img1");
        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        System.out.println("标题："+article.getTitle()+" 内容："+article.getContent()+" 图片："+article.getImgs()+" 暂存成功");
        System.out.println("手记完整信息："+article);

        System.out.println("修改手记start-----");

        article.setTitle("Javascript设计模式");
        article.setContent("手记内容-Javascript必须要学");
        article.setImgs("img2");

        System.out.println("修改手记end-----");

        System.out.println("手记完整信息："+article);

        System.out.println("修改手记start-----");

        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("Python设计模式");
        article.setContent("手记内容-Python必须要学");
        article.setImgs("img3");

        System.out.println("修改手记end-----");

        System.out.println("手记完整信息："+article);

        System.out.println("暂存回退start-----");

        System.out.println("回退出栈1次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("暂存回退end-----");
        System.out.println("手记完整信息："+article);
    }
}
