package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class LoggingAspect implements InvocationHandler {
    private Object target;

    public LoggingAspect(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Entering method: " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("Exiting method: " + method.getName());
        return result;
    }
}
