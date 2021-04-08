package codigo;

public class cocheF1Lluvia extends cocheF1 {
	
//Cuando en la carrera va a haber lluvia, muchos m�s factores entran en juego, 
//como por ejemplo, el tipo de neum�ticos dependiendo de si es lluvia extrema o
//lluvia m�s leve
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
