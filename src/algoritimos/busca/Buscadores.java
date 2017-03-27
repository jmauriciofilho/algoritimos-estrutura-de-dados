package algoritimos.busca;

import java.util.Comparator;

/**
 * Created by mauricio on 21/03/17.
 */
public class Buscadores {

	public static Integer buscadorSimplesNumerico(Integer[] numeros, Integer valor){
		if (valor != null){
			for (int i = 0; i < numeros.length; i++){
				if (valor == numeros[i]){
					return i;
				}
			}
		}
		return null;
	}

	public static Integer buscadorBinarioNumerico(Integer[] numeros, boolean emOrdem, Integer valor){
		if (valor != null){
			if (emOrdem){
				Integer inicio = 0;
				Integer fim = numeros.length - 1;
				Integer media = (inicio + fim) / 2;
				while (inicio <= fim){
					if (valor == numeros[media]){
						return media;
					}else if (valor < numeros[media]){
						fim = media - 1;
					}else if (valor > numeros[media]){
						inicio = media + 1;
					}
					media = (inicio + fim) / 2;
				}

			}

		}
		return null;
	}

	public static Integer buscadorBinarioGenerico(Object[] objects, boolean emOrdem, Object object, Comparator<Object> comparator){
		if (object != null){
			if (emOrdem){
				Integer inicio = 0;
				Integer fim = objects.length - 1;
				Integer media = (inicio + fim) / 2;
				while (inicio <= fim){
					if (comparator.compare(object, objects[media]) == 0){
						return media;
					}else if (comparator.compare(object, objects[media]) < 0){
						fim = media - 1;
					}else if (comparator.compare(object, objects[media]) > 0){
						inicio = media + 1;
					}
					media = (inicio + fim) / 2;
				}

			}

		}
		return null;
	}

	public static Integer buscadorBinariogenericoRecursivo(Object[] objects, boolean emOrdem, Integer inicio, Integer fim, Object object, Comparator<Object> comparator){
		if (object != null){
			if (emOrdem){
				Integer media = (inicio + fim) / 2;
				if (inicio <= fim){
					if (comparator.compare(object, objects[media]) == 0){
						return media;
					}else if (comparator.compare(object, objects[media]) < 0){
						fim = media - 1;
						return buscadorBinariogenericoRecursivo(objects, emOrdem, inicio, fim, object, comparator);
					}else if (comparator.compare(object, objects[media]) > 0){
						inicio = media + 1;
						return buscadorBinariogenericoRecursivo(objects, emOrdem, inicio, fim, object, comparator);
					}
					media = (inicio + fim) / 2;
				}

			}

		}
		return null;
	}
}
