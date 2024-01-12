import java.util.Arrays;

public class runningSum {
    static int[] getRunningSum(int[] arr,int n){
        int sum=0;
        int runningSum[]=new int [n];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            runningSum[i]=sum;
        }
        return runningSum;
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,10,1};
        System.out.println(Arrays.toString(getRunningSum(arr,arr.length)));
    }
}
