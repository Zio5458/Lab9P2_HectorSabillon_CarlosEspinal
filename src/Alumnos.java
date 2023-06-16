
import java.util.ArrayList;


public class Alumnos {
    
    private String nombre;
    private String cuenta;
    private String contra;
    private String carrera;
    private boolean becado;
    private int indice;
    private double descuento;
    private int aprobadas;
    private ArrayList<Asignatura> actuales;

    public Alumnos(String nombre, String cuenta, String contra, String carrera, boolean becado, int indice, double descuento, int aprobadas, ArrayList<Asignatura> actuales) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.contra = contra;
        this.carrera = carrera;
        this.becado = becado;
        this.indice = indice;
        this.descuento = descuento;
        this.aprobadas = aprobadas;
        this.actuales = actuales;
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
        return nombre + ", " + cuenta;
    }
    
    
    
}
