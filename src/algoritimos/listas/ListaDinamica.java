package algoritimos.listas;

/**
 * Created by mauricio on 26/04/17.
 */
public class ListaDinamica<E> implements Lista<E> {

	private No<E> primeiro;
	private No<E> ultimo;
	private int tamanho;

	private static class No<E>{
		private Object valor;
		private No<E> pt;

		private No(Object valor){
			this.valor = valor;
		}
	}

	@Override
	public void add(E e){
		No<E> novo = new No<>(e);
		if(this.isEmpty()){
			this.primeiro = novo;
		}else{
			this.ultimo.pt = novo;
		}
		this.ultimo = novo;
		this.tamanho++;

	}

	@Override
	public void add(int i, E e){
		validaIndex(i);
		No<E> novo = new No<>(e);
		if (i == 0){
			if (this.isEmpty()){
				ultimo = novo;
			}
			novo.pt = primeiro;
			primeiro = novo;
		}else if (i == this.tamanho - 1){
			this.add(e);
		}else{
			No<E> anterior = getNo(i-1);
			novo.pt = anterior.pt;
			anterior.pt = novo;
		}
		this.tamanho++;
	}

	@Override
	public int size(){
		return this.tamanho;
	}

	@Override
	public Object get(int i) {
		validaIndex(i);
		No<E> proximo = this.primeiro;
		for (int j = 0; j < i; j++){
			proximo = proximo.pt;
		}
		return proximo.valor;
	}

	public No<E> getNo(int i){
		validaIndex(i);
		No<E> proximo = this.primeiro;
		for (int j = 0; j < i; j++){
			proximo = proximo.pt;
		}
		return proximo;
	}

	@Override
	public boolean isEmpty() {
		return this.size() == 0;
	}

	@Override
	public boolean contains(E e) {
		No<E> proximo = this.primeiro;
		for (int j = 0; j < this.size(); j++){
			if (proximo.valor == e){
				return true;
			}
			proximo = proximo.pt;
		}
		return false;
	}

	@Override
	public Object remove(int i) {
		this.validaIndex(i);
		Object valorRemovido = null;
		if (i == 0){
			valorRemovido = primeiro.valor;
			if (this.size() == 1){
				primeiro = null;
				ultimo = null;
			}else{
				primeiro = primeiro.pt;
			}
		}else if (i == this.size() - 1){
			No<E> anterior = getNo(i - 1);
			valorRemovido = ultimo.valor;
			ultimo = anterior;
			anterior.pt = null;
		}else{
			No<E> anterior = getNo(i - 1);
			No<E> atual = getNo(i);
			valorRemovido = atual.valor;
			anterior.pt = atual.pt;
		}
		this.tamanho--;
		return valorRemovido;
	}

	@Override
	public boolean remove(E e) {
		No<E> proximo = primeiro;
		No<E> anterior = null;
		for (int i = 0; i < size(); i++){
			if (proximo.valor == e){
				if(i == 0){
					if (this.size() == 1){
						primeiro = null;
						ultimo = null;
					}else{
						primeiro = primeiro.pt;
					}
				}else if (i == this.size()-1){
					anterior = getNo(i - 1);
					ultimo = anterior;
					anterior.pt = null;
				}else{
					anterior = getNo(i-1);
					anterior.pt = proximo.pt;
				}
				this.tamanho--;
				return true;
			}
		}
		return false;
	}


}
