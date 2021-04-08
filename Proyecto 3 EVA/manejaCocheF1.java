package codigo;

public class manejaCocheF1 {

	public static void main(String[] args) {

		// Voy a crear un objeto para la pr�xima carrera que se celebrar� en Italia
		cocheF1 carreraItalia;
		//Voy a crear un objeto para la carrera en Portugal donde llover�
		cocheF1Lluvia carreraPortugal;
		
		carreraItalia= new cocheF1("McLaren MCL35M", "naranja", 746, 1.20, 5);
		carreraPortugal = new cocheF1Lluvia("McLaren MCL35M", "Naranja", 768, 1.0, 3, true);
		
		System.out.println("Para el pr�ximo gran premio de Italia utilizaremos el modelo "+ carreraItalia.getNombre() + " de color " + carreraItalia.getColor());
		System.out.println("Los reglajes ser�n:");
		System.out.println("Peso de "+ carreraItalia.getPeso() + ", Una presi�n de neumaticos de "+ carreraItalia.getPresionNeumaticos() + " y una suspensi�n de " + carreraItalia.getSuspension());
		System.out.println(" ");
		
		System.out.println("Para el gran premio de Portugal utilizaremos el modelo "+ carreraItalia.getNombre() + " de color " + carreraItalia.getColor());
		System.out.println("Como se espera que va a llover, los reglajes ser�n;");
		System.out.println("Peso de "+ carreraPortugal.getPeso() + ", Una presi�n de neumaticos de "+ carreraPortugal.getPresionNeumaticos() + " y una suspensi�n de " + carreraPortugal.getSuspension());
		
		//Este �ltimo mensaje utiliza el m�todo de tipoDeNeumatico que es un condicional que depende de si Lluviaextrema= true o Lluviaextrema=false
		System.out.println("Utilizaremos los "+ carreraPortugal.getTipoDeNeumaticos());
	}

}
