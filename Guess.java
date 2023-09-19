import java.util.*;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int wow = random.nextInt(100);
        int flag = 0;
        System.out.println("guess a number from 0-99");
        while (flag == 0) {

            int t = sc.nextInt();
            if (t == wow) {
                System.out.println("You guessed the number well done!");
                break;
            } else if (t < wow) {
                System.out.println("guess a bigger number");
            } else {
                System.out.println("guess a smaller number");
            }

        }
        sc.close();
    }

}
