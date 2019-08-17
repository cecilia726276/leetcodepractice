package Proxy;

import java.util.Date;

/**
 * @Author SYZ
 * @create 2019-08-17 22:16
 */
public class HelloServiceProxy implements HelloService{
    private HelloService helloService;

    public HelloServiceProxy(HelloService helloService1){
        this.helloService = helloService1;
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }


    @Override
    public String echo(String msg) {
        System.out.println("before echo");
        String result = helloService.echo(msg);
        System.out.println("after echo");
        return result;
    }

    @Override
    public Date getTime() {

        System.out.println("before calling getTime()");
        //调用被代理的HelloService 实例的getTime()方法
        Date date=helloService.getTime();
        //事后处理
        System.out.println("after calling getTime()");
        return date;
    }
}
