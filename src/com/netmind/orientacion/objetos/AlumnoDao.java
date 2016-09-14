package com.netmind.orientacion.objetos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.google.gson.Gson;


public class AlumnoDao {
	
	private final static Logger log = Logger.getLogger(AlumnoDao.class);


	public int add(Alumno alumno, int formato) throws IOException {

		Properties propiedades = new Properties();
		InputStream entrada = null;

		entrada = new FileInputStream("configuracion.properties");
		
        propiedades.load(entrada);
		
		if (formato == 1) {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter((propiedades.getProperty("listaAlumnos")), true));
				bw.append(alumno.toString());
				bw.newLine();
				bw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
				log.error("testAdd",e);
				throw e;
			}
		} else {
			
			addAlumnoJson(alumno);
			
		}
		return alumno.getIdAlumno();
	}

	private void addAlumnoJson(Alumno alumno) throws IOException {
		Gson gson = new Gson();
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("listaAlumnosJson.json", true));
			gson.toJson(alumno,bw);
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			log.error("testAddJson",e);

		}
		
	}

	public ArrayList<Alumno> getAll() throws IOException {

		ArrayList<Alumno> list = new ArrayList<Alumno>();
		FileInputStream in;
		Alumno alumno = null;

		try {
			in = new FileInputStream("listaAlumnos.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			while ((line = br.readLine()) != null) {
				String[] linea = line.split(",");
				alumno = new Alumno(Integer.parseInt(linea[0]), linea[1], linea[2], linea[3]);
				list.add(alumno);
			}

			br.close();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return list;

	}

}
