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
public class BreakfastMenuPageController implements Initializable {

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
    private void handleBSandwichesPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BSandwichesPage.fxml"));
        BSandwichesPageController c = loader.getController();
        items = getMenu("BSandwiches");
        String i;
        for(int k = 0; k < items.size(); k++) {
           i = items.get(k);
           c.addItem(i);
        }
        Parent root = FXMLLoader.load(getClass().getResource("BSandwichesPage.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }

    @FXML
    private void handleBLightPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BLightPage.fxml"));
        BLightPageController c = loader.getController();
        items = getMenu("BLight");
        String i;
        for(int k = 0; k < items.size(); k++) {
           i = items.get(k);
           c.addItem(i);
        }
        Parent root = FXMLLoader.load(getClass().getResource("BLightPage.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }

    @FXML
    private void handleBOmelets(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BOmeletsPage.fxml"));
        BOmeletsPageController c = loader.getController();
        items = getMenu("BOmelets");
        String i;
        for(int k = 0; k < items.size(); k++) {
           i = items.get(k);
           c.addItem(i);
        }
        Parent root = FXMLLoader.load(getClass().getResource("BOmeletsPage.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }

    @FXML
    private void handleBPlattersPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BPlattersPage.fxml"));
        BPlattersPageController c = loader.getController();
        items = getMenu("BPlatters");
        String i;
        for(int k = 0; k < items.size(); k++) {
           i = items.get(k);
           c.addItem(i);
        }
        Parent root = FXMLLoader.load(getClass().getResource("BPlattersPage.fxml"));
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
