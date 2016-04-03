package poo;

public class StringOperacoes {

	public static void main(String[] args) {
		
		String s1 = "Write Once";
		String s2 = s1 + " Run AnyWhere";
		String s3 = new String("Java Virtual Machine");
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String (array);
		
		//opera��es
		int tamanho = s1.length();//conta a quantidade de carcteres da string
		System.out.println(tamanho);
		char letra = s1.charAt(0);//come�ando de 0 at� o n�mero de carteres -1
		System.out.println(letra);
		String texto = s1.toString();
		System.out.println(texto);
		
		//localiza��o
		int letra2 = s3.indexOf('J');//retorna o �ndice da posi��o exata do caractere encontrado
		System.out.println(letra2);
		int posicao = s3.indexOf("Virtual");//retorna a posi��o do primeiro caractere achado na String
		System.out.println(posicao);
		int posicao2 = s3.lastIndexOf('a');//retorna a posi��o do ultimo caractere pedido da String
		System.out.println(posicao2);
		boolean vazio = s3.isEmpty();//retorna true se tiver vazia a vari�vel e false se n�o estiver
		System.out.println(vazio);
		
		//compara��o
		String xti = "XTI";
		boolean igual = xti.equals("xti");//compara as String
		System.out.println(igual);
		igual = xti.equalsIgnoreCase("xti");//compara ignorando as letras maiusculas e menusculas
		System.out.println(igual);
		igual = xti.startsWith("X");//verifica se a String come�a com o caractere informado
		System.out.println(igual);
		igual = xti.endsWith("I");//verifica se a String termina com os caracteres informados
		System.out.println(igual);
		int compara = "amor".compareTo("bola");//retorna um inteiro analisando a ordem alfab�tica das palavras
		System.out.println(compara);//se vier primeiro retorna < 0 se n�o retorna > 0
		//este ultimo m�todo tamb�m serve para n�mero em formato de String
		String so = "Olhe, olhe!";
		boolean o = so.regionMatches(6, "Olhe", 0, 5);//compara se existe determinada string A PARTIR da primeira posi��o informada, depois informa a string, depois informa de qual posi��o at� qual outra posi��o deseja analisar
		System.out.println(o);
		boolean o2 = so.regionMatches(true, 6, "Olhe", 0, 4);//com o true ele ignora o case de letras maiusculas
		System.out.println(o2);
		
		//extra��o
		String s5 = "O Brasil ta fudido";
		String s6 = s5.substring(12);//retorna todo o resto da String a partir do �ndice informado
		System.out.println(s6);
		s6 = s5.concat(" mas que merda");//concatena o que ja existe na String mais a nova String informada
		//s6 += s5 + " mas que merda"; equivalente ao processo acima citado
		System.out.println(s6);
		s6 = s6.replace("fudido", "lascado");//efetua substitui��o de String (velha, nova)
		System.out.println(s6);
		s6 = s5.replaceFirst(" ", "x");//troca a primeira ocorrencia do caractere informado
		System.out.println(s6);
		s6 = s5.replaceAll(" ", "X");//troca todas as ocorrencias
		System.out.println(s6);
		s6 = s5.toUpperCase();//converte toda a string para mai�scula
		System.out.println(s6);
		s6 = s5.toLowerCase();//converte toda a string para min�scula
		System.out.println(s6);
		
		System.out.println("       espa�os         ".trim());//remove os espa�os antes e depois da String
		}
}