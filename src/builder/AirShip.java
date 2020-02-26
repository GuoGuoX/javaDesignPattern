package builder;
 /*
 创建者模式
  */
public class AirShip {
    private Engine engine;
    private Escape escape;

     public Engine getEngine() {
         return engine;
     }

     public void setEngine(Engine engine) {
         this.engine = engine;
     }

     public Escape getEscape() {
         return escape;
     }

     public void setEscape(Escape escape) {
         this.escape = escape;
     }
 }
class Engine{
    private String name;
    Engine(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Escape{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Escape(String name) {
        this.name = name;
    }
}
