import javax.swing.*;   //Necesario para diseñar ventanas
import java.awt.event.*; //Necesario para disparar eventos
import java.awt.*; //Necesario para manejar color, font e imagen

public class CLUE extends JFrame implements ActionListener{

  public JLabel etiquetaIMG, etiqueta1, etiqueta2, etiqueta3;
  public JButton boton, botonSalir, botonContinuar, botonContinuar2, botonEmpezar, botonPersonaje, botonLugar, botonArma, botonLbarril, botonLcasaDR, botonLcasaDF, botonLpatio, botonLcasaB71, botonAchip, botonApelota, botonAescoba, botonAcuchillo, botonAvalero, botonPchavo, botonPflorinda, botonPramon, botonPquico, botonPchilindrina;

//********************************CONSTRUCTOR*******************************
  public CLUE (){
	setLayout(null);
	setTitle("CLUE del CHAVO");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	getContentPane().setBackground(Color.BLACK);
	setIconImage(new ImageIcon(getClass().getResource("Icono del programa.png")).getImage());

	ImageIcon imagen = new ImageIcon("Personajes.jpg");
	etiquetaIMG = new JLabel(imagen);
	etiquetaIMG.setBounds(200, 220, 600, 350);
	add(etiquetaIMG);
	
	

	Font fuente = new Font("Broadway", Font.BOLD, 35);
	etiqueta1 = new JLabel("CLUE del CHAVO !!");
	etiqueta1.setBounds(20, 20, 600, 30); // x, y, ancho, alto
	etiqueta1.setFont(fuente);
	etiqueta1.setForeground(Color.WHITE);
	add(etiqueta1);

	Font fuente2 = new Font("Broadway", Font.BOLD, 18);
	etiqueta2 = new JLabel("En esta vecindad hubo un despiadado asesinato!! Tu trabajo es encontrar al culpable.");
	etiqueta2.setBounds(35, 75, 1000, 30); // x, y, ancho, alto
	etiqueta2.setFont(fuente2);
	etiqueta2.setForeground(Color.WHITE);
	add(etiqueta2);

	Font fuente3 = new Font("Broadway", Font.BOLD, 16);
	etiqueta3 = new JLabel("Presiona jugar cuando estes listo. ");
	etiqueta3.setBounds(60, 110, 900, 30); // x, y, ancho, alto
	etiqueta3.setFont(fuente3);
	etiqueta3.setForeground(Color.WHITE);
	add(etiqueta3);



	boton = new JButton("JUGAR");
	boton.setBounds(20, 160, 90, 25);
	add(boton);
	
	botonSalir = new JButton("SALIR");
	botonSalir.setBounds(850, 560, 90, 25);
	add(botonSalir);

	botonContinuar = new JButton("Continuar...");
	botonContinuar.setBounds(425, 180, 100, 25);
	add(botonContinuar);
	botonContinuar.setVisible(false);

	botonContinuar2 = new JButton("Continuar...");
	botonContinuar2.setBounds(425, 180, 100, 25);
	add(botonContinuar2);
	botonContinuar2.setVisible(false);

	botonEmpezar = new JButton("Empecemos...");
	botonEmpezar.setBounds(425, 180, 115, 25);
	add(botonEmpezar);
	botonEmpezar.setVisible(false);



	boton.addActionListener(this);
	botonSalir.addActionListener(this);
	botonContinuar.addActionListener(this);
	botonContinuar2.addActionListener(this);
	botonEmpezar.addActionListener(this);

	botonPersonaje.addActionListener(this);
	botonLugar.addActionListener(this);
	botonArma.addActionListener(this); 

	botonLbarril.addActionListener(this);
 	botonLcasaDR.addActionListener(this); 
	botonLcasaDF.addActionListener(this); 
	botonLpatio.addActionListener(this); 
	botonLcasaB71.addActionListener(this); 
	botonAchip.addActionListener(this); 
	botonApelota.addActionListener(this); 
	botonAescoba.addActionListener(this); 
	botonAcuchillo.addActionListener(this); 
	botonAvalero.addActionListener(this); 
	botonPchavo.addActionListener(this); 
	botonPflorinda.addActionListener(this); 
	botonPramon.addActionListener(this); 
	botonPquico.addActionListener(this); 
	botonPchilindrina.addActionListener(this);




  }//Fin del constructor 
//---------------------------------------------------------------------------

//**************************METODO ACTION PERFORMED***************************

  public void actionPerformed(ActionEvent accion){

	if(accion.getSource() == botonSalir){
	  System.exit(0);
	}
	
	if(accion.getSource() == boton){
	  boton.setVisible(false);
	  botonContinuar.setVisible(true);
	  etiqueta2.setText("Han matado al senor barriga!!!");
	  etiqueta3.setText("Hay 5 personajes sospechosos: el chavo, dona Florinda, Don Ramon, Quico y la chilindrina... ");
	}

	if(accion.getSource() == botonContinuar){
	  botonContinuar.setVisible(false);
	  botonContinuar2.setVisible(true);
	  etiqueta3.setText("Tambien hay 5 posibles lugares y 5 posibles armas que forman parte del crimen.");
	}

	if(accion.getSource() == botonContinuar2){
	  botonContinuar2.setVisible(false);
	  botonEmpezar.setVisible(true);
	  etiqueta3.setText("Tendras solo 5 oportunidades de obtener informacion antes de elegir al culpable, usalas bien!.");
	}

	
  }//Fin del metodo actionPerformed
//----------------------------------------------------------------------------

//****************************************MAIN********************************
  public static void main(String args[]){
	CLUE ventana = new CLUE();
	ventana.setBounds(150, 150, 1000, 650);
 	ventana.setVisible(true);	

  }//Fin del metodo main 
//-------------------------------------------------------------------------------

}//Fin de la clase CLUE 

