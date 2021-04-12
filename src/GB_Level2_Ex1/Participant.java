package GB_Level2_Ex1;

public interface Participant {
    public void run();
    public void jump();
    public int getTrackMax();
    public int getWallMax();
    public String getName();
    public boolean isForce();
    public void setForce(boolean force);
    public String getTypeParticipant();
}
