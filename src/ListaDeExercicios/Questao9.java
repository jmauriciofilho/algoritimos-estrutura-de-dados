package ListaDeExercicios;

import java.util.ArrayList;

/**
 * Created by mauricio on 02/04/17.
 */
public class Questao9 {

	public static int retornarValorDaSequencia(int[] g, int k, int nTermo){
		for (int j = 0; j < g.length; j++) {
			if (j >= 1 && j <= k){
				g[j] = j - 1;
			} else if (j > k){
				g[j] = g[j-1] + g[j-2];
			}
		}
		return g[nTermo];
	}
}
