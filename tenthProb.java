import java.util.*;

public class tenthProb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++){
            int len = s.nextInt();

            double [] arr1 = new double[len];
            double [] arr2 = new double[len];

            for (int j = 0; j < len; j++) {
                arr1[j] = s.nextDouble();
            }

            for (int j = 0; j < len; j++) {
                arr2[j] = s.nextDouble();
            }

            double sum = 0;

            for(int j = 0; j < len; j++){
                sum += arr2[j] - arr1[j];
            }
            double fin = sum / ((double) len);
            
            System.out.printf("%.2f", fin);
            System.out.println();
        }
        
    }
}
