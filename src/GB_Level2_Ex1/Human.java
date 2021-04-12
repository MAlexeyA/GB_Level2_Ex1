package GB_Level2_Ex1;

public class Human implements Participant  {
    private String name;
    private int trackMax;
    private int wallMax;
    private boolean force;
    private static String typeParticipant = "Human";

    public Human(String name, int trackMax, int wallMax, boolean force) {
        this.name = name;
        this.trackMax = trackMax;
        this.wallMax = wallMax;
        this.force = force;
    }

    public void run(){
        System.out.printf("Human %s ran", name);
        System.out.println();
    }

    public void jump(){
        System.out.printf("Human %s jumped", name);
        System.out.println();
    }

    public int getTrackMax() {
        return trackMax;
    }

    public int getWallMax() {
        return wallMax;
    }

    public String getName() {
        return name;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }


    public String getTypeParticipant() {
        return typeParticipant;
    }
}
