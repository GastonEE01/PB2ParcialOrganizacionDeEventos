package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public abstract class Deportista implements Comparable<Deportista> {
	
	private Integer numeroDeSocio;
	private String nombre; 
	
	public Deportista(Integer numeroDeSocio,String nombre) {
		this.numeroDeSocio = numeroDeSocio;
		this.nombre = nombre;
	}

	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public void setNumeroDeSocio(Integer numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Deportista deportista = (Deportista) obj;
	    
	   
	return Objects.equals(numeroDeSocio, deportista.numeroDeSocio);
	}

	@Override
	public int hashCode() {
	    return Objects.hash(numeroDeSocio);
	}

	@Override
	public int compareTo(Deportista o) {
		return o.getNumeroDeSocio().compareTo(numeroDeSocio);
	}

}
