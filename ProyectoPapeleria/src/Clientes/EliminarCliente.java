
package Clientes;

import Clases.ButtonEditor;
import Clases.ButtonRenderer;
import Clases.Cliente;
import Clases.Producto;
import Clientes.MenuCliente;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectopapeleria.Menu;


public class EliminarCliente extends javax.swing.JFrame {
    Menu ventana;
    MenuCliente ventanaMenu;
    private Cliente listaCliente[];
    public JCheckBox eliminar[];
    public EliminarCliente(MenuCliente ventanaMenu) {
        this.ventana=ventana;
        this.ventanaMenu=ventanaMenu;
        this.listaCliente = this.ventanaMenu.database.listaCliente();
        this.eliminar=new JCheckBox[listaCliente.length];
        initComponents();
        initAlternComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/basura (2).png"))); // NOI18N
        jLabel1.setText("Eliminar Cliente");

        tabla_datos.setBackground(new java.awt.Color(255, 255, 255));
        tabla_datos.setForeground(new java.awt.Color(0, 0, 0));
        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRES", "APELLIDOS", "DIRECCION", "EMAIL", "TELEFONO", "SELECCIONAR"
            }
        ));
        jScrollPane1.setViewportView(tabla_datos);

        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_atras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_atras.setText("Atras");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1056, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(275, 275, 275))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(422, 422, 422))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        for(int i = 0; i < this.listaCliente.length; i++){
            if(this.listaCliente[i]!=null){
                if(eliminar[i].isSelected()){
                    int id = listaCliente[i].getCedula();
                    boolean temp = this.ventanaMenu.database.eliminarCliente(id);
                    
                    
                }
                
            }
        }
        JOptionPane.showMessageDialog(this, "Se ha eliminado correctamente");
        this.ventanaMenu.setVisible(true);
        dispose();
        mostrarDatosCliente();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed
    public void initAlternComponents(){
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("Icons/papeleria.png") ) );
        setLocationRelativeTo(null);
        mostrarDatosCliente();
        this.tabla_datos.getColumn("SELECCIONAR").setCellRenderer(new ButtonRenderer());
        this.tabla_datos.getColumn("SELECCIONAR").setCellEditor(new ButtonEditor(new JCheckBox()));
    }
    public void mostrarDatosCliente(){
        DefaultTableModel modelo = new DefaultTableModel();
         modelo.addColumn("CEDULA");
         modelo.addColumn("NOMBRES");
         modelo.addColumn("APELLIDO");
         modelo.addColumn("DIRECCION");
         modelo.addColumn("EMAIL");
         modelo.addColumn("TELEFONO");
         modelo.addColumn("SELECCIONAR");
         tabla_datos.setModel(modelo);
        this.listaCliente = this.ventanaMenu.database.listaCliente();
        modelo.setRowCount(0);
         for(int i = 0; i < this.listaCliente.length; i++){
            if(this.listaCliente[i]!=null){
                eliminar[i] = new JCheckBox("Eliminar");
                Object temporal [] = new Object[] {this.listaCliente[i].getCedula(), this.listaCliente[i].getNombres(), this.listaCliente[i].getApellidos(), this.listaCliente[i].getDireccion(), this.listaCliente[i].getEmail(), this.listaCliente[i].getTelefono(), this.eliminar[i]};
                modelo.addRow(temporal);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla_datos;
    // End of variables declaration//GEN-END:variables
}
