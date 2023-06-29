
package Producto;

import Clases.Producto;
import javax.swing.JOptionPane;
import proyectopapeleria.Menu;
import java.sql.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;


public class RegistroProducto extends javax.swing.JFrame {
    Menu ventana;
    MenuProducto ventanaMenu;
    DefaultTableModel modelo;
    private Producto listaProducto[];
    public RegistroProducto(MenuProducto ventanaMenu) {
        this.ventana=ventana;
        this.ventanaMenu=ventanaMenu;
        this.listaProducto=this.ventanaMenu.database.listaProducto();
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registro Producto");
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        etq_title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etq_producto = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        etq_cantidad = new javax.swing.JLabel();
        campo_cantidad = new javax.swing.JTextField();
        etq_precio = new javax.swing.JLabel();
        campo_precio = new javax.swing.JTextField();
        etq_costo = new javax.swing.JLabel();
        campo_costo = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        scroll_datos = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etq_title.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        etq_title.setForeground(new java.awt.Color(0, 0, 0));
        etq_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_title.setText("Registro Producto");

        etq_producto.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_producto.setForeground(new java.awt.Color(0, 0, 0));
        etq_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_producto.setText("Nombre Producto:");

        campo_nombre.setBackground(new java.awt.Color(204, 204, 204));
        campo_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etq_cantidad.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_cantidad.setForeground(new java.awt.Color(0, 0, 0));
        etq_cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_cantidad.setText("Cantidad Inventario:");

        campo_cantidad.setBackground(new java.awt.Color(204, 204, 204));
        campo_cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_cantidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etq_precio.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_precio.setForeground(new java.awt.Color(0, 0, 0));
        etq_precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_precio.setText("Costo:");

        campo_precio.setBackground(new java.awt.Color(204, 204, 204));
        campo_precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_precio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etq_costo.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_costo.setForeground(new java.awt.Color(0, 0, 0));
        etq_costo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_costo.setText("Precio:");

        campo_costo.setBackground(new java.awt.Color(204, 204, 204));
        campo_costo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_costo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_registrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar.setText("Registrar");
        btn_registrar.setFocusable(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setFocusable(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tabla_datos.setBackground(new java.awt.Color(255, 255, 255));
        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "PRODUCTO", "CANT. INVENTARIO", "COSTO", "PRECIO"
            }
        ));
        scroll_datos.setViewportView(tabla_datos);

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_title, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(etq_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorPrincipalLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(campo_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campo_cantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(etq_precio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etq_cantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_datos, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etq_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(etq_producto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(etq_cantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_precio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_costo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scroll_datos, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String nombre = campo_nombre.getText();
        String cant = campo_cantidad.getText();
        String precioo = campo_precio.getText();
        String costoo = campo_costo.getText();
        
        int cantidad = Integer.parseInt(cant);
        int precio = Integer.parseInt(precioo);
        int costo = Integer.parseInt(costoo);
        
        if(!nombre.equals("")&&!cant.equals("")&&!precioo.equals("")&&!costoo.equals("")){
            boolean proceso = this.ventanaMenu.database.insertarProductos(nombre, cantidad, precio, costo);
            JOptionPane.showMessageDialog(this, "Se ha registrado el producto con EXITO!");
            campo_nombre.setText("");
            campo_cantidad.setText("");
            campo_precio.setText("");
            campo_costo.setText("");
            campo_nombre.requestFocus();
        }else{
            JOptionPane.showMessageDialog(this, "ERROR, todos los campos son obligatorios");
        }
        mostrarDatosProducto();
        
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed
    public void initAlternComponents(){
        this.modelo= (DefaultTableModel) this.tabla_datos.getModel();
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("Icons/papeleria.png") ) );
        mostrarDatosProducto();
        
    }
    public void mostrarDatosProducto(){
        this.listaProducto = this.ventanaMenu.database.listaProducto();
        this.modelo.setRowCount(0);
        for(int i = 0; i < this.listaProducto.length; i++){
            if(this.listaProducto[i]!=null){
                Object temporal [] = {this.listaProducto[i].getId(), this.listaProducto[i].getNombre(), this.listaProducto[i].getCantidad(), this.listaProducto[i].getValorU(), this.listaProducto[i].getPrecio()};
                this.modelo.addRow(temporal);
            }
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JTextField campo_cantidad;
    private javax.swing.JTextField campo_costo;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_precio;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JLabel etq_cantidad;
    private javax.swing.JLabel etq_costo;
    private javax.swing.JLabel etq_precio;
    private javax.swing.JLabel etq_producto;
    private javax.swing.JLabel etq_title;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JScrollPane scroll_datos;
    private javax.swing.JTable tabla_datos;
    // End of variables declaration//GEN-END:variables
}
