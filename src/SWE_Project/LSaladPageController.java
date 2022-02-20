/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWE_Project;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class LSaladPageController implements Initializable {     
    
    public static ArrayList<String> items = new ArrayList<String>();
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("CartPage.fxml"));
    CartPageController c = loader.getController();

    @FXML
    private Button price1m;
    @FXML
    private Button price2m;
    @FXML
    private Button price3m;
    @FXML
    private Button price4m;
    @FXML
    private Button price5m;
    @FXML
    private Button price6m;
    @FXML
    private Button price1l;
    @FXML
    private Button price2l;
    @FXML
    private Button price3l;
    @FXML
    private Button price4l;
    @FXML
    private Button price5l;
    @FXML
    private Button price6l;
    @FXML
    private Button price7l;
    @FXML
    private Button price8l;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        item1.setText(items.get(0));
        price1m.setText(items.get(1));
        price1l.setText(items.get(2));
        item2.setText(items.get(3));
        price2m.setText(items.get(4));
        price2l.setText(items.get(5));
        item3.setText(items.get(6));
        price3m.setText(items.get(7));
        price3l.setText(items.get(8));
        item4.setText(items.get(9));
        price4m.setText(items.get(10));
        price4l.setText(items.get(11));
        item5.setText(items.get(12));
        price5m.setText(items.get(13));
        price5l.setText(items.get(14));
        item6.setText(items.get(15));
        price6m.setText(items.get(16));
        price6l.setText(items.get(17));
        item7.setText(items.get(18));
        price7l.setText(items.get(19));
        item8.setText(items.get(20));
        price8l.setText(items.get(21));
    }

    public static void addItem(String i) {
        items.add(i);
    }

    @FXML
    private void GardenS_M(ActionEvent event) {
        c.addFood(item1.getText()+ "(Medium)");
        c.addPrice(Double.parseDouble(price1m.getText()));
    }

    @FXML
    private void CaesarS_M(ActionEvent event) {
        c.addFood(item2.getText()+ "(Medium)");
        c.addPrice(Double.parseDouble(price2m.getText()));
    }

    @FXML
    private void TunaS_M(ActionEvent event) {
        c.addFood(item3.getText()+ "(Medium)");
        c.addPrice(Double.parseDouble(price3m.getText()));
    }

    @FXML
    private void ChickenS_M(ActionEvent event) {
        c.addFood(item4.getText()+ "(Medium)");
        c.addPrice(Double.parseDouble(price4m.getText()));
    }

    @FXML
    private void GrilledChicS_M(ActionEvent event) {
        c.addFood(item5.getText()+ "(Medium)");
        c.addPrice(Double.parseDouble(price5m.getText()));
    }

    @FXML
    private void GrilledChicCaesarS_M(ActionEvent event) {
        c.addFood(item6.getText()+ "(Medium)");
        c.addPrice(Double.parseDouble(price6m.getText()));
    }

    @FXML
    private void GardenS_L(ActionEvent event) {
        c.addFood(item1.getText()+ "(Large)");
        c.addPrice(Double.parseDouble(price1l.getText()));
    }

    @FXML
    private void CaesarS_L(ActionEvent event) {
        c.addFood(item2.getText()+ "(Large)");
        c.addPrice(Double.parseDouble(price2l.getText()));       
    }

    @FXML
    private void TunaS_L(ActionEvent event) {
        c.addFood(item3.getText()+ "(Large)");
        c.addPrice(Double.parseDouble(price3l.getText()));        
    }

    @FXML
    private void ChickenS_L(ActionEvent event) {
        c.addFood(item4.getText()+ "(Large)");
        c.addPrice(Double.parseDouble(price4l.getText()));       
    }

    @FXML
    private void GrilledChicS_L(ActionEvent event) {
        c.addFood(item5.getText()+ "(Large)");
        c.addPrice(Double.parseDouble(price5l.getText()));        
    }

    @FXML
    private void GrilledChicCaesarS_L(ActionEvent event) {
        c.addFood(item6.getText()+ "(Large)");
        c.addPrice(Double.parseDouble(price6l.getText()));        
    }

    @FXML
    private void FriedChicS_L(ActionEvent event) {
        c.addFood(item7.getText()+ "(Large)");
        c.addPrice(Double.parseDouble(price7l.getText()));        
    }

    @FXML
    private void ChefS_L(ActionEvent event) {
        c.addFood(item8.getText()+ "(Large)");
        c.addPrice(Double.parseDouble(price8l.getText()));        
    }
    
}
