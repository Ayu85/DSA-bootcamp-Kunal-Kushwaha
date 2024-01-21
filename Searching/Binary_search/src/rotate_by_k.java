import java.util.Arrays;

public class rotate_by_k {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("before rotation: ");
        System.out.println(Arrays.toString(arr));
        rotateByK(arr,2);
        System.out.println("after rotation: ");
        System.out.println(Arrays.toString(arr));
    }

    static void rotateByK(int[] arr, int k) {
        int temp[] = new int[k];
//        storing the k+1 elements in temp array
        int j = 0;
        for (int i = k + 1; i < arr.length; i++) {
            temp[j++] = arr[i];
        }
//        move the starting elements to the end
        int m=2;
        for (int i = k; i >= 0; i--) {
            arr[m+2] = arr[i];
            m--;

        }
//        place the temp array elemtns in the starting of array
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}
