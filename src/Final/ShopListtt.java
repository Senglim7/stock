
package Final;

import java.util.ArrayList;

public class ShopListtt {
    int code;
    String name;
    int qty;
    double price;
    double amount;
    double total;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public double getTotal() {
        return total;
    }
   
     public ShopListtt(int code, String name, int qty, double price, double amount) {
        this.code = code;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.amount = amount;
    }
    static ArrayList<ShopListtt> list = new ArrayList<>();
}
