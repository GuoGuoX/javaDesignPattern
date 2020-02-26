package singleton;

/**
 * 单例模式的创建方式有：饿汉式，懒汉式，静态内部类方式，枚举方式
 * 此处使用枚举方式
 * 注意枚举天然的能防止通过反射和反序列化破解
 */
public enum Singleton {
    INSTANCE;

    public void method(){
        System.out.println("通过枚举调用method方法！");
    }
}

class test{
    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE.hashCode());
        System.out.println(Singleton.INSTANCE.hashCode());
        /*
        *   1355531311
            1355531311
        * */
    }
}