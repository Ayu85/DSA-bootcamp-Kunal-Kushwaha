public class cells_with_odd_values_in_a_matrix {
    static  int oddCells(int[][] indices,int m,int n){
            int[][] temp=new int[m][n];
            int oddValues=0;
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
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                if(temp[i][j]%2!=0)
                    oddValues++;
            }

        }
            return oddValues;
    }
    public static void main(String[] args) {
        int[][] ind={{1,1},{0,0}};
    int res=oddCells(ind,2,2);
       System.out.println(res);
   }
    }

