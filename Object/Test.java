package Object;

/**
 * @Author SYZ
 * @create 2019-08-11 01:03
 */
public class Test {
        public static Test t1=new Test();

        {
            System.out.println("blockA");
        }

        static {
            System.out.println("blockB");
        }

        public static void main(String[] args){
            Test t2=new Test();
            A classA = new B();
            System.out.println(classA.a);
            classA.fun();
        }

}
