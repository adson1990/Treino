package datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data2 {

	public static void main(String[] args) throws ParseException {
		
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		Date data = c.getTime();
		System.out.println(data + " objeto data com formatação calendar");//a hora é a atual
		
		//FORMATAÇÃO DE DATAS
		DateFormat f = DateFormat.getDateInstance();//formatação default de data dd/mm/yyyy
		System.out.println(f.format(data) + " formatação default de data");
		
		//FORMATAÇÃO DAS HORAS
		f = DateFormat.getTimeInstance();//formatação default de horas hh:mm:ss
		System.out.println(f.format(data) + " formatação default de hora");
		
		//FORMATAÇÃO DE DATA E HORA
		f = DateFormat.getDateTimeInstance();//farmatação default de data e horas
		System.out.println(f.format(data) + " formatação padrão de data e hora");
		
		//FORMATAÇÃO DE ESTILOS
		f = DateFormat.getDateInstance(DateFormat.FULL);//(nome_do_dia), "dd" de "nome_do_mes" de "ano"
		System.out.println(f.format(data) + " estilo full");
		f = DateFormat.getDateInstance(DateFormat.LONG);//"dd" de "nome_do_mes" de "ano"
		System.out.println(f.format(data) + " estilo long");
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);//dd/mm;yyyy
		System.out.println(f.format(data) + " estilo medium");
		f = DateFormat.getDateInstance(DateFormat.SHORT);//dd/mm/yy
		System.out.println(f.format(data) + " estilo short");
		
		//CONVERSÕES
		Date data2 = f.parse("18/05/2015");
		System.out.println(data2);
		
		//SIMPLE DATE FORMAT
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdt.format(data));
		System.out.println(sdt.parse("10/10/2010 12:01:40"));
		Date data3 = new Date();
		System.out.println(sdt.format(data3));
	}

}
