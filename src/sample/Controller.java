package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private Button btbEnter;

    @FXML
    private TextField txtEntry;

    @FXML
    private Label lblNamefield;
    public void insideHello(){
        System.out.println("Hi!");
    }

    @FXML
    public void showName(MouseEvent event) {
        String name = txtEntry.getText();
        lblNamefield.setText("Hello " + name);
    }
}

