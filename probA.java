import java.util.Scanner;

class probA {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                System.out.println(input.nextLine());
            }
        }
    }
}