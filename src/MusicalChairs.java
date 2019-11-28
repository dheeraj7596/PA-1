import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MusicalChairs {
    public static int play(int m, List<Integer> time) {
        if (m == 0) {
            return -1;
        }
        int n = time.size();
        List<Integer> people = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            people.add(i);
        }
        for (int i = 0; i < n; i++) {
            int t = time.get(i);
            people = rot(people, t);
            people.remove(people.size() - 1);
        }
        return people.get(0);
    }

    private static List<Integer> rot(List<Integer> arr, int k) {
        int len = arr.size();
        Integer[] newArray = new Integer[len];
        for (int i = 0; i < len; i++) {
            newArray[(i + k) % len] = arr.get(i);
        }
        List<Integer> temp = new ArrayList<>();
        Collections.addAll(temp, newArray);
        return temp;
    }

    public static void main(String[] args) {
        int ans = play(8, Arrays.asList(3, 5, 8, 21, 5, 2, 0));
        System.out.println(ans);
    }
}
