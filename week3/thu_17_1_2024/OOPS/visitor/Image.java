package visitor;

class Image implements Element{

    String fileName;
    float size;

    public Image(String fileName, float size){
        this.fileName = fileName;
        this.size = size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
