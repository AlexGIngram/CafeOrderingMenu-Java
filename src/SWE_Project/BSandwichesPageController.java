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
public class BSandwichesPageController implements Initializable {

    ObservableList list = FXCollections.observableArrayList();
    
    public static ArrayList<String> items = new ArrayList<String>();
    
    String meat;
    String breadL;
    String breadR;
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("CartPage.fxml"));
    CartPageController c = loader.getController();
    
    @FXML
    private ChoiceBox<String> breadChoice_L;
    @FXML
    private ChoiceBox<String> meatChoice;
    @FXML
    private ChoiceBox<String> breadChoice_R;
    @FXML
    private Label item1;
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
    private Label item10;
    @FXML
    private Label item11;
    @FXML
    private Label item12;
    @FXML
    private Label item13;
    @FXML
    private Label item2;
    @FXML
    private Label item9;
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
    @FXML
    private Button price7;
    @FXML
    private Button price8;
    @FXML
    private Button price9;
    @FXML
    private Button price10;
    @FXML
    private Button price11;
    @FXML
    private Button price12;
    @FXML
    private Button price13;

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
    }    
    
    private void loadData() {
        list.removeAll(list);
        String a = "Bacon";
        String b = "Turkey Bacon";
        String c = "Sausage";
        String d = "Ham and Turkey";
        list.addAll(a, b, c, d);
        meatChoice.getItems().addAll(list);
        
        list.removeAll(list);
        String e = "Biscuit";
        String f = "English Muffin";
        String g = "Toast (White)";
        String h = "Toast (Wheat)";
        list.addAll(e, f, g, h);
        breadChoice_L.getItems().addAll(list);
        
        list.removeAll(list);
        String i = "Croissant";
        String j = "Bagel (Plain)";
        String k = "Bagel (Sesame Seeds)";
        String l = "Bagel (Cinnamon)";
        String m = "Bagel (Raisin)";
        String n = "Bagel (Everything)";
        list.addAll(i, j, k, l, m, n);
        breadChoice_R.getItems().addAll(list);
    }
    
    public static void addItem(String i) {
        items.add(i);
    }

    @FXML
    private void plainButtered_L(ActionEvent event) {
        breadL = breadChoice_L.getValue();    
        if(breadL == null) {    
        }
        else {
        c.addFood(breadL + " " + item1.getText());
        c.addPrice(Double.parseDouble(price1.getText()));
        }
    }

    @FXML
    private void toastedButtered_L(ActionEvent event) {
        breadL = breadChoice_L.getValue();    
        if(breadL == null) {    
        }
        else {
        c.addFood(breadL + " " + item2.getText());
        c.addPrice(Double.parseDouble(price2.getText()));
        }
    }

    @FXML
    private void eggCheese_L(ActionEvent event) {
        breadL = breadChoice_L.getValue();    
        if(breadL == null) {    
        }
        else {
        c.addFood(breadL + " " + item3.getText());
        c.addPrice(Double.parseDouble(price3.getText()));
        }
    }

    @FXML
    private void meatCheese_L(ActionEvent event) {
        breadL = breadChoice_L.getValue();    
        meat = meatChoice.getValue();
        if(breadL == null || meat == null) {    
        }
        else {
        c.addFood(breadL + " " + item4.getText() + "(" + meat + ")");
        c.addPrice(Double.parseDouble(price4.getText()));
        }
    }

    @FXML
    private void meatEgg_L(ActionEvent event) {
        breadL = breadChoice_L.getValue();    
        meat = meatChoice.getValue();
        if(breadL == null || meat == null) {    
        }
        else {
        c.addFood(breadL + " " + item5.getText() + "(" + meat + ")");
        c.addPrice(Double.parseDouble(price5.getText()));
        }
    }

    @FXML
    private void meatEggCheese(ActionEvent event) {
        breadL = breadChoice_L.getValue();    
        meat = meatChoice.getValue();
        if(breadL == null || meat == null) {    
        }
        else {
        c.addFood(breadL + " " + item6.getText() + "(" + meat + ")");
        c.addPrice(Double.parseDouble(price6.getText()));
        }
    }

    @FXML
    private void plainButtered_R(ActionEvent event) {
        breadR = breadChoice_R.getValue();    
        if(breadR == null) {    
        }
        else {
        c.addFood(breadR + " " + item7.getText());
        c.addPrice(Double.parseDouble(price7.getText()));
        }
    }

    @FXML
    private void toastedButtered_R(ActionEvent event) {
        breadR = breadChoice_R.getValue();    
        if(breadR == null) {    
        }
        else {
        c.addFood(breadR + " " + item8.getText());
        c.addPrice(Double.parseDouble(price8.getText()));
        }
    }

    @FXML
    private void bagelToastedCreamCheese(ActionEvent event) {
        breadR = breadChoice_R.getValue();    
        if(breadR == null || breadR == "Croissant") {    
        }
        else {
        c.addFood(breadR + " " + item9.getText());
        c.addPrice(Double.parseDouble(price9.getText()));
        }
    }

    @FXML
    private void eggCheese_R(ActionEvent event) {
        breadR = breadChoice_R.getValue();    
        if(breadR == null) {    
        }
        else {
        c.addFood(breadR + " " + item10.getText());
        c.addPrice(Double.parseDouble(price10.getText()));
        }
    }

    @FXML
    private void meatCheese_R(ActionEvent event) {
        breadR = breadChoice_R.getValue();    
        meat = meatChoice.getValue();
        if(breadR == null || meat == null) {    
        }
        else {
        c.addFood(breadR + " " + item11.getText() + "(" + meat + ")");
        c.addPrice(Double.parseDouble(price11.getText()));
        }
    }

    @FXML
    private void meatEgg_R(ActionEvent event) {
        breadR = breadChoice_R.getValue();    
        meat = meatChoice.getValue();
        if(breadR == null || meat == null) {    
        }
        else {
        c.addFood(breadR + " " + item12.getText() + "(" + meat + ")");
        c.addPrice(Double.parseDouble(price12.getText()));
        }
    }

    @FXML
    private void sausageEggCheese(ActionEvent event) {
        breadR = breadChoice_R.getValue();    
        if(breadR == null) {    
        }
        else {
        c.addFood(breadR + " " + item13.getText());
        c.addPrice(Double.parseDouble(price13.getText()));
        }
    }
    
}
