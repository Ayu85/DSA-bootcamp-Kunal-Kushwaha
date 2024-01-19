public class Ceiling_of_num {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,10,14,16,18};
        System.out.println(getCeil(arr,18));
    }
    static int getCeil(int[] arr,int target){
        int ceil=0;
        for(int i=0;i<arr.length-1;i++){
            if(target>arr[i] && target<arr[i+1])
                ceil=arr[i+1];
        }
        return ceil;
    }
}
