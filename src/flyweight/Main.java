package flyweight;

/**
 * 享元模式
 */
public class Main {
    public static void main(String[] args) {
        ChessFlyweight baiqi1 = ChessFlyweightFactory.getChessFlyweight("白棋");
        ChessFlyweight baiqi3 = ChessFlyweightFactory.getChessFlyweight("黑棋");
        ChessFlyweight baiqi4 = ChessFlyweightFactory.getChessFlyweight("黑棋");
        ChessFlyweight baiqi2 = ChessFlyweightFactory.getChessFlyweight("白棋");
        baiqi1.display(new Coordinate(11,23));
        System.out.println(baiqi1);
        System.out.println(baiqi2);
        System.out.println(baiqi3);
        System.out.println(baiqi4);
    }
}
