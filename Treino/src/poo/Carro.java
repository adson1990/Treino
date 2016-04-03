package poo;

public class Carro {
	String modelo;
	int velocidadeMaxima;
	double segundos;
	Motor motor;
	
	public Carro(String modelo,//construtor criado com os tipos criados
				int velocidadeMaxima,
				double segundos){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundos = segundos;
		
	}
	
	public Carro(){//construtor vazio padrão.
		
	}
	
	public Carro(String modelo,//construtor ja com a classe motor criada
				int velocidadeMaxima,
				double segundos,
				Motor motor){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundos = segundos;
		this.motor = motor;
	}

}