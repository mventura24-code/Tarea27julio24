package com.mv.spring.Tarea27jul.persona.entity;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

		    private static ArrayList<Persona> listaPersonas = new ArrayList<>();

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int opcion;

		        do {
		            mostrarMenu();
		            try {
		                opcion = scanner.nextInt();
		                scanner.nextLine(); // Consumir el salto de línea

		                switch (opcion) {
		                    case 1:
		                    	ArrayList<Persona> listaPersonas = new ArrayList<>();
		                        //listaPersonas = LlenarPersona.LlenaListaPersonas();
		                        System.out.println("Lista de personas llenada exitosamente.");
		                        break;
		                    case 2:
		                        ListaPersonas.mostrarListaPersonas(listaPersonas);
		                        break;
		                    case 3:		
		                        FiltroPersonas.PersonasMayores18(listaPersonas);
		                        break;
		                    case 4:
		                        FiltroPersonas.PersonaMayor18Guatemala(listaPersonas);
		                        break;
		                    case 5:
		                        System.out.println("¡Saliendo del programa!");
		                        break;
		                    default:
		                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
		                }
		            } catch (InputMismatchException e) {
		                System.out.println("Error: Debe ingresar un número entero.");
		                scanner.nextLine(); // Limpiar el buffer del scanner
		            }
		        } while (opcion != 5);
		    }

		    private static void mostrarMenu() {
		        System.out.println("\nMenú de opciones:");
		        System.out.println("1. Llenar lista de personas");
		        System.out.println("2. Mostrar lista de personas");
		        System.out.println("3. Mostrar personas mayores o iguales a 18 años");
		        System.out.println("4. Mostrar primera persona mayor de 18 años de Guatemala con nombre que comience con 'Lu'");
		        System.out.println("5. Salir");
		        System.out.print("Ingrese una opción: ");
		    }
				
		


	}


