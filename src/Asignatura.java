
import java.util.ArrayList;


public class Asignatura {
    
    private String nombre;
    private String cod_asignatura;
    private String cod_seccion;
    private String horario;
    private Maestro docente;
    private int uv;
    private int aula;
    private int edificio;
    private ArrayList<Alumnos> alumnos;
    private String modalidad;
    private String dias;

    public Asignatura(String nombre, String cod_asignatura, String cod_seccion, String horario, int uv, int aula, int edificio, String modalidad, String dias) {
        this.nombre = nombre;
        this.cod_asignatura = cod_asignatura;
        this.cod_seccion = cod_seccion;
        this.horario = horario;
        this.uv = uv;
        this.aula = aula;
        this.edificio = edificio;
        this.modalidad = modalidad;
        this.dias = dias;
    }
    
    

    public Asignatura(String nombre, String cod_asignatura, String cod_seccion, String horario, Maestro docente, int uv, int aula, int edificio, ArrayList<Alumnos> alumnos, String modalidad, String dias) {
        this.nombre = nombre;
        this.cod_asignatura = cod_asignatura;
        this.cod_seccion = cod_seccion;
        this.horario = horario;
        this.docente = docente;
        this.uv = uv;
        this.aula = aula;
        this.edificio = edificio;
        this.alumnos = alumnos;
        this.modalidad = modalidad;
        this.dias = dias;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCod_asignatura() {
        return cod_asignatura;
    }

    public void setCod_asignatura(String cod_asignatura) {
        this.cod_asignatura = cod_asignatura;
    }

    public String getCod_seccion() {
        return cod_seccion;
    }

    public void setCod_seccion(String cod_seccion) {
        this.cod_seccion = cod_seccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Maestro getDocente() {
        return docente;
    }

    public void setDocente(Maestro docente) {
        this.docente = docente;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return nombre + ", " + cod_asignatura;
    }

    
    
}
