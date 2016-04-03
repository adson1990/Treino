package introducao;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		/**
		 * Calculadora do IMC
		 * IMC = pesoEmKilogramas / (alturaEmMetros * alturaEmMetros)
		 */
		double pesoEmKilogramas = 170;
		double alturaEmMetros = 1.76;
		double imc = pesoEmKilogramas / (alturaEmMetros * alturaEmMetros);
		
		String msg = (imc >=20 && imc <=25) ? "Peso ideal." : "Fora do peso ideal";
		
		System.out.println("IMC : " + imc);
		System.out.println(msg);
		
		String peso = JOptionPane.showInputDialog("Qual seu peso em KG?");
		pesoEmKilogramas = Double.parseDouble(peso);
		
		String altura = JOptionPane.showInputDialog("Qual sua altura em metros?");
		alturaEmMetros = Double.parseDouble(altura);
		
		imc = pesoEmKilogramas / (alturaEmMetros * alturaEmMetros);
		msg = "IMC = " + imc + "\n" + msg; 
		
		JOptionPane.showMessageDialog (null, msg);

	}

}
