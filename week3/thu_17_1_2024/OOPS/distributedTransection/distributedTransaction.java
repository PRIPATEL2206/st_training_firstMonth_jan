package distributedTransection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class distributedTransaction {
    public static void main(String[] args) throws Exception {
        SimpleDI di = new SimpleDI();
        di.registerClass(Service.class);
        di.registerClass(Controller.class);
        di.injectDependencies();

        Controller controller = (Controller) di.instances.get(Controller.class);
        controller.doSomething();
    }
}
