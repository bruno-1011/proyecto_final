package Electrodomesticos;

import javax.swing.JOptionPane;

public class principal {
	
	public static void main(String []args) {            
		Lavadora lav= new Lavadora("PANDA","BLANCO" , "CARGA FRONTAL","Acros ALF2253EG", 4307.88, 17 , "MAITAG","1.400 rpm", "307KTWAA881");
		
		System.out.println("\n DATOS DE LA LAVADORA:");
		System.out.println("MARCA: "+ lav.getMarca());
		System.out.println("COLOR: "+ lav.getColor());
		System.out.println("TAMAÑO: "+ lav.getTamaño());
		System.out.println("MODELO: "+ lav.getModelo());
		System.out.println("PRECIO: "+ lav.getPrecio());
		System.out.println("CAPACIDAD: "+ lav.getCapacidad());
		System.out.println("DISTRIBUIDOR: "+ lav.getDistribuidor());
		System.out.println("VELOCIDAD: "+ lav.getVelocidad());
		System.out.println("NUMERO DE SERIE: "+ lav.getNumero_serie());
       
        
    JOptionPane.showMessageDialog(null,"\n DATOS DE LA PLANCHA: "+"\n MARCA: "+lav.getMarca()+"\n COLOR: "+ lav.getColor()+ "\n TAMAÑO:"+lav.getTamaño()+"\n Modelo:"+lav.getModelo()+ "\n Precio:"+lav.getPrecio()+"\n CAPACIDAD:"+lav.getCapacidad()+"\n DISTRIBUIDOR:"+lav.getDistribuidor()+"\n velocidad:"+lav.getVelocidad());
   
    plancha plan =new plancha("RECORD", "Rojo"," 37.0 x 47.0 cm"," HJ-3000.",900,1.800,"PLANCHA DE VAPOR",120);
    plan.mostrarDatos();
   
    
    estufa estuf =new estufa("Mabe", "Gris", "76.6 x 71.7 x 108.5 cm", "CEM7641BSIS0/1", 14000, 50, 10, "parrilla electrica", "gabinete de acero");
    estuf.mostrarDatos();  
    
    Microondas micro =new Microondas("WHIRLPOOL", "GRIS", "CHICO","FJ5886", 1749.56,17, "8", "45 cm de ancho x 34 cm de alto y 26 cm de fondo.", 700);
    micro.mostrarDatos();
	
    refrigerador refri =new refrigerador("MABE ","NEGRO","1.20 M","DUDN2022",8000,4,2);
   
	refri.mostrarDatos();
	}

}
