import java.util.Arrays;

public class reverseArray {
    static void swap(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
