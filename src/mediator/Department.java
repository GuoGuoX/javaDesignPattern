package mediator;

import java.util.HashMap;
import java.util.Map;

public interface Department {
    void outAction();
    void selfAction();
}
//中介
 interface Mediator{

    //集合中添加部门信息
    public void register(String departmentName,Department department);
    //调用指定部门对象的方法进行业务处理
    public void command(String departmentName);
}
//部门管理者
class Presider implements Mediator{
    Map<String,Department> map = new HashMap<String,Department>();

    //集合中添加部门信息
    public void register(String departmentName,Department department){
        map.put(departmentName,department);
    }
    //调用指定部门对象的方法进行业务处理
    public void command(String departmentName){
        map.get(departmentName).selfAction();
    }
}
//市场部
class Market implements Department{
    private Mediator mediator;
    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("market",this);//往中介对象中的部门容器添加部门对象
    }

    @Override
    public void outAction() {
        System.out.println("市场部缺少资金支持，请求资金支援！");
        mediator.command("financial");
    }

    @Override
    public void selfAction() {
        System.out.println("~~~市场部开始市场宣传布局！");
    }
}
//财务部
class Financial implements Department{
    private Mediator mediator;
    public Financial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("financial",this);//往中介对象中的部门容器添加部门对象
    }

    @Override
    public void outAction() {
        System.out.println("财务部资金溢出，请求资金清点支援！");
        mediator.command("financial");
    }

    @Override
    public void selfAction() {
        System.out.println("------财务部开始数钱钱啦！");
    }
}
class Development implements Department{
    private Mediator mediator;
    public Development(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("development",this);//往中介对象中的部门容器添加部门对象
    }

    @Override
    public void outAction() {
        System.out.println("开发部已开发完毕，请求宣传部开始市场宣传！");
        mediator.command("market");
    }

    @Override
    public void selfAction() {
        System.out.println("////////////苦逼的开发部开始开发啦！");
    }
}