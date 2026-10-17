package Practice11;

public class Main {
    static void main() {
        firstSteps();
    }

    private static void firstSteps() {
        Robot robot = new Robot(Direction.UP, 5, 5);
        System.out.println("robot = " + robot);
        robot.turnRight();
        System.out.println("robot = " + robot);
        robot.turnRight();
        System.out.println("robot = " + robot);
        robot.stepForward();
        System.out.println("robot = " + robot);
    }
}
