import java.util.Arrays;

public class find_highest_altitude {
    static int largestAltitude(int[] gain) {
        int[] temp=new int[gain.length+1];
        temp[0]=0;
        int j=1;
        int sum=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            temp[j++]=sum;
            if(sum>max)
                max=sum;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
}
