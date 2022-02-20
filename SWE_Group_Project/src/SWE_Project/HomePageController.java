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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class HomePageController implements Initializable {

    @FXML
    public AnchorPane displayArea;
    @FXML
    private Button loginButtonLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void setLoginButtonText(String s) {
        loginButtonLabel.setText(s);
    }

    @FXML
    private void handleLoginButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }

    @FXML
    private void handleMenuButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuPage.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }

    @FXML
    private void handleEmployeePageButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EmployeePage.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }

    @FXML
    private void handleHomePageButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ActualHomePage.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }

    @FXML
    private void handleCartPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CartPage.fxml"));
        displayArea.getChildren().removeAll();
        displayArea.getChildren().setAll(root);
    }
    
}
