/**
 * CatalogComponent类（抽象类，目录组件类），是抽象根节点（Component），预先定义了一些默认行为和属性
 */
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
