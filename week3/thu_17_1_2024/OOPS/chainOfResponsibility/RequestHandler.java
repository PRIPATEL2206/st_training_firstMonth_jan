package chainOfResponsibility;//Example for chain of Responsibility pattern

abstract class RequestHandler {

    public static final int DESIGN_PROJECT = 3;
    public static final int WRITE_CODE = 1;
    public static final int DEPLOY_CODE = 2;

    int level;

    RequestHandler nextRequestHandler;

    public void setNextHandler(RequestHandler nextRequestHandler){
        this.nextRequestHandler = nextRequestHandler;
    }

    public void handleRequest(int level, String message){
        if(this.level == level){

            System.out.println("Recived request: " + message);
            handle();
        }
        if (nextRequestHandler != null) {
            nextRequestHandler.handleRequest(level, message);
        }
    }

    abstract void handle();

}

