package algoritimos.listas;

import algoritimos.busca.Buscadores;

/**
 * Created by mauricio on 27/03/17.
 */
public class ListaSimples<E> implements Lista<E> {

	private Object[] elementos = new Object[100];
	private int index = 0;

	@Override
	public void add(E e){
		verificarEspaço();
		elementos[this.index] = e;
		this.index++;
	}

	@Override
	public void add(int i, E e){
		verificarEspaço();
		validaIndex(i);
		if (elementos[i] != null){
			for (int j = this.index; j > i; j--) {
				elementos[j] = elementos[j-1];
			}
		}
		elementos[i] = e;
		this.index++;
	}

	@Override
	public Object get(int i){
		validaIndex(i);
		return elementos[i];
	}

	@Override
	public boolean isEmpty(){
		return this.size() == 0;
	}

	@Override
	public boolean contains(E e){
		Integer indice = Buscadores.buscadorSimplesGenerico(elementos, e);
		return indice != null;
	}

	@Override
	public Object remove(int i){
		validaIndex(i);
		Object aRemover = this.get(i);
		this.remove((E) aRemover);
		return aRemover;
	}

	@Override
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

	@Override
	public int size(){
		return this.index;
	}

	private void verificarEspaço(){
		if (this.index == elementos.length){
			throw new StackOverflowError("Não há mais espaço na lista");
		}
	}
}
