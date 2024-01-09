import example.MathUtils;
import example.Today;

public class Man {
    public static void main(String[] args) {
        int result = MathUtils.add(5, 3);
        System.out.println(result); // Output: 8
        Today day = new Today(43);
        day.get();
    }
}