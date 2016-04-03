package colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		//First In First Out FIFO
		Queue<String> fila = new LinkedList<String>();
		fila.add("Adson");
		fila.add("Gabriel");
		fila.offer("Sandra");
		
		System.out.println(fila);
		
		System.out.println(fila.peek());//mostra o próximo elemento da fila a ser atendido/processado mas não o retira da fila
		System.out.println(fila.poll());//remove o próximo elemento para ser atendido/processado
		System.out.println(fila);
		
		//MÉTODOS DISPONÍVEIS EM LINKEDLIST
		LinkedList<String> f = (LinkedList<String>) fila;
		f.addFirst("Joana");//adiciona elemento ao início da fila
		f.addLast("Lucas");//adiciona elementos ao final da fila
		System.out.println(f);
		
		f.peekFirst();//retorna o primeiro elemento da fila
		f.peekLast();//retorna o ultimo elemento da fila
		f.pollFirst();//remove o primeiro objeto da fila
		f.pollLast();//remove o último objeto da fila
	}
}