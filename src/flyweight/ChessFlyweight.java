package flyweight;

public interface ChessFlyweight {
    void setColor(String color);
    String getColor();
    void display(Coordinate coordinate);
}
//具体享元类
class ConcreteChess implements ChessFlyweight{
    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置："+coordinate.getX()+":"+coordinate.getY());
    }
}
