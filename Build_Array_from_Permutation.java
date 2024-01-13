import java.util.Arrays;

public class Build_Array_from_Permutation {
    static int[] build(int[] arr,int n){
        int [] temp=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            temp[j]=arr[arr[i]];
            j++;
        }
        return temp;
    }
    public static void main(String[] args) {
//        int [] arr={0,2,1,5,3,4};
            int[] arr={5,0,1,2,3,4};
        System.out.println(Arrays.toString(build(arr,arr.length)));
    }
}
