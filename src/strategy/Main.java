package strategy;
//测试策略模式
public class Main {
    public static void main(String[] args) {

        Strategy newC = new NewCustomerPrice();
        Strategy newMany= new NewCustomerManyPrice();
        Strategy old = new OldCustomerPrice();
        Strategy oldMany = new OldCustomerManyPrice();

        Context context = new Context(newC);
        Context context1 = new Context(newMany);
        Context context2 = new Context(old);
        Context context3 = new Context(oldMany);
        context1.getPrice(100d);
        context2.getPrice(100d);
        context3.getPrice(100d);
        context.getPrice(100d);
    }
}
