/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWE_Project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
public class MenuPageController implements Initializable {

    @FXML
    private AnchorPane displayArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleBreakfastMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("BreakfastMenuPage.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }

    @FXML
    private void handleLunchMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LunchMenuPage.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }
    
}
