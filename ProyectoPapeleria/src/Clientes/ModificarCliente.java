
package Clientes;

import Clases.Cliente;
import Clases.Producto;
import Producto.MenuProducto;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectopapeleria.Menu;

public class ModificarCliente extends javax.swing.JFrame {
    Menu ventana;
    MenuCliente ventanaMenu;
    private Cliente listaCliente[];
    DefaultTableModel modelo;
    int guardar_id;
    public ModificarCliente(MenuCliente ventanaMenu) {
        this.ventanaMenu=ventanaMenu;
        this.ventana=ventana;
        this.listaCliente=this.ventanaMenu.database.listaCliente();
        this.guardar_id=guardar_id;
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        containerBuscar = new javax.swing.JPanel();
        etq_cedula = new javax.swing.JLabel();
        campo_cedulaBuscar = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        etq_nombres = new javax.swing.JLabel();
        campo_nombres = new javax.swing.JTextField();
        campo_apellidos = new javax.swing.JTextField();
        etq_apellidos = new javax.swing.JLabel();
        etq_direccion = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        campo_email = new javax.swing.JTextField();
        etq_email = new javax.swing.JLabel();
        etq_telefono = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();
        btn_atras = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campo_clientesRegistrados = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etq_title.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        etq_title.setForeground(new java.awt.Color(0, 0, 0));
        etq_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_title.setText("Modificar Cliente");

        containerBuscar.setBackground(new java.awt.Color(204, 204, 204));
        containerBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etq_cedula.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_cedula.setForeground(new java.awt.Color(0, 0, 0));
        etq_cedula.setText("Cedula:");

        campo_cedulaBuscar.setBackground(new java.awt.Color(255, 255, 255));
        campo_cedulaBuscar.setForeground(new java.awt.Color(0, 0, 0));

        btn_Buscar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Buscar.setText("Buscar");
        btn_Buscar.setFocusable(false);
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerBuscarLayout = new javax.swing.GroupLayout(containerBuscar);
        containerBuscar.setLayout(containerBuscarLayout);
        containerBuscarLayout.setHorizontalGroup(
            containerBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerBuscarLayout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(etq_cedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_cedulaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );
        containerBuscarLayout.setVerticalGroup(
            containerBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerBuscarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(containerBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_cedula)
                    .addComponent(campo_cedulaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        etq_nombres.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_nombres.setForeground(new java.awt.Color(0, 0, 0));
        etq_nombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nombres.setText("Nombres:");

        campo_nombres.setBackground(new java.awt.Color(204, 204, 204));
        campo_nombres.setForeground(new java.awt.Color(0, 0, 0));
        campo_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombresActionPerformed(evt);
            }
        });

        campo_apellidos.setBackground(new java.awt.Color(204, 204, 204));
        campo_apellidos.setForeground(new java.awt.Color(0, 0, 0));

        etq_apellidos.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_apellidos.setForeground(new java.awt.Color(0, 0, 0));
        etq_apellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_apellidos.setText("Apellidos:");

        etq_direccion.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_direccion.setForeground(new java.awt.Color(0, 0, 0));
        etq_direccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_direccion.setText("Direccion:");

        campo_direccion.setBackground(new java.awt.Color(204, 204, 204));
        campo_direccion.setForeground(new java.awt.Color(0, 0, 0));

        campo_email.setBackground(new java.awt.Color(204, 204, 204));
        campo_email.setForeground(new java.awt.Color(0, 0, 0));

        etq_email.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_email.setForeground(new java.awt.Color(0, 0, 0));
        etq_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_email.setText("Email:");

        etq_telefono.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(0, 0, 0));
        etq_telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_telefono.setText("Telefono:");

        campo_telefono.setBackground(new java.awt.Color(204, 204, 204));
        campo_telefono.setForeground(new java.awt.Color(0, 0, 0));

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
        jScrollPane1.setViewportView(tabla_datos);

        btn_atras.setBackground(new java.awt.Color(204, 204, 204));
        btn_atras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_atras.setForeground(new java.awt.Color(0, 0, 0));
        btn_atras.setText("Atras");
        btn_atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_atras.setFocusable(false);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(204, 204, 204));
        btn_modificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(0, 0, 0));
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_modificar.setFocusable(false);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Clientes Registrados:");

        campo_clientesRegistrados.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_nombres)
                    .addComponent(etq_nombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(campo_direccion))
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_apellidos)
                    .addComponent(etq_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campo_email)
                    .addComponent(etq_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(180, 180, 180))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(containerBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(363, 363, 363))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_clientesRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etq_title, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_title)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campo_clientesRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombres)
                    .addComponent(etq_apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_direccion)
                    .addComponent(etq_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etq_telefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(12, 12, 12))
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

    private void campo_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombresActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        String nombres = campo_nombres.getText();
        String apellidos = campo_apellidos.getText();
        String direccion = campo_direccion.getText();
        String email = campo_email.getText();
        String telefono = campo_telefono.getText();
        
        
        Cliente temporal = new Cliente (this.guardar_id, nombres, apellidos, direccion, email, telefono);
        
        if(!nombres.equals("") && !apellidos.equals("") && !direccion.equals("") && !email.equals("")&&!telefono.equals("")){
            boolean proceso = this.ventanaMenu.database.editarCliente(temporal);
            JOptionPane.showMessageDialog(this, "Cliente modificado con EXITO");
            mostrarDatosCliente();
        }else{
            JOptionPane.showMessageDialog(this, "ERROR todos los campos son obligatorios");
            campo_nombres.setText("");
            campo_apellidos.setText("");
            campo_direccion.setText("");
            campo_email.setText("");
            campo_telefono.setText("");
            campo_nombres.requestFocus();
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        this.guardar_id = Integer.parseInt(campo_cedulaBuscar.getText());
        
        Cliente temporal = (this.ventanaMenu.database.buscarCliente(this.guardar_id));
        
        if(temporal!=null){
            campo_nombres.setText(temporal.getNombres());
            campo_apellidos.setText(temporal.getApellidos());
            campo_direccion.setText(temporal.getDireccion());
            campo_email.setText(temporal.getEmail());
            campo_telefono.setText(temporal.getTelefono());
            containerBuscar.setBackground(Color.blue);
            btn_modificar.setEnabled(true);
            
        }else{
            JOptionPane.showMessageDialog(this, "NO existe ningun producto con ese id");
            campo_cedulaBuscar.setText("");
            containerBuscar.setBackground(Color.red);
            campo_nombres.setText("");
            campo_apellidos.setText("");
            campo_direccion.setText("");
            campo_email.setText("");
            campo_telefono.setText("");
            btn_modificar.setEnabled(false);
        }
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed
    public void initAlternComponents(){
        this.modelo= (DefaultTableModel) this.tabla_datos.getModel();
        campo_nombres.setEnabled(false);
        campo_apellidos.setEnabled(false);
        campo_direccion.setEnabled(false);
        campo_email.setEnabled(false);
        campo_telefono.setEnabled(false);
        campo_clientesRegistrados.setEnabled(false);
        setLocationRelativeTo(null);
        setTitle("Modificar Cliente");
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("Icons/papeleria.png") ) );
        mostrarDatosCliente();
        btn_modificar.setEnabled(false);
    }
    public void mostrarDatosCliente(){
        this.listaCliente = this.ventanaMenu.database.listaCliente();
        this.modelo.setRowCount(0);
        for(int i = 0; i < this.listaCliente.length; i++){
            if(this.listaCliente[i]!=null){
                String entero = String.valueOf(i+1);
                campo_clientesRegistrados.setText(entero);
                Object temporal [] = {this.listaCliente[i].getCedula(), this.listaCliente[i].getNombres(), this.listaCliente[i].getApellidos(), this.listaCliente[i].getDireccion(), this.listaCliente[i].getEmail(), this.listaCliente[i].getTelefono()};
                this.modelo.addRow(temporal);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_cedulaBuscar;
    private javax.swing.JTextField campo_clientesRegistrados;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JPanel containerBuscar;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_email;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla_datos;
    // End of variables declaration//GEN-END:variables
}
