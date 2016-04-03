package poo;

@SuppressWarnings("serial")
public class Conta implements java.io.Serializable {
	private double saldo;
	transient private String nome;
	
	//CONSTRUTORES
	public Conta(){
	}
	
	public Conta (String nome, double saldo){
		this.nome = nome;
		this.saldo = saldo;
	}
	
	//MÉTODOS PARA RETORNAR VALORES DAS VARIÁVEIS
	public double getSaldo(){
		return saldo;
	}
	
	public String getNome(){
		return nome;
	}
	
	//MÉTODOS PARA SETAR VALORES NAS VARIÁVEIS
	public double setSaldo(double saldo){
		this.saldo += saldo;
		return this.saldo;
	}
	
	public String setNome(String nome){
		this.nome = nome;
		return this.nome;
	}
	
	//MÉTODOS
	public void visualizarSaldo(){
		System.out.println("Cliente: " + nome + " seu saldo é: " + saldo);
	}
	
	public void sacarValor(double valor){
		this.saldo -= valor;
	}
	
	public void depositarValor(double valor){
		this.saldo += valor;
	}
	
	public void transfereValor(Conta nova, double valor){
		this.saldo -= valor;
		nova.saldo += valor;
	}

}