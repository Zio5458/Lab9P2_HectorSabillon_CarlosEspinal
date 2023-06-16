
import java.util.ArrayList;


public class Laboratorio extends Asignatura {
    
    private double precio = 0.036;

    public Laboratorio(String nombre, String cod_asignatura, String cod_seccion, String horario, Maestro docente, int uv, int aula, int edificio, ArrayList<Alumnos> alumnos, String modalidad, String dias) {
        super(nombre, cod_asignatura, cod_seccion, horario, docente, uv, aula, edificio, alumnos, modalidad, dias);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
