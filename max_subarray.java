public class max_subarray {
    static int maxSubArray(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                    sum+=nums[j];
                if(sum>maxSum)
                    maxSum=sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr={5,4,-1,7,8};
        int [] arr2={-2,1};
        System.out.println(maxSubArray(arr2));
    }
}
