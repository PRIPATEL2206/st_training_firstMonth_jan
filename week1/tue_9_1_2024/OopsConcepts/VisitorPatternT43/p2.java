package OopsConcepts.VisitorPatternT43;

class ConcreteVisitore implements Visitore{

    @Override
    public void readImage(Image d) {
        d.readImage();
    }

    @Override
    public void readParagraph(Paragraph d) {
        d.readParagraph();
    }

}

public class p2 {
    public static void main(String[] args) {
        Visitore v= new ConcreteVisitore();
        Image i= new Image(v);
        Paragraph p= new Paragraph(v);
        i.read();
        p.read();
    }
}
