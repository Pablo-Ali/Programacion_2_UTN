package teoria;

/**
 *
 * @author pablo
 */
public class Persona {
    /*
    Mala práctica:
    
    public String nombre; //cualquiera puede acceder
    protected String apellido; //solo el paquete y sus subclases
    int dni; //solo desde el paquete
    private int edad; //solo desde la clase
    */
    
    //Buena práctica
    
    //atributos
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    
    //constructor
    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }
    
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
