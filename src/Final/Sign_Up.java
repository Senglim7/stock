
package Final;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Sign_Up extends javax.swing.JFrame {
     ImageIcon icon = new ImageIcon("D:\\Etec\\Java\\Pictures\\check-mark_5290058.png");
    public Sign_Up() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btsignin = new com.k33ptoo.components.KButton();
        btregister = new com.k33ptoo.components.KButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcfpw = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpw = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(837, 582));
        setMinimumSize(new java.awt.Dimension(837, 582));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btsignin.setText("SIGN IN");
        btsignin.setToolTipText("");
        btsignin.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btsignin.setkBorderRadius(1000);
        btsignin.setkEndColor(new java.awt.Color(153, 0, 153));
        btsignin.setkHoverColor(new java.awt.Color(255, 255, 0));
        btsignin.setkHoverForeGround(new java.awt.Color(153, 0, 153));
        btsignin.setkHoverStartColor(new java.awt.Color(204, 204, 0));
        btsignin.setkStartColor(new java.awt.Color(204, 0, 0));
        btsignin.setName(""); // NOI18N
        btsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsigninActionPerformed(evt);
            }
        });
        jPanel1.add(btsignin);
        btsignin.setBounds(470, 350, 240, 140);

        btregister.setText("REGISTER");
        btregister.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        btregister.setkEndColor(new java.awt.Color(0, 0, 0));
        btregister.setkHoverColor(new java.awt.Color(0, 255, 0));
        btregister.setkHoverForeGround(new java.awt.Color(153, 0, 153));
        btregister.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        btregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregisterActionPerformed(evt);
            }
        });
        jPanel1.add(btregister);
        btregister.setBounds(110, 460, 140, 40);

        jPanel3.setLayout(null);
        jPanel3.add(jLabel6);
        jLabel6.setBounds(330, 70, 120, 120);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/sign up.jpg"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(0, 0, 130, 154);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(50, 30, 130, 154);

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 20)); // NOI18N
        jLabel3.setText("Email");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 190, 70, 40);

        txtcfpw.setBackground(new java.awt.Color(255, 255, 255));
        txtcfpw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtcfpw.setForeground(new java.awt.Color(204, 0, 0));
        txtcfpw.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        txtcfpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcfpwActionPerformed(evt);
            }
        });
        jPanel1.add(txtcfpw);
        txtcfpw.setBounds(60, 400, 250, 30);

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 20)); // NOI18N
        jLabel2.setText("Confirm Password ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 360, 170, 40);

        txtpw.setBackground(new java.awt.Color(255, 255, 255));
        txtpw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpw.setForeground(new java.awt.Color(204, 0, 0));
        txtpw.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        txtpw.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpwActionPerformed(evt);
            }
        });
        jPanel1.add(txtpw);
        txtpw.setBounds(60, 310, 250, 30);

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 20)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 270, 90, 40);

        txtemail.setBackground(new java.awt.Color(255, 255, 255));
        txtemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtemail.setForeground(new java.awt.Color(204, 0, 0));
        txtemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel1.add(txtemail);
        txtemail.setBounds(60, 230, 250, 30);

        jLabel5.setFont(new java.awt.Font("Kh BL LazySmooth", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Already have an account ???");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(430, 130, 320, 50);

        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/click down.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 160, 200);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(500, 160, 160, 200);

        jLabel8.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CREATE YOUR ACCOUNT");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(210, 30, 480, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 590);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpwActionPerformed

    private void txtcfpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcfpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcfpwActionPerformed

    private void btregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregisterActionPerformed
        String email = txtemail.getText();
        String password = txtpw.getText().toString();
        String cfpw = txtcfpw.getText().toString();
        if(password.equals(cfpw)){
            Login_List.list.add(new Login_List(email,password));
            JOptionPane.showMessageDialog(null, "Account Created..!!", "Login", HEIGHT, icon);

        }
    }//GEN-LAST:event_btregisterActionPerformed

    private void btsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsigninActionPerformed
        Sign_in.main(null);
        dispose();
    }//GEN-LAST:event_btsigninActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_Up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btregister;
    private com.k33ptoo.components.KButton btsignin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtcfpw;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtpw;
    // End of variables declaration//GEN-END:variables
}
