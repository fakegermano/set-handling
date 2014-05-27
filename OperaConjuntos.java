
import java.util.HashSet;
import java.util.Set;

public class OperaConjuntos {

	/**
	 * Implementa a união de conjuntos
	 * @param conjunto1
	 * @param conjunto2
	 * @return uniao entre 1 e 2
	 */
	public static <T extends Comparable<T>> Set<T> uniao(Set<T> conjunto1, Set<T> conjunto2) {
		Set<T> uniao = new HashSet<T>();
		for (T element : conjunto1) {
			uniao.add(element);
		}
		for (T element : conjunto2) {
			uniao.add(element);
		}
		return uniao;
	}
	/**
	 * Implementa a interseccao de conjuntos
	 * @param conjunto1
	 * @param conjunto2
	 * @return interseccao entre 1 e 2
	 */
	public static <T extends Comparable<T>> Set<T> interseccao(Set<T> conjunto1, Set<T> conjunto2) {
		Set<T> inter = new HashSet<T>();
		for (T element : conjunto2) {
			if (conjunto1.contains(element)) {
				inter.add(element);
			}
		}
		return inter;
	}

	/**
	 * Faz a diferenca entre o conjunto 1 e o conjunto 2
	 * @param conjunto1
	 * @param conjunto2
	 * @return diferenca entre 1 e 2
	 */
	public static <T extends Comparable<T>> Set<T> diferenca(Set<T> conjunto1, Set<T> conjunto2) {
		Set<T> dife = new HashSet<T>();
		for (T element : conjunto1) {
			if(!conjunto2.contains(element)) {
				dife.add(element);
			}
		}
		return dife;
	}
	
	/**
	 * Encontra o subconjunto de valores entre valor1 e valor2
	 * @param conjunto
	 * @param valor1
	 * @param valor2
	 * @return subconjunto gerado
	 */
	public static <T extends Comparable<T>> Set<T> sub(Set<T> conjunto, T valor1, T valor2) {
		Set<T> subt = new HashSet<T>();
		for (T element : conjunto) {
			if (element.compareTo(valor1) >= 0 && element.compareTo(valor2) <= 0) {
				subt.add(element);
			}
		}
		return subt;
	}

	/**
	 * Soma o valor em todos os elementos do conjunto
	 * @param conjunto
	 * @param valor
	 * @return novo conjunto com os valores somados
	 */
	public static Set<Integer> somarValor(Set<Integer> conjunto, int valor) {
		Set<Integer> soma = new HashSet<Integer>();
		for (Integer element : conjunto) {
			soma.add(element+valor);
		}
		return soma;
	}
}
