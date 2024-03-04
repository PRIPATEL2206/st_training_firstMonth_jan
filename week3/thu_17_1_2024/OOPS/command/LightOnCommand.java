package command;//Example for Command Pattern

class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.setOn(true);

    }
}

