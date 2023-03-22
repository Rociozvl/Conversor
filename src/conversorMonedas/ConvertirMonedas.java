package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertPesosArgentinoDolares(double valor) {
		double monedaDolar = valor / 137.68;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "You have $ " + monedaDolar + "dollars");
	}
	public void ConvertirPesosArgentinoEuros(double valor) {
		double monedaEuro = valor / 137.20;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	public void ConvertirPesosArgentinoLibra(double valor) {
		double monedaLibra = valor / 161.52;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
	}
	public void ConvertirPesosArgentinoYen(double valor) {
		double monedaYen = valor / 1;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
	}	
	public void ConvertirDolaresPesosArgentino(double valor) {
		double monedaDolar = 137.68 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en pesos");
	}
	public void ConvertirEurosPesosArgentino(double valor) {
		double monedaEuro = valor * 137.20;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en pesos");
	}
	public void ConvertirLibraPesosArgentino(double valor) {
		double monedaLibra = valor * 161.52;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en pesos");
	}
	public void ConvertirYenPesosArgentino(double valor) {
		double monedaYen = valor * 1;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en pesos");
	}

}
