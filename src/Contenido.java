import java.util.ArrayList;
import java.util.List;

public class Contenido {
    private String nombre;
    private Genero genero;
    //Idioma Origne
    private Idioma idiomaOrigen;
    private int añoLanzamiento;
    private List<Actor> actores = new ArrayList<>();

    //LISTA DIRECTORES

    private List<Director> directores = new ArrayList<>();

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Genero getGenero(){
        return this.genero;
    }

    public void setGenero(Genero genero){
        this.genero = genero;
    }

    public Idioma getIdiomaOrigen(){
        return this.idiomaOrigen;
    }

    public void setIdiomaOrigen(Idioma idiomaOrigen){
        this.idiomaOrigen = idiomaOrigen;
    }

    public int getAñoLanzamiento(){
        return this.añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento){
        this.añoLanzamiento = añoLanzamiento;
    }

    public List<Actor> getActores(){
        return this.actores;
    }

    public void setActores(List<Actor> actores){
        this.actores = actores;
    }

    public List<Director> getDirectores(){
        return this.directores;
    }

    public void setDirectores(List<Director> directores){
        this.directores = directores;
    }




    public Director buscarDirector(String nombre){
        for (Director director: this.directores){
            if(director.getNombre().equals(nombre)){ //si esto es verdadero, encontre la temporada
                return director;
            }
            
        }
        return null;
    }

}
