package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LeaderHandler directorLeader = new DirectorLeader("主任");
        LeaderHandler managerLeader = new ManagerLeader("副总经理");
        LeaderHandler generalManagerLeader = new GeneralManagerLeader("总经理");

        directorLeader.setNextLeader(managerLeader);
        managerLeader.setNextLeader(generalManagerLeader);

        directorLeader.nextHandler(new EmployeeRequest("张三",11,"总了彩票"));
    }
}

