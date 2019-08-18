package Proxy;

import java.lang.reflect.InvocationHandler;
import java.util.Map;

/**
 * @Author SYZ
 * @create 2019-08-18 03:05
 */
public class DynamicFoo implements Foo{

    @Override
    public void randomMethod() {
        System.out.println("I'm class "+ getClass());
    }
}
