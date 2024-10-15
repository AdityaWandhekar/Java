import java.util.*;

public class String_2 {
    // Given a route containing 4 direction find the shortest path to reach
    // destination.

    public static float shortestPath(String direction) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < direction.length(); i++) {
            if (direction.charAt(i) == 'n') {
                y++;
            } else if (direction.charAt(i) == 's') {
                y--;
            } else if (direction.charAt(i) == 'e') {
                x++;
            } else if (direction.charAt(i) == 'w') {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String direction = sc.nextLine();

        float displacement = shortestPath(direction);
        System.out.println("The shortest path is : " + displacement);
        sc.close();
    }
}
