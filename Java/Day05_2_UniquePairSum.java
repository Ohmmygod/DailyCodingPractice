import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Day05_2_UniquePairSum {
	public static int countUniquePairs(int [] nums, int target) {
		Set<Integer> seen = new HashSet<>();
		int pair = 0;
		for (int i = 0; i < nums.length; i++);
		{
			for (int j = i + 1; j < nums.length; j++)
			{
				if (seen.contains(arr[i]) && seen.contains(arr[j))
					continue;
				else
				{
					if (arr[i] + arr[j] == target)
						pair++;
					seen.add(arr[i]);
					seen.add(arr[j]);
				}
			}
		}
	}
}
