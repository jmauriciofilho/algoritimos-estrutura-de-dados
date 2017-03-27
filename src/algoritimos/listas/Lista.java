package algoritimos.listas;

/**
 * Created by mauricio on 27/03/17.
 */
public interface Lista<E> {

	/**
	 * @param e
	 * insere o elemento no final da lista.
	 * */
	void add(E e);

	/**
	 * @param i, numero
	 * @param e, elemento
	 * inserir um elemento nos limites entre a posição 0 e
	 * a quantidade de elementos na lista.
	 *
	 * */
	void add(int i, E e);

	/**
	 * @return Retorna a quantidade de elementos da lista.
	 *
	 * */
	int size();

	/**
	 * @param i, numero
	 * @return Retorna o elemento da posição i.
	 *
	 * */
	Object get(int i);

	/**
	 * @return Retorna {true} se a lista estiver vazia e false caso contrário.
	 *
	 * */
	boolean isEmpty();

	/**
	 * @param e, elemento
	 * @return se um elemento se encontra na lista.
	 */
	boolean contains(E e);

	/**
	 *
	 * @param i, numero
	 * @return se objeto foi removido
	 */
	boolean remove(int i);

	/**
	 *
	 * @param e, elemento
	 * @return se objeto foi removido
	 */
	boolean remove(E e);
}
