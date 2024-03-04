package OopsConcepts.DecoratorPatternT39;

public class p2 {
    public static void main(String[] args) {
        SimpleText s=new SimpleText();
        s.display("data1");
        BoldText b=new BoldText(s);
        b.display("data2");
        ItalicText i=new ItalicText(s);
        i.display("data3");
    }
}
