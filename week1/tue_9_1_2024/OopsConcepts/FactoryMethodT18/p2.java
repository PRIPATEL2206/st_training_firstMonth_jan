package OopsConcepts.FactoryMethodT18;

class PDFDocument implements Document {

    @Override
    public void print() {
        System.out.println("Pdf Docuent is printed");
    }

}

class WordDocument implements Document {

    @Override
    public void print() {
        System.out.println("Word Docuent is printed");
    }

}

public class p2 {
    public static void main(String[] args) {
        PDFDocument pd=new PDFDocument();
    WordDocument wd=new WordDocument();

    pd.print();
    wd.print();
    }

}
