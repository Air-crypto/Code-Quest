import java.util.*;

public class seventhProb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numCases = s.nextInt();
        for(int i = 0; i<numCases; i++){
            int numSystems = s.nextInt();
            
            int[] lowArr = new int[numSystems];
            int[] medArr = new int[numSystems];
            int[] highArr = new int[numSystems];
            for(int j = 0; j<numSystems; j++){
                String str = s.next();
                if(str.equals("LOW")){
                    lowArr[j] = s.nextInt();
                }
                else if(str.equals("MEDIUM")){
                    medArr[j] = s.nextInt();
                }
                else if(str.equals("HIGH")){
                    highArr[j] = s.nextInt();
                }
                s.nextLine();
            }
            int sum = 0;
            for(int a = 0; a<lowArr.length; a++){
                sum+=lowArr[a];
            }
            for(int a = 0; a<medArr.length; a++){
                sum+=medArr[a]*2;
            }
            for(int a = 0; a<highArr.length; a++){
                sum+=highArr[a]*3;
            }
            System.out.println(sum/numSystems);
        }

    }
                
}
