public class Ceiling_of_num {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,10,14,16,18};
        System.out.println(getCeilBest(arr,4));
    }
    static int getCeil(int[] arr,int target){
        int ceil=0;
        for(int i=0;i<arr.length-1;i++){
            if(target>arr[i] && target<arr[i+1])
                ceil=arr[i+1];
        }
        return ceil;
    }
    static int getCeilBetter(int[] arr,int target){
        if(target==arr[arr.length-1])
            return target;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target>=arr[mid] && target<arr[mid+1] )
                return arr[mid+1];
            else if(target>=arr[mid])
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
    static int getCeilBest(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target)
                return mid;
            else if(target>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return arr[start];
    }
}
