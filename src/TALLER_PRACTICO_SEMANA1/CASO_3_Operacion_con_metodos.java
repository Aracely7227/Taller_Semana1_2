package taller_practico_semana1;


public class CASO_3_Operacion_con_metodos {
public int sumar(int a,int b) {
	return a+b;
	
}
public double sumar(double a,double b ) {
	return a+b;
}
public int sumar(int a,int b,int c) {
	return a+b+c;
}

public static void main(String[] args) {
	CASO_3_Operacion_con_metodos sobre =new CASO_3_Operacion_con_metodos();
	System.out.println("suma de 5 + 10 = " +sobre.sumar(5,10));
	System.out.println("la suma de 20.5 + 10.2 = "+ sobre.sumar(20.5, 10.2));
	System.out.println("la suma de 10 + 5 + 3 = "+sobre.sumar(10, 5, 3));
}



}
