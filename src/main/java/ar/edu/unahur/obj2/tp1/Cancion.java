package ar.edu.unahur.obj2.tp1;

public class Cancion {
    private String titulo;
    private Float duracion;
    private String nombreAutor;
    private Genero generos;

    public Cancion(String titulo, Float duracion, String nombreAutor, Genero generos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.nombreAutor = nombreAutor;
        this.generos = generos;
    }
}
