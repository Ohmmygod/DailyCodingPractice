public class Day07_1_lastParam {
	public static void main(String[] args) {
		if (args.length < 1)
		{
			System.out.println("\n");
			return ;
		}

		System.out.println(args[args.length - 1]);
		return ;
	}
}

