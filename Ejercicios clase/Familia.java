package MiCodigo;

public class Familia {
		private String nombre;
		private int hijos;
		private double ingresos;
		public Familia(String nombre, int hijos, double ingresos) {
			super();
			this.nombre = nombre;
			this.hijos = hijos;
			this.ingresos = ingresos;
		
			
		}
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * @return the hijos
		 */
		public int getHijos() {
			return hijos;
		}
		/**
		 * @param hijos the hijos to set
		 */
		public void setHijos(int hijos) {
			this.hijos = hijos;
		}
		/**
		 * @return the ingresos
		 */
		public double getIngresos() {
			return ingresos;
		}
		/**
		 * @param ingresos the ingresos to set
		 */
		public void setIngresos(double ingresos) {
			this.ingresos = ingresos;
		}
		
		
		

	}

