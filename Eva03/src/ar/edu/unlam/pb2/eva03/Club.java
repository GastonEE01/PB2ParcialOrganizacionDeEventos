package ar.edu.unlam.pb2.eva03; // Asegúrate de que el paquete sea correcto

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {
    private String nombre;
    private Set<Deportista> deportistas;
    private Integer cantidadDeSocios;
    private Map<TipoDeEvento, String> eventos;

    public Club(String nombre) {
        this.nombre = nombre;
        this.deportistas = new TreeSet<Deportista>();
        this.eventos = new HashMap<TipoDeEvento, String>();
        this.cantidadDeSocios = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Deportista> getDeportistas() {
        return deportistas;
    }

    public void setDeportistas(Set<Deportista> deportistas) {
        this.deportistas = deportistas;
    }

    public Integer getCantidadDeSocios() {
        return cantidadDeSocios;
    }

    public void setCantidadDeSocios(Integer cantidadDeSocios) {
        this.cantidadDeSocios = cantidadDeSocios;
    }

    public void agregarDeportista(Deportista deportista) {
        if (deportista instanceof Corredor || deportista instanceof Triatleta || deportista instanceof Nadador
                || deportista instanceof Ciclista) {
            this.cantidadDeSocios++;
            this.deportistas.add(deportista);
        }
    }

    public void crearEvento(TipoDeEvento tipoEvento, String nombreDelEvento) {
        this.eventos.put(tipoEvento, nombreDelEvento);
    }

    public void inscribirEnEvento(TipoDeEvento tipoEvento, Deportista deportista) throws NoEstaPreparado {
        if (this.eventos.containsKey(tipoEvento)) {
            if (tipoEvento == TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS && deportista instanceof Nadador) {
                // Inscribir al deportista
            } else if (tipoEvento == TipoDeEvento.TRIATLON_IRONMAN && deportista instanceof Nadador
                    && deportista instanceof Ciclista) {
                // Inscribir al deportista
            } else {
                throw new NoEstaPreparado("Este deportista no esta preparado para este evento");
            }
        } else {
          //  throw new EventoNoEncontradoException("El evento no existe");
        }
    }
}



