package datas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class numero {

	public static void main(String[] args) throws ParseException {

		double saldo = 123_456.79;
		NumberFormat nf = NumberFormat.getInstance();//numberformat é uma classe abstrata n pode ser instanciada
		System.out.println(nf.format(saldo));
		
		nf = NumberFormat.getIntegerInstance();//exclui a parte decimal
		System.out.println(nf.format(saldo) + "  Exclui a parte após a virgula");
		
		nf = NumberFormat.getPercentInstance();//formatação de percentuais
		System.out.println(nf.format(0.25) + "  traz a porcentagem");
		
		nf = NumberFormat.getCurrencyInstance();//traz em moeda o valor
		System.out.println(nf.format(saldo) + "  traz em moeda");
		
		nf.setMaximumFractionDigits(1);//defini a quantidade de casas decimais
		System.out.println(nf.format(saldo) + "  defini a quantidade de casas decimais");
		
		//INTERNACIONALIZAR NÚMEROS
		nf = NumberFormat.getCurrencyInstance(Locale.US);//transforma pra dolar
		System.out.println(nf.format(saldo) + "  dolar");
		
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);//transforma pra euro
		System.out.println(nf.format(saldo) + "  euro");
		
		//CONVERSÃO DE VALORES
		nf = NumberFormat.getCurrencyInstance();//conversão
		System.out.println(nf.parse("R$ 1.100,25"));
		
	}

}
