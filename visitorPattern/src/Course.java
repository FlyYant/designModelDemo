/**
 * Course类（元素角色），定义了一个接受访问的方法accept()
 * 元素（Element）角色 ：接口或抽象类，它定义了一个接受访问的方法accept()
 */
public abstract class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor visitor);
}
