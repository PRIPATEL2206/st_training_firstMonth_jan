package OopsConcepts.DecoratorPatternT39;

interface TextInterFace{
    void display(String s);
}

class SimpleText implements TextInterFace{

    @Override
    public void display(String s) {
        System.out.println(s);
    }
}

abstract class TextDecorater implements TextInterFace{
    TextInterFace t;
    TextDecorater(TextInterFace t){
        this.t=t;
    }
}

class BoldText extends TextDecorater{

    BoldText(TextInterFace t) {
        super(t);
    }

    @Override
    public void display(String s) {
        s+=" (with Bold text)";
        t.display(s);
    }

}
class ItalicText extends TextDecorater{

    ItalicText(TextInterFace t) {
        super(t);
    }

    @Override
    public void display(String s) {
        s+=" (with Italic text)";
        t.display(s);
    }

}


public class p1 {
    
}
