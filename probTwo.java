import java.util.*;

public class probTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            int y = s.nextInt();

            if (x > y) {
                int ans = Math.abs(x - y);

                String out = "Cassowary Craft sold " + ans + " more aircraft";

                System.out.println(out);
                continue;
            }

            if (y > x) {
                int ans = Math.abs(x - y);

                String out = "Lead Balloons Ltd sold " + ans + " more aircraft";

                System.out.println(out);
                continue;
            }

            if (x == y) {
                System.out.println("Cassowary Craft and Lead Balloons Ltd sold the same number of aircraft");
                continue;
            }
        }
    }
}
