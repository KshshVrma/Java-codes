import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("do you want to continue? ");
            String c = sc.nextLine();
            if (c.equals("no")) {
                break;
            }
        }
    }
}
