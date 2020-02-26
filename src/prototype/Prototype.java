package prototype;

import java.util.Date;

/**
 * 原型模式（克隆）
 * 原理：通过内存的复制，达到对象的复制
 * 关键api：Cloneable（并实现clone方法）
 * 浅克隆：克隆的属性之间使用的是同一个属性的引用
 * 深克隆：将原对象的属性也克隆一份
 */
public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Sheep sheep = new Sheep("少利",date);
        System.out.println(sheep);
        System.out.println(sheep.getDate());
        Object clone = sheep.clone();
        date.setTime(1684651684654l);//浅克隆，因为引用的是同个属性，所以克隆后修改原对象属性，克隆对象的属性也会更改
        System.out.println(sheep);
        System.out.println(sheep.getDate());
    /*    Date date = new Date();
        Sheep2 sheep = new Sheep2("少利",date);
        System.out.println(sheep);
        System.out.println(sheep.getName());
        System.out.println(sheep.getDate());
        Sheep2 clone = (Sheep2) sheep.clone();
        date.setTime(1684651684654l);//此时clone方法为深克隆
        System.out.println(clone);
        System.out.println(clone.getName());
        System.out.println(clone.getDate());
*/
        /**打印结果
         * prototype.Sheep@64c64813
         * prototype.Sheep@64c64813
         */

    }
}
class Sheep implements Cloneable{
    private String name;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();//直接调用Object的clone方法
    }

    public Sheep(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

