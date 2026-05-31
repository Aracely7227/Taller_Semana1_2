package TALLER_PRACTICO_SEMANA1;

public class Persona {

private static String Nombre;
private static Integer Edad;

public   Persona(String Nombre,Integer Edad) {
	this.Nombre= Nombre;
	this.Edad = Edad;
}
public void mostrarDatos() {
	System.out.println("Nombre: " +Nombre);
	System.out.println("Edad: " +Edad);
}

	public static void main(String[] args) {
		 Persona persona = new Persona("Aracely", 22);
	     Persona persona2 = new Persona("Lizeth", 22);

	    
	        System.out.println("Datos de la Persona 1:");
	        persona.mostrarDatos();

	        System.out.println();

	        System.out.println("Datos de la Persona 2:");
	        persona2.mostrarDatos();

	}

}
