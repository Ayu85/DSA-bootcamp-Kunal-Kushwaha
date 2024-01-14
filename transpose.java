public class transpose {
    static void getTranspose(int[][] matrix){
            int[][]  temp=new int[matrix[0].length][matrix.length];
            int k=0;
            int m=0;
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    temp[j][i]=matrix[i][j];
                }

            }
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
    int[][] arr={{1,2},{4,5},{7,8}};
    getTranspose(arr);
    }
}
