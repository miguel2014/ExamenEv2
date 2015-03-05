package segundaevaluacion;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio2 {
	
	public static void main(String[] args) {
		List<Telefono> lista=new ArrayList<Telefono>();
		Telefono telefono;
		Scanner in=new Scanner(System.in);
		String nombre;
		int precio;
		boolean tieneGPS;
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
				telefono = new Telefono(nombre,precio,tieneGPS);
				if (!lista.contains(telefono))
				lista.add(telefono);
				//lista.add(new Telefono(nombre,precio,tieneGPS));
				
			}	
		}
		in.close();

		for (int i = 0; i < lista.size(); i++) {
			
		}
		System.out.println(lista);
		
		if (lista.size()>0) {
			
		StringBuilder sbuilder=new StringBuilder();
		
		for (int i = 0; i < lista.size(); i++) {
			String valor=lista.get(i).getModelo();
			sbuilder.append(valor+',');
		}
		sbuilder.deleteCharAt(sbuilder.length()-1);
		System.out.println(sbuilder);
		}
		
	}
	
}
