/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWE_Project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import java.util.ArrayList;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class CartPageController implements Initializable {

    @FXML
    private AnchorPane displayArea;
    
    public static ArrayList<String> food = new ArrayList<String>();
    public static ArrayList<Double> prices = new ArrayList<Double>();
    
    @FXML
    private TextField cartItems;
    @FXML
    private TextField cartPrices;
    @FXML
    private TextField cartTotalPrice;
    
    public String foodArray(ArrayList<String> a) {
        int length = a.size();
        String s = "";
        for(int k = 0; k < length; k++) {
            s += a.get(k) + ", ";
        }
        return s;
    }
    
    public static String priceArray(ArrayList<Double> a) {
        int length = a.size();
        String s = "";
        for(int k = 0; k < length; k++) {
            s += "$" + (a.get(k)).toString() + ", ";
        }
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
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String f = foodArray(food);
        cartItems.setText(f);
        String p = priceArray(prices);
        cartPrices.setText(p);
        String total = totalPrice(prices);
        cartTotalPrice.setText("$" + total);
    }    
    
    public static void addFood (String item) {
        food.add(item);
    }
    
    public static void addPrice (Double price) {
        prices.add(price);
    }
    
    public static String getFood() {
        return food.toString();
    }
    
    public static String getPrice() {
        return priceArray(prices);
    }

    @FXML
    private void handleOrderInfo(ActionEvent event) throws IOException {
        if(cartItems.getText() == "" || cartPrices.getText() == "") {
            
        }
        else{
            Parent root = FXMLLoader.load(getClass().getResource("OrderInfoPage.fxml"));
            displayArea.getChildren().removeAll();
            displayArea.getChildren().setAll(root);
        }
    }
    
}
