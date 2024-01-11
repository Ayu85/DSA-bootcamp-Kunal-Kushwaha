import java.util.Arrays;

public class concatenationOfSameArray {
    static int[] conc(int[] arr){
        int [] ans=new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        int z=0;
        for(int i=arr.length;i<ans.length;i++){
            ans[i]=arr[z];
            z++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1};
        System.out.println(Arrays.toString(conc(arr)));
    }
}
