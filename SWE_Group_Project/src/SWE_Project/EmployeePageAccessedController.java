/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWE_Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class EmployeePageAccessedController implements Initializable {

    @FXML
    private TextArea tableDisplay;
    
    String location;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleConfirmChanges(ActionEvent event) throws FileNotFoundException {
        if(location == null) {
            
        }
        else{
            PrintWriter w = new PrintWriter(new File(location));
            w.write(tableDisplay.getText());                                                
            w.flush();  
            w.close();
        }
    }

    @FXML
    private void handleOrderTable(ActionEvent event) throws FileNotFoundException {
        location = "OrdersTable.txt";
        Scanner in = new Scanner(new File("OrdersTable.txt"));
	String line = in.nextLine();
	tableDisplay.setText(line);
        while(in.hasNextLine()) {
	line = in.nextLine();
	tableDisplay.appendText("\n"+line);
	}
    }

    @FXML
    private void handleUserTable(ActionEvent event) throws FileNotFoundException {
        location = "UserTable.txt";
        Scanner in = new Scanner(new File("UserTable.txt"));
	String line = in.nextLine();
	tableDisplay.setText(line);
        while(in.hasNextLine()) {
	line = in.nextLine();
	tableDisplay.appendText("\n"+line);
	}
    }
    
}
