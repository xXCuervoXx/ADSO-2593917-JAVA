
package proyectopapeleria;

import Clientes.MenuCliente;
import Compra.Devolucion;
import Compra.RegistroCompra;
import Compra.Total;
import Producto.MenuProducto;


public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        initAlternComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        etq_title = new javax.swing.JLabel();
        iconRegistroProducto = new javax.swing.JLabel();
        btn_RegistroCliente = new javax.swing.JButton();
        iconRegistroCliente = new javax.swing.JLabel();
        btn_RegistroProducto = new javax.swing.JButton();
        iconRegistroCompra = new javax.swing.JLabel();
        btn_RegistroCompra = new javax.swing.JButton();
        icon_ventaDelDia = new javax.swing.JLabel();
        btn_total = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etq_title.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        etq_title.setForeground(new java.awt.Color(0, 0, 0));
        etq_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_title.setText("PAPELERIA");

        iconRegistroProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/IconRegistrarProducto.png"))); // NOI18N

        btn_RegistroCliente.setBackground(new java.awt.Color(204, 204, 204));
        btn_RegistroCliente.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        btn_RegistroCliente.setForeground(new java.awt.Color(0, 0, 0));
        btn_RegistroCliente.setText("Cliente");
        btn_RegistroCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_RegistroCliente.setFocusable(false);
        btn_RegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistroClienteActionPerformed(evt);
            }
        });

        iconRegistroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/descarga.png"))); // NOI18N

        btn_RegistroProducto.setBackground(new java.awt.Color(204, 204, 204));
        btn_RegistroProducto.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        btn_RegistroProducto.setForeground(new java.awt.Color(0, 0, 0));
        btn_RegistroProducto.setText("Producto");
        btn_RegistroProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_RegistroProducto.setFocusable(false);
        btn_RegistroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistroProductoActionPerformed(evt);
            }
        });

        iconRegistroCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/caja-registradora (1).png"))); // NOI18N

        btn_RegistroCompra.setBackground(new java.awt.Color(204, 204, 204));
        btn_RegistroCompra.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        btn_RegistroCompra.setForeground(new java.awt.Color(0, 0, 0));
        btn_RegistroCompra.setText("Compra");
        btn_RegistroCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_RegistroCompra.setFocusable(false);
        btn_RegistroCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistroCompraActionPerformed(evt);
            }
        });

        icon_ventaDelDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/verificar (1).png"))); // NOI18N

        btn_total.setBackground(new java.awt.Color(204, 204, 204));
        btn_total.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        btn_total.setForeground(new java.awt.Color(0, 0, 0));
        btn_total.setText("Total");
        btn_total.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_total.setFocusable(false);
        btn_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_totalActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(204, 204, 204));
        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("Salir");
        btn_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir.setFocusable(false);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Devolucion");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addComponent(iconRegistroProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_RegistroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addComponent(iconRegistroCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_RegistroCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addComponent(iconRegistroCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_RegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addComponent(icon_ventaDelDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)))
                .addGap(79, 79, 79))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etq_title)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconRegistroProducto)))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btn_RegistroCliente))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btn_RegistroProducto)))
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btn_RegistroCompra))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon_ventaDelDia)
                            .addComponent(iconRegistroCompra)))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btn_total)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
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

    private void btn_RegistroProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistroProductoActionPerformed
        setVisible(false);
        MenuProducto ventana = new MenuProducto(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_RegistroProductoActionPerformed

    private void btn_RegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistroClienteActionPerformed
        setVisible(false);
        MenuCliente ventana = new MenuCliente(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_RegistroClienteActionPerformed

    private void btn_RegistroCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistroCompraActionPerformed
        setVisible(false);
        RegistroCompra ventana = new RegistroCompra(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_RegistroCompraActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
        
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_totalActionPerformed
        setVisible(false);
        Total ventana = new Total(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_totalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        Devolucion ventana = new Devolucion(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void initAlternComponents(){
        setTitle("Menu");
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("Icons/papeleria.png") ) );
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_RegistroCliente;
    private javax.swing.JButton btn_RegistroCompra;
    private javax.swing.JButton btn_RegistroProducto;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_total;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JLabel etq_title;
    private javax.swing.JLabel iconRegistroCliente;
    private javax.swing.JLabel iconRegistroCompra;
    private javax.swing.JLabel iconRegistroProducto;
    private javax.swing.JLabel icon_ventaDelDia;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
