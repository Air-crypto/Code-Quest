import java.util.*;

public class sixthProb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        for (int i = 0; i < n; i++) {
            String input = s.nextLine();

            input = input.toLowerCase();

            boolean found = false;
            boolean one = false;
            boolean two = false;
            boolean three = false;

            String [] arr = {"' OR 1=1", "&& sudo", "&& su -", ";;", "<script", "%s", "%x", "%n"};

            for (int j = 0; j < arr.length; j++) {
                if (input.contains(arr[j])) {
                    System.out.println("REJECTED");
                    found = true;
                    break;
                }

                if ()
            }

            if (found) {
                continue;
            }
        }
    }
}
