package com.netmind.orientacion.objetos;

import java.util.ArrayList;
import java.util.List;

public class Singleton {

	private static List<Alumno> lista = null;

	protected Singleton() {

	}

	public static synchronized List<Alumno> getInstance() {

		if (lista == null) {
			lista = new ArrayList<Alumno>();
		}
		return lista;
	}
	
}
