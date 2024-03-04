package visitor;

class Paragragh implements Element{

    int noOfLines;
    int startLineNo;
    int endlineNo;

    public Paragragh(int noOfLines, int startLineNo, int endlineNo){
        this.noOfLines  = noOfLines;
        this.endlineNo = endlineNo;
        this.startLineNo = startLineNo;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

