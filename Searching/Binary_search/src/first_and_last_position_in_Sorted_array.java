import java.util.Arrays;

public class first_and_last_position_in_Sorted_array {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 5, 5};

    }

    static int[] searchRange(int[] nums, int target) {
        int[] temp = new int[2];
        int start = searchFirst(nums, target);
        int end = searchLast(nums, target);
        temp[0] = start;
        temp[1] = end;
        return temp;
    }

    static int searchFirst(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                ans=mid;
                right=mid-1;
            }
            else if(target>arr[mid])
                left=mid+1;
            else
                right=mid-1;
        }
        return ans;
    }
    static int searchLast(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int ans=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(target>arr[mid])
                left=mid+1;
            else
                right=mid-1;
        }
        return ans;
    }
//    static int[] getIndices(int[] arr, int target) {
//        int[] temp = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                temp[0] = i;
//                break;
//            }
//        }
//        for(int i=arr.length-1;i>=0;i--){
//            if(arr[i]==target) {
//                temp[1] = i;
//                break;
//            }
//        }
//        return temp;
//    }
}
