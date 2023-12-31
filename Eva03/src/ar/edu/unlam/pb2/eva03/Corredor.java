package ar.edu.unlam.pb2.eva03;

public class Corredor  extends Deportista {

	private Integer numeroDeSocio;
	private String nombre;
	private Integer distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados;

	public Corredor(Integer numeroDeSocio , String nombre, Integer distanciaPreferida) {
		super(numeroDeSocio,nombre);
		this.numeroDeSocio = numeroDeSocio;
		this.nombre = nombre;
		this.distanciaPreferida = distanciaPreferida;
		this.cantidadDeKilometrosEntrenados = 0;
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

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public Integer getCantidadDeKilometrosEntrenados() {
		return (Integer) cantidadDeKilometrosEntrenados;
	}

	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		this.cantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}

	@Override
	public String toString() {
		return "Corredor [numeroDeSocio=" + numeroDeSocio + ", nombre=" + nombre + ", distanciaPreferida="
				+ distanciaPreferida + ", cantidadDeKilometrosEntrenados=" + cantidadDeKilometrosEntrenados + "]";
	}

}
