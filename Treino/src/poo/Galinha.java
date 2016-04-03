package poo;

public class Galinha extends Animal implements AreaCalculavel{
	double tamanho;
	
	Galinha(){
		super(15, "Ração");
	}
	
	public void fazerBarulho(){
		System.out.println("Có, có!");
	}

	public double calculaArea() {
		return 0;
	}

	public double calculaDobroArea() {	
		return 0;
	}
}
