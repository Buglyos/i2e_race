package com.example;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController {

    @FXML
    private CheckBox absoluteCheck;

    @FXML
    private TableColumn<Racer, Boolean> absoluteCol;

    @FXML
    private TableColumn<Racer, LocalDate> birthCol;

    

    @FXML
    private ToggleGroup category;

    @FXML
    private TableColumn<Racer, String> categoryCol;

    @FXML
    private TableColumn<Racer, Integer> idCol;

    @FXML
    private DatePicker birthPicker;

    @FXML
    private TextField idField;

    @FXML
    private TableColumn<Racer, String> nameCol;

    @FXML
    private TextField nameField;

    @FXML
    private TableView<Racer> racerTable;

    @FXML
    void initialize() {
        System.out.println("Működik");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        birthCol.setCellValueFactory(new PropertyValueFactory<>("birth"));
        categoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        absoluteCol.setCellValueFactory(new PropertyValueFactory<>("absolute"));

    }

    @FXML
    void onClickAboutButton(ActionEvent event) {

    }

    @FXML
    void onClickAddButton(ActionEvent event) {
        Racer racer = new Racer();
        racer.setName(nameField.getText());
        racer.setBirth(birthPicker.getValue());
        
         String cat = ((RadioButton) category.getSelectedToggle()).getId();
         racer.setCategory(cat);
         racer.setAbsolute(absoluteCheck.isSelected());
         racerTable.getItems().add(racer);


    }

    @FXML
    void onClickDeleteButton(ActionEvent event) {

    }

    @FXML
    void onClickModifyButton(ActionEvent event) {

    }

}
