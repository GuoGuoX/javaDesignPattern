package command;

public class Invoke {
    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }
    public void call(String commandList){
        command.execute(commandList);
    }

}
