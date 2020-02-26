package command;

/**
 * 命令执行者
 */
public class Receiver {
    public void action(String command){
        System.out.println("执行者接收到命令，开始执行命令、、、"+command);
    }
}

interface Command{
    void execute(String command);
}

class ConcreteCommand implements Command{
    private Receiver receiver;//执行人可以是多个，用集合接收list、map

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String command) {
        receiver.action(command);
    }
}
