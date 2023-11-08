package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Triatleta extends Deportista{

	private Integer numeroDeSocio;
	private String nombre;
	private TipoDeEvento tipoDeEvento;
	private TipoDeBicicleta tipoDeBicicleta;

	public Triatleta(Integer numeroDeSocio, String nombre, TipoDeEvento tipoDeEvento, TipoDeBicicleta tipoDeBicicleta) {
		super(numeroDeSocio,nombre);
		this.numeroDeSocio = numeroDeSocio;
		this.nombre = nombre;
		this.tipoDeEvento = tipoDeEvento;
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

	public TipoDeEvento getTipoDeEvento() {
		return tipoDeEvento;
	}

	public void setTipoDeEvento(TipoDeEvento tipoDeEvento) {
		this.tipoDeEvento = tipoDeEvento;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	//Este metodo lo creo el test
	public Object getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return null;
	}

}
