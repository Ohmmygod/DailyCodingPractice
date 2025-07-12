import java.util.Arrays;
/* 
 * Date: 2025-05-05 , Monday 5th May 2025, 3:38 PM
 * Explanation
 * BubbleSort check if index i is greater than i+1
 * if True -> Swap index i with i+1
 * if False -> Proceed to the next index
 */

class BubbleSort {
    public static void main(String[] args) {

        int [] arr = new int [args.length]; // declare new array for sorting
        for (int i = 0; i < arr.length; i++) { // for-loop to store number from args
            arr[i] = Integer.parseInt(args[i]);
        }
        int tmp;

        for (int trial = 0; trial < arr.length - 1; trial++) {
            for (int i = 0; i < arr.length - 1; i++) { // for-loop to do the BubbleSort ; arr.length-1 to avoid IndexOutOfBound
                if (arr[i] > arr[i+1]) {
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
