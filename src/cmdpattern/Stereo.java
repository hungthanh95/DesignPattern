package cmdpattern;

public class Stereo {
    String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(room + " stereo is on!!!");
    }

    public void off() {
        System.out.println(room + " stereo is off!!!");
    }

    public void setCD() {
        System.out.println(room + " stereo is set for CD input!!!");
    }

    public void setVolume() {
        System.out.println(room + " stereo volume set to 11!!!");
    }
}
