package ar.edu.unahur.obj2.rocola;

import java.util.ArrayList;
import java.util.List;

public class Cancion implements Comparable<Cancion> {
    private String titulo;
    private String autor;
    private int duracion;
    private List<Disco> discos;

    public Cancion(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.discos = new ArrayList<>();
    }

    public void agregarDisco(Disco disco) {
        discos.add(disco);
    }

    @Override
    public int compareTo(Cancion o) {
        return this.titulo.compareTo(o.titulo);
    }
}
