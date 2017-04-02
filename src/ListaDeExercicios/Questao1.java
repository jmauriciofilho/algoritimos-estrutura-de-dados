package ListaDeExercicios;

/**
 * Created by mauricio on 02/04/17.
 */
public class Questao1 {

	/**
	 *Complexidade O(n²)
	 */
	public static int[][] somaMatriz(int[][] A, int[][] B){
		int[][] matrizResultado = new int[A.length][A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				matrizResultado[i][j] = A[i][j] + B[i][j];
			}
		}
		return matrizResultado;
	}

	public static void main(String[] args) {
		int[][] A =
				{
						{4, 4},
						{2, 4},
				};

		int[][] B =
				{
						{1, 1},
						{1, 1},
				};

		int[][] resultado = somaMatriz(A, B);

		/**
		 * Complexidade O(n²)
		 */
		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado.length; j++) {
				System.out.println(resultado[i][j]);
			}
		}
	}
}
