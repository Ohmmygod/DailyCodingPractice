public class Day02_1_MaxMin {
    public static void main(String[] args) {

        int [] arr = new int [args.length];

        if (arr.length == 0) {   // Check if user did input numbers.
            System.out.println("Please provide set of numbers");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

       // [3, 7, 5, 20, 2]
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.printf("Max Number: %d\n", max);
        System.out.printf("Min Number: %d\n", min);
    }
}
