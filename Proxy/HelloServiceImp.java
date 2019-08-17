package Proxy;

import java.util.Date;

/**
 * @Author SYZ
 * @create 2019-08-17 21:14
 */
public class HelloServiceImp implements HelloService{

    @Override
    public String echo(String msg) {
        return "Imp_echo: "+ msg;
    }

    @Override
    public Date getTime() {
        return new Date();
    }
}
