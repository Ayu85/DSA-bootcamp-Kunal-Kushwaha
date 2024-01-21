public class peak_index_in_mountain_array {
    public static void main(String[] args) {
        int[] arr = {8,10,15,18,80,7};
        System.out.println(getIndexBinarySeacrh(arr));
    }


//    using linear search
    static int peakIndexInMountainArray(int[] arr) {
        int peak = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[peak])
                peak = i;
        }
        return peak;
    }
//using binary search
    static int getIndexBinarySeacrh(int[] arr) {
        int peak = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) {
                peak = mid;
                right=mid-1;
            } else
                left = mid + 1;
        }
        return peak;
    }
}
