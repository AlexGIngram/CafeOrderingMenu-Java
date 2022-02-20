/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWE_Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class LunchMenuPageController implements Initializable {

    @FXML
    private AnchorPane displayArea;
    
    public static ArrayList<String> items = new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleLSaladsPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LSaladPage.fxml"));
        LSaladPageController c = loader.getController();
        items = getMenu("LSalad");
        String i;
        for(int k = 0; k < items.size(); k++) {
           i = items.get(k);
           c.addItem(i);
        }
        Parent root = FXMLLoader.load(getClass().getResource("LSaladPage.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }

    @FXML
    private void handleLAddOns_SoupsPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LAddOns_SoupsPage.fxml"));
        LAddOns_SoupsPageController c = loader.getController();
        items = getMenu("LAddOns_Soups");
        String i;
        for(int k = 0; k < items.size(); k++) {
           i = items.get(k);
           c.addItem(i);
        }
        Parent root = FXMLLoader.load(getClass().getResource("LAddOns_SoupsPage.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }

    @FXML
    private void handleLSpecialtyPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LSpecialtyItems.fxml"));
        LSpecialtyItemsController c = loader.getController();
        items = getMenu("LSpecialty");
        String i;
        for(int k = 0; k < items.size(); k++) {
           i = items.get(k);
           c.addItem(i);
        }
        Parent root = FXMLLoader.load(getClass().getResource("LSpecialtyItems.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }

    @FXML
    private void handleLSandwichesPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LSandwichesPage.fxml"));
        LSandwichesPageController c = loader.getController();
        items = getMenu("LSandwiches");
        String i;
        for(int k = 0; k < items.size(); k++) {
           i = items.get(k);
           c.addItem(i);
        }
        Parent root = FXMLLoader.load(getClass().getResource("LSandwichesPage.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }
    
    private ArrayList<String> getMenu(String menu) throws FileNotFoundException {
        ArrayList<String> items = new ArrayList<>();
        Scanner in = new Scanner(new File("ItemTable.txt"));
	String line = in.nextLine();
        while(in.hasNextLine()) {
            if(line.equals(menu)) {
                break;
            }
            else {
                line = in.nextLine();
            }
        }
        while(!line.equals("*")) {
            line = in.nextLine();
            int lineLength = line.length();
            String a = "";
            for(int k = 0; k < lineLength; k++) {
                if(line.charAt(k) == '/') {
                    items.add(a);
                    a = "";
                }
                else if (k == lineLength - 1) {
                    a += line.charAt(k);
                    items.add(a);
                    a = "";
                }
                else {
                    a += line.charAt(k);
                }
            }
            
        }
        return items;
    }
    
}
