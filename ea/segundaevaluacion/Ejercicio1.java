package segundaevaluacion;
import biblioteca.caracteres.*;
public class Ejercicio1 {
	
	public static void main(String[] args) {
		Palabra p1=new Palabra("Hola");
		Palabra p2=new Palabra("Examen del ejercicio de la segunda evaluacion");
		//p1.reverso(); Método mutante
		//Metodo reverso() da la vuelta al String
		System.out.println(p1.reverso());
		System.out.println(p2.reverso());
		//Metodo numeroPalabras() dice el total de numero de palabras cuyo delimitador es el espacio
		System.out.println(p2.numeroPalabras());
	}
}
	