package aspectUsingAop;

public class aspectUsingAop {
    public static void main(String[] args) {
        IService service = new ServiceProxy(new Service());
        service.performTask();
    }
}

