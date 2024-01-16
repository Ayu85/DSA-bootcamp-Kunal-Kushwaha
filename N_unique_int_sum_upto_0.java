import java.util.Arrays;

public class N_unique_int_sum_upto_0 {
    static int[] sumZero(int n) {
        int[] temp=new int[n];
        int j=1;
        boolean c=true;
        for(int i=0;i<n-1;i+=2){
            temp[i]=-j;
            temp[i+1]=j;
            j++;
        }
        if(n%2!=0)
            temp[n-1]=0;
        return temp;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
}
