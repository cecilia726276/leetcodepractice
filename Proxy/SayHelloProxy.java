package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author LHY
 * @date 2019/4/9 17:14
 */
public class SayHelloProxy<T> implements InvocationHandler {

    private T target;

    public SayHelloProxy(T target) {

        this.target = target;
    }

    public T get(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object res = method.invoke(target, args);
        System.out.println("after");
        return res;
    }

    public static void main(String[] args) {
        SayHello t = new SayHelloImpl();
        new SayHelloProxy<>(t).get().sayHello();
    }
}
