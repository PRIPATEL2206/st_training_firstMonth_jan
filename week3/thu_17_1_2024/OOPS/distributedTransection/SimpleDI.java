package distributedTransection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class SimpleDI {
    final Map<Class<?>, Object> instances = new HashMap<>();

    void registerClass(Class<?> cls) throws Exception {
        if (!cls.isAnnotationPresent(Injectable.class)) {
            throw new IllegalArgumentException("Class not marked as Injectable: " + cls.getName());
        }
        instances.put(cls, cls.getDeclaredConstructor().newInstance());
    }

    void injectDependencies() throws IllegalAccessException {
        for (Object obj : instances.values()) {
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);
                    Object dependency = instances.get(field.getType());
                    if (dependency == null) {
                        throw new IllegalArgumentException("No injectable instance found for: " + field.getType());
                    }
                    field.set(obj, dependency);
                }
            }
        }
    }
}
