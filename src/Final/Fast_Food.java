
package Final;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;  // throw data into database
import java.sql.ResultSet;         // fecth data from database
import java.sql.SQLException;
//import com.sun.jdi.connect.spi.Connection;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Fast_Food extends javax.swing.JFrame {
    Shop_Connection shop = new Shop_Connection();
    double amount;
//    Payment pay = new Payment();
//    PreparedStatement ps;
//    ResultSet r;
//    DecimalFormat df = new DecimalFormat("0.00");
//    String col[]={"Code","Name","Qty","Price","Amount"};
//    ImageIcon icon = new ImageIcon("D:\\Etec\\Java\\Pictures\\check-mark_5290058.png");
//    ImageIcon icon1 = new ImageIcon("D:\\Etec\\Java\\Pictures\\cross_7699001.png");
//    String sql;
//    double total;
//    DefaultTableModel model = new DefaultTableModel(col,0);
    public Fast_Food() {
        initComponents();
        shop.FetchData();
    }
     void Amount(int qty,double price){
        amount=qty*price;
    }

////    Connection connection(){
////        Connection con = null;
////        try {
////            Class.forName("com.mysql.jdbc.Driver");
////            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/database?useSSL=false","root","");
////            System.out.println("Completed.....");
////        }
////        catch (ClassNotFoundException | SQLException e) {
////            System.out.println("Connection Error: "+e.getMessage());
////        }
////        return con;
////  }
////    void Amount(int qty,double price){
////        total=qty*price;
////    }
////    
////    void InsertData(int code, String name, int qty, double price){
////        Amount(qty,price);
////        try {
////            sql = "INSERT INTO tbShop(Code,Name,Qty,Price,Amount) VALUES (?,?,?,?,?)";
////            ps = connection().prepareStatement(sql);
////        } catch (Exception e) {
////        }
////    }
////    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jspizza = new javax.swing.JSpinner();
        btpizza = new com.k33ptoo.components.KButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        kButton5 = new com.k33ptoo.components.KButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jsburger = new javax.swing.JSpinner();
        btburger = new com.k33ptoo.components.KButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jshotdog = new javax.swing.JSpinner();
        bthotdog = new com.k33ptoo.components.KButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        kButton4 = new com.k33ptoo.components.KButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jsburrito = new javax.swing.JSpinner();
        btburrito = new com.k33ptoo.components.KButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jsdonut = new javax.swing.JSpinner();
        btdonut = new com.k33ptoo.components.KButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jscake = new javax.swing.JSpinner();
        btcake = new com.k33ptoo.components.KButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jsfries = new javax.swing.JSpinner();
        btfries = new com.k33ptoo.components.KButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jsnugget = new javax.swing.JSpinner();
        btnugget = new com.k33ptoo.components.KButton();
        btpayment = new com.k33ptoo.components.KButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btback = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1107, 593));
        setMinimumSize(new java.awt.Dimension(1107, 593));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/pizza.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 10, 100, 100);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Qty : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 60, 40, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Pizza");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 100, 40, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Code : 1005");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 0, 90, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price : 15");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 30, 90, 30);
        jPanel1.add(jspizza);
        jspizza.setBounds(150, 60, 50, 30);

        btpizza.setText("BUY");
        btpizza.setkEndColor(new java.awt.Color(0, 0, 0));
        btpizza.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btpizza.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        btpizza.setkStartColor(new java.awt.Color(204, 0, 0));
        btpizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpizzaActionPerformed(evt);
            }
        });
        jPanel1.add(btpizza);
        btpizza.setBounds(120, 100, 70, 30);

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

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 290, 210, 140);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/burger.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 10, 100, 100);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Qty : ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(110, 60, 40, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText(" Hamburger");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 100, 100, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Code : 1001");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(110, 0, 90, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Price : 8");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(110, 30, 90, 30);
        jPanel2.add(jsburger);
        jsburger.setBounds(150, 60, 50, 30);

        btburger.setText("BUY");
        btburger.setkEndColor(new java.awt.Color(0, 0, 0));
        btburger.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btburger.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        btburger.setkStartColor(new java.awt.Color(204, 0, 0));
        btburger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btburgerActionPerformed(evt);
            }
        });
        jPanel2.add(btburger);
        btburger.setBounds(120, 100, 70, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(100, 130, 210, 140);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(null);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/hotdog.png"))); // NOI18N
        jPanel3.add(jLabel12);
        jLabel12.setBounds(0, 10, 100, 100);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Qty : ");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(110, 60, 40, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setText("Hot Dog");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 100, 70, 40);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Code : 1002");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(110, 0, 90, 30);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Price : 2.50");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(110, 30, 90, 30);
        jPanel3.add(jshotdog);
        jshotdog.setBounds(150, 60, 50, 30);

        bthotdog.setText("BUY");
        bthotdog.setkEndColor(new java.awt.Color(0, 0, 0));
        bthotdog.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        bthotdog.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        bthotdog.setkStartColor(new java.awt.Color(204, 0, 0));
        bthotdog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthotdogActionPerformed(evt);
            }
        });
        jPanel3.add(bthotdog);
        bthotdog.setBounds(120, 100, 70, 30);

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

        getContentPane().add(jPanel3);
        jPanel3.setBounds(330, 130, 210, 140);

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setLayout(null);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/burritos.png"))); // NOI18N
        jPanel6.add(jLabel27);
        jLabel27.setBounds(0, 10, 100, 100);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Qty : ");
        jPanel6.add(jLabel28);
        jLabel28.setBounds(110, 60, 40, 30);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 255, 255));
        jLabel29.setText("Burrito");
        jPanel6.add(jLabel29);
        jLabel29.setBounds(20, 100, 50, 40);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Code : 1006");
        jPanel6.add(jLabel30);
        jLabel30.setBounds(110, 0, 90, 30);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Price : 3");
        jPanel6.add(jLabel31);
        jLabel31.setBounds(110, 30, 90, 30);
        jPanel6.add(jsburrito);
        jsburrito.setBounds(150, 60, 50, 30);

        btburrito.setText("BUY");
        btburrito.setkEndColor(new java.awt.Color(0, 0, 0));
        btburrito.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btburrito.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        btburrito.setkStartColor(new java.awt.Color(204, 0, 0));
        btburrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btburritoActionPerformed(evt);
            }
        });
        jPanel6.add(btburrito);
        btburrito.setBounds(120, 100, 70, 30);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(330, 290, 210, 140);

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(null);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/donut.png"))); // NOI18N
        jPanel7.add(jLabel32);
        jLabel32.setBounds(0, 10, 100, 100);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Qty : ");
        jPanel7.add(jLabel33);
        jLabel33.setBounds(110, 60, 40, 30);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 255, 255));
        jLabel34.setText("Donuts");
        jPanel7.add(jLabel34);
        jLabel34.setBounds(30, 100, 60, 40);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Code : 1007");
        jPanel7.add(jLabel35);
        jLabel35.setBounds(110, 0, 90, 30);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Price : 1");
        jPanel7.add(jLabel36);
        jLabel36.setBounds(110, 30, 90, 30);
        jPanel7.add(jsdonut);
        jsdonut.setBounds(150, 60, 50, 30);

        btdonut.setText("BUY");
        btdonut.setkEndColor(new java.awt.Color(0, 0, 0));
        btdonut.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btdonut.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        btdonut.setkStartColor(new java.awt.Color(204, 0, 0));
        btdonut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdonutActionPerformed(evt);
            }
        });
        jPanel7.add(btdonut);
        btdonut.setBounds(120, 100, 70, 30);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(560, 290, 210, 140);

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setLayout(null);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/cake.png"))); // NOI18N
        jPanel8.add(jLabel37);
        jLabel37.setBounds(0, 10, 100, 100);

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Qty : ");
        jPanel8.add(jLabel38);
        jLabel38.setBounds(110, 60, 40, 30);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 255, 255));
        jLabel39.setText("Vanilla Cake");
        jPanel8.add(jLabel39);
        jLabel39.setBounds(10, 100, 90, 40);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Code : 1003");
        jPanel8.add(jLabel40);
        jLabel40.setBounds(110, 0, 90, 30);

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Price : 2");
        jPanel8.add(jLabel41);
        jLabel41.setBounds(110, 30, 90, 30);
        jPanel8.add(jscake);
        jscake.setBounds(150, 60, 50, 30);

        btcake.setText("BUY");
        btcake.setkEndColor(new java.awt.Color(0, 0, 0));
        btcake.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btcake.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        btcake.setkStartColor(new java.awt.Color(204, 0, 0));
        btcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcakeActionPerformed(evt);
            }
        });
        jPanel8.add(btcake);
        btcake.setBounds(120, 100, 70, 30);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(560, 130, 210, 140);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setLayout(null);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/fries.png"))); // NOI18N
        jPanel9.add(jLabel42);
        jLabel42.setBounds(0, 10, 100, 100);

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Qty : ");
        jPanel9.add(jLabel43);
        jLabel43.setBounds(110, 60, 40, 30);

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 255, 255));
        jLabel44.setText("French Fries");
        jPanel9.add(jLabel44);
        jLabel44.setBounds(10, 100, 100, 40);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Code : 1004");
        jPanel9.add(jLabel45);
        jLabel45.setBounds(110, 0, 90, 30);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Price : 3.50");
        jPanel9.add(jLabel46);
        jLabel46.setBounds(110, 30, 90, 30);
        jPanel9.add(jsfries);
        jsfries.setBounds(150, 60, 50, 30);

        btfries.setText("BUY");
        btfries.setkEndColor(new java.awt.Color(0, 0, 0));
        btfries.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btfries.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        btfries.setkStartColor(new java.awt.Color(204, 0, 0));
        btfries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfriesActionPerformed(evt);
            }
        });
        jPanel9.add(btfries);
        btfries.setBounds(120, 100, 70, 30);

        getContentPane().add(jPanel9);
        jPanel9.setBounds(790, 130, 210, 140);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.setLayout(null);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final/Pictures/nuggets.png"))); // NOI18N
        jPanel10.add(jLabel47);
        jLabel47.setBounds(0, 10, 100, 100);

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Qty : ");
        jPanel10.add(jLabel48);
        jLabel48.setBounds(110, 60, 40, 30);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 255, 255));
        jLabel49.setText("Nuggets");
        jPanel10.add(jLabel49);
        jLabel49.setBounds(20, 100, 70, 40);

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Code : 1008");
        jPanel10.add(jLabel50);
        jLabel50.setBounds(110, 0, 90, 30);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Price : 0.50");
        jPanel10.add(jLabel51);
        jLabel51.setBounds(110, 30, 90, 30);
        jPanel10.add(jsnugget);
        jsnugget.setBounds(150, 60, 50, 30);

        btnugget.setText("BUY");
        btnugget.setkEndColor(new java.awt.Color(0, 0, 0));
        btnugget.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btnugget.setkHoverStartColor(new java.awt.Color(0, 255, 0));
        btnugget.setkStartColor(new java.awt.Color(204, 0, 0));
        btnugget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuggetActionPerformed(evt);
            }
        });
        jPanel10.add(btnugget);
        btnugget.setBounds(120, 100, 70, 30);

        getContentPane().add(jPanel10);
        jPanel10.setBounds(790, 290, 210, 140);

        btpayment.setText("Payment");
        btpayment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpaymentActionPerformed(evt);
            }
        });
        getContentPane().add(btpayment);
        btpayment.setBounds(460, 460, 140, 50);

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));
        jPanel11.setLayout(null);

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Fast Food ");
        jPanel11.add(jLabel1);
        jLabel1.setBounds(460, 20, 200, 70);

        btback.setText("Back");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });
        jPanel11.add(btback);
        btback.setBounds(20, 40, 100, 40);

        getContentPane().add(jPanel11);
        jPanel11.setBounds(0, 0, 1110, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btpizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpizzaActionPerformed
        int qty = Integer.parseInt(jspizza.getValue().toString());
        if(qty>0){
            int code = 1005;
            String name = "Pizza";
            float price = 15f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jspizza.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_btpizzaActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton5ActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        Order_Option.main(null);
        dispose();
    }//GEN-LAST:event_btbackActionPerformed

    private void btburgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btburgerActionPerformed
        int qty = Integer.parseInt(jsburger.getValue().toString());
        if(qty>0){
            int code = 1001;
            String name = "Hamburger";
            float price = 8f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jsburger.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_btburgerActionPerformed

    private void btpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpaymentActionPerformed
        Payment.main(null);
        dispose();
    }//GEN-LAST:event_btpaymentActionPerformed

    private void bthotdogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthotdogActionPerformed
      int qty = Integer.parseInt(jshotdog.getValue().toString());
        if(qty>0){
            int code = 1002;
            String name = "Hot Dog";
            float price = 2.50f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jshotdog.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_bthotdogActionPerformed

    private void btcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcakeActionPerformed
        int qty = Integer.parseInt(jscake.getValue().toString());
        if(qty>0){
            int code = 1003;
            String name = "Vanilla Cake";
            float price = 2f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jscake.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_btcakeActionPerformed

    private void btfriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfriesActionPerformed
        int qty = Integer.parseInt(jsfries.getValue().toString());
        if(qty>0){
            int code = 1004;
            String name = "French Fries";
            float price = 3.50f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jsfries.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_btfriesActionPerformed

    private void btburritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btburritoActionPerformed
         int qty = Integer.parseInt(jsburrito.getValue().toString());
        if(qty>0){
            int code = 1006;
            String name = "Burrito";
            float price = 3f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jsburrito.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_btburritoActionPerformed

    private void btdonutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdonutActionPerformed
         int qty = Integer.parseInt(jsdonut.getValue().toString());
        if(qty>0){
            int code = 1007;
            String name = "Donut";
            float price = 1f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jsdonut.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_btdonutActionPerformed

    private void btnuggetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuggetActionPerformed
         int qty = Integer.parseInt(jsnugget.getValue().toString());
        if(qty>0){
            int code = 1008;
            String name = "Nuggets";
            float price = 0.50f;
            Amount(qty,price);
            shop.InsertData(code, name, qty, price,amount);
            shop.FetchData();
            jsnugget.setValue(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Qty..!!");
        }
    }//GEN-LAST:event_btnuggetActionPerformed

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
            java.util.logging.Logger.getLogger(Fast_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fast_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fast_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fast_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fast_Food().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btback;
    private com.k33ptoo.components.KButton btburger;
    private com.k33ptoo.components.KButton btburrito;
    private com.k33ptoo.components.KButton btcake;
    private com.k33ptoo.components.KButton btdonut;
    private com.k33ptoo.components.KButton btfries;
    private com.k33ptoo.components.KButton bthotdog;
    private com.k33ptoo.components.KButton btnugget;
    private com.k33ptoo.components.KButton btpayment;
    private com.k33ptoo.components.KButton btpizza;
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
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JSpinner jsburger;
    private javax.swing.JSpinner jsburrito;
    private javax.swing.JSpinner jscake;
    private javax.swing.JSpinner jsdonut;
    private javax.swing.JSpinner jsfries;
    private javax.swing.JSpinner jshotdog;
    private javax.swing.JSpinner jsnugget;
    private javax.swing.JSpinner jspizza;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    // End of variables declaration//GEN-END:variables
}
