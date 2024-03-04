package aopLogging;

// BusinessServiceImpl is the implementation of the core business logic
class BusinessServiceImpl implements BusinessService {
    @Override
    public void performOperation() {
        System.out.println("Performing the core operation");
    }
}
