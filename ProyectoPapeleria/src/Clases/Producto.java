
package Clases;


public class Producto {
    private int id;
    private String nombre;
    private int cantidad;
    private int valorU;
    private int precio;

    public Producto(int id,String nombre, int cantidad, int valorU, int precio) {
        this.id=id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valorU = valorU;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValorU() {
        return valorU;
    }

    public void setValorU(int valorU) {
        this.valorU = valorU;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
