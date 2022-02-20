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
public class LSandwichesPageController implements Initializable {
    
    public static ArrayList<String> items = new ArrayList<>();
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("CartPage.fxml"));
    CartPageController c = loader.getController();

    @FXML
    private Label item1;
    @FXML
    private Label item2;
    @FXML
    private Label item3;
    @FXML
    private Label item4;
    @FXML
    private Label item5;
    @FXML
    private Label item6;
    @FXML
    private Label item7;
    @FXML
    private Label item8;
    @FXML
    private Label item9;
    @FXML
    private Label item10;
    @FXML
    private Label item11;
    @FXML
    private Label item12;
    @FXML
    private Label item13;
    @FXML
    private Label item14;
    @FXML
    private Button price1;
    @FXML
    private Button price2;
    @FXML
    private Button price6;
    @FXML
    private Button price5;
    @FXML
    private Button price4;
    @FXML
    private Button price3;
    @FXML
    private Button price7;
    @FXML
    private Button price8;
    @FXML
    private Button price9;
    @FXML
    private Button price13;
    @FXML
    private Button price12;
    @FXML
    private Button price11;
    @FXML
    private Button price10;
    @FXML
    private Button price14;

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
        price3.setText(items.get(5));
        item4.setText(items.get(6));
        price4.setText(items.get(7));
        item5.setText(items.get(8));
        price5.setText(items.get(9));
        item6.setText(items.get(10));
        price6.setText(items.get(11));
        item7.setText(items.get(12));
        price7.setText(items.get(13));
        item8.setText(items.get(14));
        price8.setText(items.get(15));
        item9.setText(items.get(16));
        price9.setText(items.get(17));
        item10.setText(items.get(18));
        price10.setText(items.get(19));
        item11.setText(items.get(20));
        price11.setText(items.get(21));
        item12.setText(items.get(22));
        price12.setText(items.get(23));
        item13.setText(items.get(24));
        price13.setText(items.get(25));
        item14.setText(items.get(26));
        price14.setText(items.get(27));
    }

    public static void addItem(String i) {
        items.add(i);
    }

    @FXML
    private void hamCheeseSand(ActionEvent event) {
        c.addFood(item1.getText());
        c.addPrice(Double.parseDouble(price1.getText()));
    }

    @FXML
    private void turkeyCheeseSand(ActionEvent event) {
        c.addFood(item2.getText());
        c.addPrice(Double.parseDouble(price2.getText()));       
    }

    @FXML
    private void BLTSand(ActionEvent event) {
        c.addFood(item6.getText());
        c.addPrice(Double.parseDouble(price6.getText()));        
    }

    @FXML
    private void tunaSaladSand(ActionEvent event) {
        c.addFood(item5.getText());
        c.addPrice(Double.parseDouble(price5.getText()));        
    }

    @FXML
    private void chickenSaladSand(ActionEvent event) {
        c.addFood(item4.getText());
        c.addPrice(Double.parseDouble(price4.getText()));        
    }

    @FXML
    private void roastBeefCheeseSand(ActionEvent event) {
        c.addFood(item3.getText());
        c.addPrice(Double.parseDouble(price3.getText()));        
    }

    @FXML
    private void hotdogSand(ActionEvent event) {
        c.addFood(item7.getText());
        c.addPrice(Double.parseDouble(price7.getText()));        
    }

    @FXML
    private void grilledCheeseSand(ActionEvent event) {
        c.addFood(item8.getText());
        c.addPrice(Double.parseDouble(price8.getText()));          
    }

    @FXML
    private void grilledReubenSand(ActionEvent event) {
        c.addFood(item9.getText());
        c.addPrice(Double.parseDouble(price9.getText()));          
    }

    @FXML
    private void chickenSaladCheddarMeltSand(ActionEvent event) {
        c.addFood(item13.getText());
        c.addPrice(Double.parseDouble(price13.getText()));          
    }

    @FXML
    private void grilledHamCheeseSand(ActionEvent event) {
        c.addFood(item12.getText());
        c.addPrice(Double.parseDouble(price12.getText()));          
    }

    @FXML
    private void grilledTurkeyCheeseSand(ActionEvent event) {
        c.addFood(item11.getText());
        c.addPrice(Double.parseDouble(price11.getText()));          
    }

    @FXML
    private void pattyMeltSand(ActionEvent event) {
        c.addFood(item10.getText());
        c.addPrice(Double.parseDouble(price10.getText()));         
    }

    @FXML
    private void tunaMeltSand(ActionEvent event) {
        c.addFood(item14.getText());
        c.addPrice(Double.parseDouble(price14.getText()));          
    }
    
}
