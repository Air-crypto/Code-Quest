import java.util.*;

class thirdProb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int maxCount = 0;
            String kString = "";
            for (int j=0;j<b;j++){
                String s = scan.next();
                int count = 0;
                for (int k=0;k<s.length();k++){
                    int ans = s.charAt(k)-65+a;
                    ans = ans%26;
                    if(count>maxCount){
                        count = maxCount;
                        kString = s;
                    }
                }
                
            }
            System.out.println("WINNER " + a +": " + kString);
        }

    }
}