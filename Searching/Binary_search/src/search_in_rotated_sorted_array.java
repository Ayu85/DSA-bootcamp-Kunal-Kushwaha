public class search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3};
        System.out.println(getPivot(arr));
    }

    static int getPivot(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1] && mid < right) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1] && mid > left) {
                return mid - 1;
            }
            if (arr[mid] <= arr[left])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return pivot;
    }
}
