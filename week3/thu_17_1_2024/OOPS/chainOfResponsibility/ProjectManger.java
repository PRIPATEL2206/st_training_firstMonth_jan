package chainOfResponsibility;//Example for chain of Responsibility pattern

class ProjectManger extends RequestHandler{

    public ProjectManger(int level){
        this.level = level;
    }

    @Override
    void handle() {
        System.out.println("Project Menager is handling this request........");
    }
}

