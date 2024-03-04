package OopsConcepts.CommandPatternT32;


class TurnOnCommand implements RemoteControl{

    @Override
    public void execute() {
      System.out.println("Turn On Command is exucuted");   
    }

}
class TurnOffCommand implements RemoteControl{

    @Override
    public void execute() {
      System.out.println("Turn Off Command is exucuted");   
    }

}

public class p2 {
    public static void main(String[] args) {
        RemoteControl ton=new TurnOnCommand();
        RemoteControl toff=new TurnOffCommand();
        ton.execute();
        toff.execute();
    }
}
