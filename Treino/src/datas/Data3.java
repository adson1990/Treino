package datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Data3 {

	public static void main(String[] args) {

		/*ISO 639 padr�o de l�ngua
		 * ISO 3166 padr�o de pa�s*/
		
		Calendar c = Calendar.getInstance();
		c.set(1990, Calendar.NOVEMBER, 12);
		Date data = c.getTime();
		
		Locale padrao = Locale.getDefault();
		Locale brasil = new Locale("pt", "BR");//pt= portuguese (lingua), BR= brazil (pa�s)
		Locale india = new Locale("hi", "IN");//hi = hindi (lingua indiana), IN= India (pa�s)
		Locale usa = Locale.US;
		Locale japan = Locale.JAPAN;//podendo ser japanese
		Locale italiano = Locale.ITALIAN;//podendo ser italy
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, brasil);//como se passa a localiza��o por par�metro para a formata��o criada
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, india);//passando por par�metro a localiza��o india criada
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, usa);//passando por par�metro a localiza��o usa criada
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, japan);//passando por par�metro a localiza��o japan criada
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, italiano);//passando por par�metro a localiza��o italiano criada
		System.out.println(df.format(data));
	}

}
