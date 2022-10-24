package Lunes241022;

public class App {

	public static void main(String[] args) {
		// Objetos
		
		Computadora pc1=new Computadora();
	    pc1.ponerCantidadRam(8);
	    pc1.ponerEspacioDisco(1024);
	    pc1.ponerFrecuenciaTrabajo(3.5);
	    pc1.ponerMarca("Dell"); 
	    pc1.ponerPrecio(500.00); 
	    pc1.ponerVidaUtil(5);
	    pc1.ponerMarca("Dell");
	    
	    Computadora pc2=new Computadora();
	    pc2.ponerCantidadRam(12); 
	    pc2.ponerEspacioDisco(2048); 
	    pc2.ponerFrecuenciaTrabajo(3.9);
	    pc2.ponerMarca("HP");
	    pc2.ponerPrecio(980.00); 
	    pc2.ponerVidaUtil(4); 
	    
	    Computadora pc3=new Computadora();
	    
	    pc3.ponerCantidadRam(512);
	    
	    
	    System.out.println("Marca de la pc1 = "+ pc1.mostrarMarca());
	    System.out.println("Marca de la pc1 = "+ pc2.mostrarMarca());
	    System.out.println("Marca de la pc1 = "+ pc3.mostrarMarca());
	    
	}

}
