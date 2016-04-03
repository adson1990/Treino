package poo;

public abstract class Animal {
	double peso;
	String comida;
	protected int serial;
	
	void dormir(){
		System.out.println("Dormiu.");
	}
		
		public Animal(double peso, String comida){
			this.peso = peso;
			this.comida = comida;
		}
	
		public abstract void fazerBarulho ();
		
		
		public Animal(){}
		

}
