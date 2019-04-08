# Rocola

Una Rocola,también conocida en castellano como sinfonola, gramola o rocola, o jukebox en inglés, es un dispositivo parcialmente automatizado que reproduce música. Usualmente se compone de una máquina que se opera introduciendo monedas o billetes y que permite seleccionar canciones o videos para posteriormente reproducirlos. La selección de los temas se hace a través de un monitor con pantalla táctil que permite buscar la canción o artista deseado para seleccionarlo y posteriormente reproducir el contenido.

## Primera Parte

Vamos a modelar una rocola y su contenido.

De cada Disco sabemos que tiene:
- titulo: título del disco
- autor: autor del disco
- genero: género del disco
- canciones: lista de canciones del disco

De los géneros sabemos que existen los siguientes:
- `Rock`, `Pop`, `Hip Hop`, `Trap`, `Clásico`, `Folk`

Del Autor sabemos :
- nombre artístico
- discos: discos de los cuales es autor

De las canciones sabemos :
- título
- duración en minutos
- disco al que pertenece

De una Rocola sabemos que tiene: 

- discos disponibles para reproducir

y le podemos preguntar:

- canciones disponibles, ordenadas por titulo
- discos disponibles, ordenados por titulo
- artistas disponibles, ordenados por nombre
- albunes por género
- canciones por género


## Segunda Parte

Vamos a modelar el funcionamiento de la rocola. La rocola permite reproducir canciones y / o albunes  por un precio determinado. El precio depende del artista.

La rocola permite:

- reproducir cancion
- reproducir disco
- reproducir random

Se mantiene un registro de las veces que se re produjo una cancion o un album.

Se permite buscar la Canción, el Disco y el artista con mas reproducciones.


## Tercera Parte

Agregamos funcionalidades a la rocola, como la posibilidad de crear listas de temas, darles un orden determinado a esa lista de termas.
