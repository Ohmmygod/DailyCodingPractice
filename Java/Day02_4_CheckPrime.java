public class Day02_4_CheckPrime {
  /*2025-05-06 Tuesday, 6th May 2025*/
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a number");
            return;
        }

        int [] arr = new int [args.length];
        

        for (int i = 0 ; i < arr.length; i++) {
            try {
                arr[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Please provide only integer");
                return;
            }
        }
        
        boolean isPrime = false;
        for (int num : arr) {
            if (num <= 1) {isPrime = false;}
            if (num == 2) {isPrime = true;}
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                } else {isPrime = true;}
            }
            if (isPrime == true) { 
                System.out.printf("%d is a prime number\n", num);
            }
        }
    }
}
