package cmd.java.cmdpattern;

public class LightOffCommand implements Command {
    Light light;

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }
}
