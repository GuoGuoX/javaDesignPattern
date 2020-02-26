package builder;

public class Main {
    public static void main(String[] args) {
        AirShipBuilder airShipBuilder = new AirShipFactory();
        AirShipDirecte airShipDirecte = new AirShipDirecte(airShipBuilder);
        AirShip airShip = airShipDirecte.airShipAssemble();
        String name = airShip.getEngine().getName();
        System.out.println(name);
        String name1 = airShip.getEscape().getName();
        System.out.println(name1);


    }
}
