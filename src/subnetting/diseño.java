
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        idEtiqueta = new javax.swing.JLabel();
        botonCalcular = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        campoSubredes = new javax.swing.JTextField();

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

        jComboBox1.setBackground(new java.awt.Color(57, 62, 70));
        jComboBox1.setFont(new java.awt.Font("Hack Nerd Font", 1, 16)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(238, 238, 238));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subredes", "Host" }));
        jComboBox1.setBorder(null);
        jComboBox1.setFocusable(false);

        campoSubredes.setBackground(new java.awt.Color(57, 62, 70));
        campoSubredes.setFont(new java.awt.Font("Hack Nerd Font", 0, 16)); // NOI18N
        campoSubredes.setForeground(new java.awt.Color(238, 238, 238));
        campoSubredes.setBorder(null);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(titulo))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 117, Short.MAX_VALUE)
                            .addComponent(idEtiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoSubredes, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(campoID))))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoID)
                    .addComponent(idEtiqueta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(41, 41, 41)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoSubredes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(181, 181, 181)
                .addComponent(botonCalcular)
                .addGap(108, 108, 108))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCalcularMouseClicked
        calculoSubredes();
    }//GEN-LAST:event_botonCalcularMouseClicked

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
                System.out.println(i);
                System.out.println(redes + "\n" + (redes - 2));
                
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
    private javax.swing.JLabel idEtiqueta;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
