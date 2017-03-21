package algoritimos.ordenacao;

import java.util.Comparator;

/**
 * Created by mauricio on 20/03/17.
 */
public class InsertionSort {

	public static void sortNumerica(int[] numeros){
		for(int j = 1; j < numeros.length; j++){
			int temp = numeros[j];
			int i = j-1;
			while (i >= 0 && temp < numeros[i]){
				numeros[i+1] = numeros[i];
				i--;
			}
			numeros[i+1] = temp;
		}
	}

	public static void sortGenerico(Object[] objects, Comparator<Object> comparator){
		for(int j = 1; j < objects.length; j++){
			Object temp = objects[j];
			int i = j-1;
			while (i >= 0 && comparator.compare(temp, objects[i]) < 0){
				objects[i+1] = objects[i];
				i--;
			}
			objects[i+1] = temp;
		}
	}
}
