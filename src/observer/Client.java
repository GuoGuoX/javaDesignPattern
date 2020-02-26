package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式
 */
public class Client {
    public static void main(String[] args) {


        ConcreteObservable concreteObservable = new ConcreteObservable();
        Observer observer = new ObserverA();
        Observer observer1 = new ObserverA();
        Observer observer2 = new ObserverA();
        concreteObservable.addObserver(observer);
        concreteObservable.addObserver(observer1);
        concreteObservable.addObserver(observer2);

        concreteObservable.setMessage("测试观察者模式");

    }
}
