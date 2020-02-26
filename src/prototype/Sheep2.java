package prototype;

import java.util.Date;

class Sheep2 implements Cloneable{
    private String name;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        Sheep2 sheep2 = (Sheep2) clone;
        sheep2.date=(Date) this.date.clone();
        return clone;//直接调用Object的clone方法
    }

    public Sheep2(String name, Date date) {
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

