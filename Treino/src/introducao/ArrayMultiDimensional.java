package introducao;

import java.util.Random;

public class ArrayMultiDimensional {

	public static void main(String[] args) {
		
		String[][] biDimensional = {//criando array com mais de 1 dimensão.
				{"Adson", "M", "PE", "Palmares"},
				{"Aline", "F", "PE", "São José da Coroa Grande"},
				{"Aderbal", "M", "DF", "Brasília"}
									};
		
		System.out.println(biDimensional[0][0]);//acessando os dados do array
		System.out.println(biDimensional[1].length);//contando quantidade de informações dentro do sub-array ou array interno
		int total = biDimensional[1].length;//outra forma de contar as informações.
		System.out.println(total);
		
		biDimensional[2][0] = "ADERBAL";//substituindo informações;
		System.out.println(biDimensional[2][0]);
		
		String[] face = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String[] nipe = {"Espada", "Paus", "Copa", "Ouro"};
		
		String carta = face[0] + " " + nipe[0];
		System.out.println(carta);
		
		Random r = new Random();
		
		int indiceFace = r.nextInt(face.length);
		String faces = face[indiceFace];
		
		int indiceNipe = r.nextInt(nipe.length);
		String nipes = nipe[indiceNipe];
		
		carta = faces + " " + nipes;
		System.out.println(carta);

	}

}
