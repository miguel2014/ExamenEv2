package segundaevaluacion;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * No consigo lo de los dos modelos iguales
 * Tampoco lo del StringBuilder
 */

public class Ejercicio2 {
	
	public static void main(String[] args) {
		List<Telefono> lista=new ArrayList<Telefono>();
		Scanner in=new Scanner(System.in);
		String nombre="";
		int precio=0;
		boolean tieneGPS=false;
		System.out.println("Introduce nombre,telefono y gps .quit para salir:");
		while (true) {
			System.out.println("Introduce nombre:");
			nombre=in.next();
			
			if (nombre.equals("quit")) {
				break;
			}
			else{
				System.out.println("Introduce precio:");
				precio=in.nextInt();
				System.out.println("Introduce si tiene GPS o no(true,false):");
				
				tieneGPS=in.nextBoolean();
				lista.add(new Telefono(nombre,precio,tieneGPS));
				
			}	
		}
		in.close();

		for (int i = 0; i < lista.size(); i++) {
			
		}
		StringBuilder sbuilder=new StringBuilder();
		//No se como llamar al metodo get sin referencia ya probe y no me sale
		
		System.out.println(lista);
		for (int i = 0; i < lista.size(); i++) {
			String valor=lista.get(i).getModelo();
			sbuilder.append(valor+',');
		}
		sbuilder.deleteCharAt(sbuilder.length()-1);
		System.out.println(sbuilder);
	}
	
}