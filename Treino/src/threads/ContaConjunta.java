package threads;

public class ContaConjunta {
	
	private double saldo=200.00;
	
	public double getSaldo(){
		return saldo;
	}
	
	public synchronized void sacar(double valor, String cliente){
		if(saldo >= valor){
			double saldoOriginal = saldo;
		System.out.println(cliente + " Efetuando saque.");
			try {
				System.out.println(cliente + " esperando...");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			saldo -= valor;//aguardando processamento
			System.out.println(cliente + " sacou " + valor);
			System.out.println("Saldo inicial= " + saldoOriginal
							+ " Saldo final= " + saldo);
		}else{
			System.out.println("Valor de saque maior que o saldo " + cliente);
		}
	}
}