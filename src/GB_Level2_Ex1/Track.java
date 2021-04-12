package GB_Level2_Ex1;

public class Track implements Obstacles {
    private int trackLength;

    public Track(int trackLength) {
        this.trackLength = trackLength;
    }

    public void crossObstacle(Participant something) {
            if (something.getTrackMax() >= trackLength) {
                System.out.printf("%s %s has run the track (Length %d meters)", something.getTypeParticipant(), something.getName(), trackLength);
            } else {
                something.setForce(false);
                System.out.printf("%s %s exhausted", something.getTypeParticipant(), something.getName());
            }
        System.out.println();
    }

}
