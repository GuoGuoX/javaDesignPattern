package abstractFactory;

public class ProductionCat {
    public static void main(String[] args) {
        CarFactory luxury = new LuxyryCarFactory();
        Engine engine = luxury.createEngine();
        engine.message();
        luxury.createTyre().message();
        CarFactory low = new LowCarFactory();
        low.createTyre().message();
        low.createEngine().message();
    }
}
