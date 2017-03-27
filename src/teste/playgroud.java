package teste;

import algoritimos.busca.Buscadores;
import algoritimos.ordenacao.InsertionSort;

/**
 * Created by mauricio on 20/03/17.
 */
public class playgroud {
	public static void main(String[] args) {
		String[] nomes = {"Carro", "Bola", "Amor", "Vida"};
		String nome = "Carro";
		Integer inicio = 0;
		Integer fim = nomes.length - 1;
		boolean isOrdem = InsertionSort.sortGenerico(nomes, (o, t1) -> ((String) o).compareTo(((String) t1)));
		Integer resultado = Buscadores.buscadorBinariogenericoRecursivo(nomes, isOrdem, inicio, fim, nome, (o, t1) -> ((String) o).compareTo(((String) t1)));
		System.out.println(resultado);
	}
}
