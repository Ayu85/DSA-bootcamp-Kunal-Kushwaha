public class search_element_in_infinite_Array {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 9, 10, 12, 14, 15, 18, 19, 22, 23};
        System.out.println(getIndex(arr, 23));

//    static int getIndex(int[] arr, int key,int size) {
//        int start = size - 2;
//        int p = 1;
//        int end = (size * 2) - 3;
//        if (key >= arr[start] && key <= arr[end]) {
//            int left = start;
//            int right = end;
//            while (left <= right) {
//                int mid = (left + (right - left)) / 2;
//                if (key == arr[mid])
//                    return mid;
//                else if (key > arr[mid])
//                    left = mid + 1;
//                else
//                    right = mid - 1;
//            }
//        } else
//               getIndex(arr,key,size= (int) (size*Math.pow(2,p++)));
//        return 0;
//    }

    }

    static int getIndex(int[] arr, int key) {
        int start = 0;
        int end = 1;
        int ind = search(arr, key, start, end);
        while (key != arr[ind]) {
            int newstart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newstart;
            ind = search(arr, key, start, end);
        }
        return ind;
    }

    static int search(int[] arr, int key, int start, int end) {
        int s = start;
        int e = end;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == key)
                return mid;
            else if (key > arr[mid]) {
                s = mid + 1;
            } else
                e = mid - 1;
        }
        return 1;
    }
}
