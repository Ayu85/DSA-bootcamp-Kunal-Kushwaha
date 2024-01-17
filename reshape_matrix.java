public class reshape_matrix {
    static boolean matrixReshape(int[][] mat, int r, int c) {
            if(r*c==mat[0].length*mat.length){
                return true;
            }
            else
                return false;
    }

    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4},{4,5}};
        System.out.println(matrixReshape(mat,2,4));
    }
}
