package ListaDeExercicios;

/**
 * Created by mauricio on 02/04/17.
 */
public class Questão2 {

	/**
	 * Complexidade O(n³)
	 */
	public static int[][] multiplicacaoMatriz(int[][] A, int[][] B){
		int[][] resultado = new int[A.length][B.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				int soma = 0;
				for (int k = 0; k < A.length; k++) {
					int produto = A[i][k] * B[k][j];
					soma += produto;
				}
				resultado[i][j] = soma;
			}
		}
		return resultado;
	}
}
