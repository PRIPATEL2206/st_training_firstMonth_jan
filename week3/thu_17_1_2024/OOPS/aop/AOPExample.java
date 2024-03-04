package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AOPExample {
    public static void main(String[] args) {
        MyService myService = new MyServiceImpl();

        // Create a dynamic proxy for the MyService interface with the LoggingAspect
        MyService proxiedService = (MyService) Proxy.newProxyInstance(
                AOPExample.class.getClassLoader(),
                new Class[]{MyService.class},
                new LoggingAspect(myService)
        );

        // Use the proxied service
        proxiedService.doSomething();
    }
}
