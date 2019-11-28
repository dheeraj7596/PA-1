import java.util.Arrays;

public class RotateArray {
    public static int[] rotate(int[] arr, int k) {
        int len = arr.length;
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[((i + k) % len + len) % len] = arr[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] p = {3, 4, 8, 9, 5, 6};
        int[] temp = rotate(p, -176);
        System.out.println(Arrays.toString(temp));
    }
}
