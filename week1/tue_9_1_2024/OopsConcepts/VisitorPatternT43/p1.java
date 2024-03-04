package OopsConcepts.VisitorPatternT43;


interface Document{
    void read();
}


class  Paragraph implements Document{
    
    Visitore v;
    Paragraph (Visitore v){
        this.v=v;
    }

    @Override
    public void read() {
        v.readParagraph(this);
    }
    
    void readParagraph(){
        System.out.println("reading Paragraph data");
    }

}
class  Image implements Document{

    Visitore v;
    Image (Visitore v){
        this.v=v;
    }



    @Override
    public void read() {
        v.readImage(this);
    }
    void readImage(){
        System.out.println("reading Image data");
    }

}
interface Visitore{
    void readImage(Image d);
    void readParagraph(Paragraph d);
}

public class p1 {
    
}
