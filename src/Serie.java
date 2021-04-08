import java.util.*;

public class Serie extends Contenido {
    private List<Temporada> temporadas = new ArrayList<>();

    public List<Temporada> getTemporadas(){
        return this.temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas){
        this.temporadas = temporadas;
    }

    public Temporada buscarTemporada(int numeroTemporada){
        for (Temporada temporada: this.temporadas){
            if(temporada.getNumero() == numeroTemporada){ //si esto es verdadero, encontre la temporada
                return temporada;
            }
            
        }
        return null;
    }
}
