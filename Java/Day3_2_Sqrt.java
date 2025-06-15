public class Day3_2_Sqrt {
	public static int sqrt(int num) {
		if (num == 0)
			return (0);
		if (num < 0)
			return (-1);
		int	low = 1;
		int	high = num;
		int	mid;
		while (low <= high)
		{
			mid = (low + high) / 2;
			if (mid * mid == num)
				return (mid);
			else if (mid * mid <= num)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return (-1);
	}

	public static void main(String[] args)
	{
		System.out.println(sqrt(400));
	}
}
