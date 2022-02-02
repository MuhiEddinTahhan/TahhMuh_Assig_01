package Assign_01;

public class ArraysOperations {

    int [][] test= new int[2][2];


    public static boolean equality2DArray(int [][] twoDArray, int [][]twoDArray2){

        boolean x=true;

        for (int i=0; i<twoDArray.length;i++){
            for (int j=0; j<twoDArray.length;j++) {
                if (twoDArray[i][j] != twoDArray2[i][j]) {
                    x = false;
                } else {
                    x = true;
                }
            }
        }
        return x;
    }
}
