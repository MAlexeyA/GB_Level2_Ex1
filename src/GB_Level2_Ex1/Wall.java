package GB_Level2_Ex1;

public class Wall implements Obstacles {
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public void crossObstacle(Participant something) {
            if (something.getWallMax() >= wallHeight) {
                System.out.printf("%s %s has jumped the wall (Height %d meters)", something.getTypeParticipant(), something.getName(), wallHeight);
            } else {
                something.setForce(false);
                System.out.printf("%s %s exhausted", something.getTypeParticipant(), something.getName());
            }
        System.out.println();
    }

}
