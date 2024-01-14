public class count_even_digits_in_array {
    static int findNumbers(int[] nums) {
        int evenCount=0;
        for(int i=0;i<nums.length;i++){
            int org=nums[i];
            int c=0;
            while(org>0){
                int rem=org%10;
                c++;
                org/=10;
            }
            if(c%2==0)
                evenCount++;
        }
        return evenCount;
    }

    public static void main(String[] args) {
        int[] arr={231,22,1,3,5685};
        System.out.println(findNumbers(arr));
    }
}
