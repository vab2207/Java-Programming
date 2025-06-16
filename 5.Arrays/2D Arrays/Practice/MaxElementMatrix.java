public class MaxElementMatrix{
    public static void main(String[] args){
        int[][] a = {{3, 5, 9}, {1, 7, 4}};
        int max = a[0][0];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        System.out.println("Max element: " + max);
    }
}
