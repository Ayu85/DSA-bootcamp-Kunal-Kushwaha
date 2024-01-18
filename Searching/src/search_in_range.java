public class search_in_range {
    public static void main(String[] args) {
    int[] arr={2,-1,5,0,-6,4,8};
        System.out.println(search(arr,-6,1,4));
    }
    static int search(int[] arr,int target,int start,int end){
        for(int i=start;i<=end;i++)
        {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }

}
