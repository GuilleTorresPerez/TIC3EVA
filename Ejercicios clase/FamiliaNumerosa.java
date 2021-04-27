package MiCodigo;

public class FamiliaNumerosa extends Familia{
	private double subvencion;
	public FamiliaNumerosa(String nombre, int hijos, double ingresos) {
		super(nombre, hijos, ingresos);
		// TODO Auto-generated constructor stub
		
		
	}
	/**
	 * @return the subvencion
	 */
	public double getSubvencion() {
		return subvencion;
	}
	/**
	 * @param subvencion the subvencion to set
	 */
	public void setSubvencion(double subvencion) {
		this.subvencion = subvencion;
	}

}
