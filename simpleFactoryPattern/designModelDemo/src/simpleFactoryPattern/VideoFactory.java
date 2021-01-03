package simpleFactoryPattern;

/**
 * 工厂类VideoFactory
 */
public class VideoFactory {
    //创建一个返回值为Video类型的方法
    public Video getVideo(String type){

        //equalsIgnoreCase方法意识是不区分大小写的比较，而equals是区分大小写的
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }
        else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        else{
            return null;
        }

    }
    //进行编号2改进，利用反射，就可以很好的解决这个问题了
    public Video getVideo2(Class type){
        Video video2 = null;
        try{
            video2 = (Video) Class.forName(type.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video2;
    }

    //同时也很好的解决了违背开闭原则的问题，当有新产品产生时，我们不需要修改工厂中创建产品实例的方法的代码，我们只需要创建一个新的产品类即可，也就是对扩展开放，对修改关闭。
}
