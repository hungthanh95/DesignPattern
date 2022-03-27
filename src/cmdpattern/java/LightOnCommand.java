package cmd.java.cmdpattern;

public class LightOnCommand implements Command {
    Light light;

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }
}
