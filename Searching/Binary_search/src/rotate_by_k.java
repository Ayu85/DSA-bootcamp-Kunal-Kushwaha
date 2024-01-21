import java.util.Arrays;

public class rotate_by_k {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println("before rotation: ");
        System.out.println(Arrays.toString(arr));
        rotateByK(arr,3);
        System.out.println("after rotation: ");
        System.out.println(Arrays.toString(arr));
    }

    static void rotateByK(int[] arr, int k) {
        int temp[] = new int[k];
//        storing the k+1 elements in temp array
        int j = 0;
        for (int i = arr.length - k; i < arr.length; i++) {
            temp[j++] = arr[i];
        }
//        move the starting elements to the end
        for (int i = arr.length-k-1; i >= 0; i--) {
            arr[i+k] = arr[i];
        }
//        place the temp array elemtns in the starting of array
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}
