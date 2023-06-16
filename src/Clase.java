
import java.util.ArrayList;


public class Clase extends Asignatura {
    
    private double precio;

    public Clase(double precio, String nombre, String cod_asignatura, String cod_seccion, String horario, Maestro docente, int uv, int aula, int edificio, ArrayList<Alumnos> alumnos, String modalidad, String dias) {
        super(nombre, cod_asignatura, cod_seccion, horario, docente, uv, aula, edificio, alumnos, modalidad, dias);
        this.precio = precio;
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
