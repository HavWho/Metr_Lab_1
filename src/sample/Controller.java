package sample;

//import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea codFld;

    @FXML
    private Button CalcBtn;

    @FXML
    private Button ParseBtn;

    @FXML
    private Label outputLbl;

    @FXML
    void initialize() {
        assert codFld != null : "fx:id=\"codFld\" was not injected: check your FXML file 'sample.fxml'.";
        assert CalcBtn != null : "fx:id=\"CalcBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert ParseBtn != null : "fx:id=\"ParseBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert outputLbl != null : "fx:id=\"outputLbl\" was not injected: check your FXML file 'sample.fxml'.";

        ParseBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                codFld.setText("Hui");
            }
        });
    }
}