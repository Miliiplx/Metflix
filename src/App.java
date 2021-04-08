public class App {
    public static void main(String[] args) throws Exception {
        // A partir de Metflix, buscar la temporada 5 episodio 1 de la serie
        // How I met your mother y
        // reproducir el episodio.

        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo();// Estoy llamando al metodo que crea las pelis y series.

        Serie serieBuscada = miMetflix.buscarSerie("Grey's Anatomy");

        Temporada temporada = serieBuscada.buscarTemporada(2);

        Episodio episodio = temporada.buscarEpisodio(4);

        episodio.reproducir();

        // System.out.println("Nombre del director: " director.nombre);

        // ahora quiero imprimir un cartel que diga:
        // que lo que se acaba de reproducir arriba es un
        // websodio o un episodio.
        // pero en un print aparte.
        if (episodio instanceof Websodio) {
            System.out.println("El episodio era un websodio");
        } else {
            System.out.println("Es un episodio");
        }

        // Ahora quiero que si es un Websodio, imprima el Link del websodio.
        if (episodio instanceof Websodio) {
            // Castear: es el proceso donde "desenmascaramos" a una variable.
            Websodio websodio = (Websodio) episodio;
            System.out.println("El link del websodio es: " + websodio.getLink());
        }

    }
}
