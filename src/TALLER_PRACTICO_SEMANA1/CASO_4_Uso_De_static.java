package taller_practico_semana1;

public class CASO_4_Uso_De_static {
	static int contador = 0;

    public CASO_4_Uso_De_static() {
        contador++;
    }

    public static void mostrarCantidad() {
        System.out.println("Objetos creados: " + contador);
    }

    public static void main(String[] args) {

    	CASO_4_Uso_De_static c1 = new CASO_4_Uso_De_static();
    	CASO_4_Uso_De_static c2 = new CASO_4_Uso_De_static();
    	CASO_4_Uso_De_static c3 = new CASO_4_Uso_De_static();

    	CASO_4_Uso_De_static.mostrarCantidad();
    }
}
