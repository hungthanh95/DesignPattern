package cmdpattern;

public class LightOffCommand implements Command {
    Light light;

    @Override
    public void execute() {
        light.off();
    }
    public LightOffCommand(Light light) {
        this.light = light;
    }
}
