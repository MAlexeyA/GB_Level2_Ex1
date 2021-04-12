package GB_Level2_Ex1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Robot robot1 = new Robot("Steal", 5, 5, true);
        robot1.run();
        robot1.jump();

        Cat cat1 = new Cat("Koks", 5, 5, true);
        cat1.run();
        cat1.jump();

        Human human1 = new Human("Sergey", 5, 5, true);
        human1.run();
        human1.jump();

        Participant[] participants = new Participant[12];
        participants[0] = new Cat("A", 20, 1, true);
        participants[1] = new Cat("B", 10, 2, true);
        participants[2] = new Cat("C", 25, 3, true);
        participants[3] = new Cat("D", 15, 4, true);

        participants[4] = new Human("A", 200, 1, true);
        participants[5] = new Human("B", 100, 2, true);
        participants[6] = new Human("C", 250, 3, true);
        participants[7] = new Human("D", 150, 4, true);

        participants[8] = new Robot("A", 500, 2, true);
        participants[9] = new Robot("B", 700, 4, true);
        participants[10] = new Robot("C", 2500, 6, true);
        participants[11] = new Robot("D", 1500, 8, true);

        Obstacles[] obstacles = new Obstacles[10];

        obstacles[0] = new Wall(1);
        obstacles[1] = new Track(150);
        obstacles[2] = new Wall(2);
        obstacles[3] = new Track(250);
        obstacles[4] = new Wall(3);
        obstacles[5] = new Track(350);
        obstacles[6] = new Wall(4);
        obstacles[7] = new Track(450);
        obstacles[8] = new Wall(8);
        obstacles[9] = new Track(1000);

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
              if (participants[i].isForce()) {
                      obstacles[j].crossObstacle(participants[i]);
                  }
              }
            }
        }

    }


