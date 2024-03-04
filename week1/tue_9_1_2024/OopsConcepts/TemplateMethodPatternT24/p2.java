package OopsConcepts.TemplateMethodPatternT24;


class Football extends Game{

    @Override
    void initialize() {
       System.out.println("Foot Ball Game is Initialize");
    }
    
    @Override
    void startPlay() {
        System.out.println("Foot Ball Game is Initialize");
    }
    
    @Override
    void endPlay() {
        System.out.println("Foot Ball Game is Initialize");
    }
}

class Basketball extends Game{

    @Override
    void initialize() {
       System.out.println("Foot Basket Game is Initialize");
    }
    
    @Override
    void startPlay() {
        System.out.println("Foot Basket Game is Initialize");
    }
    
    @Override
    void endPlay() {
        System.out.println("Foot Basket Game is Initialize");
    }
}

public class p2 {
    public static void main(String[] args) {
        Game g1=new Basketball();
        Game g2=new Football();

        g1.initialize();
        g1.startPlay();
        g1.endPlay();

        g2.initialize();
        g2.startPlay();
        g2.endPlay();
    }
}
