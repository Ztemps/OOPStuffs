package com.netmind.orientacion.objetos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

	public static String getDatosProperties(String campo) throws IOException {

		Properties propiedades = new Properties();
		
		try (InputStream entrada = new FileInputStream("configuracion.properties")){
			propiedades.load(entrada);
			propiedades.getProperty(campo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;		
		}

		return propiedades.toString();

	}

	
}
