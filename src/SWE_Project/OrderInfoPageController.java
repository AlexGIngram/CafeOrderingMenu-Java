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
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class OrderInfoPageController implements Initializable {

    ObservableList list = FXCollections.observableArrayList();
    
    public static ArrayList<String> userInfo = new ArrayList<String>();
    
    static String userInfoLine;
    
    @FXML
    private AnchorPane displayArea;
    @FXML
    private ChoiceBox<String> onlinePersonChoice;
    @FXML
    private TextField nameBox;
    @FXML
    private TextField phoneBox;
    @FXML
    private TextField addressBox;
    @FXML
    private TextField addressNotesBox;
    @FXML
    private TextField paymentBox;
    @FXML
    private TextField paymnetInfoBox;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadData();
        if(userInfoLine != null) {
            String info = "";
            for(int k = 0; k < userInfoLine.length(); k++) {
                if(userInfoLine.charAt(k) == '/') {
                    userInfo.add(info);
                    info = "";
                }
                else {
                    info += userInfoLine.charAt(k);
                }
            }
            phoneBox.setText(userInfo.get(0));
            nameBox.setText(userInfo.get(2));
            addressBox.setText(userInfo.get(3));
            addressNotesBox.setText(userInfo.get(4));
            paymentBox.setText(userInfo.get(5));
            paymnetInfoBox.setText(userInfo.get(6));
        }
        
    }

    private void loadData() {
        list.removeAll(list);
        String a = "In Person";
        String b = "Online";
        list.addAll(a, b);
        onlinePersonChoice.getItems().addAll(list);
    }
    
    public static void getUserInfo(String info) {
        userInfoLine = info;
    }
    

    @FXML
    private void handleOrderPurchasedPage(ActionEvent event) throws IOException {
        if(phoneBox.getText() == "" || nameBox.getText() == "" || addressBox.getText() == "" || paymentBox.getText() == "" || onlinePersonChoice.getValue() == null) {
            
        }
        else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CartPage.fxml"));
            CartPageController c = loader.getController();
            String food = c.getFood();
            String price = c.getPrice();
            File file = new File("OrdersTable.txt");
            FileWriter f = new FileWriter(file, true);
            f.write(food + "/" + price +"/" + nameBox.getText() + "/" + phoneBox.getText() + "/" + addressBox.getText() + "/" + addressNotesBox.getText() + "/" + paymentBox.getText() + "/" + paymnetInfoBox.getText() + "/" + onlinePersonChoice.getValue() + "\n");
            f.close();
            File userF = new File("UserTable.txt");
            Scanner s = new Scanner(userF);
            StringBuffer buffer = new StringBuffer();
            String info = "";
            String line;
            while (s.hasNextLine()) {
            buffer.append(s.nextLine()+System.lineSeparator());
            }
            String fileContents = buffer.toString();
            s.close();
            String old = userInfo.get(0) + "/" + userInfo.get(1) + "/" + userInfo.get(2) + "/" + userInfo.get(3) + "/" + userInfo.get(4) + "/" + userInfo.get(5) + "/" + userInfo.get(6) + "/";
            userInfo.set(3, addressBox.getText());
            userInfo.set(4, addressNotesBox.getText());
            userInfo.set(5, paymentBox.getText());
            userInfo.set(6, paymnetInfoBox.getText());
            String updated = userInfo.get(0) + "/" + userInfo.get(1) + "/" + userInfo.get(2) + "/" + userInfo.get(3) + "/" + userInfo.get(4) + "/" + userInfo.get(5) + "/" + userInfo.get(6) + "/";
            fileContents = fileContents.replaceAll(old, updated);
            FileWriter writer = new FileWriter(userF);
            writer.append(fileContents);
            writer.flush();
            Parent root = FXMLLoader.load(getClass().getResource("OrderPurchasedPage.fxml"));
            displayArea.getChildren().removeAll();
            displayArea.getChildren().setAll(root);
        }
    }

    
}
