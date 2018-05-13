package Tarea13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista {

	private ArrayList<Persona> p = new ArrayList<Persona>();
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);

	// Métodos
	public void cargar() {

		String fichero = "lista.txt";
		String linea = "";
		String ficheroSplitBy = ",";
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(fichero));
			
			while ((linea = br.readLine()) != null) {
				
				String[] persona = linea.split(ficheroSplitBy);
				
				String nombre = persona[0];
				String apellidos = persona[1];
				int dni = Integer.parseInt(String.valueOf(persona[2]));
				int edad = Integer.parseInt(String.valueOf(persona[3]));
				String calle = persona[4];
				int cp = Integer.parseInt(String.valueOf(persona[5]));
				String provincia = persona[6];
				
				p.add(new Persona(nombre, apellidos, dni, edad, calle, cp, provincia));

			}
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero lista.txt");
		} catch (IOException e) {
			System.out.println("No se puede leer el fichero lista.txt");
		}

	}

	public void listar() {
		for (Persona lista : p) {
			System.out.println(lista + "\n");
		}
	}

	public void ordenar() {
		Collections.sort(p);
	}

	public void insertar() {// añade el registro al final de la lista
		
		System.out.println("Introduzca el nombre por favor:");
		String nombre = sc1.nextLine();
		
		System.out.println("Introduzca los apellidos por favor:");
		String apellidos = sc1.nextLine();
		
		System.out.println("Introduzca el DNI por favor:");
		int dni = sc2.nextInt();
		
		System.out.println("Introduzca la edad por favor:");
		int edad = sc2.nextInt();
		
		System.out.println("Introduzca el nombre de la calle por favor:");
		String calle = sc1.nextLine();
		
		System.out.println("Introduzca el código postal por favor:");
		int cp = sc2.nextInt();
		
		System.out.println("Introduzca la provincia por favor:");
		String provincia = sc1.nextLine();
		
		p.add(new Persona(nombre, apellidos, dni, edad, calle, cp, provincia));
	}

	public void eliminar() {
		int puesto = -1;
		int n = 0;
		System.out.println("Introduzca el dni de la persona que quieres eliminar:");
		int dni = sc2.nextInt();
		for (Persona lista : p) {
			if (dni == lista.getDni()) {
				puesto = n;
			} else
				n++;
		}
		p.remove(puesto);
	}

	public int contar() {
		return p.size();
	}

	public String buscarDni(int dni) {
		for (Persona lista : p) {
			if (dni == lista.getDni())
				System.out.println(lista);
		}
		return null;
	}

	public void buscarNombre(String nombre) {
		for (Persona lista : p)
			if (nombre.equals(lista.getNombre())) 
				System.out.println(lista);
			
	}

	public void guardar() {
		String fichero = "pedido.txt";
		BufferedWriter bw = null;
		String linea = "";

		try {
			bw = new BufferedWriter(new FileWriter(fichero));
			bw.write("Nombre, Apellidos, Dni, Edad, Calle, Numero, Cp, Provincia " + "\r\n");
			for (Persona lista : p) {
				linea = lista.toString();
				bw.write(linea + "\r\n");
			}
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("No se ha podido escribir en el fichero");
		}

	}

}
