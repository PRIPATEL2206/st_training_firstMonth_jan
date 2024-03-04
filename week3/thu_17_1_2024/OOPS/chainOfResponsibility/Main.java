package chainOfResponsibility;//Example for chain of Responsibility pattern

public class Main {
    
    public static void main(String[] args) {
        
        RequestHandler requestHandlerChain = getChainOfHandlers();

        requestHandlerChain.handleRequest(3, "Create desing for Hospital management system.");
        requestHandlerChain.handleRequest(1,"Write code for the Hospital management system.");
        requestHandlerChain.handleRequest(2, "Hospital manangement system's code is ready. Deploy it.");

    }

    private static RequestHandler getChainOfHandlers(){
        RequestHandler projectManager = new ProjectManger(3);
        RequestHandler developers = new Developer(1);
        RequestHandler operations = new Operation(2);

        projectManager.setNextHandler(operations);
        operations.setNextHandler(developers);

        return projectManager;
    }

}

