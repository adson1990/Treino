package poo;

public class Motor {
	//VARIÁVEIS (atributos)
	String tipo;
	int potencia;
	int rpm;
	int tanque;
	
	//CONSTRUTORES
	public Motor(){}
	
	public Motor(String tipo, int potencia){
		this.tipo = tipo;
		this.potencia = potencia;
	}
	
	public Motor(String tipo, int potencia, int rpm){
		this.tipo = tipo;
		this.potencia = potencia;
		this.rpm = rpm;
	}
	
	public Motor(String tipo, int potencia, int rpm, int tanque){
		this.tipo = tipo;
		this.potencia = potencia;
		this.rpm = rpm;
		this.tanque = tanque;
	}
	
	//MÉTODOS
	
	void ronco(){
		System.out.println("VRUM" + "VRUM" + "VRUM");
	}
	
	int aceleracao(int numero){
		int x;
		for (x = 0; x < 100; x++){
			System.out.println(x + "Km/h");
		}
		
		return x;
	}

}
