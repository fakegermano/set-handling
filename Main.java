import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String comando;
		
		HashMap<String, Set<?>> conjuntos = new HashMap<String, Set<?>>();
		HashMap<String, String> tipoConjuntos = new HashMap<String, String>();
		
		do {
			comando = entrada.next();
			
			if (comando.startsWith("cria_")) {
				
				String nome = entrada.next();

				if (comando.equals("cria_i")) {
					conjuntos.put(nome, new HashSet<Integer>());
					tipoConjuntos.put(nome, "int");
				} else if (comando.equals("cria_s")) {
					conjuntos.put(nome, new HashSet<String>());
					tipoConjuntos.put(nome, "string");
				} else if (comando.equals("cria_c")) {
					conjuntos.put(nome, new HashSet<Character>());
					tipoConjuntos.put(nome, "char");
				}
			} else if (comando.equals("adiciona")) {
				String nome = entrada.next();
				
				if (tipoConjuntos.get(nome).equals("int")) {
					int valor = entrada.nextInt();
					Set<Integer> conjunto = (Set<Integer>) conjuntos.get(nome);
					conjunto.add(valor);
				} else if (tipoConjuntos.get(nome).equals("string")) {
					String valor = entrada.next();
					Set<String> conjunto = (Set<String>) conjuntos.get(nome);
					conjunto.add(valor);
				} else if (tipoConjuntos.get(nome).equals("char")) {
					String valor = entrada.next();
					Set<Character> conjunto = (Set<Character>) conjuntos.get(nome);
					conjunto.add(valor.charAt(0));
				}
			} else if (comando.equals("remove")) {
				String nome = entrada.next();
				if (tipoConjuntos.get(nome).equals("int")) {
					int valor = entrada.nextInt();
					Set<Integer> conjunto = (Set<Integer>) conjuntos.get(nome);
					conjunto.remove(valor);
				} else if (tipoConjuntos.get(nome).equals("string")) {
					String valor = entrada.next();
					Set<String> conjunto = (Set<String>) conjuntos.get(nome);
					conjunto.remove(valor);
				} else if (tipoConjuntos.get(nome).equals("char")) {
					String valor = entrada.next();
					Set<Character> conjunto = (Set<Character>) conjuntos.get(nome);
					conjunto.remove(valor.charAt(0));
				}
			} else if (comando.equals("uniao")) {
				String nome1 = entrada.next();
				String nome2 = entrada.next();
				
				if (tipoConjuntos.get(nome1).equals("int")) {
					Set<Integer> conjunto1 = (Set<Integer>)conjuntos.get(nome1);
					Set<Integer> conjunto2 = (Set<Integer>)conjuntos.get(nome2);
				
					Set<Integer> conjuntoResultante = OperaConjuntos.uniao(conjunto1, conjunto2);
					ArrayList<Integer> lista = new ArrayList<Integer>(conjuntoResultante);
					Collections.sort(lista);
					
					for (Integer valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				} else if (tipoConjuntos.get(nome1).equals("char")) {
					Set<Character> conjunto1 = (Set<Character>)conjuntos.get(nome1);
					Set<Character> conjunto2 = (Set<Character>)conjuntos.get(nome2);
				
					Set<Character> conjuntoResultante = OperaConjuntos.uniao(conjunto1, conjunto2);
					ArrayList<Character> lista = new ArrayList<Character>(conjuntoResultante);
					Collections.sort(lista);
					
					for (Character valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				} else if (tipoConjuntos.get(nome1).equals("string")) {
					Set<String> conjunto1 = (Set<String>)conjuntos.get(nome1);
					Set<String> conjunto2 = (Set<String>)conjuntos.get(nome2);
				
					Set<String> conjuntoResultante = OperaConjuntos.uniao(conjunto1, conjunto2);
					ArrayList<String> lista = new ArrayList<String>(conjuntoResultante);
					Collections.sort(lista);
					
					for (String valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				}
			} else if (comando.equals("inter")) {
				String nome1 = entrada.next();
				String nome2 = entrada.next();
				
				if (tipoConjuntos.get(nome1).equals("int")) {
					Set<Integer> conjunto1 = (Set<Integer>)conjuntos.get(nome1);
					Set<Integer> conjunto2 = (Set<Integer>)conjuntos.get(nome2);
				
					Set<Integer> conjuntoResultante = OperaConjuntos.interseccao(conjunto1, conjunto2);
					ArrayList<Integer> lista = new ArrayList<Integer>(conjuntoResultante);
					Collections.sort(lista);
					
					for (Integer valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				} else if (tipoConjuntos.get(nome1).equals("char")) {
					Set<Character> conjunto1 = (Set<Character>)conjuntos.get(nome1);
					Set<Character> conjunto2 = (Set<Character>)conjuntos.get(nome2);
				
					Set<Character> conjuntoResultante = OperaConjuntos.interseccao(conjunto1, conjunto2);
					ArrayList<Character> lista = new ArrayList<Character>(conjuntoResultante);
					Collections.sort(lista);
					
					for (Character valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				} else if (tipoConjuntos.get(nome1).equals("string")) {
					Set<String> conjunto1 = (Set<String>)conjuntos.get(nome1);
					Set<String> conjunto2 = (Set<String>)conjuntos.get(nome2);
				
					Set<String> conjuntoResultante = OperaConjuntos.interseccao(conjunto1, conjunto2);
					ArrayList<String> lista = new ArrayList<String>(conjuntoResultante);
					Collections.sort(lista);
					
					for (String valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				}
			} else if (comando.equals("diff")) {
				String nome1 = entrada.next();
				String nome2 = entrada.next();
				
				if (tipoConjuntos.get(nome1).equals("int")) {
					Set<Integer> conjunto1 = (Set<Integer>)conjuntos.get(nome1);
					Set<Integer> conjunto2 = (Set<Integer>)conjuntos.get(nome2);
				
					Set<Integer> conjuntoResultante = OperaConjuntos.diferenca(conjunto1, conjunto2);
					ArrayList<Integer> lista = new ArrayList<Integer>(conjuntoResultante);
					Collections.sort(lista);
					
					for (Integer valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				} else if (tipoConjuntos.get(nome1).equals("char")) {
					Set<Character> conjunto1 = (Set<Character>)conjuntos.get(nome1);
					Set<Character> conjunto2 = (Set<Character>)conjuntos.get(nome2);
				
					Set<Character> conjuntoResultante = OperaConjuntos.diferenca(conjunto1, conjunto2);
					ArrayList<Character> lista = new ArrayList<Character>(conjuntoResultante);
					Collections.sort(lista);
					
					for (Character valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				} else if (tipoConjuntos.get(nome1).equals("string")) {
					Set<String> conjunto1 = (Set<String>)conjuntos.get(nome1);
					Set<String> conjunto2 = (Set<String>)conjuntos.get(nome2);
				
					Set<String> conjuntoResultante = OperaConjuntos.diferenca(conjunto1, conjunto2);
					ArrayList<String> lista = new ArrayList<String>(conjuntoResultante);
					Collections.sort(lista);
					
					for (String valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				}
			} else if (comando.equals("sub")) {
				String nome = entrada.next();
				
				if (tipoConjuntos.get(nome).equals("int")) {
					Set<Integer> conjunto = (Set<Integer>)conjuntos.get(nome);
					int v1 = entrada.nextInt();
					int v2 = entrada.nextInt();
				
					Set<Integer> conjuntoResultante = OperaConjuntos.sub(conjunto, v1, v2);
					ArrayList<Integer> lista = new ArrayList<Integer>(conjuntoResultante);
					Collections.sort(lista);
					
					for (Integer valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				} else if (tipoConjuntos.get(nome).equals("char")) {
					Set<Character> conjunto = (Set<Character>)conjuntos.get(nome);
					char v1 = entrada.next().charAt(0);
					char v2 = entrada.next().charAt(0);
				
					Set<Character> conjuntoResultante = OperaConjuntos.sub(conjunto, v1, v2);
					ArrayList<Character> lista = new ArrayList<Character>(conjuntoResultante);
					Collections.sort(lista);
					
					for (Character valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				} else if (tipoConjuntos.get(nome).equals("string")) {
					Set<String> conjunto = (Set<String>)conjuntos.get(nome);
					String v1 = entrada.next();
					String v2 = entrada.next();
				
					Set<String> conjuntoResultante = OperaConjuntos.sub(conjunto, v1, v2);
					ArrayList<String> lista = new ArrayList<String>(conjuntoResultante);
					Collections.sort(lista);
					
					for (String valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				}
			} else if (comando.equals("soma")) {
				String nome = entrada.next();
				int parcela = entrada.nextInt();
				Set<Integer> conjunto = (Set<Integer>)conjuntos.get(nome);
				Set<Integer> conjuntoResultante = OperaConjuntos.somarValor(conjunto, parcela);
				ArrayList<Integer> lista = new ArrayList<Integer>(conjuntoResultante);
				Collections.sort(lista);
				for (Integer valor : lista) {
					System.out.print(valor + " ");
				}
				System.out.println();
			} else if (comando.equals("imprime")) {
				String nome = entrada.next();
				
				if (tipoConjuntos.get(nome).equals("int")) {
					Set<Integer> conjunto = (Set<Integer>)conjuntos.get(nome);
					ArrayList<Integer> lista = new ArrayList<Integer>(conjunto);
					Collections.sort(lista);
					
					for (Integer valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				} else if (tipoConjuntos.get(nome).equals("char")) {
					Set<Character> conjunto = (Set<Character>)conjuntos.get(nome);
					ArrayList<Character> lista = new ArrayList<Character>(conjunto);
					Collections.sort(lista);
					
					for (Character valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				} else if (tipoConjuntos.get(nome).equals("string")) {
					Set<String> conjunto = (Set<String>)conjuntos.get(nome);
					ArrayList<String> lista = new ArrayList<String>(conjunto);
					Collections.sort(lista);
					
					for (String valor : lista) {
						System.out.print(valor + " ");
					}
					System.out.println();
				}
			}
			
		} while (!comando.equals("sair"));
	}

}
