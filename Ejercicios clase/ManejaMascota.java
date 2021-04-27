package MiCodigo;

public class ManejaMascota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mascota Blub;
		Blub=new Mascota("Pez","Blub",1);
		MascotaConCuidados Tobby;
		Tobby=new MascotaConCuidados("Perro","Tobby",5);
		System.out.println("Mascota 1 ");
		System.out.println("Se llama: "+Blub.getNombre());
		System.out.println("Es un: "+Blub.getEspecie());
		System.out.println("Y tiene: "+Blub.getEdad()+" años");
		System.out.println("Mascota 2 ");
		System.out.println("Se llama: "+Tobby.getNombre());
		System.out.println("Es un: "+Tobby.getEspecie());
		System.out.println("Y tiene: "+Tobby.getEdad()+" años");
		Tobby.setCuidados("Sacarlo a pasear");
		System.out.println("Cuidados especiales: "+Tobby.getCuidados());
		
		
		
		
	}

}
