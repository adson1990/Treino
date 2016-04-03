package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Colecao {

	public static void main(String[] args) {
		
	Collection<String> c = new ArrayList<>();
		
		c.add("A");//m�todo para adiconar
		c.add("E");
		c.add("I");
		
		System.out.println(c.toString());//apresenta a cole��o no formato string
		System.out.println(c.isEmpty());//retorna uma logica booleana se esta vazia
		System.out.println(c.contains("A"));//retorna uma logica booleana se existe o elemento dentro da cole�ao
		
		c.remove("A");
		System.out.println(c.toString());
		
		//GRUPOS DE COLE��ES
		
		Collection<String> c2 = Arrays.asList("O", "U");
			
			c.addAll(c2);
			System.out.println(c.toString());
			System.out.println(c.containsAll(c2));//verifica se todos os elementos de c2 existem em c1
			
			c.removeAll(c2);//remove uma cole��o de dentro de outra
			System.out.println(c.toString());
			
			String[] s = c.toArray(new String[c.size()]);//toArray ajuda a transformar uma cole��o em array
			
			System.out.println(Arrays.toString(s).toLowerCase());
			
			c.clear();//limpa a cole��o
			System.out.println(c);
			
			List<String> list = new ArrayList();
			
			list.add("futebol");
			list.add("volei");
			list.add("basket");
			list.add("nata��o");
			list.add("boxe");
			list.add("futebol");
			
			System.out.println(list);
			
			for(int i=0; i < list.size(); i++){
				String letra = (String) list.get(i);
				list.set(i, letra.toUpperCase());
			}
			
			System.out.println(list);
			
			System.out.println(list.indexOf("BOXE"));
			
			System.out.println(list.subList(2, 5));
			
			list.subList(2, 4).clear();
			System.out.println(list);

	}

}