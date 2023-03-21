package Principal;

import javax.swing.*;

import conversorMonedas.OpcionesConversion;
import conversorVelocidad.OpcionesConversorVelocidad;


public class Principal {

	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
	    OpcionesConversorVelocidad conversionV = new OpcionesConversorVelocidad();
	    
		  boolean flag = true;
		  
		  
		while(flag) {
			
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Kilometraje"}, "Elegir").toString();
			
			
			switch(opciones) {
			
			case "Conversor de Monedas":
				
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);
				
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Entra");
					
				} 
			
			case "Conversor de Kilometraje":
				
				String input1 = JOptionPane.showInputDialog(null , "Ingrese el valor");
				double valorRecibidoV = Double.parseDouble(input1);
				conversionV.ConvertirVelocidad(valorRecibidoV);
				
				int respuestaV = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				
				if( JOptionPane.OK_OPTION == respuestaV) {
					
					System.out.println("Entra");
					
				} else {
					flag= false;
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				
				
				
		}
		
	}
				
		
	
	}
	
}
	

