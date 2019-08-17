package HuaTai;

import java.lang.reflect.ParameterizedType;

/**
 * @Author SYZ
 * @create 2019-08-11 23:38
 */
class Foo<T> {
}
class Foobar<T> extends Foo<T>{}
class Bar extends Foo<Integer>{}
class Main{

    public static void printType(Object object){
        ParameterizedType t = (ParameterizedType) object.getClass().getGenericSuperclass();
        System.out.println(t.getActualTypeArguments()[0].getTypeName());
    }


    public static void main(String[] args) {
        Foobar<Integer> foobar = new Foobar<Integer>();
        printType(foobar);
        Bar bar = new Bar();
        printType(bar);
    }
}
