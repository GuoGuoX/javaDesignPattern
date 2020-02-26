package proxy;



/**
 * 代理模式：
 * 作用：通过代理控制对对象的访问，实现在调用方法前做前置处理和后置处理
 */
public interface Proxy {
    //静态代理
    void sing();//唱歌
    void gathering();//收款
}

class main{
    public static void main(String[] args) {
        dynamicProxy.RealStar realStar = new dynamicProxy.RealStar();
        Proxy proxy = new proxy.ProxyStar();
        ((proxy.ProxyStar) proxy).setStar(realStar);
       proxy.sing();//调用代理对象的唱歌方法
    }
}

class ProxyStar implements  Proxy{

    private dynamicProxy.RealStar star;

    public dynamicProxy.RealStar getStar() {
        return star;
    }

    public void setStar(dynamicProxy.RealStar star) {
        this.star = star;
    }

    @Override
    public void sing() {
        star.sing();
        this.gathering();
    }

    @Override
    public void gathering() {
        System.out.println("代理人代为收取演出报酬！");
    }
}
class RealStar  implements Proxy{

    @Override
    public void sing() {
        System.out.println("歌手本人进行演出！！");
    }

    @Override
    public void gathering() {
        System.out.println("歌手本人进行演出费的收取！！");
    }
}