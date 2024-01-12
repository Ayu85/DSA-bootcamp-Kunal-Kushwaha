public class Richest_Customer_Wealth {
    static int getRichest(int[][] accounts,int  m,int n){
        int maxMoney=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++)
                sum+=accounts[i][j];

            if(sum>maxMoney)
                maxMoney=sum;
        }
        return maxMoney;
    }
    public static void main(String[] args) {
        int[][] arr={{1,5},{7,3},{3,5}};
        System.out.println(getRichest(arr,3,2));
    }
}
