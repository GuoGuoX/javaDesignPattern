package chainOfResponsibility;

import org.xml.sax.ext.LexicalHandler;

public abstract class LeaderHandler {
    protected String LeaderName;//领导职位
    protected LeaderHandler nextLeader;//责任链上的下一个后继对象

    public LeaderHandler(String leaderName) {
        LeaderName = leaderName;
    }

    public void setNextLeader(LeaderHandler nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void nextHandler(EmployeeRequest employeeRequest);
}


class DirectorLeader extends LeaderHandler {
    public DirectorLeader(String name) {
        super(name);
    }
    public void nextHandler(EmployeeRequest employeeRequest)    {
        if(employeeRequest.getDay()<3){
            System.out.println("经上级领导"+LeaderName+"批准，准许请假！！");
        }else{
            if(employeeRequest!=null){

                this.nextLeader.nextHandler(employeeRequest);
            }
        }
    }
}
class ManagerLeader extends LeaderHandler {
    public ManagerLeader(String name) {
        super(name);
    }
    public void nextHandler(EmployeeRequest employeeRequest)    {
        if(employeeRequest.getDay()<15){
            System.out.println("经上级领导"+LeaderName+"批准，准许请假！！");
        }else{
            if(employeeRequest!=null){

                this.nextLeader.nextHandler(employeeRequest);
            }
        }
    }
}
class GeneralManagerLeader extends LeaderHandler {
    public GeneralManagerLeader(String name) {
        super(name);
    }
    public void nextHandler(EmployeeRequest employeeRequest)    {
        if(employeeRequest.getDay()<30){
            System.out.println("经上级领导"+LeaderName+"批准，准许请假！！");
        }else{
            System.out.println("总经理批示，不予批准！！！");
        }
    }
}
