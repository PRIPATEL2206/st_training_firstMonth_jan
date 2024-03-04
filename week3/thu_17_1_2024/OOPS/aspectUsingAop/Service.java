package aspectUsingAop;

class Service implements IService {
    @Override
    public void performTask() {
        System.out.println("Task is being performed.");
    }
}
