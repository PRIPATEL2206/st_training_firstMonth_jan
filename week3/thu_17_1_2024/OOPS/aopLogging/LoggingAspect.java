package aopLogging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// LoggingAspect is the aspect containing the logging behavior
class LoggingAspect implements InvocationHandler {

    private Object target;

    public LoggingAspect(Object target) {
        this.target = target;
    }

    // Create a proxy with logging behavior
    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType},
                new LoggingAspect(target)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log before method execution
        System.out.println("Before method: " + method.getName());

        // Invoke the original method
        Object result = method.invoke(target, args);

        // Log after method execution
        System.out.println("After method: " + method.getName());

        return result;
    }
}
