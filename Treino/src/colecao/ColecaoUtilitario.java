package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Guaraná");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("Açaí");
		list.add("Banana");
		
		System.out.println(list);
		
		Collections.sort(list);	//ordena em ordem crescente
		System.out.println(list);
		Collections.reverse(list);//ordena em ordem decrescente
		System.out.println(list);
		Collections.shuffle(list);//embaralha os dados da coleção
		System.out.println(list);
		Collections.addAll(list, "Cupuaçu", "Laranja", "Laranja");//adicionar mais dados a lista
		System.out.println(list);
		System.out.println(Collections.frequency(list, "Laranja"));//ver a quantidades de vezes que ocorre um dado
		
		List<String> list2 = Arrays.asList("Acerola", "Graviola");
		
		System.out.println(Collections.disjoint(list, list2));//pesquisa se dentro do primeiro objeto tem o segundo
		
		Collections.sort(list);
		String a;
		int indice = Collections.binarySearch(list, "Guaraná");//retorna o indice da pesquisa
		System.out.println(indice);
		
		Collections.fill(list, "Açaí");//troca toda a lista pela nova palavra passada
		System.out.println(list);
		
		Collection<String> constante  =
		Collections.unmodifiableCollection(list);//faz com que uma lista seja constante

	}

}
