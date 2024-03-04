package OopsConcepts.CommandPatternT47;


class TurnOnLightsCommand implements RemoteControl{

    @Override
    public void execute() {
      System.out.println("TurnOnLights Command is exucuted");   
    }

}
class TurnOffACCommand implements RemoteControl{

    @Override
    public void execute() {
      System.out.println("TurnOffAC Command is exucuted");   
    }

}

public class p2 {
    public static void main(String[] args) {
        RemoteControl tonl=new TurnOnLightsCommand();
        RemoteControl toffAc=new TurnOffACCommand();
        tonl.execute();
        toffAc.execute();
    }
}
