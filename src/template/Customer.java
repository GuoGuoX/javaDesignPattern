package template;

public class Customer  extends AbstractTemplate{
    @Override
    public void transact() {
        System.out.println("顾客开始点单-----");
    }
}
