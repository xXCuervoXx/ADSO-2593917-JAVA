
package Producto;

import Clases.ButtonEditor;
import Clases.ButtonRenderer;
import Clases.Producto;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectopapeleria.Menu;

public class EliminarProducto extends javax.swing.JFrame {

    Menu ventana;
    MenuProducto ventanaMenu;
    private Producto listaProducto[];
    public JCheckBox eliminar[];
    public EliminarProducto(MenuProducto ventanaMenu) {
        this.ventana=ventana;
        this.ventanaMenu=ventanaMenu;
        this.listaProducto = this.ventanaMenu.database.listaProducto();
        this.eliminar=new JCheckBox[listaProducto.length];
        initComponents();
        initAlternComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etq_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();
        btn_salir = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etq_title.setFont(new java.awt.Font("SimSun-ExtB", 0, 36)); // NOI18N
        etq_title.setForeground(new java.awt.Color(0, 0, 0));
        etq_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/basura (2).png"))); // NOI18N
        etq_title.setText("Eliminar Producto");

        tabla_datos.setBackground(new java.awt.Color(255, 255, 255));
        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PRODUCTO", "CANT. INVENTARIO", "COSTO", "PRECIO", "SELECCIONAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_datos);

        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
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

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        for(int i = 0; i < this.listaProducto.length; i++){
            if(this.listaProducto[i]!=null){
                if(eliminar[i].isSelected()){
                    int aux = i;
                    boolean temp = this.ventanaMenu.database.eliminarProducto(aux+1);
                    JOptionPane.showMessageDialog(this, "ERROR, todos los campos son obligatorios");
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Ningun campo fue seleccionado");
                }
                
            }
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed
    
    
    public void initAlternComponents(){
        
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("Icons/papeleria.png") ) );
        
        mostrarDatosProducto();
        this.tabla_datos.getColumn("SELECCIONAR").setCellRenderer(new ButtonRenderer());
        this.tabla_datos.getColumn("SELECCIONAR").setCellEditor(new ButtonEditor(new JCheckBox()));
        
       
        
    }
    
    public void mostrarDatosProducto(){
         DefaultTableModel modelo = new DefaultTableModel();
         modelo.addColumn("ID");
         modelo.addColumn("PRODUCTO");
         modelo.addColumn("CANT.INVENTARIO");
         modelo.addColumn("COSTO");
         modelo.addColumn("PRECIO");
         modelo.addColumn("SELECCIONAR");
         tabla_datos.setModel(modelo);
        this.listaProducto = this.ventanaMenu.database.listaProducto();
        modelo.setRowCount(0);
        
        
        
        for(int i = 0; i < this.listaProducto.length; i++){
            if(this.listaProducto[i]!=null){
                eliminar[i] = new JCheckBox("Eliminar");
                Object temporal [] = new Object[] {this.listaProducto[i].getId(), this.listaProducto[i].getNombre(), this.listaProducto[i].getCantidad(), this.listaProducto[i].getValorU(), this.listaProducto[i].getPrecio(),this.eliminar[i]};
                modelo.addRow(temporal);
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etq_title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla_datos;
    // End of variables declaration//GEN-END:variables
}
