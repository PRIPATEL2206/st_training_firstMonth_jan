package visitor;

class ElementVisitor implements Visitor{

    @Override
    public void visit(Image element) {
        System.out.println("Visiting image " + element.fileName + " has size " + element.size);
    }

    @Override
    public void visit(Paragragh element) {
        System.out.println("Visiting pragraph is starting form line no. " + element.startLineNo +  " and ending at line no. " + element.endlineNo + ". It has total " + element.noOfLines + " lines.");
    }
}

