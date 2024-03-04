package OopsConcepts.ChainofResponsibilityT23;
class Chain{
    Process chain;
    Chain(){
        buildChain();
    }
    void buildChain(){
        chain=new NagetiveProces(new PositiveProces(null));
    }
    void process(int n){
        chain.process(n);
    }
}

abstract class Process{
    private Process nextProcess;

    Process(Process nep){
        nextProcess=nep;
    }

    void process(int n){
        if (nextProcess!=null)
            nextProcess.process(n);
    }
}

class NagetiveProces extends Process{

    NagetiveProces(Process nep) {
       super(nep);
    }
    void process(int n){
        if (n<0)
            System.out.println("number is nagetive resolve with nagative Process");
        else
            super.process(n);
    }
}
class PositiveProces extends Process{

    PositiveProces(Process nep) {
       super(nep);
    }
    void process(int n){
        if (n>=0)
            System.out.println("number is nagetive resolve with Positive Process");
        else
            super.process(n);
    }
}

public class p1 {
    
}
