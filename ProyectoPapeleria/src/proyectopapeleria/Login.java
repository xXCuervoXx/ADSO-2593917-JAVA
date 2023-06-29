
package proyectopapeleria;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Papeleria");
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentTitle = new javax.swing.JPanel();
        etq_title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_usuario = new javax.swing.JTextField();
        iconUser = new javax.swing.JLabel();
        iconPassword = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();
        btn_inicioSesion = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentTitle.setBackground(new java.awt.Color(255, 255, 255));

        etq_title.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        etq_title.setForeground(new java.awt.Color(0, 0, 0));
        etq_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_title.setText("LOGIN");

        javax.swing.GroupLayout contentTitleLayout = new javax.swing.GroupLayout(contentTitle);
        contentTitle.setLayout(contentTitleLayout);
        contentTitleLayout.setHorizontalGroup(
            contentTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentTitleLayout.setVerticalGroup(
            contentTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentTitleLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(etq_title)
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txt_usuario.setBackground(new java.awt.Color(204, 204, 204));
        txt_usuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        iconUser.setBackground(new java.awt.Color(255, 51, 51));
        iconUser.setForeground(new java.awt.Color(204, 204, 204));
        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Users-User-icon (1).png"))); // NOI18N

        iconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/iconoContraseña (1).png"))); // NOI18N

        txt_contraseña.setBackground(new java.awt.Color(204, 204, 204));
        txt_contraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_inicioSesion.setBackground(new java.awt.Color(255, 255, 255));
        btn_inicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_inicioSesion.setForeground(new java.awt.Color(0, 0, 0));
        btn_inicioSesion.setText("Iniciar Sesion");
        btn_inicioSesion.setFocusable(false);
        btn_inicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioSesionActionPerformed(evt);
            }
        });

        btn_Salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_Salir.setText("Salir");
        btn_Salir.setFocusable(false);
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(iconPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(iconUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_inicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_contraseña))
                .addGap(38, 38, 38)
                .addComponent(btn_inicioSesion)
                .addGap(8, 8, 8)
                .addComponent(btn_Salir)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_inicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioSesionActionPerformed
        String usuario ="Admin123";
        String contraseña="Admin123";
        String user = txt_usuario.getText();
        String pass = new String(txt_contraseña.getPassword());
        
        if(txt_usuario.getText().equals(usuario)&& pass.equals(contraseña)){
            Menu ventana = new Menu();
            ventana.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Usuario / Contraseña incorrecto");
            txt_usuario.setText("");
            txt_contraseña.setText("");
            txt_usuario.requestFocus();;
        }
    }//GEN-LAST:event_btn_inicioSesionActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed
    
    public void initAlternComponents(){
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("Icons/papeleria.png") ) );
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_inicioSesion;
    private javax.swing.JPanel contentTitle;
    private javax.swing.JLabel etq_title;
    private javax.swing.JLabel iconPassword;
    private javax.swing.JLabel iconUser;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
