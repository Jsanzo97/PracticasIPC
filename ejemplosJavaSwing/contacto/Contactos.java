package contacto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import numberAddition.NumberAddition;

public class Contactos extends JFrame implements ActionListener{
	
		private JLabel texto;           // etiqueta o texto no editable
		private JLabel texto2;
		private JLabel texto3;
		private JLabel texto4;           // etiqueta o texto no editable
		private JLabel texto5;
		private JLabel texto6;
		private JLabel texto7;
		private JLabel texto8;
		private JLabel texto9;
    
    
		private JTextField caja;        // caja de texto, para insertar datos
		private JTextField caja2;
		private JTextField caja3;
		private JTextField caja4;        // caja de texto, para insertar datos
		private JTextField caja5;
		private JTextField caja6;
		
    
		private JButton boton;          // boton con una determinada accion
		private JButton boton2;
		private JButton boton3;          // boton con una determinada accion
		private JButton boton4;
		private JButton boton5;          // boton con una determinada accion
		private JButton boton6;
	
    public Contactos() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }
   
    public static void main(String[] args) {
        Contactos c = new Contactos();      // creamos una ventana
        c.setVisible(true);             // hacemos visible la ventana creada
    }
	
    public void configurarVentana(){
		this.setTitle("CONTACTOS");                   // colocamos titulo a la ventana
        this.setSize(600, 450);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void inicializarComponentes(){
		
		texto = new JLabel();
		texto2 = new JLabel();
	    texto3 = new JLabel();
	    texto4 = new JLabel();
		texto5 = new JLabel();
	    texto6 = new JLabel();
	    texto7 = new JLabel();
	    texto8 = new JLabel();
	    texto9 = new JLabel();
	        
	    caja = new JTextField();
	    caja2 = new JTextField();
	    caja3 = new JTextField();
	    caja4 = new JTextField();
	    caja5 = new JTextField();
	    caja6 = new JTextField("");
	        
	    boton = new JButton();
	    boton2 = new JButton();
	    boton3 = new JButton();
	    boton4 = new JButton();
	    boton5 = new JButton();
	    boton6 = new JButton();
	       
	    texto.setText("Primer Nombre");    // colocamos un texto a la etiqueta
	    texto.setBounds(60, 40, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
	       
	    texto2.setText("Titulo");    // colocamos un texto a la etiqueta
	    texto2.setBounds(60, 80, 100, 25);
	        
	    texto3.setText("Segundo Nombre");    // colocamos un texto a la etiqueta
	    texto3.setBounds(330, 40, 100, 25);
	    
	    texto4.setText("Nickname");
	    texto4.setBounds(330, 80, 100, 25);
	    
	    texto5.setText("Nombre");
	    texto5.setBounds(10, 10, 100, 25);
	    
	    texto6.setText("Display");
	    texto6.setBounds(60, 120, 100, 25);
	    
	    texto7.setText("Email");
	    texto7.setBounds(10, 180, 100, 25);
	    
	    texto8.setText("Direccion Email");
	    texto8.setBounds(60, 220, 100, 25);
	        
	    caja.setBounds(170, 40, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
	    caja2.setBounds(170, 80, 100, 25);
	    caja3.setBounds(440, 40, 100, 25);
	    caja4.setBounds(440, 80, 100, 25);
	    caja5.setBounds(170, 220, 300, 25);
	    caja6.setBounds(60, 260, 410, 100);
	        
	    boton.setText("Añadir");   // colocamos un texto al boton
	    boton.setBounds(490, 216, 90, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
	    boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
	       
	   // boton2.setText("Salir");
	   // boton2.setBounds(190, 120, 90, 30);
	   // boton2.addActionListener(this);
	    
		this.add(texto);
        this.add(texto2);
        this.add(texto3);
        this.add(texto4);
        this.add(texto5);
        this.add(texto6);
        this.add(texto7);
        this.add(texto8);
        this.add(texto9);
        
        this.add(caja);
        this.add(caja2);
        this.add(caja3);
        this.add(caja4);
        this.add(caja5);
        this.add(caja6);
        
        this.add(boton);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        this.add(boton5);
        this.add(boton6);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
