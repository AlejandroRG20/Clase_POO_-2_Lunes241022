package Lunes241022;

public class Computadora {
     //Campos/Atrivutos
	
	String marca;
	private int vidaUtil, cantRam, espacioDisco;
	private double precio, frecuenciaTrabajo;

	//Metodos/Comportamientos
	   //Setters - Modificar el valor de una Variable
	
	public void ponerMarca(String marca) {
		this.marca = marca;
	}
	public void ponerVidaUtil(int vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	public void ponerPrecio(double precio) {
		this.precio = precio;
	}
	public void ponerCantidadRam(int CantRam) {
		this.cantRam = CantRam;
	}
	public void ponerEspacioDisco(int espacioDisco) {
		this.espacioDisco = espacioDisco;
	}
	public void ponerFrecuenciaTrabajo(double FTrabajo) {
		this.frecuenciaTrabajo = FTrabajo;
	}
	//Getters - Mostrar el valor
	
	public String mostrarMarca() {
		return this.marca;
	}
	
}
