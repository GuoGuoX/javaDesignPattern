package adapter;

/**
 * 适配器模式：
 * 作用：从程序结构上实现解耦合
 * 实现：通过继承实现适配器功能
 */
public class Adapter extends Adaptee implements HDML{
    public void handle(){
        super.function();
    }
}
interface HDML{
    void handle();
}

//需要被适配对象
class Adaptee{
    void function(){
        System.out.println("这是被适配器，具备键盘功能");
    }
}
class Main{
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.function();
    }
}