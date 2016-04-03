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
		
		System.out.println(fila.peek());//mostra o pr�ximo elemento da fila a ser atendido/processado mas n�o o retira da fila
		System.out.println(fila.poll());//remove o pr�ximo elemento para ser atendido/processado
		System.out.println(fila);
		
		//M�TODOS DISPON�VEIS EM LINKEDLIST
		LinkedList<String> f = (LinkedList<String>) fila;
		f.addFirst("Joana");//adiciona elemento ao in�cio da fila
		f.addLast("Lucas");//adiciona elementos ao final da fila
		System.out.println(f);
		
		f.peekFirst();//retorna o primeiro elemento da fila
		f.peekLast();//retorna o ultimo elemento da fila
		f.pollFirst();//remove o primeiro objeto da fila
		f.pollLast();//remove o �ltimo objeto da fila
	}
}