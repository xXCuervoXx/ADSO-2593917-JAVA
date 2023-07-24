package Compra;

import Clases.Cliente;
import Clases.Database;
import Clases.Producto;
import Clases.Productos;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import proyectopapeleria.Menu;

public class RegistroCompra extends javax.swing.JFrame {
    RegistroCompra ventanaMenu;
    Database database;
    Menu ventana;
    DefaultTableModel modelo;
    private Cliente listaCliente[];
    private Producto listaProducto[];
    private String guardarProducto;
    private int guardarPrecio;
    int guardar_id;
    private Productos productos[];
    int i;
    int guardar_producto;
    int contClicks;
    String cliente;
    int valor;
    public RegistroCompra(Menu ventana) {
        this.guardarProducto = "";
        this.guardarPrecio = 0;
        this.ventanaMenu=ventanaMenu;
        this.ventana=ventana;
        this.database= new Database();
        this.listaCliente= this.database.listaCliente();
        this.listaProducto=this.database.listaProducto();
        this.productos= new Productos[100];
        this.guardar_id=guardar_id;
        this.guardar_producto=guardar_producto;
        this.i=i;
        this.cliente=cliente;
        this.contClicks=contClicks;
        this.valor=valor;
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
        btn_buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campo_apellidos = new javax.swing.JTextField();
        campo_nombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        campo_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campo_cant = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_buscarProducto = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        scroll_lista = new javax.swing.JScrollPane();
        contenedor_productos = new javax.swing.JPanel();
        btn_facturar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FACTURA");

        jLabel2.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cedula Cliente:");

        btn_buscar.setText("Buscar");
        btn_buscar.setFocusable(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombres:");

        campo_apellidos.setBackground(new java.awt.Color(255, 255, 255));
        campo_apellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campo_apellidos.setForeground(new java.awt.Color(0, 0, 0));
        campo_apellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_apellidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campo_nombres.setBackground(new java.awt.Color(255, 255, 255));
        campo_nombres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campo_nombres.setForeground(new java.awt.Color(0, 0, 0));
        campo_nombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_nombres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Direccion:");

        campo_direccion.setBackground(new java.awt.Color(255, 255, 255));
        campo_direccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campo_direccion.setForeground(new java.awt.Color(0, 0, 0));
        campo_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_direccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Email:");

        campo_email.setBackground(new java.awt.Color(255, 255, 255));
        campo_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campo_email.setForeground(new java.awt.Color(0, 0, 0));
        campo_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Telefono:");

        campo_telefono.setBackground(new java.awt.Color(255, 255, 255));
        campo_telefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campo_telefono.setForeground(new java.awt.Color(0, 0, 0));
        campo_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ID:");

        jLabel9.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Producto:");

        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Cantidad:");

        campo_cant.setText("1");

        btn_agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.setFocusable(false);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_buscarProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_buscarProducto.setText("Buscar");
        btn_buscarProducto.setFocusable(false);
        btn_buscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarProducto_buscarProductoActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setFocusable(false);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        scroll_lista.setBackground(new java.awt.Color(255, 255, 255));
        scroll_lista.setForeground(new java.awt.Color(0, 0, 0));

        contenedor_productos.setBackground(new java.awt.Color(255, 255, 255));
        contenedor_productos.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contenedor_productosLayout = new javax.swing.GroupLayout(contenedor_productos);
        contenedor_productos.setLayout(contenedor_productosLayout);
        contenedor_productosLayout.setHorizontalGroup(
            contenedor_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );
        contenedor_productosLayout.setVerticalGroup(
            contenedor_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );

        scroll_lista.setViewportView(contenedor_productos);

        btn_facturar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_facturar.setText("Facturar");
        btn_facturar.setFocusable(false);
        btn_facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(211, 211, 211)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(30, 30, 30)
                                        .addComponent(campo_cedulaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(143, 143, 143))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_buscarProducto))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scroll_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campo_cedulaBuscar)
                                .addComponent(jLabel2))
                            .addComponent(btn_buscar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscarProducto))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(65, 65, 65)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scroll_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_facturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1196, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarProducto_buscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarProducto_buscarProductoActionPerformed
        String texto = campo_id.getText();
        boolean encontrado = false;
        if (!texto.equals("")) {
            for (int i=0; i<this.listaProducto.length; i++) {
                if(this.listaProducto[i]!=null && this.listaProducto[i].getId()==Integer.valueOf(texto) ){
                    this.campo_nombre.setText( this.listaProducto[i].getNombre() );
                    encontrado = true;
                    this.guardarProducto = this.listaProducto[i].getNombre();
                    this.guardarPrecio = this.listaProducto[i].getPrecio();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btn_buscarProducto_buscarProductoActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        this.guardar_id = Integer.valueOf(campo_cedulaBuscar.getText());
        String nombres="";
        String apellidos="";
        String direccion="";
        String email="";
        String telefono="";
        int aux = 0;
        boolean encontrado = false;
        for(int i = 0; i<this.listaCliente.length;i++){
            if(this.listaCliente[i]!=null){
                if(this.listaCliente[i].getCedula()==this.guardar_id){
                    encontrado = true;
                    nombres=this.listaCliente[i].getNombres();
                    apellidos=this.listaCliente[i].getApellidos();
                    direccion=this.listaCliente[i].getDireccion();
                    email=this.listaCliente[i].getEmail();
                    telefono=this.listaCliente[i].getTelefono();
                    aux=i;
                }
            }
        }
        if(encontrado!=false){
            campo_nombres.setText(this.listaCliente[aux].getNombres());
            campo_apellidos.setText(this.listaCliente[aux].getApellidos());
            campo_direccion.setText(this.listaCliente[aux].getDireccion());
            campo_email.setText(this.listaCliente[aux].getEmail());
            campo_telefono.setText(this.listaCliente[aux].getTelefono());
            campo_nombres.setBackground(Color.white);
            campo_apellidos.setBackground(Color.white);
            campo_direccion.setBackground(Color.white);
            campo_email.setBackground(Color.white);
            campo_telefono.setBackground(Color.white);
            System.out.println("Emcontrado");
        }else{
            campo_nombres.setBackground(Color.red);
            campo_apellidos.setBackground(Color.red);
            campo_direccion.setBackground(Color.red);
            campo_email.setBackground(Color.red);
            campo_telefono.setBackground(Color.red);
            campo_nombres.setText("");
            campo_apellidos.setText("");
            campo_direccion.setText("");
            campo_email.setText("");
            campo_telefono.setText("");
            campo_cedulaBuscar.requestFocus();
            
        }
        revalidate();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

        String id = campo_id.getText();
        String product = campo_nombre.getText();
        int cant = Integer.valueOf(campo_cant.getText());
        int precio = 0;
        
        this.guardar_producto=Integer.valueOf(campo_id.getText());
        for(int i = 0; i < this.listaProducto.length;i++){
            if(this.listaProducto[i]!=null){
                if(this.listaProducto[i].getId()==this.guardar_producto){
                    precio = this.listaProducto[i].getPrecio();
                    this.valor = cant*precio;
                    
                }
            }
        }
            
        JLabel cosas = new JLabel("ID      PRODUCTO      CANTIDAD");
        JLabel productos = new JLabel("->"+id+" - "+product+" - "+cant+" - "+valor);
        Font letra = new Font("Arial", Font.BOLD, 15);
        cosas.setFont(letra);
        productos.setFont(letra);
        contenedor_productos.add(productos);
        this.scroll_lista.revalidate();
        String cliente = campo_nombres.getText();
        Date fechaActual = new Date(Calendar.getInstance().getTimeInMillis());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        String fecha = formato.format(fechaActual);
        Productos temp = new Productos(id,cliente, product, cant, valor, fecha);
        this.productos[this.i]=temp;
        i++;
            
        for(int i = 0; i<this.productos.length;i++){
            if(this.productos[i]!=null){
                System.out.println(this.productos[i]);
            }
        }
        System.out.println("->"+id+" - "+product+" - "+cant+" - "+precio);
        campo_id.setText("");
        campo_nombre.setText("");
        this.contClicks++;
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed

    private void btn_facturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturarActionPerformed
        String nombreCliente = campo_nombres.getText();
        int id2=0;
        String nombre = "";
        int cant = 0;
        int precio = 0;
        String date = "";
        
        for(int i = 0; i < this.contClicks;i++){
            if(this.productos[i]!=null){
               
                System.out.println(" - "+nombreCliente+" - "+this.productos[i].getId()+" - "+this.productos[i].getNombre()+" - "+this.productos[i].getCant()+" - "+this.productos[i].getPrecio()+" - "+date);
                String id = this.productos[i].getId();
                id2 = Integer.valueOf(this.productos[i].getId());
                nombre = this.productos[i].getNombre();
                cant = this.productos[i].getCant();
                precio = this.productos[i].getPrecio();
                date = this.productos[i].getFecha();
                boolean proceso = this.database.insertarItems(nombreCliente,id,nombre,cant, valor, date);
                
            
            }
            for(int j = 0; j < this.listaProducto.length; j++){
                if(this.listaProducto[j]!=null){
                    int comparador = Integer.valueOf(this.listaProducto[j].getId());
                    if(comparador==id2){
                        int resta = this.listaProducto[j].getCantidad()-cant;
                        int costo = this.listaProducto[j].getValorU();
                        if(resta>=0){
                            Producto temporal = new Producto (id2, nombre, resta,costo, precio);
                            boolean cambio = this.database.editarProducto2(temporal);
                        }else{
                            JOptionPane.showMessageDialog(this, "ERROR no hay suficientes cantidades de "+nombre+"  en el inventario");
                        }
                        
                    }
                }
            }
                
        }
        this.ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_facturarActionPerformed

    public void initAlternComponents(){
        setTitle("Factura");
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("Icons/papeleria.png") ) );
        campo_nombres.setEnabled(false);
        campo_apellidos.setEnabled(false);
        campo_direccion.setEnabled(false);
        campo_email.setEnabled(false);
        campo_telefono.setEnabled(false);
        contenedor_productos.setLayout( new BoxLayout(contenedor_productos, BoxLayout.Y_AXIS) );
        contenedor_productos.setBackground(Color.WHITE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscarProducto;
    private javax.swing.JButton btn_facturar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_cant;
    private javax.swing.JTextField campo_cedulaBuscar;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_id;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JPanel contenedor_productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JScrollPane scroll_lista;
    // End of variables declaration//GEN-END:variables
}
