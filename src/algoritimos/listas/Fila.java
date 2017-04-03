package algoritimos.listas;

/**
 * Created by mauricio on 03/04/17.
 */
public class Fila<E> {

	ListaSimples<E> fila = new ListaSimples<E>();

	public void insert(E e){
		this.fila.add(e);
	}

	public Object remove(){
		return this.fila.remove(0);
	}

	public Object primeiroDaFila(){
		return this.fila.get(0);
	}

	public boolean vazia(){
		return this.fila.isEmpty();
	}
}
