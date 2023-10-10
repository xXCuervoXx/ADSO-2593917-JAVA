
package pokeapi;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class MenuApi extends javax.swing.JFrame {


    public MenuApi() {
        initComponents();
        initAlternComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuScroll = new javax.swing.JPanel();
        panel_paginador = new javax.swing.JPanel();
        panel_info = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pokemon API");

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        menuScroll.setBackground(new java.awt.Color(255, 255, 255));
        menuScroll.setLayout(new javax.swing.BoxLayout(menuScroll, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menuScroll);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel_paginador.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout panel_paginadorLayout = new javax.swing.GroupLayout(panel_paginador);
        panel_paginador.setLayout(panel_paginadorLayout);
        panel_paginadorLayout.setHorizontalGroup(
            panel_paginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_paginadorLayout.setVerticalGroup(
            panel_paginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        panel_info.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel_infoLayout = new javax.swing.GroupLayout(panel_info);
        panel_info.setLayout(panel_infoLayout);
        panel_infoLayout.setHorizontalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_infoLayout.setVerticalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panel_paginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_paginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    public void mostrarBotones(){
        ConsumoAPI ejemplo = new ConsumoAPI();
        
        // GET sin datos
        String respuestaAll =ejemplo.consumoGET("https://pokeapi.co/api/v2/pokemon");
        JsonObject objetoRespuesta = JsonParser.parseString(respuestaAll).getAsJsonObject();
        
        JsonArray result = objetoRespuesta.get("results").getAsJsonArray();
        for(int i = 0; i<result.size();i++){
            JsonObject temporal = result.get(i).getAsJsonObject();
            JButton btn = new JButton(temporal.get("name").getAsString());
            btn.setBackground(Color.white);
            btn.setPreferredSize(new Dimension(149,btn.getPreferredSize().height));
            btn.setFocusable(false);
            btn.setMaximumSize(new Dimension(149,btn.getPreferredSize().height));
            
            btn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    mostrarPokemons(temporal.get("url").getAsString());
                }
            });
            menuScroll.add(btn);
        }
        
        
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuApi().setVisible(true);
            }
        });
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setTitle("PokeApi");
        mostrarBotones();
    }
    public void mostrarPokemons(String url){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menuScroll;
    private javax.swing.JPanel panel_info;
    private javax.swing.JPanel panel_paginador;
    // End of variables declaration//GEN-END:variables
}
