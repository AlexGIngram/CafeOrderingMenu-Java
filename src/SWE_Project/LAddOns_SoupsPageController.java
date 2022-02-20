/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWE_Project;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class LAddOns_SoupsPageController implements Initializable {
    
    public static ArrayList<String> items = new ArrayList<String>();
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("CartPage.fxml"));
    CartPageController c = loader.getController();

    @FXML
    private Label item1;
    @FXML
    private Label item2;
    @FXML
    private Label item3;
    @FXML
    private Button price1;
    @FXML
    private Button price2;
    @FXML
    private Button price3m;
    @FXML
    private Button price3l;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        item1.setText(items.get(0));
        price1.setText(items.get(1));
        item2.setText(items.get(2));
        price2.setText(items.get(3));
        item3.setText(items.get(4));
        price3m.setText(items.get(5));
        price3l.setText(items.get(6));
    }

    public static void addItem(String i) {
        items.add(i);
    }

    @FXML
    private void frenchFries(ActionEvent event) {      
        c.addFood(item1.getText());
        c.addPrice(Double.parseDouble(price1.getText()));           
    }

    @FXML
    private void bakedPotato(ActionEvent event) {
        c.addFood(item2.getText());
        c.addPrice(Double.parseDouble(price2.getText()));           
    }

    @FXML
    private void soupDay_M(ActionEvent event) {
        c.addFood(item3.getText() + " Medium");
        c.addPrice(Double.parseDouble(price3m.getText()));           
    }

    @FXML
    private void soupDay_L(ActionEvent event) {
        c.addFood(item3.getText() + " Large");
        c.addPrice(Double.parseDouble(price3l.getText()));           
    }
    
}
