package Proxy;

import java.io.File;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LHY
 * @date 2019/4/9 17:13
 */
public class SayHelloImpl implements SayHello {
    @Override
    public void sayHello() {
        System.out.println("hello!");
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list.stream().map(a -> {
            a += 3;
            return a;
        }).count());
    }
}
