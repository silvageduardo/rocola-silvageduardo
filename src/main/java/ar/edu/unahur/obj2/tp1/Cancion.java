package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;

public class Cancion implements Comparable<Cancion> {
    private String titulo;
    private Float duracion;
    private String nombreAutor;
    private Genero generos;
    private List<Disco> discos = new ArrayList<>();

    public Cancion(String titulo, Float duracion, String nombreAutor, Genero generos, List<Disco> discos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.nombreAutor = nombreAutor;
        this.generos = generos;
        this.discos = discos;
    }


    public String getTitulo() {
        return titulo;
    }

    public Float getDuracion() {
        return duracion;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public Genero getGeneros() {
        return generos;
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    @Override
    public int compareTo(Cancion o) {
        return 0;
    }
}
