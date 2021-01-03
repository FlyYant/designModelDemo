/**
 * 应用层
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("Windows课程",12);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);

        CatalogComponent designPattern = new Course("Java设计模式",20);
        CatalogComponent springboot = new Course("springboot框架",17);
        CatalogComponent springcloud = new Course("springcloud框架",19);

        javaCourseCatalog.add(designPattern);
        javaCourseCatalog.add(springboot);
        javaCourseCatalog.add(springcloud);

        CatalogComponent mainCourseCatalog = new CourseCatalog("课程主目录",1);

        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();

    }
}
