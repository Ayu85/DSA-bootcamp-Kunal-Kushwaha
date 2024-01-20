import java.util.Arrays;

public class first_and_last_position_in_Sorted_array {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 5, 5};
        System.out.println(Arrays.toString(getIndices(arr, 5)));
    }

    static int[] getIndices(int[] arr, int target) {
        int[] temp = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                temp[0] = i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target) {
                temp[1] = i;
                break;
            }
        }
        return temp;
    }
}
