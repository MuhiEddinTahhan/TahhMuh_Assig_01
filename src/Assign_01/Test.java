package Assign_01;

import java.util.Scanner;

public class Test extends ArraysOperations {
    /**
     *the main function is to get the output of each function
     * and to test the methods inherated from the other class
     * @param args; the main parameter which passes the arguments
     */
    public static void main(String[] args) {

        int [][] test= new int[2][2];
        int [][] test2= new int[2][2];
        int [] temp= new int [2];
        Scanner input = new Scanner(System.in);

        for (int i=0;i<test.length;i++) {     //take input from user
            for (int j = 0; j < test.length; j++) {
                System.out.println("please enter the " + (i + 1) + " of the first 2D array\n");
                test[i][j]=input.nextInt();
            }
        }
        for (int i=0;i<test2.length;i++) {     //take input from user
            for (int j = 0; j < test2.length; j++) {
                System.out.println("please enter the " + (i + 1) + " of the second 2D array\n");
                test2[i][j]=input.nextInt();
            }
        }
        //input.close();

        System.out.println("are the 2 arrays equal to each other?\n");
        System.out.println(equality2DArray(test,test2)+"\n");

        System.out.println("\n");
        System.out.println("we will print the last 2 values of the columns of the first array you put in oneD array \n ");

        temp=copyTheLastPortion(test,temp);

        for (int i=0; i<temp.length;i++){
            System.out.println(temp[i]+"\s");
        }
        System.out.println("\n");
        System.out.println("the sum of the first row of the first array is \n ");
        System.out.println(sumFirstRowOfTwoDArray(test)+"\n");
        System.out.println("the sum of the second row of the first array is \n ");
        System.out.println(sumSecondRowOfTwoDArray(test)+"\n");
        System.out.println("the hamming distance between the 2 arrays is \n");
        System.out.println(hammingDistanceOfTwoArrays(test,test2)+"\n");
        System.out.println("the sorted array after putting it in 1D array is \n");
        int []sorted=sortedArray(test);
        for (int i=0; i<4;i++){
            System.out.print(sorted[i]+" ");
        }
        System.out.println("\n");
        System.out.println("please enter what are you searching for \n");
        int key=input.nextInt();
        System.out.print("the key that you have been searching for found to be: \n");
        System.out.print(binarySearch(sorted,key,0, sorted.length));
    }
}
