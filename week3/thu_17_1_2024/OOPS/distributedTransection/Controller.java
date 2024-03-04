package distributedTransection;

@Injectable
class Controller {
    @Inject
    private Service service;

    void doSomething() {
        service.serve();
    }
}
