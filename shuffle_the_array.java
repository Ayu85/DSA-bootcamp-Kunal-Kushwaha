import java.lang.reflect.Array;
import java.util.Arrays;

public class shuffle_the_array {
    static int[] shuffle(int[] arr,int n){
        int p1=0;
        int p2=n;
        int j=1;
        int[] sArray=new int[n*2];
        for(int i=0;i<arr.length;i+=2){
            sArray[i]=arr[p1];
            p1++;
            sArray[j]=arr[p2];
            p2++;

            j+=2;
        }
    return sArray;
    }
    public static void main(String[] args) {
//        int [] arr={2,5,1,3,4,7};
            int[] arr={1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr,4)));
    }
}
