package com.netmind.orientacion.objetos;

import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.Log4jEntityResolver;


public class Principal {


	
	public static void main(String[] arg) throws Exception {

		Scanner scanner = new Scanner(System.in);
		Alumno alumno = new Alumno();
		AlumnoDao alumnoDao = new AlumnoDao();
		IAlumnoDao<Alumno> dao = new AlumnoDao();
		
		int opcion = 0;
		int formato = 0;

		do {

		System.out.println("Gestión de Alumnos");
		System.out.println("1) Introduce alumno");
		System.out.println("2) Lista alumnos");
		System.out.println("3) Formato");
		System.out.println("4) Salir");
		opcion = scanner.nextInt();

			switch (opcion) {
			case 1:

				System.out.println("Introduce id de alumno: ");
				alumno.setIdAlumno(scanner.nextInt());
				scanner.nextLine();

				System.out.println("Introduce nombre de alumno: ");
				alumno.setNombre(scanner.nextLine());

				System.out.println("Introduce apellidos de alumno: ");
				alumno.setApellidos(scanner.nextLine());

				System.out.println("Introduce dni de alumno: ");
				alumno.setDni(scanner.nextLine());

					alumnoDao.add(alumno, formato);
			
				
				System.out.println("\nAlumno insertado");
				System.out.println("Id: " + alumno.getIdAlumno());
				System.out.println("Nombre: " + alumno.getNombre());
				System.out.println("Apellido: " + alumno.getApellidos());
				System.out.println("Dni: " + alumno.getDni());
				System.out.println("UUID: " + alumno.getUUIDRandom());				

				break;
			
			case 2:

				for (int i = 0; i < alumnoDao.getAll().size(); i++) {
					System.out.println(alumnoDao.getAll().get(i));
				}

				break;

			case 3:

				System.out.println("En que formato guardar?");
				System.out.println("1) .txt");
				System.out.println("2) .json");
				formato = scanner.nextInt();

				break;
				
			case 4:

				System.out.println("Cerrando...");
				Thread.sleep(1000);
				System.out.println("Deu!");
				
				break;
				
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcion != 4);
	}
}
