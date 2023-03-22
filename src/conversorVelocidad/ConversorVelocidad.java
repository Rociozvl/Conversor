package conversorVelocidad;

import javax.swing.JOptionPane;

public class ConversorVelocidad {
	
	
   public void ConvertirdeMetrosAMillaPorHora(double valor) {
	   double ValorMillas = valor * 2.237;
	   ValorMillas = (double)Math.round(ValorMillas );
	   JOptionPane.showMessageDialog(null , valor + " Metros = " + ValorMillas + " Mi/h");
   }

  public void ConvertirMetrosAKilometrosPorHora(double valor) {
	
	double ValorKilometros = valor * 3.6;
	ValorKilometros = (double)Math.round(ValorKilometros);
	JOptionPane.showMessageDialog(null , valor + " Metros = " + ValorKilometros + " KM/h");
}

   public void ConvertirMetrosAPiesPorSegundo(double valor) {
	double ValorPies = valor * 3.281;
	ValorPies = (double)Math.round(ValorPies);
	JOptionPane.showMessageDialog(null,  valor + " Metros = " + ValorPies + " P/s" );
}

  public void ConvertirMetrosANudos(double valor) {
		double ValorNudos = valor * 1.944;
		ValorNudos = (double)Math.round(ValorNudos);
		JOptionPane.showMessageDialog(null,  valor + " Metros = " + ValorNudos + " Nudo" );
  }
  
  
  
}
