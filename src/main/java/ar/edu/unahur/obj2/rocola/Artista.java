package ar.edu.unahur.obj2.rocola;

import java.util.Set;

public class Artista implements Comparable<Artista> {

    private String nombre;
    private Set<Disco> discos;

    public Artista(String nombre, Set<Disco> discos) {
        this.nombre = nombre;
        this.discos = discos;
        this.discos.stream().forEach(d -> d.setArtista(this));
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Disco> getDiscos() {
        return discos;
    }

    @Override
    public int compareTo(Artista o) {
        return this.nombre.compareTo(o.nombre);
    }
}
