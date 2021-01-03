import java.util.ArrayList;
import java.util.List;

/**
 * Staff类（请求者角色），Staff类有一个List用来存储命令对象，executeCommands()方法用来实现调用命令对象执行具体的请求
 * Invoker：请求者角色，该类的职责是调用命令对象执行具体的请求
 */
public class Staff {
    private List<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommands(){
        for (Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }
}
