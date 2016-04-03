package threads;

public class PingPongRunnable implements Runnable{

	String palavra;
	long tempo;
	
	public PingPongRunnable(String palavra, long tempo){
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run(){
		try {
		for (int i = 0; i < 100; i++) {
			System.out.println(palavra);
			Thread.sleep(tempo);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
	
	public static void main(String[] args) {
		
		//CRIANDO A THREAD
		Runnable ping = new PingPongRunnable("Ping", 1000);//o comando start deixa a thread pronta pra ser executada
		Runnable pong = new PingPongRunnable("Pong", 1000);
		
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();
	}
}