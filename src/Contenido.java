import java.util.ArrayList;
import java.util.List;

public class Contenido {
    public String nombre;
    public Genero genero;
    //Idioma Origne
    public Idioma idiomaOrigen;
    public int añoLanzamiento;
    public List<Actor> actores = new ArrayList<>();

    //LISTA DIRECTORES

    public List<Director> directores = new ArrayList<>();

    public Director buscarDirector(String nombre){
        for (Director director: this.directores){
            if(director.nombre.equals(nombre)){ //si esto es verdadero, encontre la temporada
                return director;
            }
            
        }
        return null;
    }

}
