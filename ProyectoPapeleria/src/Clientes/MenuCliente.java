
package Clientes;

import Clases.Cliente;
import Clases.Database;
import Clases.Producto;
import javax.swing.table.DefaultTableModel;
import proyectopapeleria.Menu;


public class MenuCliente extends javax.swing.JFrame {

    MenuCliente ventanaMenu;
    public Database database;
    Menu ventana;
    DefaultTableModel modelo;
    private Cliente listaCliente[];
    public MenuCliente(Menu ventana) {
        this.ventanaMenu=ventanaMenu;
        this.ventana=ventana;
        this.database= new Database();
        this.listaCliente= this.database.listaCliente();
        initComponents();
        initAlternComponents();
        setLocationRelativeTo(null);
    }
    public void initAlternComponents(){
        setTitle("Producto");
        campo_clientesRegistrados.setEnabled(false);
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("Icons/papeleria.png") ) );
        this.modelo=(DefaultTableModel) this.tabla_datos.getModel();
        mostrarClientes();
    }
    public void mostrarClientes(){
        this.listaCliente = this.database.listaCliente();
        this.modelo.setRowCount(0);
        for(int i = 0; i < this.listaCliente.length; i++){
            if(this.listaCliente[i]!=null){
                String entero = String.valueOf(i+1);
                campo_clientesRegistrados.setText(entero);
                Object temporal [] = {this.listaCliente[i].getCedula(), this.listaCliente[i].getNombres(), this.listaCliente[i].getApellidos(), this.listaCliente[i].getDireccion(), this.listaCliente[i].getEmail(),this.listaCliente[i].getTelefono()};
                this.modelo.addRow(temporal);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        etq_title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_registroCliente = new javax.swing.JButton();
        btn_modificarCliente = new javax.swing.JButton();
        btn_EliminarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campo_clientesRegistrados = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();
        btn_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        etq_title.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        etq_title.setForeground(new java.awt.Color(0, 0, 0));
        etq_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_title.setText("Menu Cliente");
        etq_title.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/caja (1).png"))); // NOI18N

        btn_registroCliente.setBackground(new java.awt.Color(255, 255, 255));
        btn_registroCliente.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btn_registroCliente.setForeground(new java.awt.Color(0, 0, 0));
        btn_registroCliente.setText("Registrar Cliente");
        btn_registroCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_registroCliente.setFocusable(false);
        btn_registroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroClienteActionPerformed(evt);
            }
        });

        btn_modificarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btn_modificarCliente.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btn_modificarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btn_modificarCliente.setText("Modificar Cliente");
        btn_modificarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_modificarCliente.setFocusable(false);
        btn_modificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarClienteActionPerformed(evt);
            }
        });

        btn_EliminarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btn_EliminarCliente.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btn_EliminarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btn_EliminarCliente.setText("Eliminar Cliente");
        btn_EliminarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_EliminarCliente.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Clientes Registrados:");

        campo_clientesRegistrados.setBackground(new java.awt.Color(255, 255, 255));
        campo_clientesRegistrados.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_title, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_registroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btn_modificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btn_EliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_clientesRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(284, 284, 284)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(etq_title, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_registroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campo_clientesRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        tabla_datos.setBackground(new java.awt.Color(255, 255, 255));
        tabla_datos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombres", "Apellidos", "Direccion", "Email", "Telefono"
            }
        ));
        tabla_datos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabla_datos);

        btn_volver.setBackground(new java.awt.Color(204, 204, 204));
        btn_volver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(0, 0, 0));
        btn_volver.setText("Volver al Menu principal");
        btn_volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_volver.setFocusable(false);
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroClienteActionPerformed
        setVisible(false);
        CrearUsuario ventana = new CrearUsuario(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_registroClienteActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        this.ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_modificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarClienteActionPerformed
        setVisible(false);
        ModificarCliente ventana = new ModificarCliente(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_modificarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_EliminarCliente;
    private javax.swing.JButton btn_modificarCliente;
    private javax.swing.JButton btn_registroCliente;
    private javax.swing.JButton btn_volver;
    private javax.swing.JTextField campo_clientesRegistrados;
    private javax.swing.JLabel etq_title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_datos;
    // End of variables declaration//GEN-END:variables
}
