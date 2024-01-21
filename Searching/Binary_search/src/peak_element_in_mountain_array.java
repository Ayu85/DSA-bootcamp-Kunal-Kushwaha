public class peak_element_in_mountain_array {
    public static void main(String[] args) {
        int[] arr={0,1,2,4,2,1};
        System.out.println(getPeak(arr,3));
    }
    static int getPeak(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target)
            {
                return mid;
//                right-mid-1;
            }
            else if(arr[mid]>target)
                right=mid-1;
            else
                left=mid+1;
        }
        return -1;
    }
}
