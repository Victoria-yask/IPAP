package Task.task235;
import Practice10.segment.Point;
import java.util.HashSet;
import java.util.Set;

public class Robot {
    int x, y;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int getMove(char[] commands){
        Set<Point> move = new HashSet<>();
        int x = 0, y = 0;
        int dx = 0, dy = 1;
        int steps = 0;

        for (char c : commands) {
            if (c == 'S') {
                x += dx;
                y += dy;
                steps++;

                Point p = new Point(x, y);
                if (move.contains(p)) {
                    return steps;
                }
                move.add(p);

            } else if (c == 'L') {
                int tmp = dx;
                dx = -dy;
                dy = tmp;
            } else if (c == 'R') {
                int tmp = dx;
                dx = dy;
                dy = -tmp;
            }
        }
        return -1;
    }
}



