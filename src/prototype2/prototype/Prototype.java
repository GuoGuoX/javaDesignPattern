package prototype2.prototype;

import java.io.*;
import java.time.DateTimeException;
import java.util.Date;

/**
 * 反序列化实现克隆
 */
public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException, InterruptedException {
        //通过序列化和反序列化实现深复制
        Sheep sheep = new Sheep("多利",new Date());
        System.out.println(sheep.getDate());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(sheep);
        byte[] bytes = out.toByteArray();

        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        ObjectInputStream in = new ObjectInputStream(input);
        Thread.sleep(2000);
        System.out.println(new Date());
        Object o = in.readObject();
        Sheep o1 = (Sheep) o;
        sheep.setDate(new java.util.Date());
        System.out.println("源对象"+sheep.getDate());
        System.out.println("克隆对象"+o1.getDate());
        /**
         * 反序列化实现克隆对象的打印结果
         * Tue May 21 10:14:55 CST 2019
         * Tue May 21 10:14:57 CST 2019
         * 源对象Tue May 21 10:14:57 CST 2019
         * 克隆对象Tue May 21 10:14:55 CST 2019
         */

      /*  Date date = new Date();
        Sheep sheep = new Sheep("少利",date);
        System.out.println(sheep);
        System.out.println(sheep.getDate());
        Object clone = sheep.clone();
        date.setTime(1684651684654l);//浅克隆，因为引用的是同个属性，所以克隆后修改原对象属性，克隆对象的属性也会更改
        System.out.println(sheep);
        System.out.println(sheep.getDate());*/

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

class Sheep implements Cloneable,Serializable {
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

