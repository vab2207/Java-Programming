public class MatrixTransposeExample{
    public static void main(String[] args){
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] transpose = new int[3][2];
        for(int i = 0; i < original.length; i++){
            for(int j = 0; j < original[i].length; j++){
                transpose[j][i] = original[i][j];
            }
        }
        for(int i = 0; i < transpose.length; i++){
            for(int j = 0; j < transpose[i].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
