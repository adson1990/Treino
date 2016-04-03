package threads;

public class Compras implements Runnable {

	ContaConjunta c = new ContaConjunta();
	
	public static void main(String[] args) {
		Compras irAsCompras = new Compras();
		new Thread(irAsCompras, "Pai").start();;
		new Thread(irAsCompras, "Mãe").start();
		new Thread(irAsCompras, "Filho").start();
		new Thread(irAsCompras, "Filha").start();
		
	}

	@Override
	public void run() {
		String nome = Thread.currentThread().getName();
		for(int i=0 ; i < 5 ; i++){
		c.sacar(20, nome);
		if(c.getSaldo() < 0 ){
			System.out.println("Conta estourou.");
			}
		}
	}
}