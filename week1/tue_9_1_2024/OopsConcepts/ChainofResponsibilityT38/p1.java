package OopsConcepts.ChainofResponsibilityT38;

class Chain {
    Logger chain;

    Chain() {
        buildChain();
    }

    void buildChain() {
        chain = new Logger1(new Logger2(null));
    }

    void process(int n,String data) {
        chain.log(n,data);
    }
}

abstract class Logger {
    Logger next;

    Logger(Logger l) {
        next = l;
    }

    void log(int n, String data) {
        if (next != null) {
            next.log(n, data);
        }
    }
}

class Logger1 extends Logger {

    Logger1(Logger l) {
        super(l);
    }

    @Override
    public void log(int n, String data) {
        if (n == 1) {

            System.out.println("Logger1 : " + data);
            return;
        }
        super.log(n, data);
    }

}

class Logger2 extends Logger {

    Logger2(Logger l) {
        super(l);
    }

    @Override
    public void log(int n, String data) {
        if (n == 2) {

            System.out.println("Logger2 : " + data);
            return;
        }
        super.log(n, data);
    }

}

public class p1 {

}
