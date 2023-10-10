
package principal;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DeletePersona extends javax.swing.JFrame {

    public JCheckBox eliminar[];
    public Persona listaPersonas[];
    DefaultTableModel modelo;
    public DeletePersona() {
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        
        String respuestaAll = ejemplo.consumoGET("http://localhost/APIenPHP/Obtener.php");
        JsonObject objetoRespuesta = JsonParser.parseString(respuestaAll).getAsJsonObject();
        
        JsonArray arregloPersonas = objetoRespuesta.get("registros").getAsJsonArray();
        listaPersonas = new Persona [ arregloPersonas.size()];
        for(int i = 0; i < arregloPersonas.size(); i++){
            Persona temp = gson.fromJson(arregloPersonas.get(i).getAsJsonObject(), Persona.class);
            listaPersonas[i] = temp;

        }
        this.eliminar=new JCheckBox[listaPersonas.length];
        initComponents();
        initAlternComponents();
    }
    
    public void MostrarDatosPersona(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CEDULA");
        modelo.addColumn("NOMBRES");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("EMAIL");
        modelo.addColumn("SELECCIONAR");
        tabla_datos.setModel(modelo);
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        
        String respuestaAll = ejemplo.consumoGET("http://localhost/APIenPHP/Obtener.php");
        JsonObject objetoRespuesta = JsonParser.parseString(respuestaAll).getAsJsonObject();
        
        JsonArray arregloPersonas = objetoRespuesta.get("registros").getAsJsonArray();
        listaPersonas = new Persona [ arregloPersonas.size()];
        for(int i = 0; i < arregloPersonas.size(); i++){
            Persona temp = gson.fromJson(arregloPersonas.get(i).getAsJsonObject(), Persona.class);
            listaPersonas[i] = temp;

        }
        
        for(int i = 0; i<this.listaPersonas.length;i++){
            if(this.listaPersonas[i]!=null){
                
                System.out.println(listaPersonas[i].getNombres()+"Eliminar");
                this.eliminar[i] = new JCheckBox("Eliminar");
                Object temporal [] = new Object[] {this.listaPersonas[i].getCedula(), this.listaPersonas[i].getNombres(), this.listaPersonas[i].getApellidos(), this.listaPersonas[i].getTelefono(), this.listaPersonas[i].getDireccion(), this.listaPersonas[i].getEmail(), this.eliminar[i]};
                modelo.addRow(temporal);
            }
        }
    }
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        this.modelo=(DefaultTableModel) this.tabla_datos.getModel();
        MostrarDatosPersona();
        this.tabla_datos.getColumn("SELECCIONAR").setCellRenderer(new ButtonRenderer());
        this.tabla_datos.getColumn("SELECCIONAR").setCellEditor(new ButtonEditor(new JCheckBox()));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
                "CEDULA", "NOMBRES", "APELLIDOS", "TELEFONO", "DIRECCION", "EMAIL", "SELECCIONAR"
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 251, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        
        String respuestaAll = ejemplo.consumoGET("http://localhost/APIenPHP/Obtener.php");
        JsonObject objetoRespuesta = JsonParser.parseString(respuestaAll).getAsJsonObject();
        
        JsonArray arregloPersonas = objetoRespuesta.get("registros").getAsJsonArray();
        this.listaPersonas = new Persona [ arregloPersonas.size()];
        for(int i = 0; i < arregloPersonas.size(); i++){
            Persona temp = gson.fromJson(arregloPersonas.get(i).getAsJsonObject(), Persona.class);
            this.listaPersonas[i] = temp;

        }
        for(int i = 0; i < this.listaPersonas.length; i++){
            if(this.listaPersonas[i]!=null){
                if(this.eliminar[i].isSelected()){
                    String cedula = listaPersonas[i].getCedula();
                    Map<String, String> deleteData = new HashMap<>();
                    deleteData.put("cedula", cedula);
                    System.out.println("Consumo DELETE: " + ejemplo.consumoPOST("http://localhost/APIenPHP/Delete.php", deleteData));
                    
                }
                
            }
        }
        JOptionPane.showMessageDialog(this, "Se ha eliminado correctamente");
        listaPersonas ventana = new listaPersonas();
        ventana.setVisible(true);
        dispose();
        MostrarDatosPersona();
    }//GEN-LAST:event_btn_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla_datos;
    // End of variables declaration//GEN-END:variables
}
