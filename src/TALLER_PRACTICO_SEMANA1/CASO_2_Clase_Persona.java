package taller_practico_semana1;

public class CASO_2_Clase_Persona {

private static String Nombre;
private static Integer Edad;

public   CASO_2_Clase_Persona(String Nombre,Integer Edad) {
	this.Nombre= Nombre;
	this.Edad = Edad;
}
public void mostrarDatos() {
	
	//hola desde java.
	System.out.println("Nombre: " +Nombre);
	System.out.println("Edad: " +Edad);
}

	public static void main(String[] args) {
		 CASO_2_Clase_Persona cASO_2_Clase_Persona = new CASO_2_Clase_Persona("Aracely", 22);
	     CASO_2_Clase_Persona persona2 = new CASO_2_Clase_Persona("Lizeth", 22);

	    
	        System.out.println("Datos de la Persona 1:");
	        cASO_2_Clase_Persona.mostrarDatos();

	        System.out.println();

	        System.out.println("Datos de la Persona 2:");
	        persona2.mostrarDatos();

	}

}

//HOLAMUNDO