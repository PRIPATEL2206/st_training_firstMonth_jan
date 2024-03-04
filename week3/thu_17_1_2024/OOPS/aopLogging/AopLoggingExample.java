package aopLogging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AopLoggingExample {
    public static void main(String[] args) {
        // Create the core business service
        BusinessService coreService = new BusinessServiceImpl();

        // Inject logging behavior using AOP
        BusinessService loggedService = LoggingAspect.createProxy(coreService, BusinessService.class);

        // Use the logged service
        loggedService.performOperation();
    }
}
