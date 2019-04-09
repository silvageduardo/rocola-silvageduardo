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
- discos a los que pertenece

De una Rocola sabemos que tiene: 

- discos disponibles para reproducir

y le podemos preguntar:

- canciones disponibles, ordenadas por titulo
- discos disponibles, ordenados por titulo
- artistas disponibles, ordenados por nombre
- albunes por género
- canciones por género

## Segunda Parte

Vamos a modelar el funcionamiento de la rocola. La rocola permite reproducir canciones y / o albunes.
La rocola permite:

- reproducir cancion: reproduce una canción seleccionada
- reproducir disco: reproduce todas las canciones de un album
- reproducir random: reproduce una canción en forma aleatorea

Se mantiene un registro de las veces que se re produjo una cancion o un album.
Se permite buscar la `Canción`, el `Disco` y el `Artista` con mas reproducciones.

## Tercera Parte

El precio por canción está definido en cada Rocola. La rocola no permite reproducir una canción o album sino se deposito previamente dinero.
El usuario de la Rocola puede `cargar` la cantidad de dinero que desee, la misma queda guardada en la Rocola y se va descontando mientras se va reproduciendo música.
Si no hay creditos suficientes, arroja un error al intentar reproducir.

La rocola debe recordar el dinero recaudado.



