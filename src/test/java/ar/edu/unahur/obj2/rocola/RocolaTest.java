package ar.edu.unahur.obj2.rocola;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RocolaTest {

    private Cancion cancion1;
    private Cancion cancion2;
    private Cancion cancion3;
    private Cancion cancion4;
    private Cancion cancion5;
    private Cancion cancion6;
    private Cancion cancion7;
    private Cancion cancion8;
    private Cancion cancion9;
    private Cancion cancion10;

    private Disco disco1;
    private Disco disco2;
    private Disco disco3;

    private Artista artista1;
    private Artista artista2;

    private Rocola rocola;

    @BeforeTest
    public void setup() {
        cancion1 = new Cancion("cancion1", 10);
        cancion2 = new Cancion("cancion2", 10);
        cancion3 = new Cancion("cancion3", 10);
        cancion4 = new Cancion("cancion4", 10);
        cancion5 = new Cancion("cancion5", 10);
        cancion6 = new Cancion("cancion6", 10);
        cancion7 = new Cancion("cancion7", 10);
        cancion8 = new Cancion("cancion8", 10);
        cancion9 = new Cancion("cancion9", 10);
        cancion10 = new Cancion("cancion10", 10);

        disco1 = new Disco("Disco 1", Genero.Rock, Stream.of(cancion1, cancion2, cancion3, cancion4).collect(Collectors.toSet()));
        disco2 = new Disco("Disco 2", Genero.Pop, Stream.of(cancion5, cancion6, cancion7).collect(Collectors.toSet()));
        disco3 = new Disco("Disco 3", Genero.Rock, Stream.of(cancion8, cancion9, cancion10).collect(Collectors.toSet()));

        artista1 = new Artista("Artista 1", Stream.of(disco1, disco2).collect(Collectors.toSet()));
        artista2 = new Artista("Artista 2", Stream.of(disco3).collect(Collectors.toSet()));

        rocola = new Rocola(Stream.of(disco1, disco2, disco3).collect(Collectors.toSet()));
    }

    @Test
    public void testCanciones() {
        Set<Cancion> cancionesEsperadas = Stream.of(cancion1,cancion2, cancion3, cancion4, cancion5, cancion6, cancion7,
                cancion8, cancion9, cancion10).collect(Collectors.toSet());

        Assert.assertEquals(rocola.canciones(), cancionesEsperadas);
    }

    @Test
    public void testDiscos() {
        Set<Disco> discosEsperados = Stream.of(disco1, disco2, disco3).collect(Collectors.toSet());

        Assert.assertEquals(rocola.discos(), discosEsperados);
    }

    @Test
    public void testArtistas() {
        Set<Artista> artistasEsperados = Stream.of(artista1,artista2).collect(Collectors.toSet());

        Assert.assertEquals(rocola.artistas(), artistasEsperados);
    }

    @Test
    public void testDiscosPorGeneroPop() {
        Set<Disco> discosDePop = Stream.of(disco2).collect(Collectors.toSet());

        Assert.assertEquals(rocola.discosPorGenero(Genero.Pop), discosDePop);

    }

    @Test
    public void testDiscosPorGeneroOptimizadoRock() {
        Set<Disco> discosDeRock = Stream.of(disco1, disco3).collect(Collectors.toSet());

        Assert.assertEquals(rocola.discosPorGeneroOptimizado(Genero.Rock), discosDeRock);
    }

    @Test
    public void testCancionesPorGeneroOptimizadoPop() {
        Set<Cancion> cancionesDePop = Stream.of(cancion5, cancion6, cancion7).collect(Collectors.toSet());

        Assert.assertEquals(rocola.cancionesPorGeneroOptimizado(Genero.Pop), cancionesDePop);
    }

    @Test
    public void testCancionesPorGeneroPop() {
        Set<Cancion> cancionesDePop = Stream.of(cancion5, cancion6, cancion7).collect(Collectors.toSet());

        Assert.assertEquals(rocola.cancionesPorGenero(Genero.Pop), cancionesDePop);
    }
}