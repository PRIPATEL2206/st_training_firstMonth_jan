package dependancyInjection;

import java.util.HashMap;
import java.util.Map;

// Dependency container to manage dependencies
class DependencyContainer {
    private Map<Class<?>, Object> dependencyMap = new HashMap<>();

    public <T> void registerDependency(Class<T> type, T instance) {
        dependencyMap.put(type, instance);
    }

    public <T> T getDependency(Class<T> type) {
        return type.cast(dependencyMap.get(type));
    }

    public <T extends Injectable> T createInstance(Class<T> type) throws IllegalAccessException, InstantiationException {
        T instance = type.newInstance();
        instance.injectDependencies(this);
        return instance;
    }
}
