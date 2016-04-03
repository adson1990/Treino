package rede;

//import java.awt.List;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {
	
	List<PrintWriter> escritores = new ArrayList<>();
	
	private void encaminharParaTodos(String texto){
		for (PrintWriter writer : escritores) {
			try {
			writer.println(texto);
			writer.flush();
			} catch(Exception e){}
		}
	}
	
	public ChatServer(){

		
		
		ServerSocket server;
		try{
		server = new ServerSocket(5000);
		while(true){
			Socket s = server.accept();
			new Thread(new EscutaCliente(s)).start();
			PrintWriter w = new PrintWriter(s.getOutputStream());
			escritores.add(w);
			}
		}catch(Exception e) {}
		
	}	
	
	private class EscutaCliente implements Runnable{
		Scanner leitor;
		
		public EscutaCliente(Socket socket) {
			try{
			leitor = new Scanner(socket.getInputStream());
			}catch(Exception e){}
		}
		
		@Override
		public void run() {
			try {
			String line;
			while((line = leitor.nextLine()) != null){
				System.out.println(line);
				encaminharParaTodos(line);
			}
		}catch (Exception e){}
	}
	
		public void main (String[] args) {
		
		

		}

	}
}