
package Final;

import javax.swing.JOptionPane;

public class Boba_Tea extends javax.swing.JFrame {
    Shop_Connection shop = new Shop_Connection();
    double amount;
    public Boba_Tea() {
        initComponents();
        shop.FetchData();
    }
    void Amount(int qty,double price){
        amount=qty*price;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btback = new rojeru_san.complementos.RSButtonHover();
        jPanel9 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jsicechoc = new javax.swing.JSpinner();
        bticechoc = new com.k33ptoo.components.KButton();
        jLabel34 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jschocmilktea = new javax.swing.JSpinner();
        btchocmilktea = new com.k33ptoo.components.KButton();
        jLabel52 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jspurpletea = new javax.swing.JSpinner();
        btpurpletea = new com.k33ptoo.components.KButton();
        jLabel49 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jsstrawberry = new javax.swing.JSpinner();
        btstrawberry = new com.k33ptoo.components.KButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jstriple = new javax.swing.JSpinner();
        bttriple = new com.k33ptoo.components.KButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        kButton4 = new com.k33ptoo.components.KButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jslimetea = new javax.swing.JSpinner();
        btlimetea = new com.k33ptoo.components.KButton();
        jLabel44 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jsgreentea = new javax.swing.JSpinner();
        btgreentea = new com.k33ptoo.components.KButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        kButton5 = new com.k33ptoo.components.KButton();
        jLabel39 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jsrainbow = new javax.swing.JSpinner();
        btrainbow = new com.k33ptoo.components.KButton();
        jLabel12 = new javax.swing.JLabel();
        btpayment = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1107, 593));
        setMinimumSize(new java.awt.Dimension(1107, 593));
        getContentPane().setLayout(null);

        btback.setText("Back");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });
        getContentPane().add(btback);
        btback.setBounds(20, 40, 100, 40);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setLayout(null);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/choc milkshake.png"))); // NOI18N
        jPanel9.add(jLabel42);
        jLabel42.setBounds(0, 0, 100, 140);

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Qty : ");
        jPanel9.add(jLabel43);
        jLabel43.setBounds(110, 60, 40, 30);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Code : 3004");
        jPanel9.add(jLabel45);
        jLabel45.setBounds(110, 0, 90, 30);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Price : 2.50");
        jPanel9.add(jLabel46);
        jLabel46.setBounds(110, 30, 90, 30);
        jPanel9.add(jsicechoc);
        jsicechoc.setBounds(150, 60, 50, 30);

        bticechoc.setText("BUY");
        bticechoc.setkEndColor(new java.awt.Color(0, 0, 0));
        bticechoc.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        bticechoc.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        bticechoc.setkStartColor(new java.awt.Color(204, 0, 0));
        bticechoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bticechocActionPerformed(evt);
            }
        });
        jPanel9.add(bticechoc);
        bticechoc.setBounds(120, 100, 70, 30);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 255, 255));
        jLabel34.setText("Ice Chocolate");
        jPanel9.add(jLabel34);
        jLabel34.setBounds(10, 130, 110, 40);

        getContentPane().add(jPanel9);
        jPanel9.setBounds(790, 100, 210, 170);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.setLayout(null);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/chocolate tea.png"))); // NOI18N
        jPanel10.add(jLabel47);
        jLabel47.setBounds(0, 0, 100, 140);

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Qty : ");
        jPanel10.add(jLabel48);
        jLabel48.setBounds(110, 60, 40, 30);

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Code : 3008");
        jPanel10.add(jLabel50);
        jLabel50.setBounds(110, 0, 90, 30);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Price : 2$");
        jPanel10.add(jLabel51);
        jLabel51.setBounds(110, 30, 90, 30);
        jPanel10.add(jschocmilktea);
        jschocmilktea.setBounds(150, 60, 50, 30);

        btchocmilktea.setText("BUY");
        btchocmilktea.setkEndColor(new java.awt.Color(0, 0, 0));
        btchocmilktea.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btchocmilktea.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        btchocmilktea.setkStartColor(new java.awt.Color(204, 0, 0));
        btchocmilktea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchocmilkteaActionPerformed(evt);
            }
        });
        jPanel10.add(btchocmilktea);
        btchocmilktea.setBounds(120, 100, 70, 30);

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 255, 255));
        jLabel52.setText("Chocolate Milk Tea");
        jPanel10.add(jLabel52);
        jLabel52.setBounds(10, 130, 140, 40);

        getContentPane().add(jPanel10);
        jPanel10.setBounds(790, 290, 210, 170);

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(null);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/purple tea.png"))); // NOI18N
        jPanel7.add(jLabel32);
        jLabel32.setBounds(0, 0, 100, 140);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Qty : ");
        jPanel7.add(jLabel33);
        jLabel33.setBounds(110, 60, 40, 30);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Code : 3007");
        jPanel7.add(jLabel35);
        jLabel35.setBounds(110, 0, 90, 30);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Price : 2");
        jPanel7.add(jLabel36);
        jLabel36.setBounds(110, 30, 90, 30);
        jPanel7.add(jspurpletea);
        jspurpletea.setBounds(150, 60, 50, 30);

        btpurpletea.setText("BUY");
        btpurpletea.setkEndColor(new java.awt.Color(0, 0, 0));
        btpurpletea.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btpurpletea.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        btpurpletea.setkStartColor(new java.awt.Color(204, 0, 0));
        btpurpletea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpurpleteaActionPerformed(evt);
            }
        });
        jPanel7.add(btpurpletea);
        btpurpletea.setBounds(120, 100, 70, 30);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 255, 255));
        jLabel49.setText("Purple Tea");
        jPanel7.add(jLabel49);
        jLabel49.setBounds(20, 130, 80, 40);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(560, 290, 210, 170);

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setLayout(null);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/strawberry.png"))); // NOI18N
        jPanel8.add(jLabel37);
        jLabel37.setBounds(0, 0, 100, 140);

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Qty : ");
        jPanel8.add(jLabel38);
        jLabel38.setBounds(110, 60, 40, 30);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Code : 3003");
        jPanel8.add(jLabel40);
        jLabel40.setBounds(110, 0, 90, 30);

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Price : 2.50");
        jPanel8.add(jLabel41);
        jLabel41.setBounds(110, 30, 90, 30);
        jPanel8.add(jsstrawberry);
        jsstrawberry.setBounds(150, 60, 50, 30);

        btstrawberry.setText("BUY");
        btstrawberry.setkEndColor(new java.awt.Color(0, 0, 0));
        btstrawberry.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btstrawberry.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        btstrawberry.setkStartColor(new java.awt.Color(204, 0, 0));
        btstrawberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstrawberryActionPerformed(evt);
            }
        });
        jPanel8.add(btstrawberry);
        btstrawberry.setBounds(120, 100, 70, 30);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 255, 255));
        jLabel29.setText("Strawberry Flavor");
        jPanel8.add(jLabel29);
        jLabel29.setBounds(10, 130, 130, 40);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(560, 100, 210, 170);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Qty : ");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(110, 60, 40, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Code : 3002");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(110, 0, 90, 30);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Price : 2.50");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(110, 30, 90, 30);
        jPanel3.add(jstriple);
        jstriple.setBounds(150, 60, 50, 30);

        bttriple.setText("BUY");
        bttriple.setkEndColor(new java.awt.Color(0, 0, 0));
        bttriple.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        bttriple.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        bttriple.setkStartColor(new java.awt.Color(204, 0, 0));
        bttriple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttripleActionPerformed(evt);
            }
        });
        jPanel3.add(bttriple);
        bttriple.setBounds(120, 100, 70, 30);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setLayout(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/burger.png"))); // NOI18N
        jPanel4.add(jLabel17);
        jLabel17.setBounds(0, 10, 100, 100);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Qty : ");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(110, 60, 40, 30);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setText(" Hamburger");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(10, 100, 100, 40);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Code : 1001");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(110, 0, 90, 30);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Price : 8$");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(110, 30, 90, 30);
        jPanel4.add(jSpinner4);
        jSpinner4.setBounds(150, 60, 50, 30);

        kButton4.setText("BUY");
        jPanel4.add(kButton4);
        kButton4.setBounds(120, 100, 70, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(280, 90, 210, 140);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/triple flavor.png"))); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(0, 0, 100, 140);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setText("Triple Flavor");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(10, 130, 100, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(330, 100, 210, 170);

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setLayout(null);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/Lime tea.png"))); // NOI18N
        jPanel6.add(jLabel27);
        jLabel27.setBounds(0, 0, 100, 140);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Qty : ");
        jPanel6.add(jLabel28);
        jLabel28.setBounds(110, 60, 40, 30);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Code : 3006");
        jPanel6.add(jLabel30);
        jLabel30.setBounds(110, 0, 90, 30);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Price : 2");
        jPanel6.add(jLabel31);
        jLabel31.setBounds(110, 30, 90, 30);
        jPanel6.add(jslimetea);
        jslimetea.setBounds(150, 60, 50, 30);

        btlimetea.setText("BUY");
        btlimetea.setkEndColor(new java.awt.Color(0, 0, 0));
        btlimetea.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btlimetea.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        btlimetea.setkStartColor(new java.awt.Color(204, 0, 0));
        btlimetea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimeteaActionPerformed(evt);
            }
        });
        jPanel6.add(btlimetea);
        btlimetea.setBounds(120, 100, 70, 30);

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 255, 255));
        jLabel44.setText("Lime Tea");
        jPanel6.add(jLabel44);
        jLabel44.setBounds(20, 130, 80, 40);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(330, 290, 210, 170);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/Green tea.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 100, 140);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Qty : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 60, 40, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Code : 3005");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 0, 90, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price : 2");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 30, 90, 30);
        jPanel1.add(jsgreentea);
        jsgreentea.setBounds(150, 60, 50, 30);

        btgreentea.setText("BUY");
        btgreentea.setkEndColor(new java.awt.Color(0, 0, 0));
        btgreentea.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btgreentea.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        btgreentea.setkStartColor(new java.awt.Color(204, 0, 0));
        btgreentea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgreenteaActionPerformed(evt);
            }
        });
        jPanel1.add(btgreentea);
        btgreentea.setBounds(120, 100, 70, 30);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(null);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/burger.png"))); // NOI18N
        jPanel5.add(jLabel22);
        jLabel22.setBounds(0, 10, 100, 100);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Qty : ");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(110, 60, 40, 30);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel24.setText(" Hamburger");
        jPanel5.add(jLabel24);
        jLabel24.setBounds(10, 100, 100, 40);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Code : 1001");
        jPanel5.add(jLabel25);
        jLabel25.setBounds(110, 0, 90, 30);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Price : 8$");
        jPanel5.add(jLabel26);
        jLabel26.setBounds(110, 30, 90, 30);
        jPanel5.add(jSpinner5);
        jSpinner5.setBounds(150, 60, 50, 30);

        kButton5.setText("BUY");
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(kButton5);
        kButton5.setBounds(120, 100, 70, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(50, 250, 210, 140);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 255, 255));
        jLabel39.setText("Green Tea");
        jPanel1.add(jLabel39);
        jLabel39.setBounds(20, 130, 80, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 290, 210, 170);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/rainbow.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 0, 100, 140);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Qty : ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(110, 60, 40, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Code : 3001");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(110, 0, 90, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Price : 2.50");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(110, 30, 90, 30);
        jPanel2.add(jsrainbow);
        jsrainbow.setBounds(150, 60, 50, 30);

        btrainbow.setText("BUY");
        btrainbow.setkEndColor(new java.awt.Color(0, 0, 0));
        btrainbow.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btrainbow.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        btrainbow.setkStartColor(new java.awt.Color(204, 0, 0));
        btrainbow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrainbowActionPerformed(evt);
            }
        });
        jPanel2.add(btrainbow);
        btrainbow.setBounds(120, 100, 70, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 255));
        jLabel12.setText("Rainbow Flavor");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 130, 110, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(100, 100, 210, 170);

        btpayment.setText("Payment");
        btpayment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpaymentActionPerformed(evt);
            }
        });
        getContentPane().add(btpayment);
        btpayment.setBounds(480, 490, 140, 50);

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Boba Tea");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 20, 200, 70);

        jPanel11.setBackground(new java.awt.Color(255, 255, 0));
        jPanel11.setLayout(null);
        getContentPane().add(jPanel11);
        jPanel11.setBounds(0, 0, 1110, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btgreenteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgreenteaActionPerformed
         int qty = Integer.parseInt(jsgreentea.getValue().toString());
        if(qty>0){
            int code = 3005;
            String name = "Green Tea";
            float price = 2f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jsgreentea.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_btgreenteaActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton5ActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        Order_Option.main(null);
        dispose();
    }//GEN-LAST:event_btbackActionPerformed

    private void btpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpaymentActionPerformed
        Payment.main(null);
        dispose();
    }//GEN-LAST:event_btpaymentActionPerformed

    private void btrainbowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrainbowActionPerformed
        int qty = Integer.parseInt(jsrainbow.getValue().toString());
        if(qty>0){
            int code = 3001;
            String name = "Rainbow Flavor";
            float price = 2.50f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jsrainbow.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_btrainbowActionPerformed

    private void bttripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttripleActionPerformed
        int qty = Integer.parseInt(jstriple.getValue().toString());
        if(qty>0){
            int code = 3002;
            String name = "Triple Flavor";
            float price = 2.50f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jstriple.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_bttripleActionPerformed

    private void btstrawberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstrawberryActionPerformed
         int qty = Integer.parseInt(jsstrawberry.getValue().toString());
        if(qty>0){
            int code = 3003;
            String name = "Strawberry Flavor";
            float price = 2.50f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jsstrawberry.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_btstrawberryActionPerformed

    private void bticechocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bticechocActionPerformed
         int qty = Integer.parseInt(jsicechoc.getValue().toString());
        if(qty>0){
            int code = 3004;
            String name = "Ice Chocolate";
            float price = 2.50f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jsicechoc.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_bticechocActionPerformed

    private void btlimeteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimeteaActionPerformed
        int qty = Integer.parseInt(jslimetea.getValue().toString());
        if(qty>0){
            int code = 3006;
            String name = "Lime Tea";
            float price = 2f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jslimetea.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_btlimeteaActionPerformed

    private void btpurpleteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpurpleteaActionPerformed
        int qty = Integer.parseInt(jspurpletea.getValue().toString());
        if(qty>0){
            int code = 3007;
            String name = "Purple Tea";
            float price = 2f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jspurpletea.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_btpurpleteaActionPerformed

    private void btchocmilkteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchocmilkteaActionPerformed
       int qty = Integer.parseInt(jschocmilktea.getValue().toString());
        if(qty>0){
            int code = 3008;
            String name = "Chocolate Milk Tea";
            float price = 2f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jschocmilktea.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_btchocmilkteaActionPerformed

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
            java.util.logging.Logger.getLogger(Boba_Tea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boba_Tea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boba_Tea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boba_Tea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boba_Tea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btback;
    private com.k33ptoo.components.KButton btchocmilktea;
    private com.k33ptoo.components.KButton btgreentea;
    private com.k33ptoo.components.KButton bticechoc;
    private com.k33ptoo.components.KButton btlimetea;
    private com.k33ptoo.components.KButton btpayment;
    private com.k33ptoo.components.KButton btpurpletea;
    private com.k33ptoo.components.KButton btrainbow;
    private com.k33ptoo.components.KButton btstrawberry;
    private com.k33ptoo.components.KButton bttriple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jschocmilktea;
    private javax.swing.JSpinner jsgreentea;
    private javax.swing.JSpinner jsicechoc;
    private javax.swing.JSpinner jslimetea;
    private javax.swing.JSpinner jspurpletea;
    private javax.swing.JSpinner jsrainbow;
    private javax.swing.JSpinner jsstrawberry;
    private javax.swing.JSpinner jstriple;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    // End of variables declaration//GEN-END:variables
}
