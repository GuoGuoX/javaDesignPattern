package abstractFactory;

public class LuxyryCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
