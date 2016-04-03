package poo;

public class Quadrado implements AreaCalculavel {

	double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}

	public double calculaArea() {
		return lado * lado;
	}

	public double calculaDobroArea() {
		return (lado * lado) * 2;
	}
	
	
	
}
