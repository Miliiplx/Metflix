public class Pelicula extends Contenido {

    // LOS CONSTRUCTORES NO SE HEREDAN. ENTONCES DEBO CREAR UNO QUE LLAME AL
    // COSTRUCTOR DE LA CLASE MAPADRE

    public Pelicula(String nombre, int añoLanzamiento) {
        super(nombre, añoLanzamiento);
    }

    // PUEDO CREAR OTRO CONSTRUCTOR QUE INCLUYA LA DURACION DE LA PELICULA. ENTONCES
    // PUEDO USAR UNO U
    // OTRO CONSTRUCTOR SIN QUE ME DE ERROR.

    public Pelicula(String nombre, int añoLanzamiento, int duracion) {
        super(nombre, añoLanzamiento);
        this.duracion = duracion;
    }

    private int duracion; // en minutos
    private Director director;
    private boolean filmadaEnIMAX;

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Director getDirector() {
        return this.director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public boolean getFilmadaEnIMAX() {
        return this.filmadaEnIMAX;
    }

    public void setFilmadaEnIMAX(boolean filmadaEnIMAX) {
        this.filmadaEnIMAX = filmadaEnIMAX;
    }
}
