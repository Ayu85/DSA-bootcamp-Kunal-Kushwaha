import java.util.Arrays;

public class rotate_by_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("before rotation: ");
        System.out.println(Arrays.toString(arr));
        rotate(arr);
        System.out.println("after rotation: ");
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int arr[]) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }


}
