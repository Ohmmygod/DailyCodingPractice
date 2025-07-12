import java.util.Arrays;
/*Tuesday, 6th May 2025*/
public class Day02_2_ReversedArray {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide number");
            return;
        }
        int [] arr = new int [args.length];
        int [] ans = new int [args.length];
        int idx = args.length;

        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Please provide integer only.");
                return;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[idx-1];
            idx--;
        }

        System.out.println(Arrays.toString(ans));
    }
}
