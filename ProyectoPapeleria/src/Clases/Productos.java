
package Clases;


public class Productos {
    private String id;
    private String cliente;
    private String nombre;
    private int cant;
    private int precio;
    private String fecha;

    public Productos(String id,String cliente, String nombre, int cant, int precio, String fecha) {
        this.id = id;
        this.cliente=cliente;
        this.nombre = nombre;
        this.cant = cant;
        this.precio = precio;
        this.fecha=fecha;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public void setCliente(){
        this.cliente = cliente;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

    
    
}
