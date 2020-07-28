package gastoscasa;

import java.util.ArrayList;

public class Casa {
	// variables de instancia
	private ArrayList<Gasto> conjuntoGastos; 
	private String direccion;
	
	// Constructor 
	public Casa() {
		conjuntoGastos = new ArrayList<Gasto>(); 
		this.setDireccion("Sin direccion");
	}
	
	/* acceso y modificacion */
	public void setDireccion(String unaDireccion) { 
		direccion = unaDireccion;
	}
	
	public String getDireccion() { 
		return direccion;
	}
	
	public void agregarUnGasto(Gasto unGasto) { 
		this.conjuntoGastos.add(unGasto);
	}
	
	public ArrayList<Gasto> devolverTodosGastos() {
		return conjuntoGastos;
	}
	
	// devuelve cantidad de elementos 
	public int cantidadGastos() {
		return this.devolverTodosGastos().size();
	}
	

}
