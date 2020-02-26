package builder;

interface AirShipBuilder {
    Engine craeteEngine();
    Escape createEscape();
}
class AirShipFactory implements AirShipBuilder{

    @Override
    public Engine craeteEngine() {
        return new Engine("神舟6号推动器");
    }

    @Override
    public Escape createEscape() {
        return new Escape("神舟6号逃生舱");
    }
}