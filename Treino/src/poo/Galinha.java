package poo;

public class Galinha extends Animal implements AreaCalculavel{
	double tamanho;
	
	Galinha(){
		super(15, "Ra��o");
	}
	
	public void fazerBarulho(){
		System.out.println("C�, c�!");
	}

	public double calculaArea() {
		return 0;
	}

	public double calculaDobroArea() {	
		return 0;
	}
}
