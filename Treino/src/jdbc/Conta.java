package jdbc;

public class Conta {
	int numero;
	String cliente;
	double saldo;
	
	public Conta(int numero, String nome, double saldo){
		this.numero = numero;
		this.cliente = nome;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return numero + ", "+ cliente + ", "+ saldo;
	}

}
