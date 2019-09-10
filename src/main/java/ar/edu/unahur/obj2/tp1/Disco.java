package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;

public class Disco implements Comparable<Disco>{
    private String titulo;
    private String autor;
    private List<Genero> generos = new ArrayList<>();
    private List<Cancion> canciones = new ArrayList<>();

    public Disco(String titulo, String autor, List<Genero> generos, List<Cancion> canciones) {
        this.titulo = titulo;
        this.autor = autor;
        this.generos = generos;
    }
    private void agregarCancion(Cancion cancion){
        this.canciones.add(cancion);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    @Override
    public int compareTo(Disco o) {
        return 0;
    }
}
