package gastoscasa;

import java.util.ArrayList;
import java.util.Scanner;

public class Claseprueba extends Gasto{
	static Scanner ingreso = new Scanner(System.in);
    static ArrayList<Gasto> listaGastos = new ArrayList<Gasto>();
    static Gasto aux;
	
    // Variables 
    static int dia = 0;
    static int monto=0;
    static String descripcion = "";
	
	/////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IngresarNuevoGasto();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////
	public static void Menu() {
		System.out.println("opciones: "+"\n"+
				"1 -mostrar todos" +"\n"+
				"2 -mayor" +"\n"+
				"3 -ordenar"+"\n"+
				"4 -buscar datos de un monto" +"\n"+
				"5 -indicar si esta monto"+"\n"+
				"6 -fin");
		
		int ingreso_menu = ingreso.nextInt();
		switch(ingreso_menu) {
		case 1:
			mostrarCGastos();
			break;
			
		case 2:
			Ordenar();
			break;
			
		case 3:
			Ordenar();
			break;
			
		case 4:
			break;
			
		case 5:
			break;
			
		case 6:
			break;
			
		}

	}
	
	/////////////////////////////////////////////////////////////////////////////////////////
    public static void IngresarNuevoGasto(){
    	System.out.println("INGRESAR GASTOS");
    	int llave = 0;
    	do {
            System.out.println("Numero de Gastos a ingresar");
            llave = ingreso.nextInt();
            ingreso.nextLine(); //limpiar el intro
    	}
    	
    	while(llave < 0);
    	
    	 for(int i =1; i <= llave; i++){
             
             System.out.println("Ingresar Dia");
             dia = ingreso.nextInt();
             System.out.println("\n Ingresar Monto");
             monto = ingreso.nextInt();
             System.out.println("\n Ingresar Descripcion");
             descripcion = ingreso.nextLine();

             aux = new Gasto();
             aux.setDia(dia);
             aux.setMonto(monto);
             aux.setDescripcion(descripcion);
             
             listaGastos.add(aux);
             
             Menu();
             ingreso.nextLine(); //limpiar el intro

         }
    }
	
	/////////////////////////////////////////////////////////////////////////////////////////
    
    public static void mostrarCGastos(){  
        for(int i = 0; i < listaGastos.size(); i++){
            System.out.println("dia: " + listaGastos.get(i).getDia());
            System.out.println("Monto : " + listaGastos.get(i).getMonto());
            System.out.println("Descripcion: " + listaGastos.get(i).getDescripcion());
        }
    } 
    
    public static void Ordenar() {
    	
        for (int i = 0; i < listaGastos.size(); i++) {
            System.out.println((i+1) + ". " + listaGastos.get(i).getMonto() + 
            		" Monto: " + listaGastos.get(i).getDia() + " - Dia: " +
            		listaGastos.get(i).getDescripcion());
        }
    	
    }
    
    @Override
    public int compareTo(Gasto o) {
        if (monto < o.getMonto()) {
            return -1;
        }
        if (monto > o.getMonto()) {
            return 1;
        }
        return 0;
    }
	


}










//COCHINADAS
//// MENUString 
//String lista[] = 
//{"ingreso", "mostrar todos", "mayor", "ordenar", "buscar datos de un monto", "indicar si esta monto", 
//"fin"};
//
//for (int i = 0; i <= 6; i++) {
//	System.out.println((i + 1) + "===" + lista[i]);
//}
//