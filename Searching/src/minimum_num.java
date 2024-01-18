public class minimum_num {
    public static void main(String[] args) {
        int[] nums={5,4,1,3,8,-9,-2};
        System.out.println(getMin(nums));
    }
    static int getMin(int [] nums){
        int min=Integer.MAX_VALUE;
        for(int x:nums)
            if(x<min)
                min=x;

        return min;
    }
}
