
package Compra;

import Clases.Database;
import Clases.Productos;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import proyectopapeleria.Menu;

public class Total extends javax.swing.JFrame {

    Total ventanaMenu;
    Database database;
    Menu ventana;
    private Productos productos[];
    JLabel product;
    public Total(Menu ventana) {
        this.ventanaMenu=ventanaMenu;
        this.ventana=ventana;
        this.database=new Database();
        this.productos=this.database.listaItems();
        initComponents();
        initAlternComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        scrollLista = new javax.swing.JScrollPane();
        contentLista = new javax.swing.JPanel();
        ElegirFecha = new com.toedter.calendar.JDateChooser();
        btn_buscar = new javax.swing.JButton();
        campo_total = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btn_salir = new javax.swing.JButton();
        total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Ventas");

        javax.swing.GroupLayout contentListaLayout = new javax.swing.GroupLayout(contentLista);
        contentLista.setLayout(contentListaLayout);
        contentListaLayout.setHorizontalGroup(
            contentListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        contentListaLayout.setVerticalGroup(
            contentListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        scrollLista.setViewportView(contentLista);

        btn_buscar.setText("Buscar");
        btn_buscar.setFocusable(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        campo_total.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        campo_total.setForeground(new java.awt.Color(0, 0, 0));
        campo_total.setText("Total venta: ");

        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setFocusable(false);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        total.setBackground(new java.awt.Color(0, 0, 0));
        total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(ElegirFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btn_buscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(scrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campo_total)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ElegirFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(32, 32, 32)
                .addComponent(scrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(campo_total)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)))
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        this.product=new JLabel("");
        btn_buscar.setEnabled(false);
        ElegirFecha.setEnabled(false);
        int acum= 0;
        revalidate();
        Date transform = ElegirFecha.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato.format(transform);
        System.out.println(fecha);
        
        if(fecha!=""){
            
            for(int i = 0; i < this.productos.length; i++){
                if(this.productos[i]!=null){
                    String fecha2 = this.productos[i].getFecha();
                    if(fecha2.equals(fecha)){
                        acum = acum+this.productos[i].getPrecio();
                        String acumulador = String.valueOf(acum);
                        total.setText("$"+acumulador);
                        
                        System.out.println("a");
                        this.product = new JLabel("--> "+this.productos[i].getCliente()+" -- "+this.productos[i].getId()+" -- "+this.productos[i].getNombre()+" -- "+this.productos[i].getCant()+" -- "+this.productos[i].getPrecio()+" -- "+this.productos[i].getFecha());
                        contentLista.add(product);
                        this.scrollLista.revalidate();
                    }
                }
                
            }
        }else if(ElegirFecha==null){
            System.out.println("b");
            for(int i = 0; i < this.productos.length; i++){
                if(this.productos[i]!=null){
                    this.product = new JLabel("--> "+this.productos[i].getCliente()+" -- "+this.productos[i].getId()+" -- "+this.productos[i].getNombre()+" -- "+this.productos[i].getCant()+" -- "+this.productos[i].getPrecio()+" -- "+this.productos[i].getFecha());
                    contentLista.add(product);
                    this.scrollLista.revalidate();
                }
            }
        }
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed
    
    public void imprimirLista(){
        
        
    }
    
    
    
    public void initAlternComponents(){
        setTitle("Total Ventas");
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("Icons/papeleria.png") ) );
        contentLista.setLayout( new BoxLayout(contentLista, BoxLayout.Y_AXIS) );
        Date fechaActual = new Date(Calendar.getInstance().getTimeInMillis());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        String fecha = formato.format(fechaActual);
        ElegirFecha.setDate(fechaActual);
        total.setEnabled(false);
        imprimirLista();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser ElegirFecha;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel campo_total;
    private javax.swing.JPanel contentLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JScrollPane scrollLista;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
