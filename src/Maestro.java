
import java.util.ArrayList;


public class Maestro extends Usuario {
    

    private String nacionalidad;
    private String titulo;
    private ArrayList<Asignatura> clases;

    public Maestro(String nacionalidad, String titulo, ArrayList<Asignatura> clases, String nombre, String cuenta, String contra) {
        super(nombre, cuenta, contra);
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.clases = clases;
    }

    public Maestro(String nacionalidad, String titulo, String nombre, String cuenta, String contra) {
        super(nombre, cuenta, contra);
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
    }

    

    
    
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Asignatura> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Asignatura> clases) {
        this.clases = clases;
        
        
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
