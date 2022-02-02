package Assign_01;

import java.util.Scanner;

public class Test extends ArraysOperations {
    /**
     *the main function is to get the output of each function
     * and to test
     * @param args; the main parameter which passes the arguments
     */
    public static void main(String[] args) {

        int [][] test= new int[2][2];
        int [][] test2= new int[2][2];
        Scanner input = new Scanner(System.in);
        for (int i=0;i<test.length;i++){     //print out 2 D array
            for (int j=0;j<test.length;j++){
                System.out.println("please enter the"+(i+1)+"of the first 2D array");
                test[i]=input.nextInt();


        System.out.println("are the 2D arrays equal?");
        System.out.println(equality2DArray(test, test2));
        System.out.println("\n");
        System.out.print("the sum of the 1D array is = \n");

        for (int i=0;i<result.length;i++){     //print out 2 D array
            for (int j=0;j<result.length;j++){
                System.out.print(result[i][j] + " ");
            }
        }
    }
}
