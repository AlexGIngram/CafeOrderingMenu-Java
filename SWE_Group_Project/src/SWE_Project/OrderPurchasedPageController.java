/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWE_Project;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class OrderPurchasedPageController implements Initializable {

    @FXML
    private TextArea receiptText;
    
    String text;
    
    String total;
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("CartPage.fxml"));
    CartPageController c = loader.getController();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        total = totalPrice(c.prices);
        text = foodArray(c.food, c.prices, total);
        receiptText.setText(text);
    }
    
    public String foodArray(ArrayList<String> i, ArrayList<Double> p, String t) {
        int length = i.size();
        String s = "";
        for(int k = 0; k < length; k++) {
            s += i.get(k) + " : $" + Double.toString(p.get(k)) + "\n";
        }
        s += "Total Price: $" + t + "\nHave a nice day!";
        return s;
    }
    
    public String totalPrice(ArrayList<Double> a) {
        int length = a.size();
        double total = 0;
        for(int k = 0; k < length; k++) {
            total += a.get(k);
        }
        total = (double)Math.round(total * 100000d) / 100000d;
        String s = String.valueOf(total);
        return s;
    }
    
}
