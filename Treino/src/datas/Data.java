package datas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {

	public static void main(String[] args) {
		

		//01 DE JANEIRO DE 1970 (hora zero no JAVA)
		System.out.println(System.currentTimeMillis() + " data atual em milisegundos desde hora 0");//retorna a data em milisegundos desde a hora zero
		
		Date agora = new Date();//retorna a data atual
		System.out.println(agora + " data atual");
		
		Date data = new Date(System.currentTimeMillis());//outra forma de retornar a data atual
		System.out.println(data + " data atual");
		
		Date data2 = new Date(1_000_000_000_000L);//retorna a data com a quantidade de mili segundos informada
		System.out.println(data2 + " data passando milisegundos");
		
		//MÉTODOS
		System.out.println(data.getTime() + " Data atual em milisegundos");//retorna o tempo atual em mili segundos
		data.setTime(1_000_000_000_000L);//definir um tempo em mili segundos
		System.out.println(data.compareTo(agora));//se a data for menor do que a comparada retorna <0 e se for maior retorna >0
		
		//GregorianCalendar
		Calendar c = Calendar.getInstance();//calendario é uma classe abstrata por isso não pode ser instanciada para criar objetos
		new GregorianCalendar();//criação de um calendario tipo gregoriano equivale a getInstance
		
		System.out.println("\n\n");
		c.set(1980, Calendar.FEBRUARY, 12);
		System.out.println(c.getTime());//retorna um objeto do tipo date
		System.out.println(c.get(Calendar.YEAR));//método get recebe como parâmetro o que vc deseja recuperar no caso do exemplo foi o ano
		System.out.println(c.get(Calendar.MONTH));//agora buscando retornar o mes os meses começam a ser contados em 0.
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//retorna o dia do mês
		
		System.out.println("\n\n");
		c.set(Calendar.YEAR, 1972);//o método set serve para alterar valores
		c.set(Calendar.MONTH, Calendar.MARCH);//alterando o mes podendo ser substituido tb por numero contando a partir de 0
		c.set(Calendar.DAY_OF_MONTH, 25);//alterando o dia do mes
		System.out.println(c.getTime());//exibindo resultado
		
		c.clear(Calendar.MINUTE);//limpando os minutos
		c.clear(Calendar.SECOND);//limpando os segundos
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH, 1);//adiciona 1 ao dia da data
		c.add(Calendar.YEAR, 1);//adiciona 1 ao ano da data
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH, -2);//diminuindo 2 dias da data
		c.add(Calendar.YEAR, -2);//diminuido o ano
		System.out.println(c.getTime());
		
		c.roll(Calendar.DAY_OF_MONTH, 20);//adicina 20 dias sem virar o mes pois o metodo roll n meche nas unidade maiores das que ele esta editando
		System.out.println(c.getTime());
		
		//EXEMPLO
		
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		
		if (hora < 12){
			System.out.println("Bom dia");
		} else if (hora >12 && hora<18){
			System.out.println("Boa Tarde");
		} else {
			System.out.println("Boa Noite");
		}
	}
}