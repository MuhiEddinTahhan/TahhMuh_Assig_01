/**
 *Name: Muhi Eddin Tahhan
 *date: 1/2/2022
 * discribtion: assignment#1 try to make some operations on arrays
 */

package Assign_01;

/**
 * main class
 */
public class ArraysOperations {


    /**
     * this method is to test 2 arrays if they are equal
     * @param twoDArray taking the test array from the user
     * @param twoDArray2 taking the test array from the user
     * @return x which is a boolean function to determain if the 2 arrays are equal
     */
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

    /**
     * takes one array and copy the last values into a 1D array and will present it
     * @param twoDArray taking the test array from the user
     * @param new1DArray using this array to store the last 2 values in the 2D array
     * @return new1DArray which is the resulting array from the copying operation
     */
    public static int [] copyTheLastPortion(int [][] twoDArray, int [] new1DArray){
        for (int i=0;i<twoDArray.length;i++) {     //take input from user
            for (int j = 0; j < twoDArray.length; j++) {

                new1DArray[i]=twoDArray[i][j];
            }
        }
        return new1DArray;
    }

    /**
     * this method takes the first row of the test array and find the sum of them
     * @param towDArray taking the test array from the user
     * @return sum which is the sum of the first row
     */
    public static int sumFirstRowOfTwoDArray(int [][] towDArray ){

        int sum = 0;
        for (int i=0; i<towDArray.length-1;i++){
            for(int j=0; j<towDArray.length;j++){
                sum=+towDArray[i][j];
            }
        }
        return sum;
    }
    /**
     * this method takes the second row of the test array and find the sum of them
     * @param towDArray taking the test array from the user
     * @return sum which is the sum of the second row
     */
    public static int sumSecondRowOfTwoDArray(int [][] towDArray ){

        int sum = 0;
        for (int i=1; i<towDArray.length;i++){
            for(int j=0; j<towDArray.length;j++){
                sum=+towDArray[i][j];
            }
        }
        return sum;
    }

    /**
     * finds the hamming distance of the passed 2 arrays
     * @param towDArray taking the test array from the user
     * @param twoDArray2 taking the test array from the user
     * @return ham which is the hamming distance and it is an integer
     */
    public static int hammingDistanceOfTwoArrays(int [][] towDArray, int[][] twoDArray2){

        int ham = 0;
        for (int i=1; i<towDArray.length;i++){
            for(int j=0; j<towDArray.length;j++){
                if (towDArray[i][j]!=twoDArray2[i][j])
                ham++;
            }
        }
        return ham;
    }

    /**
     * this method uses takes the 2D array and convert it into 1D array.
     * And it uses the bubble sort algorithm to sort the resulting array from the smallest
     * to largest. the way it works is by finding if the value is larger than the next one
     * and do a swap if that was the case. then increase the index byu one until the end of the sort
     * @param twoDArray taking the test array from the user
     * @return temp which is the sorted array
     */
    public static int [] sortedArray(int [][]twoDArray){
        int []temp=new int[4];

        for (int i=0,count=0; i<twoDArray.length;i++){
            for(int j=0; j<twoDArray.length;j++){
                temp[count]=twoDArray[i][j];
                count++;
            }
        }
        //I could have put twoDArray.length - 1 to make it more effecient than hard coding the value but
        // I'm too tired to do that now hahahahah
        for (int i=0;i<3;i++){
                for (int j=0;j<3-i;j++){
                    if (temp[j] > temp[j+1]) {
                        int index=temp[j];
                        temp[j]=temp[j+1];
                        temp[j+1]=index;
                    }
                    }
            }
        return temp;
    }

    /**
     * this method do the binary search algorithem to find the key value given by the user
     * @param oneDArray the sorted array from before
     * @param x the key given by the user
     * @param min the smallest index of the array
     * @param max the largest index of the array
     * @return found which is a boolean value that tells if the key was found or not
     */
    public static boolean binarySearch(int[] oneDArray, int x,int min, int max) {
        boolean found = false;
        while (min <= max) {
            int mid = min+((max - min)/2);
            if (oneDArray[mid] == x){
                found = true;
                break;
            }
            else if (oneDArray[mid] < x){
                min = mid+1;
            }
            else if (oneDArray[mid] > x){
                max = mid-1;
            }
        }
        return found;
    }
}

