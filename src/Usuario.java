
public class Usuario {
    
    private String nombre;
    private String cuenta;
    private String contra;

    public Usuario(String nombre, String cuenta, String contra) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.contra = contra;
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

    @Override
    public String toString() {
        return nombre + ", " + contra;
    }
    
    
    
}
