public class peak_index_in_mountain_array {
    public static void main(String[] args) {
        int[] arr = {8, 10, 5, 12};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int peak = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1] && arr[i]>arr[peak])
                peak = i;
        }
        return arr[peak] > arr[arr.length - 1] ? peak : arr.length - 1;
    }
}
