package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	private static int cantidadCamiones;

	public static int getCantidadCamiones() {
		return cantidadCamiones;
	}

	public static void setCantidadCamiones(int cantidadCamiones) {
		Camion.cantidadCamiones = cantidadCamiones;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public Camion(String placa, String nombre, int precio, int peso,
			Fabricante frabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", frabricante);
		this.ejes=ejes;
		cantidadCamiones++;
	}
	
}
