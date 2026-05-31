package TALLER_PRACTICO_SEMANA1;

import java.util.Scanner;

public class CASO_1_Calculadora_básica {

	public static double Suma(double num1, double num2) {

		return num1 + num2;
	}

	public static double Resta(double num1, double num2) {

		return num1 - num2;
	}

	public static double Multiplicacion(double num1, double num2) {

		return num1 * num2;
	}

	public static double Division(double num1, double num2) {
		double resul = 0;
		if (num2 == 0) {
			return 0.0;
		} else {
			resul = num1 / num2;
		}

		return resul;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num1, num2;
		double resultado = 0;
		char opcion;

		System.out.println("Ingerse Numero 1: ");
		num1 = scanner.nextDouble();

		System.out.println("Ingerse Numero 2: ");
		num2 = scanner.nextDouble();

		System.out.println("Ingrese la operacion: ");

		opcion = scanner.next().charAt(0);

		switch (opcion) {
		case '+': {

			resultado = Suma(num1, num2);
		}
			break;
		case '-': {
			resultado = Resta(num1, num2);
		}
			break;
		case '*': {
			resultado = Multiplicacion(num1, num2);
		}
			break;
		case '/': {
			resultado = Division(num1, num2);
		}
			break;
		default:
			System.out.print("Operacion desconocida.");
		}

		System.out.print("La respuesta es: " + resultado);

	}

}