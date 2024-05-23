package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

//Importar los recursos del modelo y de la vista
import vista.ventana;
import modelo.persona;

public class logica_ventana implements ActionListener{
	//Crear el delegado de la vista
	private ventana delegado;
	private persona persona;

	public logica_ventana(ventana delegado) {
		//Asignar los recursos de la vista al delegado
		this.delegado = delegado;
		//Inicializar persona de modelo
		this.persona = new persona();
		// Registrar el oyente con la fuente del evento 
		this.delegado.button.addActionListener(this);
	}

	// Implementar el método actionPerformed usando una clase anónima
	public void actionPerformed(ActionEvent e) {
		//Identificar el evento ejecutado por cada boton
		if(e.getSource()==delegado.button) {
			// Mostrar  un cuadro de diálogo con un mensaje
            JOptionPane.showMessageDialog(null, persona.obtenerDatos()); 
		}
		
	}
	
	

}
