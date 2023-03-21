package conversorVelocidad;

import javax.swing.JOptionPane;

public class OpcionesConversorVelocidad {
	
       ConversorVelocidad velocidad = new ConversorVelocidad();
       
       public void ConvertirVelocidad(double valor) {
    	   
       String opcion = (JOptionPane.showInputDialog(null,
   			"Elije unidades ",  "Velocidades",
   			JOptionPane.PLAIN_MESSAGE, null, new Object[]
   					{"De M/s a  Mi/h", "De M/s a Km/h", "De M/s a Pies/s","De M/s a Nudos",}, 
   					"Opcion")).toString();
       
       switch (opcion) {
       case "De M/s a  Mi/h": 
    	   
   		velocidad.ConvertirdeMetrosAMillaPorHora(valor);
   		break;
   		
       case "De M/s a Km/s":
    	   velocidad.ConvertirMetrosAKilometrosPorHora(valor);
    	   break;
       case "De M/s a Pies/s":
    	   velocidad.ConvertirMetrosAPiesPorSegundo(valor);
    	   break;
       case "De M/s a Nudos":
    	   velocidad.ConvertirMetrosANudos(valor);
    	   break;
     
       }
}
}
