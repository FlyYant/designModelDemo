import java.util.ArrayList;
import java.util.List;

/**
 * CourseCatalog类（课程目录类），继承了CatalogComponent类，也重写了它需要的方法，
 * 因为它是目录（树枝节点），所以它有一个容器private List<CatalogComponent> items = new ArrayList<CatalogComponent>()，
 * 用来存储课程（叶子节点），所以它是是树枝节点（Composite）
 * level是目录的级数，方便打印目录结构
 */
public class CourseCatalog extends CatalogComponent{
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for(CatalogComponent catalogComponent : items){
            if(level != null){
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            catalogComponent.print();
        }
    }
}
