package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static int cantidadCamionetas;

	public boolean isVolco() {
		return volco;
	}

	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}

	public static void setCantidadCamionetas(int cantidadCamionetas) {
		Camioneta.cantidadCamionetas = cantidadCamionetas;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public Camioneta(String placa, int puertas, String nombre, int precio, int peso,
			Fabricante frabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", frabricante);
		this.volco = volco;
		cantidadCamionetas++;
	}
	
	
}
