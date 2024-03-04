package OopsConcepts.SingletonPatternT10;

public class P1 {
    
}

class Logger{
    private static Logger instance=null;

    private Logger(){
                System.out.println("loger is constructed");

    }

    static Logger create(){
        if (instance==null) {
            instance=new Logger();
        }
        return instance;
    }
    void log(String msg){
        System.out.println(msg);
    }
}