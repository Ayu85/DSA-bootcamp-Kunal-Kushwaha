public class linear_search {

    static int search(int[] arr,int target){
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,6,5,1,-0,3};
        System.out.println(search(arr,-0));
    }
}
