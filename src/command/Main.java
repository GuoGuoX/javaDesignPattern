package command;

public class Main {
    public static void main(String[] args) {


    Receiver receiver = new Receiver();
    Command command = new ConcreteCommand(receiver);
    Invoke invoke = new Invoke(command);
    String com = "向敌人进军";
    invoke.call(com);
}
}
