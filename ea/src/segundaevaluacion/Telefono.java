package segundaevaluacion;

/**
 * 
 * @author matinal
 * @version 1.0
 */
public class Telefono {
	private String modelo;
	private String nombre;
	private double precio;
	private boolean tieneGPS;
	private String MAC;
	/**
	 * 
	 * @param nombre nombre
	 * @param precio precio
	 * @param tieneGPS tieneGPS
	 */
	public Telefono(String nombre, double precio, boolean tieneGPS) {
		this.nombre = nombre;
		this.precio = precio;
		this.tieneGPS = tieneGPS;
		MAC=generarMAC();
		modelo=generarModelo();
	}
	/**
	 * Genera un modelo al azar
	 * @return modelo
	 */
	private String generarModelo(){
		String[] letras={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		int aleatorio=(int) (Math.random()*letras.length);
		String l1=letras[aleatorio];
		int n1=(int) (Math.random()*100);
		String fin=l1+n1;
		return fin;
	}
	/**
	 * Genera una MAC al azar
	 * @return MAC
	 */
	private String generarMAC(){
		String[] letrasnumeros={"A","B","C","D","E","F","0","1","2","3","4","5","6","7","8","9"};
		String aleatorio1=null;
		String resultado="";
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 1; j++) {
				aleatorio1=letrasnumeros[(int) (Math.random()*letrasnumeros.length)];
				resultado+=aleatorio1;
			}
			resultado+=aleatorio1+":";
			aleatorio1=null;
			
		}
		resultado=resultado.substring(0, resultado.length()-1);
		return resultado;
	}
	/**
	 * Getter modelo
	 * @return modelo
	 */
	public String getModelo() {
			return modelo;
	}
	@Override
	public String toString() {
		return "Telefono [modelo=" + modelo + ", nombre=" + nombre
				+ ", precio=" + precio + ", tieneGPS=" + tieneGPS + ", MAC="
				+ MAC + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefono other = (Telefono) obj;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}
	
	
	
}	
