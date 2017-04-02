package algoritimos.listas;

import algoritimos.busca.Buscadores;

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

	public void add(int i, E e){
		verificarEspaço();
		validarIndex(i);
		if (elementos[i] != null){
			for (int j = this.index; j > i; j--) {
				elementos[j] = elementos[j-1];
			}
		}
		elementos[i] = e;
		this.index++;
	}

	public Object get(int i){
		validarIndex(i);
		return elementos[i];
	}

	public boolean isEmpty(){
		return this.size() == 0;
	}

	public boolean contains(E e){
		Integer indice = Buscadores.buscadorSimplesGenerico(elementos, e);
		return indice != null;
	}

	public boolean remove(int i){
		validarIndex(i);
		Object aRemover = this.get(i);
		return this.remove((E) aRemover);
	}

	public boolean remove(E e){
		Integer indice = Buscadores.buscadorSimplesGenerico(elementos, e);

		if (indice != null) {
			if (indice < size() - 1) {
				for (int i = indice; i < size() - 1; i++) {
					elementos[i] = elementos[i + 1];
				}
			}
			elementos[--index] = null;
			return true;
		}

		return false;
	}

	public int size(){
		return this.index;
	}

	private void verificarEspaço(){
		if (this.index == elementos.length){
			throw new StackOverflowError("Não há mais espaço na lista");
		}
	}

	public void validarIndex(int i){
		if (i < 0 || i > index){
			throw new ArrayIndexOutOfBoundsException("Indice fora do intervalo permitido.");
		}
	}
}
