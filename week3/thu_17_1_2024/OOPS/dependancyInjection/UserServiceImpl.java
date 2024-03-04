package dependancyInjection;

class UserServiceImpl implements UserService, Injectable {
    private UserRepository userRepository;

    public UserServiceImpl() {
        // Dependencies will be injected
    }

    @Override
    public void createUser(String username) {
        userRepository.saveUser(username);
    }

    @Override
    public void injectDependencies(DependencyContainer container) {
        this.userRepository = container.getDependency(UserRepository.class);
    }
}
