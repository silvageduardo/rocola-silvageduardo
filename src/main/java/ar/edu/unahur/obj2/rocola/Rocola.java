package ar.edu.unahur.obj2.rocola;

import java.util.*;
import java.util.stream.Collectors;

public class Rocola {

    private Set<Disco> discos;

    private Map<Genero, List<Disco>> discosPorGenero;

    public Rocola(Set<Disco> discos) {
        this.discos = discos;
        this.discosPorGenero = this.discos.stream()
                .collect(Collectors.groupingBy(Disco::getGenero));

    }

    public Set<Cancion> canciones() {
        return discos.stream()
                .flatMap(d -> d.getListaCanciones().stream())
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<Disco> discos() {
        return discos.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<Artista> artistas() {
        return discos.stream()
                .map(d -> d.getArtista())
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    /**
     * Opción correcta pero poco performante
     *
     * @param genero
     * @return
     */
    public Set<Disco> discosPorGenero(Genero genero) {
        return discos.stream().filter(disco -> disco.getGenero().equals(genero))
                .sorted().collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<Disco> discosPorGeneroOptimizado(Genero genero) {
        return discosPorGenero.get(genero).stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }


    /**
     * Opción correcta pero poco performante
     *
     * @param genero
     * @return
     */
    public Set<Cancion> cancionesPorGenero(Genero genero) {
        return discosPorGenero(genero).stream()
                .flatMap(d -> d.getListaCanciones().stream())
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<Cancion> cancionesPorGeneroOptimizado(Genero genero) {
        return discosPorGenero(genero).stream()
                .flatMap(d -> d.getListaCanciones().stream())
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }



}
