package com.netmind.alumnos.integration.test;

import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertTrue; 

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import org.junit.Test;

import com.google.gson.Gson;
import com.netmind.orientacion.objetos.Alumno;
import com.netmind.orientacion.objetos.AlumnoDao;

public class AlumnDaoTest {

	@Test
	public void testAdd() throws IOException {

		Alumno alumno = new Alumno();
		alumno.setIdAlumno(2);
		alumno.setNombre("Javi");
		alumno.setApellidos("Casado");
		alumno.setDni("123456789W");
		alumno.setUUIDRandom("7550147a-d8f7-4f14-bf05-d02d35ebc1d0");

		FileInputStream in;
		try {
			in = new FileInputStream("listaAlumnosTest.txt");

			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			String strLine = null, tmp;

			while ((tmp = br.readLine()) != null) {
				strLine = tmp;
			}

			String lastLine = strLine;

			in.close();
			br.close();

			Alumno alumnoEncontrado = new Alumno();

			StringTokenizer token = new StringTokenizer(lastLine, ",");

			while (token.hasMoreElements()) {
				alumnoEncontrado.setIdAlumno(Integer.parseInt(token.nextToken().trim()));
				alumnoEncontrado.setNombre(token.nextToken().trim());
				alumnoEncontrado.setApellidos(token.nextToken().trim());
				alumnoEncontrado.setDni(token.nextToken().trim());
				alumnoEncontrado.setUUIDRandom(token.nextToken().trim());
			}

			assertEquals(alumnoEncontrado, alumno);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testJson() throws IOException{
		
		Alumno alumno = new Alumno();
		alumno.setIdAlumno(2);
		alumno.setNombre("Javi");
		alumno.setApellidos("Casado");
		alumno.setDni("123456789W");
		alumno.setUUIDRandom("1e1f9e54-bc7d-4faf-8f47-7d3b0c25c02b");

		Gson gson = new Gson();
		gson.fromJson(new FileReader("listaAlumnosJsonTest.json"), Alumno.class);
	
		String str = gson.fromJson(new FileReader("listaAlumnosJsonTest.json"), Alumno.class).toString();

		Alumno alumnoEncontrado = new Alumno();

		StringTokenizer token = new StringTokenizer(str, ",");

		while (token.hasMoreElements()) {
			alumnoEncontrado.setIdAlumno(Integer.parseInt(token.nextToken().trim()));
			alumnoEncontrado.setNombre(token.nextToken().trim());
			alumnoEncontrado.setApellidos(token.nextToken().trim());
			alumnoEncontrado.setDni(token.nextToken().trim());
			alumnoEncontrado.setUUIDRandom(token.nextToken().trim());
		}

		assertEquals(alumnoEncontrado, alumno);
					
	}
	
	@Test
	public void getAllTest() throws IOException{
		
		AlumnoDao alumnno = new AlumnoDao();
			try {
				assertTrue(alumnno.getAll().size()>=0);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
