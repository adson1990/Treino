package threads;

public class PonteSinc implements Ponte {

	private int valor = -1;
	private boolean ocupada = false;
	
	@Override
	public synchronized void set(int valor) throws InterruptedException {
		while(ocupada){
			System.out.println("Ponte ocupada.");
			wait();
		}
		System.out.println("Produziu " + valor);
		this.valor = valor;
		ocupada = true;
		notifyAll();
	}

	@Override
	public synchronized int get() throws InterruptedException {
		while(!ocupada){
			System.out.println("Ponte vazia.");
			wait();
		}
		System.err.println("Consumiu: " + valor);
		ocupada = false;
		notifyAll();
		return valor;
	}

}
