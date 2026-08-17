
package interfaz;
import biblioteca.Biblioteca;
import biblioteca.Libro;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;
public class Registrar_Libro extends javax.swing.JFrame {

    Libro libro;
    private HashMap<JTextField,String> regexMap;
    public Registrar_Libro() {
        initComponents();
        this.setLocationRelativeTo(null);
        regexMap = new HashMap<>();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        autor = new javax.swing.JTextField();
        idLibro = new javax.swing.JTextField();
        nombreLibro = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        genero = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        fechaPublicacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 0, 0, 150));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.gray));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setEnabled(false);
        jPanel7.setName(""); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("REGISTRO DE LIBRO");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("ID DEL LIBRO");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 140, 20));

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("NOMBRE DEL LIBRO");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 140, 10));
        jPanel7.add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 310, 30));
        jPanel7.add(idLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 310, 30));

        nombreLibro.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jPanel7.add(nombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 310, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("AUTOR");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 130, 10));

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("FECHA DE PUBLICACION");
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 190, 10));

        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });
        jPanel7.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 310, 30));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGISTRARSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 120, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("GENERO LITERARIO");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 160, 20));
        jPanel7.add(fechaPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 310, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 110, 40));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 390, 470));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3732a5a735fc2f7cbbbb0bc27fe5b19d.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Registrarse
        int cont = 0;
        regexMap.clear();
        regexMap.put(idLibro,"^\\d{5}$");
        regexMap.put(nombreLibro, "^([\\p{L}]+|[\\d]+)([ \\p{P}]+([\\p{L}]+|[\\d]+))*$");
        regexMap.put(autor,"^\\p{L}+$");
        regexMap.put(fechaPublicacion,"^((0[1-9]|[12][0-9])-(02)-(\\d{4})|" +         // 01–29 de febrero
                                      "31-(0[13578]|1[02])-(\\d{4})|" +               // 31 en meses con 31 días
                                      "(30)-(0[13-9]|1[0-2])-(\\d{4})|" +             // 30 en meses con 30 días
                                      "(0[1-9]|1\\d|2\\d)-(0[1-9]|1[0-2])-(\\d{4}))$" // 01–29 en cualquier mes
        );
        regexMap.put(genero,"^\\p{L}+$");
        
        for(Map.Entry<JTextField,String> entrada:regexMap.entrySet()){
            String regex = entrada.getValue();
            Pattern pattern = Pattern.compile(regex);
            String texto = entrada.getKey().getText();
            Matcher matcher = pattern.matcher(texto);
            if (matcher.matches()) {
                //Coincide
                cont++;
                entrada.getKey().setBackground(Color.white);
            } else {
                entrada.getKey().setBackground(Color.red);
            }
        }
        
        if (cont == 5) {
            libro = new Libro(idLibro.getText(), nombreLibro.getText(), autor.getText(), fechaPublicacion.getText(), genero.getText());
            Biblioteca.getInstancia().registrarLibro(libro);
            Biblioteca_Pestana_Inicio v1 = new Biblioteca_Pestana_Inicio();
            v1.setVisible(true);
            this.setVisible(false);
            
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Biblioteca_Pestana_Inicio v1 = new Biblioteca_Pestana_Inicio();
        v1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registrar_Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Libro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autor;
    private javax.swing.JTextField fechaPublicacion;
    private javax.swing.JTextField genero;
    private javax.swing.JTextField idLibro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField nombreLibro;
    // End of variables declaration//GEN-END:variables
}
