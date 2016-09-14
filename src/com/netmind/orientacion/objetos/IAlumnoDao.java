package com.netmind.orientacion.objetos;

import java.io.IOException;
import java.util.ArrayList;

public interface IAlumnoDao<T> {

	public int add(T model, int formato) throws Exception;
	
	public void addAlumnoJson(T model) throws IOException;
		
	public ArrayList<T> getAll() throws IOException;
	
}
