package poo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EspressaoRegular {

	public static void main(String[] args) {
		
		String padrao = "Java";
		String referencia = "Java";
		
		boolean b = referencia.matches(padrao);
		System.out.println(b);
		
		padrao = "java";
		
		b = referencia.matches(padrao);
		System.out.println(b);
		
		/*MODIFICADORES
		 * (?i), ignora maiúsculas e minúsculas)
		 * (?x), reconhece comentários
		 * (?m), multilinhas
		 * (?s), Dottal*/
		
		b = "Java".matches("(?i)java");
		System.out.println(b);
		b = "Java".matches("(?im)java");
		System.out.println(b);
		
		/*METACARACTERES
		 * . qualquer caracter
		 * \d dígitos [0-9]
		 * \D não é dígito [^0-9]
		 * \s espaços [\t\n\x0B\f\r]
		 * \S não é espaço [^\s]
		 * \w letra [a-zA-Z_0-9]
		 * \W não é letra*/
		System.out.println("\n");
		b = "@".matches(".");
		System.out.println(b);
		b = "2".matches("\\d");
		System.out.println(b);
		b = "a".matches("\\d");
		System.out.println(b);
		b = "A".matches("\\w");
		System.out.println(b + "AQUI");
		b = "#".matches("\\w");
		System.out.println(b);
		b = " ".matches("\\s");
		System.out.println(b + "\n");
		
		b = "Pi".matches(".");
		System.out.println(b);
		b = "Pi".matches("..");
		System.out.println(b);
		b = "Pia".matches("...");
		System.out.println(b);
		b = "21".matches("\\d\\d");
		System.out.println(b);
		
		//EXEMPLO DE VALIDAÇÃO DE CEP
		
		System.out.println();
		b = "54420-200".matches("\\d\\d\\d\\d\\d\\D\\d\\d\\d");
		System.out.println(b);
		
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "12345-000".matches(cep);
		System.out.println(b);
		
		/*QUANTIFICADORES
		 * X{n}    X, exatamente n vezes
		 * X{n,}   X, pela menos n vezes
		 * X{n, m} X, pelo menos n mas não mais do que m vezes
		 * X?      X, 0 ou 1 vez
		 * X*      X, 0 ou + vezes
		 * X+      X, 1 ou + vezes*/
		System.out.println();
		b = "2114".matches("\\d{4}");
		System.out.println(b);
		
		b = "12345".matches("\\d{2,}");
		System.out.println(b);
		
		b = "123456".matches("\\d{2,5}");
		System.out.println(b);
		
		b = "".matches(".?");
		System.out.println(b);
		
		b = "".matches(".+");
		System.out.println(b);
		
		cep = "\\d{5}-\\d{3}";
		b = "54420-200".matches(cep);//validando cep
		System.out.println(b);
		
		b = "11/06/2015".matches("\\d{2}/\\d{2}/\\d{4}");//validando data
		System.out.println(b);
		
		/*METACARACTER DE FRONTEIRA
		 * ^   inicia
		 * $   finaliza
		 * |   ou*/
		System.out.println();
		b= "Pier21".matches("^Pier.*");//validação se inicia com Pier
		System.out.println(b);
		
		b = "Pier21".matches(".+21$");//validação começar com 1 ou + caracter e termina com 21
		System.out.println(b);
		
		b = "tem Java aqui".matches(".*(?i)java.*");//validação começa com qualquer caracter no meio pesquisa a palavra java sem diferença maiúscula e minúscula e termina com qualquer caracter
		System.out.println(b);
		
		b = "sim".matches("sim|não");//validação OU
		System.out.println(b);
		
		/*AGRUPADORES
		 * [...]			agrupamento
		 * [a-z]			alcance
		 * [a-e][i-u]		união
		 * [a-z&&[aeiou]]	intersecção
		 * [^abc]			exceção
		 * [a-z&&[^m-p]]	Subtração
		 * \x				fuga literal*/
		System.out.println();
		b = "2".matches("[a-z]");
		System.out.println(b);
		
		b = "A".matches("(?i)[a-z]");//validação ignorando maiúsculas e minúsculas
		System.out.println(b);
		
		b = "true".matches("[tT]rue|[yY]es");//validação de letra maiúscula ou minúscula no começo
		System.out.println(b);
		
		b = "Adson".matches("^[A-Z]?[a-z]*");//validação no começo da palavra
		System.out.println(b);
		
		b = "alho".matches("[^abc]lho");//validação de exceção no começo da palavra
		System.out.println(b);
		
		b = "crou".matches("cr[ae]u");//validação do meio da palavra
		System.out.println(b);
		
		b = "rh@xtiuniversity.com.br".matches("\\w+@\\w+\\.\\w{3}\\.\\w{2}");//validação simples de e-mail
		System.out.println(b);
		
		System.out.println();
		String doce = "Qual é o Doce mais doce que o doCe?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		
		while(matcher.find()){
			System.out.println(matcher.group());
		}
			//SUBSTITUIÇÕES
			
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		System.out.println(r);
		
		String rato = "O rato roeu a roupa do rei de roma.";
		r = rato.replaceAll("r[aeiou]", "XX");
		System.out.println(r);
		
		r = "Tabular esse texto".replaceAll("\\s", "\t");
		System.out.println(r);
		
		String url = "www.xti.com.br/clientes-2015.html";
		
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b = url.matches(re);
		System.out.println(b);
		
		re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		r = url.replaceAll(re, "http://$1/$3/$2.jsp");
		
		System.out.println(r);
	}

}
