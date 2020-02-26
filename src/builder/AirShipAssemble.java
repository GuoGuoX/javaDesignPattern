package builder;

public interface AirShipAssemble {
    AirShip airShipAssemble();
}
class AirShipDirecte implements AirShipAssemble{
    private AirShipBuilder airShipBuilder;
    public AirShipDirecte(AirShipBuilder airShipBuilder){
        this.airShipBuilder=airShipBuilder;
    }
   public AirShip airShipAssemble(){
        Engine engine = airShipBuilder.craeteEngine();
        Escape escape = airShipBuilder.createEscape();
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscape(escape);
        return airShip;
    }

}
