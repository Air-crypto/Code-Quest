import java.util.*;

public class fifthProb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        for (int i = 0; i < n; i++) {
            String first = s.nextLine();
            String second = s.nextLine();

            String [] arr1 = first.split(" ");
            String [] arr2 = second.split(" ");

            String ans = "";
            int counter = 0;

            for (int j = 0; j < arr1.length; j++) {
                if (Double.parseDouble(arr1[j]) >= 0.6 && Double.parseDouble(arr1[j]) <= 0.85 && Double.parseDouble(arr2[j]) >= 0.6 && Double.parseDouble(arr2[j]) <= 0.85) {
                    ans += Integer.toString(j) + " ";
                    counter++;
                }
            }

            if (ans.length() == 0) {
                System.out.println("No multipaction events detected.");
                continue;
            }

            String fin = ans.substring(0, ans.length() - 1);

            if (counter == 1) {
                System.out.println("A multipaction event was detected at time index " + fin + ".");
                continue;
            }

            System.out.println(Integer.toString(counter) + " multipaction events were detected at time indices: " + fin + ".");
            continue;
        }
    }
}
