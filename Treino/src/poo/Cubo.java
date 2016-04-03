package poo;

public class Cubo implements VolumeCalculavel, AreaCalculavel {
	
	double lado;
	
	public Cubo (double lado){
		this.lado = lado;
	}

	public double calculaArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	public double calculaDobroArea() {
		// TODO Auto-generated method stub
		return (lado * lado) * 2;
	}

	public double calculaVolume() {
		// TODO Auto-generated method stub
		return 6 * (lado * lado);
	}

	public double calculaVolumeDobrado() {
		// TODO Auto-generated method stub
		return (6 * (lado * lado)) * 2;
	}

}
