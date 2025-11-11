package exc12_Arrays;

public class Lab107_2D_array_Iterate_for_loop {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<matrix.length;i++){  //0 to 2 matrix.length - row  i=0
            for(int j=0; j<matrix[i].length; j++){ //matrix[i].length -> c  j=0
                System.out.print(matrix[i][j]+"  ");
//                System.out.print("*"+"  ");//instead of adding numbers we are going to print *
            }
            System.out.println();
        }
    }
}
