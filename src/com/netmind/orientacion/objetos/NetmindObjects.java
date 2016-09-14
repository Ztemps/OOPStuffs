package com.netmind.orientacion.objetos;

import java.util.UUID;

public class NetmindObjects {

	private String uuidRandom;
	
	public NetmindObjects(){
		uuidRandom = UUID.randomUUID().toString();
	}

	public String getUUIDRandom() {
		return uuidRandom ;
	}
	public void setUUIDRandom(String string) {
		this.uuidRandom = string;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uuidRandom == null) ? 0 : uuidRandom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NetmindObjects other = (NetmindObjects) obj;
		if (uuidRandom == null) {
			if (other.uuidRandom != null)
				return false;
		} else if (!uuidRandom.equals(other.uuidRandom))
			return false;
		return true;
	}


	
	
}
