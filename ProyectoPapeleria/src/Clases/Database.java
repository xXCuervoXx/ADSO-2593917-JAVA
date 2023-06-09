
package Clases;

import java.sql.*;

public class Database {
    
    Statement manipularDB;
    
    public Database(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "db_papeleria";
        String database_user = "root";
        String database_password = "";
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try{
            Connection conexion = DriverManager.getConnection(url, database_user, database_password);
            this.manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa a: "+database_name);
        }catch(SQLException e){
            System.out.println("Error en conexion: "+e.getMessage());
            this.manipularDB = null;
        }
    }
    
    public boolean insertarProductos(String nombre,int cantidad, int precio, int costo){
        String consulta = "INSERT INTO productos (nombre, cantidad, precio, costo) VALUES ('"+nombre+"','"+cantidad+"','"+costo+"','"+precio+"')";
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    public Producto [] listaProducto(){
        Producto [] listaProducto = new Producto[100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM productos");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Producto temp = new Producto(registros.getInt("id"), registros.getString("nombre"), registros.getInt("cantidad"),registros.getInt("costo"),registros.getInt("precio"));
                    listaProducto[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaProducto;
        }catch (SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaProducto;
        }
    }
    public Producto buscarProducto(int id){
        Producto temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM productos WHERE id='"+id+"' ");
            registros.next();
            if (registros.getRow()==1){
                temp = new Producto (registros.getInt("id"),registros.getString("nombre"),registros.getInt("cantidad"),registros.getInt("costo"),registros.getInt("precio"));
            }
            return temp;
        }catch (SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    public boolean editarProducto(Producto temp){
        boolean respuesta = false;
        int id = temp.getId();
        String nombre = temp.getNombre();
        int cantidad = temp.getCantidad();
        int costo = temp.getValorU();
        int precio = temp.getPrecio();
        
        try {
            String consulta = "UPDATE productos SET nombre='"+nombre+"',cantidad='"+cantidad+"',costo='"+costo+"',precio='"+precio+"' WHERE id='"+id+"' ";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        }catch (SQLException e){
            System.out.println("Error en UPDATE: "+e.getMessage());
        }
        return respuesta;
    }
    public boolean eliminarProducto(int id){
        boolean respuesta = false;
        try {
            String consulta = "DELETE FROM productos WHERE id='"+id+"'";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("--> Error Delete: " + e.getMessage());
        }
        return respuesta;
    }
}
