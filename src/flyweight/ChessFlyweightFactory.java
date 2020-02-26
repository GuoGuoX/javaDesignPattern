package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessFlyweightFactory {
    private static Map<String,ChessFlyweight> map = new HashMap<String,ChessFlyweight>();

    public static ChessFlyweight getChessFlyweight(String color){
        if(map.get(color)!=null){
            return map.get(color);
        }else{
            ChessFlyweight chessFlyweight = new ConcreteChess(color);
            map.put(color,chessFlyweight);
            return chessFlyweight;
        }
    }
}
