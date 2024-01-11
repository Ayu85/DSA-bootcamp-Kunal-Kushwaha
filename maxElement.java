public class maxElement {
    static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max)
                max=x;
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr={2000,10,3,5,77,85,64};
        System.out.println(max(arr));
    }
}
