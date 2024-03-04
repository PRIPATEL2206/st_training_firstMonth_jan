package OopsConcepts.CommandPatternT17;

class Light{
    void on(){
        System.out.println("now light is on");
    }
    void off(){
        System.out.println("now light is off");
    }
}

class LightOnCommand implements Command{
    Light l;
    LightOnCommand(Light l){
        this.l=l;
    }

    @Override
    public void execute() {
        l.on();
    }

}
class LightOffCommand implements Command{
    Light l;
    LightOffCommand(Light l){
        this.l=l;
    }

    @Override
    public void execute() {
        l.off();
    }

}

public class p2 {
    public static void main(String[] args) {
        Light l=new Light();
        LightOnCommand lon=new LightOnCommand(l);
        LightOffCommand lof=new LightOffCommand(l);
        lon.execute();
        lof.execute();
    }
}
