import java.util.ArrayList;
import java.util.List;

public class kNarcissistic {
    public static void main(String[] args) {
        System.out.println(getKN(5));
    }

    public static List<Integer> getKN(int n) {
        int start = (int) Math.pow(10, n - 1);
        int end = (int) Math.pow(10, n);
        List<Integer> res = new ArrayList<>();
        for (int i = start; i < end; i++) {
            if (isNarcissistic(i, n)) {
                res.add(i);
            }
        }
        return res;
    }

    public static boolean isNarcissistic(int i, int n) {
        int sum = 0;
        int number = i;
        while (i > 0) {
            int curr = i % 10;
            sum += (int) Math.pow(curr, n);
            i = i / 10;
        }
        return sum == number;
    }
}