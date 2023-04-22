import java.util.*;

public class turingProb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int t = s.nextInt();

            holder [] arr = new holder[5];

            for (int j = 0; j < 5; j++) {
                char temp1 = s.next().charAt(0);
                int temp2 = s.nextInt();
                int temp3 = s.nextInt();
                char temp4 = s.next().charAt(0);
                char temp5 = s.next().charAt(0);

                holder temp = new holder(temp1, temp2, temp3, temp4, temp5);

                arr[j] = temp;
            }

            String tapeT = s.nextLine();
            String [] tape = tapeT.split(" ");

            int repetitions = s.nextInt();

            int tapeIndex = (tapeT.length() / 2) + 1;
            char state = 'A';

            for (int j = 0; j < repetitions; j++) {
                int cur = Integer.parseInt(tape[tapeIndex]);

                for (int k = 0; k < 5; k++) {
                    if (arr[k].one == state && arr[k].two == cur) {
                        tape[tapeIndex] = Integer.toString(arr[k].three);
                        state = arr[k].five;

                        if (arr[k].four == 'R') {
                            tapeIndex++;
                        }

                        else {
                            tapeIndex--;
                        }

                        break;
                    }
                }
            }

            System.out.println(tape.toString());
        }
    }
}

class holder {
    public char one;
    public int two;
    public int three;
    public char four;
    public char five;

    public holder (char one, int two, int three, char four, char five) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
    }
}
