public class Day02_3_StatsSummary {
    public static void main(String[] args) {
    
    /* Unfinished
     * 2025-05-05 : 5:30 PM
     */

        int [] arr = new int [args.length];
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Please enter only integers");
            }
        }

        double max = Integer.MIN_VALUE; double min = Integer.MAX_VALUE;
        double mean = 0, median, mode, std;

        for (int i = 0; i < arr.length; i++) {  // finding MAX
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {  // finding MIN
                min = arr[i];
            }
        }

        for (double num : arr) { // finding MEAN
            mean += num;
        }
        mean /= arr.length;
        
        int tmp;
        for (int trial = 0; trial < arr.length - 1; trial++) { // BubbleSort from least to greatest
            for (int i = 0; i < arr.length - 1; i++) {  // Actually bettter to sort first , then MIN MAX will be ready to use, but yeah..
                if (arr[i] > arr[i+1]) {
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }

        int idx; // finding MEDIAN
        if (arr.length % 2 == 0) { // n is even
            idx = arr.length / 2;
            median = (arr[idx] + arr[idx-1]) / 2;
        } else { // n is odd
            idx = arr.length / 2;
            median = arr[idx];
        }


        System.out.printf("Max = %f\n", max);
        System.out.printf("Min = %f\n", min);
        System.out.printf("Mean = %f\n", mean);
        System.out.printf("Median = %f\n", median);
    }
}
