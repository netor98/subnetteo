
package subnetting;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class diseño extends javax.swing.JFrame {
   
    public diseño() {
        initComponents();
        this.setLocationRelativeTo(null);
        alinearTexto();
    }
    
    
    public void alinearTexto(){
        campoID.setHorizontalAlignment(0);
        campoSubredes.setHorizontalAlignment(0);
        totalSubredes.setHorizontalAlignment(0);
        subredesPracticas.setHorizontalAlignment(0);
        subredesTeoricas.setHorizontalAlignment(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        idEtiqueta = new javax.swing.JLabel();
        botonCalcular = new javax.swing.JButton();
        eleccion = new javax.swing.JComboBox<>();
        campoSubredes = new javax.swing.JTextField();
        totalSubredes = new javax.swing.JLabel();
        subredesTeoricas = new javax.swing.JTextField();
        subredesPracticas = new javax.swing.JTextField();
        teoricoSubredes = new javax.swing.JLabel();
        practicoSubredes = new javax.swing.JLabel();
        hostTeoricos = new javax.swing.JTextField();
        hostsPracticos = new javax.swing.JTextField();
        practicoEtiqeuta = new javax.swing.JLabel();
        teoricoEtiqueta = new javax.swing.JLabel();
        totalHosts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(34, 40, 49));
        panelPrincipal.setForeground(new java.awt.Color(27, 38, 44));
        panelPrincipal.setToolTipText("");

        titulo.setFont(new java.awt.Font("FreeSans", 1, 28)); // NOI18N
        titulo.setForeground(new java.awt.Color(238, 238, 238));
        titulo.setText("SUBNETEO");

        campoID.setBackground(new java.awt.Color(57, 62, 70));
        campoID.setFont(new java.awt.Font("Hack Nerd Font", 0, 16)); // NOI18N
        campoID.setForeground(new java.awt.Color(238, 238, 238));
        campoID.setBorder(null);

        idEtiqueta.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        idEtiqueta.setForeground(new java.awt.Color(238, 238, 238));
        idEtiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idEtiqueta.setText("ID RED");

        botonCalcular.setText("CALCULAR");
        botonCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCalcularMouseClicked(evt);
            }
        });

        eleccion.setBackground(new java.awt.Color(57, 62, 70));
        eleccion.setFont(new java.awt.Font("Hack Nerd Font", 1, 16)); // NOI18N
        eleccion.setForeground(new java.awt.Color(238, 238, 238));
        eleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subredes", "Host" }));
        eleccion.setBorder(null);
        eleccion.setFocusable(false);

        campoSubredes.setBackground(new java.awt.Color(57, 62, 70));
        campoSubredes.setFont(new java.awt.Font("Hack Nerd Font", 0, 16)); // NOI18N
        campoSubredes.setForeground(new java.awt.Color(238, 238, 238));
        campoSubredes.setBorder(null);

        totalSubredes.setFont(new java.awt.Font("Hack Nerd Font", 1, 16)); // NOI18N
        totalSubredes.setForeground(new java.awt.Color(238, 238, 238));
        totalSubredes.setText("SUBREDES");

        subredesTeoricas.setBackground(new java.awt.Color(57, 62, 70));
        subredesTeoricas.setFont(new java.awt.Font("Hack Nerd Font", 0, 16)); // NOI18N
        subredesTeoricas.setForeground(new java.awt.Color(238, 238, 238));
        subredesTeoricas.setBorder(null);

        subredesPracticas.setBackground(new java.awt.Color(57, 62, 70));
        subredesPracticas.setFont(new java.awt.Font("Hack Nerd Font", 0, 16)); // NOI18N
        subredesPracticas.setForeground(new java.awt.Color(238, 238, 238));
        subredesPracticas.setBorder(null);

        teoricoSubredes.setFont(new java.awt.Font("Hack Nerd Font", 1, 16)); // NOI18N
        teoricoSubredes.setForeground(new java.awt.Color(238, 238, 238));
        teoricoSubredes.setText("T");

        practicoSubredes.setFont(new java.awt.Font("Hack Nerd Font", 1, 16)); // NOI18N
        practicoSubredes.setForeground(new java.awt.Color(238, 238, 238));
        practicoSubredes.setText("P");

        hostTeoricos.setBackground(new java.awt.Color(57, 62, 70));
        hostTeoricos.setFont(new java.awt.Font("Hack Nerd Font", 0, 16)); // NOI18N
        hostTeoricos.setForeground(new java.awt.Color(238, 238, 238));
        hostTeoricos.setBorder(null);

        hostsPracticos.setBackground(new java.awt.Color(57, 62, 70));
        hostsPracticos.setFont(new java.awt.Font("Hack Nerd Font", 0, 16)); // NOI18N
        hostsPracticos.setForeground(new java.awt.Color(238, 238, 238));
        hostsPracticos.setBorder(null);

        practicoEtiqeuta.setFont(new java.awt.Font("Hack Nerd Font", 1, 16)); // NOI18N
        practicoEtiqeuta.setForeground(new java.awt.Color(238, 238, 238));
        practicoEtiqeuta.setText("P");

        teoricoEtiqueta.setFont(new java.awt.Font("Hack Nerd Font", 1, 16)); // NOI18N
        teoricoEtiqueta.setForeground(new java.awt.Color(238, 238, 238));
        teoricoEtiqueta.setText("T");

        totalHosts.setFont(new java.awt.Font("Hack Nerd Font", 1, 16)); // NOI18N
        totalHosts.setForeground(new java.awt.Color(238, 238, 238));
        totalHosts.setText("HOST * SUBRED");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(titulo))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(teoricoSubredes)
                            .addComponent(practicoSubredes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eleccion, 0, 117, Short.MAX_VALUE)
                                    .addComponent(idEtiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoSubredes, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .addComponent(campoID, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(totalSubredes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(subredesPracticas, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subredesTeoricas, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                                .addComponent(teoricoEtiqueta)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(hostTeoricos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                                .addComponent(practicoEtiqeuta)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(hostsPracticos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(59, 59, 59))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(totalHosts)
                                        .addGap(54, 54, 54)))))))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 230, Short.MAX_VALUE)
                .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idEtiqueta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoSubredes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalSubredes)
                            .addComponent(totalHosts))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subredesTeoricas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teoricoSubredes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subredesPracticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(practicoSubredes)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hostTeoricos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teoricoEtiqueta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hostsPracticos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(practicoEtiqeuta))))
                .addGap(113, 113, 113)
                .addComponent(botonCalcular)
                .addGap(37, 37, 37))
        );

        campoID.getAccessibleContext().setAccessibleName("");
        campoID.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCalcularMouseClicked
        calculoSubredes();
    }//GEN-LAST:event_botonCalcularMouseClicked

    //avance pa, wachate
    
    private void nuevaMascara(int unos){
        int[] escala = {128,64,32,16,8,4,2,1};
        int res = 0;
        
        for (int i = 0 ; i < escala.length; i++){
            if (unos > 0){
                res += (escala[i] * 1);
                unos--;
            }

        }
        System.out.println(res);
    }
    
    private void calculoSubredes(){
        if (identificarClase()){
            
            try {
                int redesSolicitadas = Integer.parseInt(campoSubredes.getText());
                
                int redes = 0, i = 0;
                while (redes < redesSolicitadas){
                    redes = (int) Math.pow(2, i);
                    i++;
                } 
                i -= 1;
                nuevaMascara(i);
                subredesTeoricas.setText(String.valueOf(redes));
                subredesPracticas.setText(String.valueOf(redes - 2));

                
            } catch(NumberFormatException e){
                mensajeError();
            }
            

        }
        else{
            mensajeError();
        }
    }
    
    
    
    private boolean identificarClase(){
        String cadenaIp = campoID.getText();
        
        if (aceptarIP(cadenaIp)){
            
            int clase = Integer.parseInt(cadenaIp.substring(0, cadenaIp.indexOf(".")));

            if (clase >= 0 && clase <= 127 ){
                System.out.println("CLASE A");
            }
            else if (clase >= 128 && clase <= 191){
                System.out.println("CLASE B");
            }
            else if (clase >= 192 && clase <= 223){
                System.out.println("CLASE C");
            }
            else if (clase >= 224 && clase <= 239){
                System.out.println("CLASE D");
            }
            else if (clase >= 240 && clase <= 255){
                System.out.println("CLASE E");
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
        return true;
    }
    
    
    private boolean aceptarIP(String ip){
        String[] octetos = ip.split("\\.");
        
        if (octetos.length != 4){
            return false;
        }
         
        //Excepcion si un octeto de la dirección no es número.
        try{
            for (String octeto : octetos){
                int num = Integer.parseInt(octeto);
                //A la vez, si es número se verifica que no sobrepase 255
                if (num > 255) {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException e){;
            return false;
        }
        
    }
    
    private void mensajeError(){
        JOptionPane.showMessageDialog(this.panelPrincipal, "Datos invalidos", "ERROR",JOptionPane.ERROR_MESSAGE);
    }
    


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new diseño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoSubredes;
    private javax.swing.JComboBox<String> eleccion;
    private javax.swing.JTextField hostTeoricos;
    private javax.swing.JTextField hostsPracticos;
    private javax.swing.JLabel idEtiqueta;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel practicoEtiqeuta;
    private javax.swing.JLabel practicoSubredes;
    private javax.swing.JTextField subredesPracticas;
    private javax.swing.JTextField subredesTeoricas;
    private javax.swing.JLabel teoricoEtiqueta;
    private javax.swing.JLabel teoricoSubredes;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel totalHosts;
    private javax.swing.JLabel totalSubredes;
    // End of variables declaration//GEN-END:variables
}
