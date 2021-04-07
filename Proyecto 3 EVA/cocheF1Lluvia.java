package codigo;

public class cocheF1Lluvia extends cocheF1 {
	
//Cuando en la carrera va a haber lluvia, muchos más factores entran en juego, 
//el tipo de neumáticos, si se va a activar o no el drs...	
	private boolean lluviaExtrema;
	
	//Constructor
	public cocheF1Lluvia(String nombre, String color, int peso, double presionNeumaticos, int suspension, boolean lluviaExtrema) {
		super(nombre, color, peso, presionNeumaticos, suspension);
		this.lluviaExtrema = lluviaExtrema;
	}

	//Getters and Setters
	public boolean isLluviaExtrema() {
		return lluviaExtrema;
	}
	
	public void setLluviaExtrema(boolean lluviaExtrema) {
		this.lluviaExtrema = lluviaExtrema;
	}

	public String getTipoDeNeumaticos() {
		if (lluviaExtrema == true) {
			return ("neumaticos de lluvia extrema");
		} else {
			return ("neumaticos intermedios");
		}
	}

	

	
	

	
}
