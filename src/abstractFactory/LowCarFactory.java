package abstractFactory;

public class LowCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
