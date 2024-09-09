
public class Alumno {
    // atributos
    private String codigo;
    private String nombre;
    private int creditos;
    private String estado;
    
    //metodos
    Alumno(String codigo){
        this.codigo = codigo;
        this.creditos = 0;
        this.estado = "REGULAR";
    }
    
    Alumno (String codigo, String nombre){
        this(codigo);
        this.nombre = nombre;
    }     

    @Override
    public String toString() {
        return  "codigo=" + codigo + "\nnombre=" + nombre + "\ncreditos=" + creditos + "\nestado=" + estado ;
    }
    
    
    
    public void matricular(String curso){};

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void addCreditos(int creditos) {
        this.creditos += creditos;
    }

    public String getEstado() {
        return estado;
    }

    public void reservarMatricula() {
        this.estado = "RESERVADO";
    }
    
    public void activarMatricula() {
        this.estado = "REGULAR";
    }
    
    
}
