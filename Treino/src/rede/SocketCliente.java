package rede;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketCliente {

	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("172.16.180.6", 5000);
		Scanner s = new Scanner (socket.getInputStream());
		System.out.println("Mensagem: " + s.nextLine());
		s.close();

	}

}
