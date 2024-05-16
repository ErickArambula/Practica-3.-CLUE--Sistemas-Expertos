import javax.swing.*;   //Necesario para diseñar ventanas
import java.awt.event.*; //Necesario para disparar eventos
import java.awt.*; //Necesario para manejar color, font e imagen

public class CLUE extends JFrame implements ActionListener{

  public JLabel etiquetaIMG, etiqueta1, etiqueta2, etiqueta3;
  public JButton boton, botonSalir, botonContinuar, botonContinuar2, botonEmpezar, botonPersonaje, botonLugar, botonArma, botonLbarril, botonLcasaDR, botonLcasaDF, botonLpatio, botonLcasaB71, botonAchip, botonApelota, botonAescoba, botonAcuchillo, botonAvalero, botonPchavo, botonPflorinda, botonPramon, botonPquico, botonPchilindrina, botonVolver;

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

	botonLugar = new JButton("Lugar");
	botonLugar.setBounds(340, 180, 100, 25);
	add(botonLugar);
	botonLugar.setVisible(false);

	botonArma = new JButton("Arma");
	botonArma.setBounds(450, 180, 100, 25);
	add(botonArma);
	botonArma.setVisible(false);

	botonPersonaje = new JButton("Personaje");
	botonPersonaje.setBounds(560, 180, 100, 25);
	add(botonPersonaje);
	botonPersonaje.setVisible(false);



//--------------------BOTONES DE PISTAS----------------------

	botonLbarril = new JButton("Barril del chavo");
	botonLbarril.setBounds(10, 180, 160, 25);
	add(botonLbarril);
	botonLbarril.setVisible(false);

	botonLcasaDR = new JButton("Casa de Don Ramon");
	botonLcasaDR.setBounds(180, 180, 160, 25);
	add(botonLcasaDR);
	botonLcasaDR.setVisible(false);

	botonLcasaDF = new JButton("Casa de Dona Florinda");
	botonLcasaDF.setBounds(350, 180, 160, 25);
	add(botonLcasaDF);
	botonLcasaDF.setVisible(false);

	botonLpatio = new JButton("Patio principal");
	botonLpatio.setBounds(520, 180, 160, 25);
	add(botonLpatio);
	botonLpatio.setVisible(false);

	botonLcasaB71 = new JButton("Casa de la Bruja 71");
	botonLcasaB71.setBounds(690, 180, 160, 25);
	add(botonLcasaB71);
	botonLcasaB71.setVisible(false);

//---------------------------------------------------------------
	botonAchip = new JButton("Chipote Chillon");
	botonAchip.setBounds(10, 180, 160, 25);
	add(botonAchip);
	botonAchip.setVisible(false);

	botonApelota = new JButton("Pelota cuadrada");
	botonApelota.setBounds(180, 180, 160, 25);
	add(botonApelota);
	botonApelota.setVisible(false);

	botonAescoba = new JButton("Escoba voladora");
	botonAescoba.setBounds(350, 180, 160, 25);
	add(botonAescoba);
	botonAescoba.setVisible(false);

	botonAcuchillo = new JButton("Cuchillo que no corta");
	botonAcuchillo.setBounds(520, 180, 160, 25);
	add(botonAcuchillo);
	botonAcuchillo.setVisible(false);

	botonAvalero = new JButton("Valero de madera");
	botonAvalero.setBounds(690, 180, 160, 25);
	add(botonAvalero);
	botonAvalero.setVisible(false);

//-------------------------------------------------------------------
	botonPchavo = new JButton("El cahvo del 8");
	botonPchavo.setBounds(10, 180, 160, 25);
	add(botonPchavo);
	botonPchavo.setVisible(false);

	botonPflorinda = new JButton("Dona Florinda");
	botonPflorinda.setBounds(180, 180, 160, 25);
	add(botonPflorinda);
	botonPflorinda.setVisible(false);

	botonPramon = new JButton("Don Ramon");
	botonPramon.setBounds(350, 180, 160, 25);
	add(botonPramon);
	botonPramon.setVisible(false);

	botonPquico = new JButton("Quico");
	botonPquico.setBounds(520, 180, 160, 25);
	add(botonPquico);
	botonPquico.setVisible(false);

	botonPchilindrina = new JButton("La chilindrina");
	botonPchilindrina.setBounds(690, 180, 160, 25);
	add(botonPchilindrina);
	botonPchilindrina.setVisible(false);


//-----------------------------------------------------------


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

	if(accion.getSource() == botonEmpezar){
	  botonEmpezar.setVisible(false);
	  botonLugar.setVisible(true);
	  botonArma.setVisible(true);
	  botonPersonaje.setVisible(true);
	  etiqueta3.setText("Que quieres investigar ??");
	}

	if(accion.getSource() == botonLugar){
	  botonLugar.setVisible(false);
	  botonArma.setVisible(false);
	  botonPersonaje.setVisible(false);

	  botonLbarril.setVisible(true);
	  botonLcasaDR.setVisible(true);
	  botonLcasaDF.setVisible(true);
	  botonLpatio.setVisible(true);
	  botonLcasaB71.setVisible(true);
	  etiqueta3.setText("Que lugar quieres investigar ??");
	}

	if(accion.getSource() == botonArma){
	  botonLugar.setVisible(false);
	  botonArma.setVisible(false);
	  botonPersonaje.setVisible(false);

	  botonAchip.setVisible(true);
	  botonApelota.setVisible(true);
	  botonAescoba.setVisible(true);
	  botonAcuchillo.setVisible(true);
	  botonAvalero.setVisible(true);
	  etiqueta3.setText("Que arma quieres investigar ??");
	}

	if(accion.getSource() == botonPersonaje){
	  botonLugar.setVisible(false);
	  botonArma.setVisible(false);
	  botonPersonaje.setVisible(false);

	  botonPchavo.setVisible(true);
	  botonPflorinda.setVisible(true);
	  botonPramon.setVisible(true);
	  botonPquico.setVisible(true);
	  botonPchilindrina.setVisible(true);
	  etiqueta3.setText("Que arma quieres investigar ??");
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

