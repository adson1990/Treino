package datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Data3 {

	public static void main(String[] args) {

		/*ISO 639 padrão de língua
		 * ISO 3166 padrão de país*/
		
		Calendar c = Calendar.getInstance();
		c.set(1990, Calendar.NOVEMBER, 12);
		Date data = c.getTime();
		
		Locale padrao = Locale.getDefault();
		Locale brasil = new Locale("pt", "BR");//pt= portuguese (lingua), BR= brazil (país)
		Locale india = new Locale("hi", "IN");//hi = hindi (lingua indiana), IN= India (país)
		Locale usa = Locale.US;
		Locale japan = Locale.JAPAN;//podendo ser japanese
		Locale italiano = Locale.ITALIAN;//podendo ser italy
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, brasil);//como se passa a localização por parâmetro para a formatação criada
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, india);//passando por parâmetro a localização india criada
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, usa);//passando por parâmetro a localização usa criada
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, japan);//passando por parâmetro a localização japan criada
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, italiano);//passando por parâmetro a localização italiano criada
		System.out.println(df.format(data));
	}

}
