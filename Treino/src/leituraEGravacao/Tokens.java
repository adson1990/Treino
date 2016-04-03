package leituraEGravacao;

public class Tokens {

	public static void main(String[] args) {

		String s = "XHTML; JAVASCRIPT; JAVA; CSS; JQUERY";
		String[] tokens = s.split(";");
		System.out.println(tokens.length + " tokens");

		for (String token : tokens) {
			System.out.println(token);

		}

		System.out.println("");

		String s2 = "Venha trabalha na XTI";
		String[] tokens2 = s2.split(" ");
		System.out.println(tokens2.length);
		for (String token : tokens2) {
			System.out.println(token);
		}
	}

}