package threads;

public class PingPong extends Thread {

	String palavra;
	long tempo;
	
	public PingPong(String palavra, long tempo){
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run(){
		try {
		for (int i = 0; i < 5; i++) {
			System.out.println(palavra);
			Thread.sleep(tempo);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
	
	public static void main(String[] args) {
		
		//CRIANDO A THREAD
		new PingPong("Ping", 2000).start();//o comando start deixa a thread pronta pra ser executada
		new PingPong("Pong", 2000).start(); 	
	}
}