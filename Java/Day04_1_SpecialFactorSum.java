public class Day04_1_SpecialFactorSum {
	public static int SpecialFactorSum(int n) {
		if (n <= 0)
			return (-1);
		int i = 1;
		int sum = 0;
		while (i * i <= n)
		{
			if (!isPrime(i))
				i++;
			if (n % i == 0)
				sum += i;
			i++; 
		}
		return (sum);
	}
	
	private static boolean isPrime(int n) {
		if (n <= 1)
			return (false);
		if (n == 2)
			return (true);
		int i = 2;
		while (i * i <= n)
		{
			if (n % i == 0)
				return (false);
			i++;
		}
		return (true);
	}

	public static void main(String[] args) {
		if (args.length != 1)
		{
			System.out.println("Invalid Input");
			return ;
		}
		try {
			int n = Integer.parseInt(args[0]);
				System.out.println(SpecialFactorSum(n));
		}
		catch (NumberFormatException e) {
			System.out.println("Please provide a valid number");
		}
		return ;
	}
}
