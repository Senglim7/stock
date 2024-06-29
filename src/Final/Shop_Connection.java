
package Final;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;  // throw data into database
import java.sql.ResultSet;         // fecth data from database
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Shop_Connection {
    PreparedStatement ps;
    ResultSet r;
    DecimalFormat df = new DecimalFormat("0.00");
    String sql;
  //  double amount;
    String col[] = {"Code","Name","Qty","Price","Amount"};
    ImageIcon icon = new ImageIcon("D:\\Etec\\Java\\Pictures\\check-mark_5290058.png");
    DefaultTableModel model = new DefaultTableModel(col,0);
    
    DefaultTableModel getModel(){
        return model;
    }
    
    double total=0;
    double getTotal(){
        return total;
    }
//      
//    double Amount(int qty,double price){
//        return qty*price;
//    }
//    
    Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/database?useSSL=false","root","");
            System.out.println("Completed.....");
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Error: "+e.getMessage());
        }
        return con;
  }
    
    void InsertData(int code, String name, int qty, double price, double amount){
     
        try {
        sql = "INSERT INTO tbresturant(Code,Name,Qty,Price,Amount)VALUES(?,?,?,?,?)";
        ps = connection().prepareStatement(sql);
        ps.setInt(1, code);
        ps.setString(2, name);
        ps.setInt(3, qty);
        ps.setDouble(4, price);
        ps.setDouble(5, amount);
        int index = ps.executeUpdate();
        if(index>0){
         JOptionPane.showMessageDialog(null, "Data Saved..!!!","Save",index,icon);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    void FetchData(){
        try {
            sql = "SELECT *FROM tbresturant";
            ps = connection().prepareStatement(sql);
            r=ps.executeQuery();
            model.setRowCount(0);
            while(r.next()){
                Object row[]={
                  r.getInt("Code"),
                  r.getString("Name"),
                  r.getInt("Qty"),
                  df.format(r.getDouble("Price"))+"$",
                  df.format(r.getDouble("Amount"))+"$",
                };
                model.addRow(row);
                total+=r.getDouble("Amount");
                ShopListtt.list.add(new ShopListtt(
                        r.getInt("Code"),
                        r.getString("Name"),
                        r.getInt("Qty"),
                        r.getDouble("Price"),
                        r.getDouble("Amount")
                ));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     void Reset(){
        try {
            sql = "DELETE FROM tbresturant";
            ps = connection().prepareStatement(sql);
            int index = ps.executeUpdate();
            if(index>0){
                JOptionPane.showMessageDialog(null, "Data Reset..!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
 
    
    
    
}
