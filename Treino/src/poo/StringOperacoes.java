package poo;

public class StringOperacoes {

	public static void main(String[] args) {
		
		String s1 = "Write Once";
		String s2 = s1 + " Run AnyWhere";
		String s3 = new String("Java Virtual Machine");
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String (array);
		
		//operações
		int tamanho = s1.length();//conta a quantidade de carcteres da string
		System.out.println(tamanho);
		char letra = s1.charAt(0);//começando de 0 até o número de carteres -1
		System.out.println(letra);
		String texto = s1.toString();
		System.out.println(texto);
		
		//localização
		int letra2 = s3.indexOf('J');//retorna o índice da posição exata do caractere encontrado
		System.out.println(letra2);
		int posicao = s3.indexOf("Virtual");//retorna a posição do primeiro caractere achado na String
		System.out.println(posicao);
		int posicao2 = s3.lastIndexOf('a');//retorna a posição do ultimo caractere pedido da String
		System.out.println(posicao2);
		boolean vazio = s3.isEmpty();//retorna true se tiver vazia a variável e false se não estiver
		System.out.println(vazio);
		
		//comparação
		String xti = "XTI";
		boolean igual = xti.equals("xti");//compara as String
		System.out.println(igual);
		igual = xti.equalsIgnoreCase("xti");//compara ignorando as letras maiusculas e menusculas
		System.out.println(igual);
		igual = xti.startsWith("X");//verifica se a String começa com o caractere informado
		System.out.println(igual);
		igual = xti.endsWith("I");//verifica se a String termina com os caracteres informados
		System.out.println(igual);
		int compara = "amor".compareTo("bola");//retorna um inteiro analisando a ordem alfabética das palavras
		System.out.println(compara);//se vier primeiro retorna < 0 se não retorna > 0
		//este ultimo método também serve para número em formato de String
		String so = "Olhe, olhe!";
		boolean o = so.regionMatches(6, "Olhe", 0, 5);//compara se existe determinada string A PARTIR da primeira posição informada, depois informa a string, depois informa de qual posição até qual outra posição deseja analisar
		System.out.println(o);
		boolean o2 = so.regionMatches(true, 6, "Olhe", 0, 4);//com o true ele ignora o case de letras maiusculas
		System.out.println(o2);
		
		//extração
		String s5 = "O Brasil ta fudido";
		String s6 = s5.substring(12);//retorna todo o resto da String a partir do índice informado
		System.out.println(s6);
		s6 = s5.concat(" mas que merda");//concatena o que ja existe na String mais a nova String informada
		//s6 += s5 + " mas que merda"; equivalente ao processo acima citado
		System.out.println(s6);
		s6 = s6.replace("fudido", "lascado");//efetua substituição de String (velha, nova)
		System.out.println(s6);
		s6 = s5.replaceFirst(" ", "x");//troca a primeira ocorrencia do caractere informado
		System.out.println(s6);
		s6 = s5.replaceAll(" ", "X");//troca todas as ocorrencias
		System.out.println(s6);
		s6 = s5.toUpperCase();//converte toda a string para maiúscula
		System.out.println(s6);
		s6 = s5.toLowerCase();//converte toda a string para minúscula
		System.out.println(s6);
		
		System.out.println("       espaços         ".trim());//remove os espaços antes e depois da String
		}
}