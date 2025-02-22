package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import application.Main;
import application.model.Characters;

/**
 * @author Christopher Ackerley kfx631
 *
 */

public class ThanatosController {
	
	@FXML
    private Button BackButton;
    
    @FXML
    private Button NextButton;
    
    @FXML
    private Button PreviousButton;
    
    @FXML
    private ImageView charImage;
    
    @FXML
    private TextArea charDescription;
    
    @FXML
    private Text charName;
    	
    
    
    @FXML
    void BackPressed(ActionEvent event) {
    	Main.set_pane(0);
    }
    
    @FXML
    void NextPressed(ActionEvent event) {
    	Main.set_pane(18);
    }
    
    @FXML
    void PreviousPressed(ActionEvent event) {
    	Main.set_pane(16);
    }

}