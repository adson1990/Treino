package threads;

public class PonteTeste {

	public static void main(String[] args) {
		
		Ponte ponte = new PonteSinc();
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();

	}

}
