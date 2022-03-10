package calculadora;

import java.util.Scanner;


//*\\178.170.65.40\admin\java\aniwin\src\examen


public class Calculadora {
	/**
	 * pree:
	 * post:crear una calculadora que tenga menu y pueda realizar operaciones de sumar,restar,multiplicar y dividir.
	 * El usuario deberá indicarle al programa qué operación es la que desea realizar, utilizando el
	 * código numérico asignado a cada una de las acciones (1, 2, 3 o 4), y posteriormente deberá
	 * indicarle nuevamente al programa que dos números utilizará para dicha operación.
	 */
	public static void main(String[]args) {
		/**
		 * Añado los nombres de los otras metodos 
		 */
		menu();
		operaciones();
	}
public static void menu() {
	/**
	 * en este metodo mostro solo el menu de la calculadora para que tenga un diseño
	 */
	 System.out.println("¡Bienvenidos a mi primera calculadora!");
     System.out.println(" 1.- Sumar");
     System.out.println(" 2.- Restar ");
     System.out.println(" 3.- Multiplicar");
     System.out.println(" 4.- Dividir");
     System.out.println("---------------------------------------");
}
public static void operaciones() {
	/**
	 * creo un escaner para preguntarle al usuario que operacion quiere realizar,
	 *  creo condiciones para que el numero que sea entre a la condicion y entremos al metodo selecionado 
	 */
	Scanner entrada=new Scanner(System.in);
	System.out.print("Que operación deseas hacer : ");
	int x=entrada.nextInt();
    if (x >= 0 & x <= 5) {
        if (x == 1) {
        	 sumar();
             return;
        }else if (x == 2) {
             restar();
             return;
        }else if (x == 3) {
         multiplicacion();
        	return ;
        }else if (x== 4) {
        	 division();
        	 return;
       } 
    }
}
public static void sumar() {
	/**
	 * en cada metodo tiene su escaner y sus numeros decimal,  cuando acabamos la
	 *  operacion llamados al metodo operaciones por si el usuario quiere hacer otra operacion
	 */
	Scanner entrada=new Scanner(System.in);
	System.out.print("Introduzca el primer numero : ");
    double numero1=entrada.nextDouble();
	System.out.print("Introduzca el segundo numero : ");
    double numero2=entrada.nextDouble();
	System.out.print("La suma de " + numero1 + " + " + numero2 + " = " + numero1 + numero2);
    System.out.println();
	operaciones();
}

public static void restar() {
	Scanner entrada=new Scanner(System.in);
    System.out.print("Introduzca el primer numero : ");
    double numero1=entrada.nextDouble();
    System.out.print("introduzca el segundo numero : ");
    double numero2=entrada.nextDouble();
    System.out.print("El resultado  de " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
    System.out.println();
    operaciones();
}

public static void multiplicacion() {
	Scanner entrada=new Scanner(System.in);
	System.out.print("Introduzca el primer numero : ");
	double numero1=entrada.nextDouble();
    System.out.print("introduzca el segundo numero : ");
	double numero2=entrada.nextDouble();
    System.out.print("La multiplicacion de " + numero1 + " * " + numero2 + " = " + numero1 * numero2);
    System.out.println();
    operaciones();
}

public static void division() {
	Scanner entrada=new Scanner(System.in);
	System.out.print("Introduzca el primer numero : ");
	double numero1=entrada.nextDouble();
	System.out.print("Introduzca el segundo numero : ");
	double numero2=entrada.nextDouble();
    System.out.print("El cociente de " + numero1 + " entre " + numero2 + " = " + numero1 / numero2);
    System.out.println();
    operaciones();
}
}