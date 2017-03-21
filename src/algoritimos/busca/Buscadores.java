package algoritimos.busca;

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
			
		}
		return null;
	}
}
