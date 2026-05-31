package taller_practico_semana1;
import java.util.ArrayList;
import java.util.Scanner;

public class CASO_5_Lista_de_estudiante {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        try {

            System.out.print("¿Cuántos estudiantes desea ingresar?: ");
            int cantidad = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < cantidad; i++) {
                System.out.print("Nombre del estudiante " + (i + 1) + ": ");
                estudiantes.add(sc.nextLine());
            }

            System.out.println("\nLista de estudiantes:");

            for (String estudiante : estudiantes) {
                System.out.println(estudiante);
            }

        } catch (Exception e) {
            System.out.println("Dato inválido.");
        }

        sc.close();
    }
}
