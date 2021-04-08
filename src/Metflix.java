import java.util.ArrayList;
import java.util.List;

public class Metflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    // Metodo que inicializa el catalogo cno las pelis/series qeu querramos
    public void inicializarCatalogo() {

        // Pelis: Titanic, Batman: El caballero de la noche
        Pelicula titanic; // declara una variable que apuntara a una Pelicula
        titanic = new Pelicula(); // Estas ultimoas 2 lineas: Pelicula titanic = new Pelicula();

        titanic.nombre = "Titanic";
        titanic.añoLanzamiento = 1997;
        titanic.duracion = 210; // 3hs 30

        Actor actor = new Actor();
        actor.nombre = "Leo DiCaprio";

        // Agrego a la lista de actores del objeto titanic
        titanic.actores.add(actor); // metodo Add -> agregar a una lista

        // Recien ahora estoy agregando a Titanic al catalogo
        this.peliculas.add(titanic);

        // Otra Peli
        Pelicula batman = new Pelicula();
        batman.nombre = "Batman: el caballero de la nohe";
        batman.añoLanzamiento = 2008;
        batman.duracion = 152;

        // No voy a declarar otra variable actor, voy a reusar
        // siempre primero antes de reusar
        // re instanciar
        actor = new Actor(); // Creo un nuevo actor, pero referenciado con la variable actor
        actor.nombre = "Christian Bale";

        batman.actores.add(actor);

        this.peliculas.add(batman);

        // How I met your mother. Serie

        Serie howIMetYM = new Serie();
        howIMetYM.nombre = "How I met your mother";
        howIMetYM.añoLanzamiento = 2005;

        actor = new Actor();
        actor.nombre = "Neil Patrick Harris";

        howIMetYM.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Cobie Smulders";

        howIMetYM.actores.add(actor);

        // T5:E11
        // creo la temporada
        Temporada temporada = new Temporada();
        temporada.setNumero(5);

        // Creo el episodio
        Episodio episodio = new Episodio();
        episodio.setNombre("The last cigarrette");
        episodio.setNumero(11);

        // vinculo temporada con episodio
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio();
        episodio.setNombre("Definitions");
        episodio.setNumero(1);

        Websodio ws = new Websodio();
        ws.setNombre("Nombre wesodio en internet");
        ws.setNumero(35);
        ws.setLink("http://miepisodios.com/websodio.avi");

        temporada.getEpisodios().add(ws);

        temporada.getEpisodios().add(episodio);

        // Agrego la temporada
        howIMetYM.temporadas.add(temporada);

        // T3
        // creo la temporada
        temporada = new Temporada();
        temporada.setNumero(3);

        // Creo el episodio
        episodio = new Episodio();
        episodio.setNombre("Wait for it");
        episodio.setNumero(1);

        // vinculo temporada con episodio
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio();
        episodio.setNombre("Little Boys");
        episodio.setNumero(4);

        temporada.getEpisodios().add(episodio);

        // Agrego la temporada
        howIMetYM.temporadas.add(temporada);

        // Aca esta toda la serie con 2 temporadas y cada una con 2 episodios.
        this.series.add(howIMetYM);

        Serie bbt = new Serie();
        bbt.nombre = "The BigBang Theory";
        bbt.añoLanzamiento = 2007;

        actor = new Actor();
        actor.nombre = "Kaley Cuoco";

        bbt.actores.add(actor);

        // creo la temporada
        temporada = new Temporada();
        temporada.setNumero(1);

        // Creo el episodio
        episodio = new Episodio();
        episodio.setNombre("Pilot");
        episodio.setNumero(1);

        // vinculo temporada con episodio
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio();
        episodio.setNombre("The Cooper-Hofstadter Polarizatio");

        temporada.getEpisodios().add(episodio);

        // Agrego la temporada
        bbt.temporadas.add(temporada);

        this.series.add(bbt);

        // NUEVA SERIE

        Serie greysAnatomy = new Serie();
        greysAnatomy.nombre = "Grey's Anatomy";
        greysAnatomy.añoLanzamiento = 2005;

        actor = new Actor();
        actor.nombre = "Sandra Oh";

        greysAnatomy.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Ellen Pompeo";

        greysAnatomy.actores.add(actor);

        Director director = new Director();
        director.nombre = "Shonda";

        temporada = new Temporada();
        temporada.setNumero(1);

        episodio = new Episodio();
        episodio.setNombre("A Hard Day's Night");
        episodio.setNumero(1);

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio();
        episodio.setNombre("The First Cut is the Deepest");
        episodio.setNumero(2);

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio();
        episodio.setNombre("Winning a Battle, Losing the War");
        episodio.setNumero(3);

        temporada.getEpisodios().add(episodio);

        greysAnatomy.temporadas.add(temporada);

        temporada = new Temporada();
        temporada.setNumero(2);

        episodio = new Episodio();
        episodio.setNombre("Deny, Deny, Deny");
        episodio.setNumero(4);

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio();
        episodio.setNombre("Bring the Pain");
        episodio.setNumero(5);

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio();
        episodio.setNombre("Into You Like a Train");
        episodio.setNumero(6);

        temporada.getEpisodios().add(episodio);

        greysAnatomy.temporadas.add(temporada);

        this.series.add(greysAnatomy); // IMPORTARTE//

        Serie peakyBlinders = new Serie();
        peakyBlinders.nombre = "Peaky Blinders";
        peakyBlinders.añoLanzamiento = 2013;

        actor = new Actor();
        actor.nombre = "Cillian Murphy";
        peakyBlinders.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Helen McCrory";
        peakyBlinders.actores.add(actor);

        temporada = new Temporada();
        temporada.setNumero(1);

        episodio = new Episodio();
        episodio.setNombre("Episodio 1");
        episodio.setNumero(1);

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio();
        episodio.setNombre("Episodio 2");
        episodio.setNumero(2);

        temporada.getEpisodios().add(episodio);

        peakyBlinders.temporadas.add(temporada);
        this.series.add(peakyBlinders);

    }

    // Buscar Serie
    public Serie buscarSerie(String nombreABuscar) {

        // series = | serie1 | serie2 | serie25 | serie40 |
        // vamos a usar el foreach: que sirve para recorrer listas
        // este ciclo, tiene una variable, qeu apunta en cada vuelta
        // a cada elemento de la lista
        // o sea la primer vez, va a apuntar a serie1, despues a serie2 ddesp
        // serie25 hasta que termina.
        for (Serie serie : this.series) {
            // pregunto si el nombre de la serie actual
            // que estoy recorriendo es la que necesito
            if (serie.nombre.equals(nombreABuscar))
                return serie; // devuelvo esta serie.
        }
        // si llego hasta aca, es porque no encontro la serie.
        return null;

    }

    // buscar un director
    //
}
