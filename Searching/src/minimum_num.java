public class minimum_num {
    public static void main(String[] args) {
        int[] nums={2,4,3,8,-9};
        System.out.println(getMin(nums));
    }
    static int getMin(int [] nums){
        int min=Integer.MAX_VALUE;
        int min2=nums[1];
        for(int x:nums) {
            if (x < min ) {
                min2 = min;
                min = x;
            }
            else
                min2=x;
        }

        return min2;
    }
}
