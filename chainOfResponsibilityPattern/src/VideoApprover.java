/**
 * VideoApprover类（ 具体处理者角色），继承了Approver类，实现了deploy()方法，检查是否有视频，有视频就将课程给下一个检查的处理者检查
 */
public class VideoApprover extends Approver{
    public void deploy(Course course) {
        if(!StringUtils.isEmpty(course.getVideo())){
            System.out.println(course.getName()+"含有视频，批准");
            if(approver != null){
                approver.deploy(course);
            }
        }
        else{
            System.out.println(course.getName()+"不包含视频，不批准");
            return ;
        }
    }
}
