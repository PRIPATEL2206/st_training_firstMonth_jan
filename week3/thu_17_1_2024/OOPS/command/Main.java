package command;//Example for Command Pattern

public class Main {
    public static void main(String[] args) {

        Light l1 = new Light();

        Command lightOn = new LightOnCommand(l1);
        Command lightOff = new LightOffCommand(l1);
        
        //Turing on the light using command
        lightOn.execute();
        //Print current status of light which is on hence 'true'
        System.out.println(l1.getOn());

        //Turing off the light usign command
        lightOff.execute();
        //Print current status of light which is off hence 'true'
        System.out.println(l1.getOn());
    }
}

