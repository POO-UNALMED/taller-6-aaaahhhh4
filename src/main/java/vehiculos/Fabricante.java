package vehiculos;

import java.util.HashMap;

public class Fabricante {
	private String nombre;
	private Pais pais;
	static HashMap<Fabricante,Integer> fabricantes = new HashMap<Fabricante,Integer>(); 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.put(this, 0);
	}
	public Fabricante() {
	}
	public static Fabricante fabricaMayorVentas() {
		int c=0;
		Fabricante f=new Fabricante();
		for (Fabricante i: fabricantes.keySet()) {
			int a=fabricantes.get(i);
			if(a>c) {
				c=a;
				f=i;
			}
		}
		return f;
	}
	
}
