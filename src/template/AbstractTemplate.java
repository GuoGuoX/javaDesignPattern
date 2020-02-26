package template;

/**
 * 模本类
 */

/**
 * 抽象类与接口区别：一个是继承一个是实现
 *      一个能初始化一个不能
 *
 */
public abstract  class AbstractTemplate {
    public abstract void transact();


    public void takeNumber(){
        System.out.println("开始----排号");
    }

    public void evaluation(){
        System.out.println("服务结束---请您为我评分****");
    }

    public void process(){
        takeNumber();
        transact();
        evaluation();
    }
}
