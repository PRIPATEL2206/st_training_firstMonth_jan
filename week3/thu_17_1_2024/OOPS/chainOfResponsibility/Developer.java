package chainOfResponsibility;//Example for chain of Responsibility pattern

class Developer extends RequestHandler{

    public Developer(int level){
        this.level = level;
    }

    @Override
    void handle() {
        System.out.println("Developers are handling this request........");
    }

}

