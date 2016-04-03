package leituraEGravacao;

public class StringMultavel {

	public static void main(String[] args) {
			StringBuffer s0 = new StringBuffer();//métodos sincronizados, ambiente multiprocessado com várias threads acessando os mesmo stringbuffers
			StringBuilder s1 = new StringBuilder("Java");//métodos não sincronizados
			
			s1.length();
			System.out.println(s1.capacity());//retorna a capacidade de armazenamento antes de instanciar outra classe de novo
			System.out.println(s1.toString());
			//System.out.println(s1.reverse());//exibe a String ao contrário
			s1.append(" trabalhando ");//adiciona a string
			char[] c = {'c', 'o', 'm'};//array de char
			s1.append(c).append(" textos.");//adicionando array mais append a String
			System.out.println(s1);
			
			String xti =  new StringBuffer("www.xti.com.br").delete(0, 4).toString();//deletando caracteres da String e convertendo-a de StringBuffer para String novamente
			System.out.println(xti);
			
			String utt = new String("www.google.com.br");
			String utt2 = new StringBuffer(utt).delete(0, 4).toString();//outra maneira de deletar e converter
			System.out.println(utt2);

		}

	}