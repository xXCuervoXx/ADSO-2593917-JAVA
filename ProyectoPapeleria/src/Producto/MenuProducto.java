
package Producto;

import proyectopapeleria.Menu;
import Clases.Database;
import Clases.Producto;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MenuProducto extends javax.swing.JFrame {

    MenuProducto ventanaMenu;
    public Database database;
    Menu ventana;
    DefaultTableModel modelo;
    private Producto listaProducto[];
    public MenuProducto(Menu ventana) {
        
        this.ventanaMenu=ventanaMenu;
        this.ventana=ventana;
        this.database= new Database();
        this.listaProducto= this.database.listaProducto();
        initComponents();
        initAlternComponent();
        setLocationRelativeTo(null);
        
    }
    
    public void initAlternComponent(){
        setTitle("Producto");
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("Icons/papeleria.png") ) );
        this.modelo=(DefaultTableModel) this.tabla_productos.getModel();
        mostrarProductos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        contenedorSecundario = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        etq_title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_RegistrarProducto = new javax.swing.JButton();
        btn_ModificarProducto = new javax.swing.JButton();
        btn_EliminarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        btn_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        contenedorSecundario.setBackground(new java.awt.Color(204, 204, 204));
        contenedorSecundario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        icon1.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/caja (1).png"))); // NOI18N

        etq_title.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        etq_title.setForeground(new java.awt.Color(0, 0, 0));
        etq_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_title.setText("Menu Producto");
        etq_title.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btn_RegistrarProducto.setBackground(new java.awt.Color(255, 255, 255));
        btn_RegistrarProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_RegistrarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btn_RegistrarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/registro-en-linea (1).png"))); // NOI18N
        btn_RegistrarProducto.setText("Registrar Producto");
        btn_RegistrarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_RegistrarProducto.setFocusable(false);
        btn_RegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarProductoActionPerformed(evt);
            }
        });

        btn_ModificarProducto.setBackground(new java.awt.Color(255, 255, 255));
        btn_ModificarProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ModificarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btn_ModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar (1).png"))); // NOI18N
        btn_ModificarProducto.setText("Modificar Producto");
        btn_ModificarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ModificarProducto.setFocusable(false);
        btn_ModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarProductoActionPerformed(evt);
            }
        });

        btn_EliminarProducto.setBackground(new java.awt.Color(255, 255, 255));
        btn_EliminarProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_EliminarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btn_EliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/basura (2).png"))); // NOI18N
        btn_EliminarProducto.setText("Eliminar Producto");
        btn_EliminarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_EliminarProducto.setFocusable(false);
        btn_EliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorSecundarioLayout = new javax.swing.GroupLayout(contenedorSecundario);
        contenedorSecundario.setLayout(contenedorSecundarioLayout);
        contenedorSecundarioLayout.setHorizontalGroup(
            contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                        .addComponent(icon1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorSecundarioLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
            .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btn_RegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(btn_ModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(btn_EliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        contenedorSecundarioLayout.setVerticalGroup(
            contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_RegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tabla_productos.setBackground(new java.awt.Color(255, 255, 255));
        tabla_productos.setForeground(new java.awt.Color(255, 255, 255));
        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Cantidad Inventario", "Precio Unidad", "Costo"
            }
        ));
        tabla_productos.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tabla_productos);

        btn_atras.setBackground(new java.awt.Color(204, 204, 204));
        btn_atras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_atras.setForeground(new java.awt.Color(0, 0, 0));
        btn_atras.setText("Volver A Menu Principal");
        btn_atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_atras.setFocusable(false);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(401, 401, 401))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_atras)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        contenedorSecundario.getAccessibleContext().setAccessibleName("");

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

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.ventana.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_RegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarProductoActionPerformed
        setVisible(false);
        RegistroProducto ventana = new RegistroProducto(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_RegistrarProductoActionPerformed

    private void btn_ModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarProductoActionPerformed
        setVisible(false);
        ModificarProducto ventana = new ModificarProducto(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_ModificarProductoActionPerformed

    private void btn_EliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarProductoActionPerformed
        setVisible(false);
        EliminarProducto ventana = new EliminarProducto(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_EliminarProductoActionPerformed
    public void mostrarProductos(){
        this.listaProducto = this.database.listaProducto();
        this.modelo.setRowCount(0);
        for(int i = 0; i < this.listaProducto.length; i++){
            if(this.listaProducto[i]!=null){
                Object temporal [] = {this.listaProducto[i].getId(), this.listaProducto[i].getNombre(), this.listaProducto[i].getCantidad(), this.listaProducto[i].getValorU(), this.listaProducto[i].getPrecio()};
                this.modelo.addRow(temporal);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_EliminarProducto;
    private javax.swing.JButton btn_ModificarProducto;
    private javax.swing.JButton btn_RegistrarProducto;
    private javax.swing.JButton btn_atras;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JPanel contenedorSecundario;
    private javax.swing.JLabel etq_title;
    private javax.swing.JLabel icon1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla_productos;
    // End of variables declaration//GEN-END:variables
}
