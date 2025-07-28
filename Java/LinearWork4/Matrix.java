import java.util.Scanner;

public class Matrix {
	int	size;
	double	[][] matrix;

	public Matrix(int n) {
		this.size = n;
		this.matrix = new double [size][size];
	}

	public void fillMatrix() {
		Scanner sc = new Scanner(System.in);
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				System.out.printf("a%d_%d: ", row + 1, col + 1);
				matrix[row][col] = sc.nextDouble();
			}
		}
	sc.close();
	}

	public double determinant() {
		if (size == 1)
			return matrix[0][0];
		if (size == 2)
			return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
		double	det = 0;
		for (int col = 0; col < size; col++) {
			double	sign = (col % 2 == 0) ? 1 : -1;
			Matrix minor = minorMatrix(0, col);
			det += sign * matrix[0][col] * minor.determinant();
		}
		return det;
	}

	private Matrix minorMatrix(int removedRow, int removedCol) {
		Matrix m = new Matrix(size - 1);
		int row = 0;
		for (int i = 0; i < size; i++) {
			if (i == removedRow)
				continue;
			int	col = 0;
			for (int j = 0; j < size; j++) {
				if (j == removedCol)
					continue;
				m.matrix[row][col] = this.matrix[i][j];
				col++;
			}
			row++;
		}
		return m;
	}

	public Matrix inverse() {
		double det = determinant();
		if (det == 0)
		{
			System.out.println("The matrix provided is a Singular Matrix, no inverse");
			return (null);
		}
		Matrix adj = adjointMatrix();
		Matrix inv = new Matrix(size);
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				inv.matrix[row][col] = adj.matrix[row][col] / det;
			}
		}
		return inv;
	}

	private Matrix adjointMatrix() {
		Matrix coef = new Matrix(size);
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				double sign = ((row + col) % 2 == 0) ? 1 : -1;
				coef.matrix[row][col] = sign * minorMatrix(row, col).determinant();
			}
		}
		return coef.transpose();
	}

	private Matrix transpose() {
		Matrix t = new Matrix(size);
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				t.matrix[row][col] = this.matrix[col][row];
			}
		}
		return t;
	}

	public void printMatrix() {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.printf("%10.4f ", matrix[row][col]);
			}
			System.out.println();
		}
	}


}