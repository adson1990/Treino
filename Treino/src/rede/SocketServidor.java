package rede;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServidor {

	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(5000);
		while (true) {
			Socket socket = server.accept();
			try (PrintWriter pw = new PrintWriter(socket.getOutputStream())) {
				pw.println("Aprenda JAVA e seja contratado.");
			}
		}

	}

}