
package subnetting;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class diseño extends javax.swing.JFrame {
    String[] mascaras = {"255.0.0.0", "255.255.0.0", "255.255.255.0"};
    int seleccionarMascara = 0;
    
   
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
        campoMascara.setHorizontalAlignment(0);
        mascaraEtiqueta.setHorizontalAlignment(0);
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
        mascaraEtiqueta = new javax.swing.JLabel();
        campoMascara = new javax.swing.JTextField();

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

        idEtiqueta.setFont(new java.awt.Font("Hack Nerd Font", 1, 16)); // NOI18N
        idEtiqueta.setForeground(new java.awt.Color(238, 238, 238));
        idEtiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idEtiqueta.setText("ID RED");

        botonCalcular.setBackground(new java.awt.Color(57, 62, 70));
        botonCalcular.setFont(new java.awt.Font("Hack Nerd Font", 1, 16)); // NOI18N
        botonCalcular.setForeground(new java.awt.Color(238, 238, 238));
        botonCalcular.setText("CALCULAR");
        botonCalcular.setBorder(null);
        botonCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCalcularMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCalcularMouseExited(evt);
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

        mascaraEtiqueta.setFont(new java.awt.Font("Hack Nerd Font", 1, 16)); // NOI18N
        mascaraEtiqueta.setForeground(new java.awt.Color(238, 238, 238));
        mascaraEtiqueta.setText("MÁSCARA");

        campoMascara.setBackground(new java.awt.Color(57, 62, 70));
        campoMascara.setFont(new java.awt.Font("Hack Nerd Font", 0, 16)); // NOI18N
        campoMascara.setForeground(new java.awt.Color(238, 238, 238));
        campoMascara.setBorder(null);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(teoricoSubredes)
                    .addComponent(practicoSubredes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGap(94, 94, 94))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(totalHosts)
                                .addGap(89, 89, 89))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(eleccion, 0, 117, Short.MAX_VALUE)
                                .addComponent(mascaraEtiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(idEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoSubredes, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoID)
                            .addComponent(campoMascara))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 230, Short.MAX_VALUE)
                .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(titulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSubredes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mascaraEtiqueta)
                            .addComponent(campoMascara, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalHosts, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(totalSubredes))
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
                        .addGap(101, 101, 101)
                        .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(idEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        botonCalcular.setForeground(new Color(57, 62, 70));
        botonCalcular.setBackground(new Color(238, 238, 238));
    }//GEN-LAST:event_botonCalcularMouseClicked

    private void botonCalcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCalcularMouseExited
        botonCalcular.setForeground(new Color(238, 238, 238));
        botonCalcular.setBackground(new Color(57, 62, 70));
    }//GEN-LAST:event_botonCalcularMouseExited

    
    
    private void nuevaMascara(int unos, int clase){
        int[] escala = {128,64,32,16,8,4,2,1};
        int res = 0;
        StringBuilder nuevaMasc = new StringBuilder(mascaras[seleccionarMascara]);
        System.out.println(unos);
        System.out.println(nuevaMasc);
        
        
        int i = 0;
        while (unos > 0){
            if (i > 7) i = 0;
            if (res >= 255){
                nuevaMasc.replace(nuevaMasc.indexOf("0"), nuevaMasc.indexOf("0") + 1, String.valueOf(res)); 
                res = 0;
            }
            res += (escala[i] * 1);
            i++;
            unos--;
        }
        
        try{
            nuevaMasc.replace(nuevaMasc.indexOf("0"), nuevaMasc.indexOf("0") + 1, String.valueOf(res));
        }  catch (StringIndexOutOfBoundsException e){
            nuevaMasc.replace(0, nuevaMasc.length(), "255.255.255.255");
        }
        campoMascara.setText(String.valueOf(nuevaMasc));
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
                
                if (redesSolicitadas > 0){
                    nuevaMascara(i, seleccionarMascara);
                    subredesTeoricas.setText(String.valueOf(redes));
                    subredesPracticas.setText(String.valueOf(redes - 2));
                }
                else{
                    mensajeError();
                }


                
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
                seleccionarMascara = 0;
            }
            else if (clase >= 128 && clase <= 191){
                System.out.println("CLASE B");
                System.out.println(mascaras[1]);
                seleccionarMascara = 1;
            }
            else if (clase >= 192 && clase <= 223){
                System.out.println("CLASE C");
                System.out.println(mascaras[2]);
                seleccionarMascara = 2;
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
                if (num > 255 || num < 0) {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException e){;
            return false;
        }
        
    }
    
    private void mensajeError(){
        campoID.setText("");
        campoSubredes.setText("");
        campoMascara.setText("");
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
    private javax.swing.JTextField campoMascara;
    private javax.swing.JTextField campoSubredes;
    private javax.swing.JComboBox<String> eleccion;
    private javax.swing.JTextField hostTeoricos;
    private javax.swing.JTextField hostsPracticos;
    private javax.swing.JLabel idEtiqueta;
    private javax.swing.JLabel mascaraEtiqueta;
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
