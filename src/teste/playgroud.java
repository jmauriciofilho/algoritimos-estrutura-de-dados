package teste;

import algoritimos.ordenacao.InsertionSort;

/**
 * Created by mauricio on 20/03/17.
 */
public class playgroud {
	public static void main(String[] args) {
		Integer[] numeros = {5, 3, 2, 7};
		String[] nomes = {"casa", "amor", "vida", "bola"};

		InsertionSort.sortGenerico(nomes, (o1, o2) -> ((String ) o1).compareTo((String) o2));
		for(String nome : nomes){
			System.out.println(nome);
		}
	}
}
