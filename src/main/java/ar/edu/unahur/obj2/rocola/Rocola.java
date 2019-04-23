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
        return discosPorGeneroOptimizado(genero).stream()
                .flatMap(d -> d.getListaCanciones().stream())
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }



    public void reproducirCancion(Cancion cancion){
        Optional<Cancion> cancionbuscada = buscarCancion(cancion);
        if(cancionbuscada .isPresent())
            System.out.println("Reproduciendo" + cancionbuscada.get().getTitulo()  + "\n");

        throw new RuntimeException("Canción " + cancion.getTitulo() + " no encontrada");
    }


    private Optional<Cancion> buscarCancion(Cancion cancion){

        return canciones().stream().filter(c -> c.equals(cancion)).findAny();

    }

    public void reproducirDisco(Disco disco){
        Optional<Disco> discobuscado = buscarDisco(disco);
        if(discobuscado .isPresent()) {
            System.out.println("Reproduciendo" + discobuscado.get().getTitulo() + "\n");
            for (Cancion cancion : discobuscado.get().getListaCanciones()) {
                System.out.println("Reproduciendo " + cancion.getTitulo() + "\n");
            }
        }

        throw new RuntimeException("Disco " + disco.getTitulo() + " no encontrado");
    }


    private Optional<Disco> buscarDisco(Disco disco){

        return discos().stream().filter(c -> c.equals(disco)).findAny();

    }

    public void reproducirAleatorio(){
        Set<Cancion> c = canciones();
        Random random = new Random(c.size());
        List<Cancion> c2 = new ArrayList(c);

       for (int i = 0; i < c2.size(); i++){
            System.out.println("Reproduciendo " + c2.get(random.nextInt()).getTitulo() + "\n");
       }
    }


}
