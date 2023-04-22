import java.util.*;

public class firstProb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int ans = 1;

            while (s.hasNext()) {
                String input = s.next();

                if (input.equals("Nimo")) {
                    System.out.println(ans);
                    break;
                }

                ans++;
            }

            s.nextLine();

            continue;
        }
    }
}
