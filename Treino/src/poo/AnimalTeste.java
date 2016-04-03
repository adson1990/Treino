package poo;

public class AnimalTeste {

	public static void barulho (Animal animal){
		animal.fazerBarulho();
	}
	
	
	public static void main(String[] args) {
		Cachorro toto = new Cachorro();
		toto.dormir();
		toto.comida = "Ração";
		toto.peso = 15;
		toto.fazerBarulho();
		System.out.println(toto.comida + "\n");
		
		Galinha carijo = new Galinha();
		carijo.peso = 2.3;
		carijo.comida = "milho";
		carijo.fazerBarulho();
		System.out.println(carijo.peso + "\n");
		
		//Animal animalGenerico = new Animal(27, "carne");
		//animalGenerico.fazerBarulho();
		//System.out.println(animalGenerico.comida + "\n" +
							//animalGenerico.peso + "\n");
		
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal );
		System.out.print("\n");
		
		barulho(toto);
		barulho(carijo);
		System.out.println("\n");
		
		System.out.println(toto.equals(carijo));//compara os 2 objetos
		System.out.println(toto.hashCode());//gera numero serial unico pro objeto
		System.out.println(toto.getClass());//retorna o tipo da classe do objeto
		System.out.println(toto.toString());//retorna a respresentação em texto do objeto
		
	}

}
