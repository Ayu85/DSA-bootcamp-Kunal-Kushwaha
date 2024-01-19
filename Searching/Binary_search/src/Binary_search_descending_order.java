public class Binary_search_descending_order {

//    static int search(int[] arr, int target) {
//        if (arr[0] > arr[arr.length-1]) {
//            int left=0;
//            int right=arr.length-1;
//            while(left<=right){
//                int mid=(left+right)/2;
//                if(arr[mid]==target)
//                    return mid;
//                else if(target>arr[mid])
//                    right=mid-1;
//                else
//                    left=mid+1;
//            }
//
//        } else {
//            int left = 0;
//            int right = arr.length - 1;
//            while (left <= right) {
//                int mid = (left + right) / 2;
//                if (arr[mid] == target)
//                    return mid;
//                else if (arr[mid] > target) {
//                    right = mid - 1;
//                } else
//                    left = mid + 1;
//            }
//        }
//        return -1;
//    }

    static int search(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        boolean isAsc=arr[left]<arr[right];
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target)
                return mid;
            if(isAsc){
                if(target>arr[mid])
                    left=mid+1;
                else
                    right=mid-1;
            }
            else
            {
                if(target>arr[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }
        }


        return -1;
    }
    public static void main(String[] args) {
    int[] arr={2,4,5,6,8,9};
    int[] arr2={10,8,5,3,2,-14};
        System.out.println(search(arr,8));
    }
}
