public class Day3_1_ParityBlockSum {
	public static void ParityBlock(int[] nums) {
		int	cnt = 1;
		int	j;
		String	status;
		for (int i = 0; i < nums.length; i++)
		{
			j = i + 1;
			if (i == nums.length - 1)
			{
				if (nums[i] % 2 == 0)
					status = "คู่";
				else
					status = "คี่";
				System.out.printf("กลุ่มที่ %d (%s): ", cnt, status);
				System.out.printf("%d => ผลรวม: %d\n", nums[i], nums[i]);
				return ;
			}
			if (nums[i] % 2 == 0)
			{
				status = "คู่";
				System.out.printf("กลุ่มที่ %d (%s): ", cnt, status);
				if (nums[j] % 2 == 0)
					System.out.printf("%d %d => ผลรวม: %d\n", nums[i], nums[j], nums[i] + nums[j]);
				else
					System.out.printf("%d => ผลรวม: %d\n", nums[i], nums[i]);
			}
			else
			{
				status = "คี่";
				System.out.printf("กลุ่มที่ %d (%s): ", cnt, status);
				if (nums[j] % 2 == 1)
					System.out.printf("%d %d => ผลรวม: %d\n", nums[i], nums[j], nums[i] + nums[j]);
				else
					System.out.printf("%d => ผลรวม: %d\n", nums[i], nums[i]);
			}
		}
	}

	public static void main(String[] args)
	{
		int	[] test1 = {4, 2, 1, 3, 6, 8, 7, 5, 10, 13};
		ParityBlock(test1);
	}
}
