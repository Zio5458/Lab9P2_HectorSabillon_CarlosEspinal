
import java.util.ArrayList;


public class Maestro {
    
    private String nombre;
    private String cuenta;
    private String contra;
    private String nacionalidad;
    private String titulo;
    private ArrayList<Asignatura> clases;

    public Maestro(String nombre, String cuenta, String contra, String nacionalidad, String titulo, ArrayList<Asignatura> clases) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.contra = contra;
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.clases = clases;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
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
        return nombre + ", " + cuenta;
    }
    
    
    
}
