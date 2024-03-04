package chainOfResponsibility;//Example for chain of Responsibility pattern

class Operation extends RequestHandler{

    public Operation(int level){
        this.level = level;
    }

    @Override
    void handle() {
       System.out.println("Operations team is handling this request........"); 
    }

}