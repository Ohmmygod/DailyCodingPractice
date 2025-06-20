import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Day05_2_UniquePairSum {
	public static int countUniquePairs(int [] nums, int target) {
		Set<Integer> seen = new HashSet<>();
		int pair = 0;
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = i + 1; j < nums.length; j++)
			{
				if (seen.contains(nums[i]) && seen.contains(nums[j]))
					continue;
				else
				{
					if (nums[i] + nums[j] == target)
						pair++;
					seen.add(nums[i]);
					seen.add(nums[j]);
				}
			}
		}
		return (pair);
	}
	public static void main(String[] args) {
		int [] arr = {1, 3, 2, 2, 4, 5};
		int target = 6;
		System.out.println(countUniquePairs(arr, target));
		return ;
	}
}
