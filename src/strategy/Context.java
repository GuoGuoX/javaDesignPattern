package strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void getPrice(Double d){

        strategy.getPrice(d);
    }
}
