package abstractFactory;

public interface Engine {
    void message();
}
class LuxuryEngine implements Engine{

    @Override
    public void message() {
        System.out.println("高端发动机,就是快!!!");
    }
}
class LowEngine implements Engine{

    @Override
    public void message() {
        System.out.println("低端发动机,慢就完事!!!");
    }
}