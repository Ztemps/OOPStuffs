package com.netmind.orientacion.objetos;

import java.util.UUID;

public class Alumno extends NetmindObjects{

	private int idAlumno;
	private String nombre;
	private String apellidos;
	private String dni;

	public Alumno(){
		
	}

	public Alumno(int idAlumno, String nombre, String apellidos, String dni) {
		// TODO Auto-generated constructor stub
		this.idAlumno=idAlumno;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
				
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + idAlumno;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (idAlumno != other.idAlumno)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();
	
		return str.append(idAlumno)
				.append(",")
				.append(nombre)
				.append(",")
				.append(apellidos)
				.append(",")
				.append(dni)
				.append(",")
				.append(getUUIDRandom()).toString();
	}
	
	

}
