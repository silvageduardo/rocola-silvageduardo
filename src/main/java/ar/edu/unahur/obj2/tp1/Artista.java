package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Artista implements Comparable<Artista> {
    private String nombre;
    private List<Disco> discos = new ArrayList<>();

    public Artista(String nombre) {
        this.nombre = nombre;
    }
    public void agregarDisco(Disco disco){
        this.discos.add(disco);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    @Override
    public int compareTo(Artista o) {
        return 0;
    }
}
