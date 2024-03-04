package dependancyInjection;

import java.util.HashMap;
import java.util.Map;

public class DependencyInjectionFrameworkExample {
    public static void main(String[] args) {
        // Setup Dependency Container
        DependencyContainer container = new DependencyContainer();

        // Register dependencies
        container.registerDependency(UserRepository.class, new UserRepositoryImpl());

        try {
            // Create an instance of UserServiceImpl with injected dependencies
            UserService userService = container.createInstance(UserServiceImpl.class);

            // Use the service
            userService.createUser("John Doe");
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

