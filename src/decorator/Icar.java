package decorator;

import abstractFactory.CarFactory;



class Main{
    public static void main(String[] args) {
        Car car = new Car();
        SuperCar superCar = new SuperCar(car);
        FlyCar flyCar = new FlyCar(car);
        WaterCar waterCar = new WaterCar(car);
        flyCar.move();
        waterCar.move();
        System.out.println("--------一次性增加多个功能");
        WaterCar waterCar2 = new WaterCar(flyCar);
        waterCar2.move();
    }
}

public interface Icar {
    void move();
}

class Car implements Icar{

    @Override
    public void move() {
        System.out.println("/////汽车跑起来了！！");
    }
}
//创建装饰类
class SuperCar implements Icar{
    private Icar car;

    public SuperCar(Icar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}


//增加飞行功能
class FlyCar extends SuperCar{

    public FlyCar(Icar car) {
        super(car);
    }
    public void move(){
        super.move();
        System.out.println("~~~~~汽车开始飞起来啦！！！");
    }
}

//增加水上功能
class WaterCar extends SuperCar{

    public WaterCar(Icar car) {
        super(car);
    }
    public void move(){
        super.move();
        System.out.println("~~~~~汽车开始游起来啦！！！");
    }
}
