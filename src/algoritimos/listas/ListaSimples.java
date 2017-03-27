package algoritimos.listas;

/**
 * Created by mauricio on 27/03/17.
 */
public class ListaSimples<E> implements Lista<E> {

	private Object[] elementos = new Object[100];
	private int index = 0;

	public void add(E e){
		verificarEspaço();
		elementos[this.index] = e;
		this.index++;
	}

	public int size(){
		return this.index;
	}

	private void verificarEspaço(){
		if (this.index == elementos.length){
			throw new StackOverflowError("Não há mais espaço na lista");
		}
	}
}
