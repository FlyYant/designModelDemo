/**
 * 应用层
 */
public class Test {
    private static final String departments[] = {"RD","QA","PM","BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int)(Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
//从结果可以看出，已经创建出来的部门经理，如果以后还需要使用就不需要再次创建了，
// 因为它已经被存储到EmployeeFactory类的HashMap中了，
// 因为是用HashMap进行存储享元的，并且没有其他维护线程安全操作，所以这个例子是线程不安全的。
//这里便完成了一个简单的享元模式例子
