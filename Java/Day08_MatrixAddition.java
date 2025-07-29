import java.util.Scanner;

public class Day08_MatrixAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String enter;
		int	m, n;
		
		enter = sc.nextLine();
		int i = 0;
		String tmp;
		while (enter[i] != " ")
		{
			tmp += enter[i];
			i++;
		}
		m = Integer.parseInt(tmp);
		tmp = "";
		while (enter[i] == " ")
			i++;
		
		while (enter[i] != " ")
		{
			tmp += enter[i];
			i++;
		}
		n = Integer.parseInt(tmp);

		System.out.println("m = " + m);
		System.out.println("n = " + n);
			
		
	}
}
