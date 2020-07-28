package gastoscasa;

import java.util.Iterator;

public class Gasto extends Casa{
	// variablesde instancia 
	private int monto; 
	private int dia;
	private String descripcion;
	
	// Constructores 
	public Gasto() {
		this.setDia(1); 
		this.setDescripcion("Sin datos"); 
		this.setMonto(0);
	}
	
	public Gasto(int unDia, String unaD, int unM) 
	{ 
		this.setDia(unDia); 
		this.setDescripcion(unaD); 
		this.setMonto(unM);
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////

	// acceso y modificacion
	public void setDescripcion(String unaDescripcion) 
	{ 
		descripcion = unaDescripcion;
		
	}
	public String getDescripcion() { 
		return descripcion;
	}
		
	/////////////////////////////////////////////////////////////////////////////////////////

	
	public int getDia()
	{
		return dia;
	}
	public void setDia(int unDia)
	{ 
		dia = unDia;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////
	public int getMonto() 
	{
		return monto;
	}
	
	public void setMonto(int unMonto) 
	{ 
		monto = unMonto;
	}

	public int compareTo(Gasto o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////
    


}
