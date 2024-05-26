import javax.swing.*;   //Necesario para diseñar ventanas
import java.awt.event.*; //Necesario para disparar eventos
import java.awt.*; //Necesario para manejar color, font e imagen

public class CLUE extends JFrame implements ItemListener, ActionListener{

  public JLabel etiquetaIMG, etiqueta1, etiqueta2, etiqueta3, etiquetaIncriminar;
  public JButton boton, botonSalir, botonContinuar, botonContinuar2, botonEmpezar, botonPersonaje, botonLugar, botonArma, botonLbarril, botonLcasaDR, botonLcasaDF, botonLpatio, botonLcasaB71, botonAchip, botonApelota, botonAescoba, botonAcuchillo, botonAvalero, botonPchavo, botonPflorinda, botonPramon, botonPquico, botonPchilindrina, botonVolver,botonIncriminar;
  public JComboBox <String> comboLugar, comboPersonaje, comboArma;
  int asesino = 0;
  int inocente = 0;
  int kk;

//*************************VARIABLES DE TEXTO********************************

  public String chavo, donaFlorinda, donRamon, quico, chilindrina, Barril, casaDR, casaDF, patio, casaB71, chipoteCH, pelotaC, escoba, cuchillo, valero;

//---------------------------------------------------------------------------

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

	etiquetaIncriminar = new JLabel("Selecciona al culpable...");
	etiquetaIncriminar.setBounds(10, 350, 900, 30); // x, y, ancho, alto
	etiquetaIncriminar.setFont(fuente3);
	etiquetaIncriminar.setForeground(Color.WHITE);
	add(etiquetaIncriminar);
	etiquetaIncriminar.setVisible(false);


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

	botonVolver = new JButton("Volver");
	botonVolver.setBounds(380, 130, 100, 25);
	add(botonVolver);
	botonVolver.setVisible(false);

	botonIncriminar = new JButton("Incriminar !!");
	botonIncriminar.setBounds(40,510,115,25);
	add(botonIncriminar);
	botonIncriminar.setVisible(false);


	comboLugar = new JComboBox<String>();
	comboLugar.setBounds(20,400,140,25);
	add(comboLugar);
	comboLugar.setVisible(false);

	comboLugar.setEditable(true);
	comboLugar.setSelectedItem("Lugar:");
	comboLugar.setEditable(false);
	comboLugar.addItem("Barril del cahvo");
	comboLugar.addItem("Casa de Don Ramon");
	comboLugar.addItem("Casa de Dona Florinda");
	comboLugar.addItem("Patio principal");
	comboLugar.addItem("Casa de la bruja del 71");


	comboArma = new JComboBox<String>();
	comboArma.setBounds(20,435,140,25);
	add(comboArma);
	comboArma.setVisible(false);

	comboArma.setEditable(true);
	comboArma.setSelectedItem("Arma:");
	comboArma.setEditable(false);
	comboArma.addItem("Chipote chillon");
	comboArma.addItem("Pelota cuadrada");
	comboArma.addItem("Escoba voladora");
	comboArma.addItem("Cuchillo que no corta");
	comboArma.addItem("Valero de Quico");


	comboPersonaje = new JComboBox<String>();
	comboPersonaje.setBounds(20,470,140,25);
	add(comboPersonaje);
	comboPersonaje.setVisible(false);

	comboPersonaje.setEditable(true);
	comboPersonaje.setSelectedItem("Personaje:");
	comboPersonaje.setEditable(false);
	comboPersonaje.addItem("Chavo del 8");
	comboPersonaje.addItem("Dona Florinda");
	comboPersonaje.addItem("Don Ramon");
	comboPersonaje.addItem("Quico");
	comboPersonaje.addItem("La Chilindrina");



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
	botonVolver.addActionListener(this);
	botonIncriminar.addActionListener(this);


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

	comboLugar.addItemListener(this);
	comboArma.addItemListener(this);
	comboPersonaje.addItemListener(this);


  }//Fin del constructor 
//---------------------------------------------------------------------------

//**************************METODO ITEM STATE CHANGED*************************

  public void itemStateChanged(ItemEvent accion){

	//asesino = comboLugar.getSelectedItem() = 1;
  	/*
	v2="\n"+"---"+combo2.getSelectedItem().toString();
  	v3="\n"+"---"+combo3.getSelectedItem().toString();
  	v4="\n"+"CAMISAS"+"\n"+"---"+combo4.getSelectedItem().toString();
  	v5="\n"+"---"+combo5.getSelectedItem().toString();1
 	v6="\n"+"---"+combo6.getSelectedItem().toString();
 	v7="\n"+"CALCETAS"+"\n"+"---"+combo7.getSelectedItem().toString();
  	v8="\n"+"ROPA INFANTIL"+"\n"+"---"+combo8.getSelectedItem().toString();
  	v9="\n"+"---"+combo9.getSelectedItem().toString();
	*/
  	//etiqueta.setText

  }//FIn de itemStateChanged

//----------------------------------------------------------------------------

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
	  botonIncriminar.setVisible(true);
	  comboLugar.setVisible(true);
	  comboArma.setVisible(true);
	  comboPersonaje.setVisible(true);
	  etiquetaIncriminar.setVisible(true);
	  etiqueta3.setText("Que quieres investigar ??");
	}

	if(accion.getSource() == botonLugar){
	  botonVolver.setVisible(true);
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
	  botonVolver.setVisible(true);
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
	  botonVolver.setVisible(true);
	  botonLugar.setVisible(false);
	  botonArma.setVisible(false);
	  botonPersonaje.setVisible(false);

	  botonPchavo.setVisible(true);
	  botonPflorinda.setVisible(true);
	  botonPramon.setVisible(true);
	  botonPquico.setVisible(true);
	  botonPchilindrina.setVisible(true);
	  etiqueta3.setText("Que personaje quieres investigar ??");
	}

	if(accion.getSource() == botonVolver){
	  botonVolver.setVisible(false);
	  botonLugar.setVisible(true);
	  botonArma.setVisible(true);
	  botonPersonaje.setVisible(true);


	  botonLbarril.setVisible(false);
	  botonLcasaDR.setVisible(false);
	  botonLcasaDF.setVisible(false);
	  botonLpatio.setVisible(false);
	  botonLcasaB71.setVisible(false);

	  botonAchip.setVisible(false);
	  botonApelota.setVisible(false);
	  botonAescoba.setVisible(false);
	  botonAcuchillo.setVisible(false);
	  botonAvalero.setVisible(false);

	  botonPchavo.setVisible(false);
	  botonPflorinda.setVisible(false);
	  botonPramon.setVisible(false);
	  botonPquico.setVisible(false);
	  botonPchilindrina.setVisible(false);
	  etiqueta3.setText("Que quieres investigar ??");
	}

	if(accion.getSource() == botonLcasaB71){
	  asesino = 1;
	  System.out.println(asesino);
	  System.out.println(inocente);
	}



	
  }//Fin del metodo actionPerformed
//----------------------------------------------------------------------------

//****************************************MAIN********************************
  public static void main(String args[]){
	CLUE ventana = new CLUE();
	ventana.setBounds(150, 150, 1000, 650);
 	ventana.setVisible(true);	
 	ventana.setResizable(false);

  }//Fin del metodo main 
//-------------------------------------------------------------------------------

}//Fin de la clase CLUE 

