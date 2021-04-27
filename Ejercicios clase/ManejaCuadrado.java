package MiCodigo;

public class ManejaCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto miVertice;
		Cuadrado miCuadrado;
		double coordenadaX=3.0;
		double coordenadaY=2.0;
		double lado=5.0;
		miVertice= new Punto(coordenadaX,coordenadaY);
		miCuadrado=new Cuadrado(miVertice,lado);
		System.out.println(miCuadrado.getLado());
		System.out.println(miCuadrado.getArea());
	}

}
