package numberAddition;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Clase Ventana
 * Muestra la estructuta que deberia tener una Ventana en Java con la libreria
 * Swing, contiene una etiqueta, un caja de texto y un boton, que tiene la
 * accion de mostrar el texto en la caja por una ventana de mensaje.
 */
public class NumberAddition extends JFrame implements ActionListener {

    private JLabel texto;           // etiqueta o texto no editable
    private JLabel texto2;
    private JLabel texto3;
    
    private JTextField caja;        // caja de texto, para insertar datos
    private JTextField caja2;
    private JTextField caja3;
    
    private JButton boton;          // boton con una determinada accion
    private JButton boton2;

    public NumberAddition() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("CALCULADORA");                   // colocamos titulo a la ventana
        this.setSize(300, 250);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    private void inicializarComponentes() {
       
        texto = new JLabel();
        texto2 = new JLabel();
        texto3 = new JLabel();
        
        caja = new JTextField();
        caja2 = new JTextField();
        caja3 = new JTextField();
        
        boton = new JButton();
        boton2 = new JButton();
       
        texto.setText("Inserte Numero 1");    // colocamos un texto a la etiqueta
        texto.setBounds(50, 20, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
       
        texto2.setText("Inserte Numero 2");    // colocamos un texto a la etiqueta
        texto2.setBounds(50, 60, 100, 25);
        
        texto3.setText("Resultado");    // colocamos un texto a la etiqueta
        texto3.setBounds(50, 160, 100, 25);
        
        caja.setBounds(160, 20, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        caja2.setBounds(160, 60, 100, 25);
        caja3.setBounds(160, 160, 100, 25);
        
        boton.setText("Sumar");   // colocamos un texto al boton
        boton.setBounds(50, 100, 90, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
       
        boton2.setText("Salir");
        boton2.setBounds(170, 100, 90, 30);
        boton2.addActionListener(this);
        
        this.add(texto);
        this.add(texto2);
        this.add(texto3);
        
        this.add(caja);
        this.add(caja2);
        this.add(caja3);
        
        this.add(boton);
        this.add(boton2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    	int numero=0, numero2=0, resultado;
    	if(e.getSource() == boton){
    		try{
    		numero = Integer.parseInt(caja.getText()); 
        	numero2 = Integer.parseInt(caja2.getText());
        	
    		}catch(NumberFormatException ex){
    			
    		}finally{
    			resultado = numero+numero2;
    		}
        	caja3.setText(String.valueOf(resultado));
    	}
    	
    	if(e.getSource() == boton2){
    		System.exit(0);
    	}
    	
    }

    public static void main(String[] args) {
        NumberAddition V = new NumberAddition();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada
    }
}