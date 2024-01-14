public class cells_with_odd_values_in_a_matrix {
    static  int[][] oddCells(int[][] indices,int m,int n){
            int[][] temp=new int[m][n];
            for(int i=0;i<indices.length;i++){
                boolean isRow=true;
                for(int j=0;j<indices[i].length;j++){
                    int index=indices[i][j];
                    if(isRow){
                        int y=0;
                        for(int x=0;x<temp[index].length;x++){
                            temp[index][x]+=1;
                            isRow=false;
                            y++;
                        }
                    }
                    else {
                        for(int o=0;o<temp.length;o++){
                            int p=0;
                            temp[o][index]+=1;
                            isRow=true;
                        }
                    }
                }
            }
            return temp;
    }
    public static void main(String[] args) {
        int[][] ind={{0,1},{1,1}};
    int[][] res=oddCells(ind,2,3);
    for(int i=0;i<res.length;i++){
       for(int j=0;j<res[i].length;j++){
           System.out.print(res[i][j]+" ");
       }
       System.out.println();
   }
    }
}
