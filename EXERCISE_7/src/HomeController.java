package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


public class HomeController implements Initializable{

    ObservableList<User> tablecontainer = FXCollections.observableArrayList();

    @FXML
    private Button createbutton;

    @FXML
    private Button deletebutton;

    @FXML
    private Button updatebutton;

    @FXML
    private TableColumn<User, String> usernamecol;

    @FXML
    private TableColumn<User, String> passwordcol;

    @FXML
    private TableColumn<User, String> statuscol;

    @FXML
    private TableColumn<User, String> accountcreatedcol;

    @FXML
    private TextField passwordtextfield;

    @FXML
    private ChoiceBox<?> statuschoicebox;

    @FXML
    private TableView<?> tablecontainer;

    @FXML
    private Label username;

    @FXML
    private TextField usernametextfield;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
     
        String user = LoginController.user.getUsername();

        nameLabel.setText("Hello " + user);
    }

}