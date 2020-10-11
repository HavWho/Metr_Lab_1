package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea codeFld;

    @FXML
    private Button CalcBtn;

    @FXML
    private Button ParseBtn;

    @FXML
    private Label outputLbl;

    @FXML
    void initialize() {

        ParseBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                outputLbl.setText("mocha");
            }
        });

    }
}