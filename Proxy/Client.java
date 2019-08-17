package Proxy;

/**
 * @Author SYZ
 * @create 2019-08-17 22:22
 */
public class Client {
    public static void main(String[] args) {
        HelloService helloService=new HelloServiceImp();
        HelloService helloServiceProxy=new HelloServiceProxy(helloService);
        System.out.println(helloServiceProxy.echo("hello"));
    }
}
