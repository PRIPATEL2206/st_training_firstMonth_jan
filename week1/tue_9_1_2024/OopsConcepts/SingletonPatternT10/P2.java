package OopsConcepts.SingletonPatternT10;

public class P2 {
public static void main(String[] args) {
        Logger l1 =Logger.create();
        l1.log("this is log 1");
        Logger l2 =Logger.create();
        l2.log("this is log 2");
}    
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