package cmdpattern;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(int numOfSlot) {
        this.onCommands = new Command[numOfSlot];
        this.offCommands = new Command[numOfSlot];

        Command noCommand = new NoCommand();
        for (int i = 0; i < numOfSlot; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----------Remote Control ---------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }

}
