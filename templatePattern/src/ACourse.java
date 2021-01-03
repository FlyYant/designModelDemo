/**
 * 举慕课网的例子，当讲师发布新课程时，慕课网一般要求讲师制作PPT、制作视频、编写手记（可选）、打包课程等，所以我们可以将这一过程模板化，
 * 可选的操作这里使用钩子方法（也可以在抽象类中不出现，由子类来添加实现即可），不可选或者说必须的操作就直接final，即不可重写。
 * ACourse类（课程抽象类），定义了讲师发布新课程时的一些操作
 */
public abstract class ACourse {
    protected  final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }
    final void makeVideo(){
        System.out.println("制作视频");
    }
    final void writeArticle(){
        System.out.println("编写手记");
    }
    //钩子方法
    protected boolean needWriteArticle(){
        return false;
    }
    abstract void packageCourse();
}
