
package Compra;

import Clases.Database;
import Clases.Producto;
import Clases.Productos;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import proyectopapeleria.Menu;

public class Devolucion extends javax.swing.JFrame {
    Menu ventana;
    Devolucion ventanaMenu;
    Database database;
    private Producto listaProducto[];
    private Productos productos[];
    public Devolucion(Menu ventana) {
        this.ventana=ventana;
        this.ventanaMenu=ventanaMenu;
        this.database= new Database();
        this.listaProducto=this.database.listaProducto();
        this.productos=this.database.listaItems();
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        campo_productoBuscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        campo_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campo_producto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campo_cantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campo_precio = new javax.swing.JTextField();
        btn_aplicar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese el nombre del Producto:");

        btn_buscar.setText("Buscar");
        btn_buscar.setFocusable(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ID:");

        campo_id.setBackground(new java.awt.Color(255, 255, 255));
        campo_id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campo_id.setForeground(new java.awt.Color(0, 0, 0));
        campo_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_id.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Producto:");

        campo_producto.setBackground(new java.awt.Color(255, 255, 255));
        campo_producto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campo_producto.setForeground(new java.awt.Color(0, 0, 0));
        campo_producto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cantidad:");

        campo_cantidad.setBackground(new java.awt.Color(255, 255, 255));
        campo_cantidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campo_cantidad.setForeground(new java.awt.Color(0, 0, 0));
        campo_cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Precio:");

        campo_precio.setBackground(new java.awt.Color(255, 255, 255));
        campo_precio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campo_precio.setForeground(new java.awt.Color(0, 0, 0));
        campo_precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_aplicar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_aplicar.setText("Aplicar");
        btn_aplicar.setFocusable(false);
        btn_aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aplicarActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setFocusable(false);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                                .addComponent(jSeparator1))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(campo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(campo_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(campo_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_productoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscar)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btn_aplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_productoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(campo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(campo_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(campo_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String nombre = campo_productoBuscar.getText();
        for(int i = 0; i < this.listaProducto.length; i++){
            if(this.listaProducto[i]!=null){
                String comparador = this.listaProducto[i].getNombre();
                if(comparador.equalsIgnoreCase(nombre)){
                    campo_id.setText(String.valueOf(this.listaProducto[i].getId()));
                    campo_producto.setText(this.listaProducto[i].getNombre());
                    campo_precio.setText(String.valueOf(this.listaProducto[i].getPrecio()-this.listaProducto[i].getPrecio()-this.listaProducto[i].getPrecio()));
                }
            }
        }
        campo_productoBuscar.setText("");
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aplicarActionPerformed
        String id = campo_id.getText();
        int id2 = Integer.valueOf(id);
        String cliente = "";
        String nombre = campo_producto.getText();
        int cantidad = Integer.valueOf(campo_cantidad.getText());
        int precio = Integer.valueOf(campo_precio.getText());
        int pesos = cantidad*precio;
        int reduccion = pesos-pesos-pesos;
        Date fechaActual = new Date(Calendar.getInstance().getTimeInMillis());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato.format(fechaActual);
        System.out.println(" - "+id+" - "+nombre+" - "+cantidad+" - ");
        for(int i = 0; i < this.listaProducto.length; i++){
            if(this.listaProducto[i]!=null){
                System.out.println("a");
                String aux = String.valueOf(this.listaProducto[i].getId());
                if(aux.equals(id)){
                    System.out.println("b");
                    int restante = this.listaProducto[i].getCantidad()+cantidad;
                    int costo = this.listaProducto[i].getPrecio();
                    int positivo = costo+costo+costo;
                    boolean proceso = this.database.insertarItems(cliente,id,nombre,cantidad, pesos, fecha);
                    Producto temporal = new Producto (id2, nombre, restante,precio, positivo);
                    boolean cambio = this.database.editarProductoDev(temporal);
                }
            }
        }
        this.ventana.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_aplicarActionPerformed
    public void initAlternComponents(){
        setTitle("Devolucion Producto");
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("Icons/papeleria.png") ) );
        campo_producto.setEnabled(false);
        campo_id.setEnabled(false);
        campo_precio.setEnabled(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aplicar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField campo_cantidad;
    private javax.swing.JTextField campo_id;
    private javax.swing.JTextField campo_precio;
    private javax.swing.JTextField campo_producto;
    private javax.swing.JTextField campo_productoBuscar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
