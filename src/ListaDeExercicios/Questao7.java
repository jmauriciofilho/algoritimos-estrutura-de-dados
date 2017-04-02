package ListaDeExercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauricio on 02/04/17.
 */
public class Questao7 {

	public static ArrayList<Object> intercessao(Object[] A, Object[] B){
		ArrayList<Object> intercessao = new ArrayList<Object>();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i].equals(B[j])){
					intercessao.add(A[i]);
				}
			}
		}
		return intercessao;
	}

	public static void main(String[] args) {
		String[] A = {"0123", "02456", "04532"};
		String[] B = {"02456"};

		ArrayList intercessao = intercessao(A, B);
		for (int i = 0; i < intercessao.size(); i++) {
			System.out.println(intercessao.get(i));
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]){
					System.out.println(A[i]);
				}
			}
		}

	}
}
