package colecao;

import java.util.HashMap;
import java.util.Map;

public class ColecaoMap {

	public static void main(String[] args) {
		
		Map<String, String> pais = new HashMap<>();//a classe map não recebe apenas 1 parâmetro, são 2: 1 para chave outro para valor
		pais.put("BR", "Brasil");
		pais.put("RU", "Rússia");
		pais.put("IN", "Índia");
		pais.put("CN", "China");
		
		System.out.println(pais);
		
		System.out.println(pais.containsKey("BR"));//retorna um booleano se existe a chave no objeto
		System.out.println(pais.containsKey("US"));
		
		System.out.println(pais.containsValue("Brasil"));//retorna um booleano se existe o valor no objeto
		System.out.println(pais.containsValue("USA"));
		
		System.out.println(pais.get("CN"));//retorna o conteúdo da chave
		System.out.println(pais.remove("RU"));//remove o conteúdo indicado pela chave
		
		System.out.println(pais);
		
		System.out.println(pais.keySet());
	}
}