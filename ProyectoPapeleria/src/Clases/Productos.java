
package Clases;


public class Productos {
    private String id;
    private String nombre;
    private int cant;
    private int precio;

    public Productos(String id, String nombre, int cant, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.cant = cant;
        this.precio = precio;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public void setPrecio(int precio){
        this.precio = precio;
    }

    
    
}
