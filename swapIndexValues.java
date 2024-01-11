import java.util.Arrays;

public class swapIndexValues {
    static void swap(int[] nums,int i1,int i2){
        int temp=nums[i1];
        nums[i1]=nums[i2];
        nums[i2]=temp;
    }
    public static void main(String[] args) {
        int [] arr={3,2,5,10,4,5};
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
}
