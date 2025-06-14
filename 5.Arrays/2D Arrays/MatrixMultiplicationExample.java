public class MatrixMultiplicationExample{
    public static void main(String[] args){
        int[][] a = {
            {1, 2},
            {3, 4}
        };
        int[][] b = {
            {2, 0},
            {1, 2}
        };
        int[][] product = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                product[i][j] = 0;
                for(int k = 0; k < 2; k++){
                    product[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
