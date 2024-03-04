package aspectUsingAop;

class ServiceProxy implements IService {
    private IService service;

    public ServiceProxy(IService service) {
        this.service = service;
    }

    @Override
    public void performTask() {
        try {
            log("Before performing the task");
            service.performTask();
            log("Task completed successfully");
        } catch (Exception e) {
            log("Error occurred: " + e.getMessage());
        }
    }

    private void log(String message) {
        System.out.println(message);
    }
}
