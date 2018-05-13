package Tarea13;

import java.util.Scanner;

public class ListaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu=0;
		String menu1;
		Lista tabla = new Lista();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Menú\n");
			System.out.println("1) Cargar ");
			System.out.println("2) Mostrar toda la lista");
			System.out.println("3) Insertar una persona");
			System.out.println("4) Eliminar una persona");
			System.out.println("5) Mostrar el número de personas en la lista");
			System.out.println("6) Buscar persona por el DNI");
			System.out.println("7) Buscar persona por el Nombre");
			System.out.println("8) Ordenar la lista según número DNI");
			System.out.println("9) Guardar en fichero");
			System.out.println("0) Salir");
			menu = sc.nextInt();
			menu1 =sc.nextLine();
			switch(menu) {
			
			case 1: tabla.cargar();
					break;
			case 2:	tabla.listar();
					break;
			case 3: tabla.insertar();
					break;
			case 4: tabla.eliminar();
					break;
			case 5: System.out.println("La cantidad de personas en la lista son: " + tabla.contar());
					break;
			case 6: System.out.println("Introducir el DNI de la persona que quieres buscar (sin letra)");
			        int dni = sc.nextInt();
			        tabla.buscarDni(dni);
					break;
			case 7: System.out.println("Introduzca el nombre de la persona a buscar:");
			        String nombre = sc.nextLine();
			        tabla.buscarNombre(nombre);
					break;
			case 8: tabla.ordenar();
			        break;
			case 9: tabla.guardar();
			        break;
			case 0:	System.out.println(" Muchas gracias por usar el programa, hasta la próxima");
					break;
			default:System.out.println("Por favor, introduzca una opción correcta");
					break;
			}
		
		}while(menu != 0);
		
		sc.close();
	}
	

}

