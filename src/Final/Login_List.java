
package Final;

import java.util.ArrayList;

public class Login_List {
    String email;
    String password;
    
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
  
    public Login_List(String email, String password) {
        this.email = email;
        this.password = password;
    }
    static ArrayList<Login_List> list = new ArrayList<>();
}
