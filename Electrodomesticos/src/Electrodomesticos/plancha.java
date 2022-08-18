package Electrodomesticos;

public class plancha extends Electrodomesticos {
	
	private String tipo;
	private int nivelesTemperatura;
	
	public plancha(String marca, String color, String tamaño, String modelo, double precio, double capacidad,
			String tipo, int nivelesTemperatura) {
		super(marca, color, tamaño, modelo, precio, capacidad);
		this.tipo = tipo;
		this.nivelesTemperatura = nivelesTemperatura;
	}
	 public void mostrarDatos () {
		 System.out.println("\n PLANCHA:"+ "\n MARCA: "+ getMarca()+"\n COLOR:"+getColor()+"\n TAMAÑO: "+getTamaño()+
		 "\n MODELO:" +getModelo()+"\n PRECIO: $ "+getPrecio()+"\n CAPACIDAD:"+ getCapacidad()+"\n TIPO:"+tipo+"\n NIVELES TEMPERATURA: "+nivelesTemperatura+" c°");
	 }
	 
}
