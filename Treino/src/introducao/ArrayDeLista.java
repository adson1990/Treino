package introducao;

import java.util.ArrayList;
import java.util.Random;

public class ArrayDeLista {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();//construindo um array list
		cores.add("Branco");//adicionando informações ao array
		cores.add(0, "Vermelho");//numerando a ordem do array
		cores.add("Verde");
		cores.add(1, "Azul");
		
		System.out.println(cores.toString());//podendo ser também System.out.print(cores);
		System.out.println(cores.size());//contando elementos do array
		System.out.println(cores.get(2));//retorna o elemento posicionado no indíce indicado
		System.out.println(cores.indexOf("Branco"));//retorna o indice do elemento indicado
		
		cores.remove("Azul");//remove um elemento do array list
		
		System.out.println(cores.contains ("Amarelo"));//pesquisa se o elemento existe no array
		
		//array list com foreach
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<=10; i++){//for comum
			
			list.add(i);
		}
		for (Integer numero : list){//foreach
			System.out.println(numero);
		}

	}

}
