package observer;

import java.util.Observable;

public class ObserverA implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
        String message = ((ConcreteObservable) o).getMessage();
        System.out.println(message);
    }
}
