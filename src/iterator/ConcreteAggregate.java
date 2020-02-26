package iterator;

import java.util.*;
import java.util.ArrayList;

//自定义的迭代器接口
interface MyIterator{
    void first();
    void last();
    void next();
    boolean isFirst();
    boolean isLast();
    boolean hasNext();
    Object currentObject();
}
//自定义聚合类
public class ConcreteAggregate {
    private List<Object> list = new ArrayList<Object>();

    public void addObject(Object o){
        list.add(o);
    }
    public void remove(Object o){
        list.remove(o);
    }
    public List getList(){
        return list;
    }
    public void setList(List list){
        this.list=list;
    }

    //返回自定义迭代器
    public MyIterator getIterator(){
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements MyIterator{
        //定义索引标记
        private int index;
        @Override
        public void first() {
            this.index=0;
        }

        @Override
        public void last() {
            this.index=list.size()-1;

        }

        @Override
        public void next() {
            if(index<list.size())
            index++;
            System.out.println("index::::"+index);
        }

        @Override
        public boolean isFirst() {
            return index==0?true:false;
        }

        @Override
        public boolean isLast() {
            return index==(list.size()-1)?true:false;
        }

        @Override
        public boolean hasNext() {
            if(index<list.size()){

                return true;
            }
            return false;
        }

        @Override
        public Object currentObject() {

            return list.get(index);
        }
    }
}
