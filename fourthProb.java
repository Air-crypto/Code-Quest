import java.util.*;

public class fourthProb {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int numTestCases = s.nextInt();
        for(int i = 0; i<numTestCases; i++){
            int numC = s.nextInt();
            int numT = s.nextInt();
            ArrayList <String> cats = new ArrayList<String>();
            ArrayList <Integer> money = new ArrayList<Integer>();
            for(int j = 0; j<numC; j++){
                cats.add(s.next());
                money.add(s.nextInt());
                s.nextLine();

            }
            for(int k = 0; k<numT; k++){
                if(s.next().equals(cats.indexOf(k))){
                    if(s.next().equals("+")){
                        int a = money.indexOf(k);
                        
                        money.indexOf(k)+=s.nextInt();
                    }
                    else if(s.next().equals("-")){
                        money.indexOf(k)-=s.nextInt();
                    }

                }
                if(money.indexOf(k)>0) System.out.println("YES");
                if(money.indexOf(k)<0) System.out.println("NO");

            }

        }
    }
}
