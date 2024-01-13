public class good_pair {
    static int getPairs(int[] arr,int n){
        int pairCount=0;
        for(int i=0;i<n;i++){
            for(int k=i+1;k<n;k++){
                if(arr[i]==arr[k])
                    pairCount++;
            }
        }
        return pairCount==0?-1:pairCount;
    }
    public static void main(String[] args) {
//        int [] arr={1,2,3,1,1,3};
            int[] arr2={1,2,3};
        System.out.println(getPairs(arr2,arr2.length));
    }
}
