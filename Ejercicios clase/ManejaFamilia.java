package MiCodigo;

public class ManejaFamilia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Familia Garcia;
		Garcia=new Familia("Garcia",2,800);
		FamiliaNumerosa Sedano;
		Sedano=new FamiliaNumerosa("Sedano",7,3500);
		System.out.println("Familia 1");
		System.out.println("Familia "+Garcia.getNombre());
		System.out.println("Tienen "+Garcia.getHijos()+ " hijos");
		System.out.println("Ganan al mes "+Garcia.getIngresos()+"€");
		System.out.println("Familia 2");
		System.out.println("Familia "+Sedano.getNombre());
		System.out.println("Tienen "+Sedano.getHijos()+ " hijos");
		System.out.println("Ganan al mes "+Sedano.getIngresos()+"€");
		
	}

}
