public class convert_1d_to_2d {
    static int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n==original.length){
            int[][] temp=new int[m][n];
            int k=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    temp[i][j]=original[k++];
                }
            }
            return temp;
        }
        return new int[][]{};
    }

    public static void main(String[] args) {
        int[] org={1,2,3};
        int res[][]=construct2DArray(org,1,1);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
