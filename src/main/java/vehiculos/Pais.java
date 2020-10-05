package vehiculos;

import java.util.HashMap;

public class Pais {
	private String nombre;
	static HashMap<Pais,Integer> paises = new HashMap<Pais,Integer>(); 
	public String getNombre() {
		return nombre;
	}

	public Pais(String nombre) {
		this.nombre = nombre;
		paises.put(this, 0);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static Pais paisMasVendedor() {
		int c=0;
		Pais p;
		for (Pais i: paises.keySet()) {
			int a=paises.get(i);
			if(a>c) {
				c=a;
				p=i;
			}
		}
		return p;
	}
}
