import java.util.*;
public class luckey_num_in_matrix {
    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int minInRow=Integer.MAX_VALUE;
            int minInx=0;
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]<minInRow){
                    minInRow=matrix[i][j];
                    minInx=j;
                }
            }
            boolean isMax=true;
            for(int m=0;m<matrix[i].length;m++){
                    if(matrix[i][minInx]<matrix[m][minInx]){
                        isMax=false;
                    }
            }
            if(isMax)
                temp.add((minInRow));
        }
        return temp;
    }

    public static void main(String[] args) {
        int[][] matrix={{3,7,8},{9,11,13},{15,16,17}};
         List <Integer> res=luckyNumbers(matrix);
        for(int x:res)
            System.out.print(x+" ");
    }
}
