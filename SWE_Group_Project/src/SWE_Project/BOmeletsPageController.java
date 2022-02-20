/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWE_Project;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class BOmeletsPageController implements Initializable {
    ObservableList list = FXCollections.observableArrayList();
    
    public static ArrayList<String> items = new ArrayList<String>();
    
    String side;
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("CartPage.fxml"));
    CartPageController c = loader.getController();
    
    @FXML
    private ChoiceBox<String> sideChoice;
    @FXML
    private Label item1;
    @FXML
    private Label item2;
    @FXML
    private Label item4;
    @FXML
    private Label item5;
    @FXML
    private Label item6;
    @FXML
    private Label item3;
    @FXML
    private Button price1;
    @FXML
    private Button price2;
    @FXML
    private Button price3;
    @FXML
    private Button price4;
    @FXML
    private Button price5;
    @FXML
    private Button price6;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadData();
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
    }    
    
    private void loadData() {
        list.removeAll(list);
        String a = "Toast";
        String b = "Hash Brown";
        String c = "Grits";
        list.addAll(a, b, c);
        sideChoice.getItems().addAll(list);
    }
    
    public static void addItem(String i) {
        items.add(i);
    }

    @FXML
    private void cheeseOmelet(ActionEvent event) {
    side = sideChoice.getValue();    
    if(side == null) {    
    }
    else {
        c.addFood(item1.getText() + " w. " + side);
        c.addPrice(Double.parseDouble(price1.getText()));
    }
    }

    @FXML
    private void hamCheeseOmelet(ActionEvent event) {
        side = sideChoice.getValue();    
        if(side == null) {    
        }
        else {
        c.addFood(item2.getText() + " w. " + side);
        c.addPrice(Double.parseDouble(price2.getText()));
        } 
    }

    @FXML
    private void turkeyCheeseOmelet(ActionEvent event) {
        side = sideChoice.getValue();    
        if(side == null) {    
        }
        else {
        c.addFood(item3.getText() + " w. " + side);
        c.addPrice(Double.parseDouble(price3.getText()));
        } 
    }

    @FXML
    private void gardenOmelet(ActionEvent event) {
        side = sideChoice.getValue();    
        if(side == null) {    
        }
        else {
        c.addFood(item4.getText() + " w. " + side);
        c.addPrice(Double.parseDouble(price4.getText()));
        } 
    }

    @FXML
    private void westernOmelet(ActionEvent event) {
        side = sideChoice.getValue();    
        if(side == null) {    
        }
        else {
        c.addFood(item5.getText() + " w. " + side);
        c.addPrice(Double.parseDouble(price5.getText()));
        } 
    }

    @FXML
    private void steakCheeseOmelet(ActionEvent event) {
        side = sideChoice.getValue();    
        if(side == null) {    
        }
        else {
        c.addFood(item6.getText() + " w. " + side);
        c.addPrice(Double.parseDouble(price6.getText()));
        } 
    }
    
}
