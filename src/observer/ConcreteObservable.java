package observer;



public class ConcreteObservable extends java.util.Observable {
    private String message;

    public void setMessage(String message){
        this.message=message;
        setChanged();//表示目标对象已经发生更改
        notifyObservers(message);//通知所有观察者
    }

    public String getMessage() {
        return this.message;
    }
}
