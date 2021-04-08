package codigo;

public class manejaCocheF1 {

	public static void main(String[] args) {

		// Voy a crear un objeto para la próxima carrera que se celebrará en Italia
		cocheF1 carreraItalia;
		//Voy a crear un objeto para la carrera en Portugal donde lloverá
		cocheF1Lluvia carreraPortugal;
		
		carreraItalia= new cocheF1("McLaren MCL35M", "naranja", 746, 1.20, 5);
		carreraPortugal = new cocheF1Lluvia("McLaren MCL35M", "Naranja", 768, 1.0, 3, true);
		
		System.out.println("Para el próximo gran premio de Italia utilizaremos el modelo "+ carreraItalia.getNombre() + " de color " + carreraItalia.getColor());
		System.out.println("Los reglajes serán:");
		System.out.println("Peso de "+ carreraItalia.getPeso() + ", Una presión de neumaticos de "+ carreraItalia.getPresionNeumaticos() + " y una suspensión de " + carreraItalia.getSuspension());
		System.out.println(" ");
		
		System.out.println("Para el gran premio de Portugal utilizaremos el modelo "+ carreraItalia.getNombre() + " de color " + carreraItalia.getColor());
		System.out.println("Como se espera que va a llover, los reglajes serán;");
		System.out.println("Peso de "+ carreraPortugal.getPeso() + ", Una presión de neumaticos de "+ carreraPortugal.getPresionNeumaticos() + " y una suspensión de " + carreraPortugal.getSuspension());
		
		//Este último mensaje utiliza el método de tipoDeNeumatico que es un condicional que depende de si Lluviaextrema= true o Lluviaextrema=false
		System.out.println("Utilizaremos los "+ carreraPortugal.getTipoDeNeumaticos());
	}

}
