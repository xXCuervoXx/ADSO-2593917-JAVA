package Producto;


import Producto.MenuProducto;
import Clases.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectopapeleria.Menu;


public class ModificarProducto extends javax.swing.JFrame {
    Menu ventana;
    MenuProducto ventanaMenu;
    private Producto listaProducto[];
    DefaultTableModel modelo;
    int guardar_id;
    public ModificarProducto(MenuProducto ventanaMenu) {
        this.ventanaMenu=ventanaMenu;
        this.ventana=ventana;
        this.listaProducto=this.ventanaMenu.database.listaProducto();
        this.guardar_id=guardar_id;
        initComponents();
        initAlternComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        contentPrincipal = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        scroll_datos = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();
        etq_title = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        etq_idBuscar = new javax.swing.JLabel();
        campo_idBuscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        etq_producto = new javax.swing.JLabel();
        campo_producto = new javax.swing.JTextField();
        etq_cantidad = new javax.swing.JLabel();
        campo_cantidad = new javax.swing.JTextField();
        etq_costo = new javax.swing.JLabel();
        campo_costo = new javax.swing.JTextField();
        etq_precio = new javax.swing.JLabel();
        campo_precio = new javax.swing.JTextField();
        btn_modificar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tabla_datos.setBackground(new java.awt.Color(255, 255, 255));
        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "CANTIDAD", "COSTO", "PRECIO"
            }
        ));
        scroll_datos.setViewportView(tabla_datos);

        etq_title.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        etq_title.setForeground(new java.awt.Color(0, 0, 0));
        etq_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_title.setText("Modificar Producto");

        etq_idBuscar.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        etq_idBuscar.setForeground(new java.awt.Color(0, 0, 0));
        etq_idBuscar.setText("ID:");

        campo_idBuscar.setBackground(new java.awt.Color(204, 204, 204));
        campo_idBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_buscar.setText("Buscar");
        btn_buscar.setFocusable(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etq_producto.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_producto.setForeground(new java.awt.Color(0, 0, 0));
        etq_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_producto.setText("Producto:");

        campo_producto.setBackground(new java.awt.Color(204, 204, 204));
        campo_producto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etq_cantidad.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_cantidad.setForeground(new java.awt.Color(0, 0, 0));
        etq_cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_cantidad.setText("Cantidad:");

        campo_cantidad.setBackground(new java.awt.Color(204, 204, 204));
        campo_cantidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etq_costo.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_costo.setForeground(new java.awt.Color(0, 0, 0));
        etq_costo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_costo.setText("Costo:");

        campo_costo.setBackground(new java.awt.Color(204, 204, 204));
        campo_costo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etq_precio.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_precio.setForeground(new java.awt.Color(0, 0, 0));
        etq_precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_precio.setText("Precio:");

        campo_precio.setBackground(new java.awt.Color(204, 204, 204));
        campo_precio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_modificar.setBackground(new java.awt.Color(255, 255, 255));
        btn_modificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(0, 0, 0));
        btn_modificar.setText("Modificar");
        btn_modificar.setFocusable(false);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setFocusable(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                                .addComponent(etq_idBuscar)
                                .addGap(7, 7, 7)
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(campo_idBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_buscar)))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                                .addComponent(campo_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator3))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(etq_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etq_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etq_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etq_costo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etq_precio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campo_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etq_idBuscar)
                            .addComponent(campo_idBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar))
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etq_producto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etq_cantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etq_costo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etq_precio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scroll_datos))
                .addContainerGap())
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_title)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        String nombre = campo_producto.getText();
        String cantidad2 = campo_cantidad.getText();
        String costo2 = campo_costo.getText();
        String precio2 = campo_precio.getText();
        
        int cantidad = Integer.parseInt(campo_cantidad.getText());
        int costo = Integer.parseInt(campo_costo.getText());
        int precio = Integer.parseInt(campo_precio.getText());
        Producto temporal = new Producto (this.guardar_id,nombre,cantidad,costo,precio);
        
        if(!nombre.equals("") && !cantidad2.equals("") && !costo2.equals("") && !precio2.equals("")){
            boolean proceso = this.ventanaMenu.database.editarProducto(temporal);
            JOptionPane.showMessageDialog(this, "Producto modificado con EXITO");
            mostrarDatosProducto();
        }else{
            JOptionPane.showMessageDialog(this, "ERROR todos los campos son obligatorios");
            campo_producto.setText("");
            campo_cantidad.setText("");
            campo_costo.setText("");
            campo_precio.setText("");
            campo_producto.requestFocus();
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        this.guardar_id = Integer.parseInt(campo_idBuscar.getText());
        if(campo_idBuscar.equals("")){
            campo_idBuscar.setText("");
            campo_producto.setText("");
            campo_cantidad.setText("");
            campo_costo.setText("");
            campo_precio.setText("");
        }
        
        
        
        Producto temporal = (this.ventanaMenu.database.buscarProducto(this.guardar_id));
        
        if(temporal!=null){
            campo_producto.setText(temporal.getNombre());
            String cantidad = String.valueOf(temporal.getCantidad());
            campo_cantidad.setText(cantidad);
            String costo = String.valueOf(temporal.getValorU());
            campo_costo.setText(costo);
            String precio = String.valueOf(temporal.getPrecio());
            campo_precio.setText(precio);
            btn_modificar.setEnabled(true);
            
        }else{
            JOptionPane.showMessageDialog(this, "NO existe ningun producto con ese id");
            campo_idBuscar.setText("");
            btn_modificar.setEnabled(false);
            campo_producto.setText("");
            campo_cantidad.setText("");
            campo_costo.setText("");
            campo_precio.setText("");
            
        }
        revalidate();
    }//GEN-LAST:event_btn_buscarActionPerformed
    public void initAlternComponents(){
        this.modelo= (DefaultTableModel) this.tabla_datos.getModel();
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("Icons/papeleria.png") ) );
        mostrarDatosProducto();
        btn_modificar.setEnabled(false);
        
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
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JTextField campo_cantidad;
    private javax.swing.JTextField campo_costo;
    private javax.swing.JTextField campo_idBuscar;
    private javax.swing.JTextField campo_precio;
    private javax.swing.JTextField campo_producto;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etq_cantidad;
    private javax.swing.JLabel etq_costo;
    private javax.swing.JLabel etq_idBuscar;
    private javax.swing.JLabel etq_precio;
    private javax.swing.JLabel etq_producto;
    private javax.swing.JLabel etq_title;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JScrollPane scroll_datos;
    private javax.swing.JTable tabla_datos;
    // End of variables declaration//GEN-END:variables
}
