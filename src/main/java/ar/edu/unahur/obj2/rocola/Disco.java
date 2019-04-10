package ar.edu.unahur.obj2.rocola;

import java.util.Set;

public class Disco implements Comparable<Disco> {

    private String titulo;
    private Artista artista;
    private Genero genero;
    private Set<Cancion> listaCanciones;

    public Disco(String titulo,  Genero genero, Set<Cancion> listaCanciones) {
        this.titulo = titulo;
        this.genero = genero;
        this.listaCanciones = listaCanciones;
        this.listaCanciones.forEach(c -> c.agregarDisco(this));
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public Genero getGenero() {
        return genero;
    }

    public Set<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    @Override
    public int compareTo(Disco o) {
        return this.titulo.compareTo(o.titulo);
    }
}
