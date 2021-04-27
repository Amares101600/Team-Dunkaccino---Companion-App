package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ZoneSelectController {

    @FXML
    private Button HoHButton;
    
    @FXML
    private Button BackButton;
    
    @FXML
    private Button ElysiumButton;
    
    @FXML
    private Button TartarusButton;
    
    @FXML
    private Button AsphodelButton;   

    @FXML
    private Button GatesButton;
    
    @FXML
    private Button GreeceButton;    
    
    @FXML
    void BackPressed(ActionEvent event) {
    	Main.set_pane(0);
    }

    @FXML
    void HoHPressed(ActionEvent event) {

    	Main.set_pane(3);   	
    }
    
    @FXML
    void ElysiumPressed(ActionEvent event) {
    	Main.set_pane(7); 
    }
    
    @FXML
    void TartarusPressed(ActionEvent event) {
    	Main.set_pane(5); 
    }
    
    @FXML
    void AsphodelPressed(ActionEvent event) {
    	Main.set_pane(6);
    } 
    
    @FXML
    void GatesPressed(ActionEvent event) {

    }    

    @FXML
    void GreecePressed(ActionEvent event) {
    	Main.set_pane(8);
    }    

}

