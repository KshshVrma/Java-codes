
import java.util.*;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        double ct = Double.valueOf(c);
        ct = ct * 24 * 60 * 60;
        System.out.println("the number of seconds are " + ct);
        sc.close();
    }
}
