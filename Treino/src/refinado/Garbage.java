package refinado;

import java.util.List;
import java.util.ArrayList;

public class Garbage {
	
	public static long carregarMemoria(){
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100_000; i++) {
			list.add(i);
		}
		
		return Runtime.getRuntime().freeMemory();
	}

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		int MB = 1_048_576;//total de bytes em 1 MB
		double total = rt.maxMemory() / MB;
		double inicio = total - (carregarMemoria()/MB);
		
		System.out.println(total + " total de memória");
		System.out.println(inicio + " após processo");
		
		rt.runFinalization();//chama um método para finalizar variáveis n usadas mais
		rt.gc();//força a chamada do garbagge collector
		
		double fim = total - (rt.freeMemory()/MB);
		
		System.out.println("Início: " + inicio + " fim: " + fim);

	}

}
