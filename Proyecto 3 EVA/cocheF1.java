package codigo;

public class cocheF1 {
	
// Esta proyecto es en la situación de un equipo de Formula 1 el cual tiene que 
// configurar los reglajes de su coche para su proxima carrera por medio de este
// programa
	
	private String nombre;
	private String color;
	private int peso;
	private double presionNeumaticos;
	private int suspension;
	
	public cocheF1(String nombre, String color, int peso, double presionNeumaticos, int suspension) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;
		this.presionNeumaticos = presionNeumaticos;
		this.suspension = suspension;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getPresionNeumaticos() {
		return presionNeumaticos;
	}

	public void setPresionNeumaticos(double presionNeumaticos) {
		this.presionNeumaticos = presionNeumaticos;
	}

	public int getSuspension() {
		return suspension;
	}

	public void setSuspension(int suspension) {
		this.suspension = suspension;
	}

	public String getColor() {
		return color;
	}
	
}
