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
		System.out.println(data + " objeto data com formata��o calendar");//a hora � a atual
		
		//FORMATA��O DE DATAS
		DateFormat f = DateFormat.getDateInstance();//formata��o default de data dd/mm/yyyy
		System.out.println(f.format(data) + " formata��o default de data");
		
		//FORMATA��O DAS HORAS
		f = DateFormat.getTimeInstance();//formata��o default de horas hh:mm:ss
		System.out.println(f.format(data) + " formata��o default de hora");
		
		//FORMATA��O DE DATA E HORA
		f = DateFormat.getDateTimeInstance();//farmata��o default de data e horas
		System.out.println(f.format(data) + " formata��o padr�o de data e hora");
		
		//FORMATA��O DE ESTILOS
		f = DateFormat.getDateInstance(DateFormat.FULL);//(nome_do_dia), "dd" de "nome_do_mes" de "ano"
		System.out.println(f.format(data) + " estilo full");
		f = DateFormat.getDateInstance(DateFormat.LONG);//"dd" de "nome_do_mes" de "ano"
		System.out.println(f.format(data) + " estilo long");
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);//dd/mm;yyyy
		System.out.println(f.format(data) + " estilo medium");
		f = DateFormat.getDateInstance(DateFormat.SHORT);//dd/mm/yy
		System.out.println(f.format(data) + " estilo short");
		
		//CONVERS�ES
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
