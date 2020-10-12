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

    String code;
    RegsVocabulary regsVocabulary = new RegsVocabulary();
    RegsCounter regsCounter = new RegsCounter();

    @FXML
    void initialize() {
        ParseBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                code = codeFld.getText();
                if (code == null) {
                    setOutputLabel("Code is null");
                }
            }
        });
        CalcBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String[] regsArray = regsVocabulary.arrRegex;
                int numberOfRegs = regsCounter.counter(regsArray, code);
                outputAnswer(numberOfRegs);
//                setOutputLabel(numberOfRegs);
            }
        });
    }

    void setOutputLabel(String str) {
        outputLbl.setText(str);
    }

    void outputAnswer(int answer) {
        outputLbl.setText("The number of operators is: " + String.valueOf(answer));
    }
}