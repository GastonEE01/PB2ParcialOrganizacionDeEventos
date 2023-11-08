package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public class Ciclista  extends Deportista {
	private Integer numeroDeSocio;
	private String nombre;
	private TipoDeBicicleta tipoDeBicicleta;

	public Ciclista(Integer numeroDeSocio, String nombre, TipoDeBicicleta tipoDeBicicleta) {
		super(numeroDeSocio,nombre);
		this.numeroDeSocio = numeroDeSocio;
		this.nombre = nombre;
		this.tipoDeBicicleta = tipoDeBicicleta;
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

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	
	
}
