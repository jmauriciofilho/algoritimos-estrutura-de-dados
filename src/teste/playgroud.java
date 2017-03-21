package teste;

import algoritimos.busca.Buscadores;
import algoritimos.ordenacao.InsertionSort;

/**
 * Created by mauricio on 20/03/17.
 */
public class playgroud {
	public static void main(String[] args) {
		Integer[] numeros = {5, 3, 2, 7};
		Integer valor = 2;

		System.out.println(Buscadores.buscadorSimplesNumerico(numeros, valor));
	}
}
