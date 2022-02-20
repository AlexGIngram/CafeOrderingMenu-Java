/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWE_Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class LoginPageController implements Initializable {

    @FXML
    private TextField loginPhone;
    @FXML
    private TextField loginPassword;
    @FXML
    private TextField registerName;
    @FXML
    private TextField registerPhone;
    @FXML
    private TextField registerPassword;
    @FXML
    private Label loginConfirmation;
    @FXML
    private Label registeredConfirmation;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public Boolean checkEmployee(String phone, String pass, String line){
        int phoneLength = phone.length();
        int passLength = pass.length();
        int lineLength = line.length();
        if(phoneLength == 0 || passLength == 0 || lineLength == 0) {
            return false;
        }
        else{
            int k = 0;
            while(line.charAt(k) != '/' || k < phoneLength) {
                if(line.charAt(k) == phone.charAt(k)) {
                    k++;
                }
                else{
                    return false;
                }
            }
            if(line.substring(0, k).length() != phoneLength) {
                return false;
            }
            k++;
            int i = 0;
            while(i < passLength) {
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
    private void loginButton(ActionEvent event) throws FileNotFoundException {
        File file = new File("UserTable.txt");
        Scanner s = new Scanner(file);
        String phone = loginPhone.getText();
        String pass = loginPassword.getText();
        Boolean match;
        if(phone.length() == 0 || pass.length() == 0){
            
        }
        else{
        while(s.hasNextLine()) {
           String line = s.nextLine();
           match = checkEmployee(phone, pass, line);
           if(match == true) {
                loginConfirmation.setText("Logged In!");
                FXMLLoader loader = new FXMLLoader(getClass().getResource("OrderInfoPage.fxml"));
                OrderInfoPageController c = loader.getController();
                c.getUserInfo(line);
                break;
           }
           else {
               
           }
        }
    }
    }

    @FXML
    private void registerButton(ActionEvent event) throws FileNotFoundException, IOException {
        String name = registerName.getText();
        String phone = registerPhone.getText();
        String pass = registerPassword.getText();
        if(name.length() == 0 || phone.length() == 0 || pass.length() == 0) {
            
        }
        else {
            File file = new File("UserTable.txt");
            FileWriter f = new FileWriter(file, true);
            f.write("\n"+ phone +"/"+ pass + "/"+ name + "/////");
            f.close();
            registeredConfirmation.setText("Registered!");
        }
    }
    
}
