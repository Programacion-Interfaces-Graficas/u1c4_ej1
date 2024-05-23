package vista;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
//Importar el controlador
import controlador.logica_ventana;
public class ventana {
	//Declarar Variable globales
	private JFrame ventana;
	//Convertir en publico los recursos que van a pasar por el delegado
	public JButton button; 
	public ventana() {
		//Crear un nuevo contenedor JFrame
				ventana=new JFrame("Ejemplo 1");
				//Asignar el tamaño inicial de la ventana
				ventana.setSize(250,100);
				//Terminar el programa cuando el usuario cierre la ventana
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//Crear un boton usando el componente JButton
		        button = new JButton("Haz clic aquí"); 
				//Añadir la etiqueta al panel de contenido
				ventana.add(button);
				//Mostrar la ventana
				ventana.setVisible(true);	
				//Cargar el delegado en el controlador
				logica_ventana lv=new logica_ventana(this);
			}
			public static void main(String[] args) {
				//Crea la ventana en el subproceso de entrega de eventos
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						new ventana();
					}		
				});

			}
}
