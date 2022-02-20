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
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class EmployeePageController implements Initializable {

    @FXML
    private AnchorPane displayArea;
    @FXML
    private TextField idBox;
    @FXML
    private TextField passwordBox;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public Boolean checkEmployee(String id, String pass, String line){
        int idLength = id.length();
        int passLength = pass.length();
        int lineLength = line.length();
        if(idLength == 0 || passLength == 0 || lineLength == 0) {
            return false;
        }
        else{
            int k = 0;
            while(line.charAt(k) != '/' || k < idLength) {
                if(line.charAt(k) == id.charAt(k)) {
                    k++;
                }
                else{
                    return false;
                }
            }
            if(line.substring(0, k).length() != idLength) {
                return false;
            }
            k++;
            int i = 0;
            while(i != passLength || k < lineLength) {
                if(line.charAt(k) == pass.charAt(i)) {
                    k++;
                    i++;
                }
                else {
                    return false;                       
                }
            }
        }       
        return true;
    }

    @FXML
    private void handleEmployeePageAccessedButton(ActionEvent event) throws IOException {
        File file = new File("EmployeeTable.txt");
        Scanner s = new Scanner(file);
        String id = idBox.getText();
        String pass = passwordBox.getText();
        Boolean match;
        if(id.length() == 0 || pass.length() == 0){
            
        }
        else{
        while(s.hasNextLine()) {
           String line = s.nextLine();
           match = checkEmployee(id, pass, line);
           if(match == true) {
               Parent root = FXMLLoader.load(getClass().getResource("EmployeePageAccessed.fxml"));
                displayArea.getChildren().removeAll();
                displayArea.getChildren().setAll(root);
                break;
           }
           else {
               
           }
        }
    }
    }
    
}
