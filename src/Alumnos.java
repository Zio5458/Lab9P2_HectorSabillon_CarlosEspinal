
import java.util.ArrayList;


public class Alumnos {
    
    
    private String carrera;
    private boolean becado;
    private int indice;
    private double descuento;
    private int aprobadas;
    private ArrayList<Asignatura> actuales;

    public Alumnos(String carrera, boolean becado, int indice, double descuento, int aprobadas, ArrayList<Asignatura> actuales) {
        this.carrera = carrera;
        this.becado = becado;
        this.indice = indice;
        this.descuento = descuento;
        this.aprobadas = aprobadas;
        this.actuales = actuales;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getAprobadas() {
        return aprobadas;
    }

    public void setAprobadas(int aprobadas) {
        this.aprobadas = aprobadas;
    }

    public ArrayList<Asignatura> getActuales() {
        return actuales;
    }

    public void setActuales(ArrayList<Asignatura> actuales) {
        this.actuales = actuales;
    }

    @Override
    public String toString() {
        return super.toString();
    }

   
    
}
