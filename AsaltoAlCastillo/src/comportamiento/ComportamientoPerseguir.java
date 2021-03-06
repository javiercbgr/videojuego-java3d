package comportamiento;

import entidad.DiccionarioEntidades;
import entidad.EntidadInteligente;
import entidad.Entidad;
import entidad.Personaje;
import static util.Maths.*;

public class ComportamientoPerseguir implements Comportamiento {

    private static DiccionarioEntidades diccionarioEntidades = DiccionarioEntidades.getInstance();

    private EntidadInteligente entidadControlada = null;
    private Entidad objetivo = null;

    public ComportamientoPerseguir(EntidadInteligente entidadControlada, Entidad personaje) {
        this.entidadControlada = entidadControlada;

        /* Ponemos al jugador como enemigo fijo */
        this.objetivo = personaje;
//        System.out.println("Objetivo:  " + objetivo);
    }

    public void actualizar() {
        entidadControlada.ir(objetivo.posiciones);
    }
}
