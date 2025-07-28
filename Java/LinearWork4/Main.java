import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size (1-10): ");
		int	n = sc.nextInt();
		if (n < 1 || n > 10)
		{
			System.out.println("Invalid Size");
			sc.close();
			return ;
		}

		Matrix m1 = new Matrix(n);
		m1.fillMatrix();
		System.out.printf("Det: %10.2f\n", m1.determinant());
		sc.close();

		Matrix inv = m1.inverse();
		if (inv != null) {
			System.out.println("Inverse matrix:");
			inv.printMatrix();
		}
	}

	
}
