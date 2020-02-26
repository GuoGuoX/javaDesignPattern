package iterator;

public class Main {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        int i =1;
        int i1 =122;
        String i2 ="xxx";
        concreteAggregate.addObject(i);
        concreteAggregate.addObject(i1);
        concreteAggregate.addObject(i2);

        MyIterator iterator = concreteAggregate.getIterator();
        while(iterator.hasNext()){
            iterator.last();
            System.out.println(iterator.currentObject());
            iterator.next();
        }
        System.out.println();
    }
}
