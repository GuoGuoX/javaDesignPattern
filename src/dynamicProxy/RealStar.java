package dynamicProxy;






import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理模式：动态代理
 * 作用：通过代理控制对对象的访问，实现在调用方法前做前置处理和后置处理
 */
 interface DynamicProxy {
    //静态代理
    void sing();//唱歌
    void gathering();//收款
}

class Main{
    public static void main(String[] args) {
        //动态代理
        final RealStar realStar = new RealStar();
        DynamicProxy o = (DynamicProxy)Proxy.newProxyInstance(RealStar.class.getClassLoader(),RealStar.class.getInterfaces(), new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

               // System.out.println(proxy);
                System.out.println("执行目标方法前");
                Object invoke;

                invoke = method.invoke(realStar, args);
                System.out.println("执行目标方法后");
                return invoke;
            }
        });
        o.sing();




       /* RealStar realStar = new RealStar();
        Proxy proxy = new ProxyStar();
        ((ProxyStar) proxy).setStar(realStar);
        proxy.sing();//调用代理对象的唱歌方法*/


    }
}

class ProxyStar implements DynamicProxy {

    private RealStar star;

    public RealStar getStar() {
        return star;
    }

    public void setStar(RealStar star) {
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

public class RealStar  implements DynamicProxy{

    @Override
    public void sing() {
        System.out.println("歌手本人进行演出！！");
    }

    @Override
    public void gathering() {
        System.out.println("歌手本人进行演出费的收取！！");
    }
}