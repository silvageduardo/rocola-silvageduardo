package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Artista {
    private String nombre;
    private List<Disco> discos = new ArrayList<>();

    public Artista(String nombre, List<Disco> discos) {
        this.nombre = nombre;
        this.discos = discos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artista)) return false;
        Artista artista = (Artista) o;
        return Objects.equals(getNombre(), artista.getNombre()) &&
                Objects.equals(getDiscos(), artista.getDiscos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getDiscos());
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", discos=" + discos +
                '}';
    }
}
