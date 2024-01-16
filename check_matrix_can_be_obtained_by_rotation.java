public class check_matrix_can_be_obtained_by_rotation {
    static boolean findRotation(int[][] mat,int[][] target){
        for(int i=0;i<4;i++){
            if(checkEqual(mat,target))
                return true;
            else
                mat=rotate(mat);
        }
        return false;
    }
    static int[][] rotate(int[][] mat){
        int [][] temp=new int[mat[0].length][mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                temp[j][mat.length-i-1]=mat[i][j];
            }
        }
        return temp;
    }
    static boolean checkEqual(int[][] mat,int[][] target){
        if(mat.length == target.length && mat[0].length==target[0].length){
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    if(mat[i][j]!=target[i][j])
                        return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] arr1={{0,1},{1,1}};
        int[][] arr2={{1,0},{0,1}};
        System.out.println(findRotation(arr1,arr2));
    }
}
