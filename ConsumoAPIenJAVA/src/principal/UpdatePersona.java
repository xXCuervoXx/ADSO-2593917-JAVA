
package principal;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;


public class UpdatePersona extends javax.swing.JFrame {
    public Persona listaPersona[];
    public UpdatePersona() {
        
        this.listaPersona = listaPersona;
        initComponents();
        initAlternComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        campo_cedulaBuscar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campo_apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODIFICAR USUARIO");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CEDULA A BUSCAR:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRES:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("APELLIDOS:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("TELEFONO:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DIRECCION:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("EMAIL:");

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(campo_cedulaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                            .addComponent(btn_buscar)
                            .addGap(31, 31, 31))
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campo_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                            .addComponent(campo_apellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_telefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_direccion, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(71, 71, 71)
                .addComponent(jButton1)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_cedulaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modificarPersona();
        listaPersonas ventana = new listaPersonas();
        setVisible(false);
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buscarPersona();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listaPersonas ventana = new listaPersonas();
        setVisible(false);
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void buscarPersona(){
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        String cedulaBuscar =campo_cedulaBuscar.getText();
        
        Map<String, String> getData = new HashMap<>();
        getData.put("cedula", cedulaBuscar);
        String respuestaAll = ejemplo.consumoGET("http://localhost/APIenPHP/getPersona.php",getData);
        JsonObject persona = gson.fromJson(respuestaAll, JsonObject.class);
        
        String cedula = persona.get("cedula").getAsString();
        String nombres = persona.get("nombres").getAsString();
        String apellidos = persona.get("apellidos").getAsString();
        String telefono = persona.get("telefono").getAsString();
        String direccion = persona.get("direccion").getAsString();
        String email = persona.get("email").getAsString();
        campo_cedulaBuscar.setText(cedula);
        campo_nombre.setText(nombres);
        campo_apellido.setText(apellidos);
        campo_telefono.setText(telefono);
        campo_direccion.setText(direccion);
        campo_email.setText(email);
    }
    public void modificarPersona(){
        ConsumoAPI ejemplo = new ConsumoAPI();
        String cedula = campo_cedulaBuscar.getText();
        String nombres = campo_nombre.getText();
        String apellidos = campo_apellido.getText();
        String telefono = campo_telefono.getText();
        String direccion = campo_direccion.getText();
        String email = campo_email.getText();
        Map<String, String> updateData = new HashMap<>();
        updateData.put("cedula", cedula);
        updateData.put("nombres", nombres);
        updateData.put("apellidos", apellidos);
        updateData.put("telefono", telefono);
        updateData.put("direccion", direccion);
        updateData.put("email", email);
        System.out.println("Consumo UPDATE: " + ejemplo.consumoPOST("http://localhost/APIenPHP/Update.php", updateData));
    }
        

    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setTitle("UPDATE");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_cedulaBuscar;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
