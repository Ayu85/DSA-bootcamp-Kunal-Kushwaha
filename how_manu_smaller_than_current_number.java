import java.util.Arrays;

public class how_manu_smaller_than_current_number {
    static int[] getArr(int[] nums){
        int [] temp=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int k=0;k<nums.length;k++){
                if(nums[k]<nums[i]){
                    count++;
                }
            }
            temp[j++]=count;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr={6,5,4,8};
        System.out.println(Arrays.toString(getArr(arr)));
    }
}
