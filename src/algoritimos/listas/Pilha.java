package algoritimos.listas;

/**
 * Created by mauricio on 03/04/17.
 */
public class Pilha<E> {

	private ListaSimples<E> pilha = new ListaSimples<E>();

	public void push(E e){
		this.pilha.add(e);
	}

	public Object pop(){
		return this.pilha.remove(this.pilha.size()-1);
	}

	public Object peek(){
		return this.pilha.get(this.pilha.size()-1);
	}

	public boolean vazia(){
		return this.pilha.isEmpty();
	}
}
