import java.util.HashSet;
import java.util.Set;
public class Day05_1_FirstDuplicateIndex {
	public static int FirstDuplicateIndex(int [] arr) {
		Set<Integer> seen = new HashSet<>();
		for (int i = 0; i < arr.length; i++)
		{
			if (seen.contains(arr[i]))
				return (arr[i]);
			seen.add(arr[i]);
		}
		return (-1);
	}

	public static void main(String [] args) {
		int [] arr = {3, 1, 4, 2, 5, 3, 7};
		System.out.println(FirstDuplicateIndex(arr));
		return ;
	}
}
