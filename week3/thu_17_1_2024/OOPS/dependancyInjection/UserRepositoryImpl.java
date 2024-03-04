package dependancyInjection;

class UserRepositoryImpl implements UserRepository {
    @Override
    public void saveUser(String username) {
        System.out.println("User '" + username + "' saved.");
    }
}
