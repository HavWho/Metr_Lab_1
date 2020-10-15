package sample;

import java.net.URL;
import java.sql.SQLOutput;
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
    String[] ans = new String[100];
    int strNum = 0;
    String answerStr = "";
    RegsVocabulary regsVocabulary = new RegsVocabulary();
    RegsCounter regsCounter = new RegsCounter();
    String[] regsArray = regsVocabulary.arrRegex;
    LiteralsCounter literalsCounter = new LiteralsCounter();
    OperandsCounter operandsCounter = new OperandsCounter();
    int Count;

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
                int numberOfRegs = regsCounter.counter(regsArray, code);
                ans[strNum] = "Количество операторов (N): " + numberOfRegs + "\n";
                strNum++;
                String[] arrLiteralVar = literalsCounter.literalVarCounter(code);
                String[] arrGlobalVar = operandsCounter.globalVarCounter(code);
                String[] arrExempVar = operandsCounter.exempVarCounter(code);
                String[] arrClassVar = operandsCounter.classVarCounter(code);
                for (int i = 0; i < arrLiteralVar.length; i++) {
                    if (arrLiteralVar[i] != "") {
                        Count = countStringInString(arrLiteralVar[i], code);
                        ans[strNum] = "Литерал " + arrLiteralVar[i] + "' - " + Count + " раз\n";
                        strNum++;
                    }
                }
                for (int i = 0; i < arrGlobalVar.length; i++) {
                    if (arrGlobalVar[i] != "") {
                        Count = countStringInString(arrGlobalVar[i], code);
                        ans[strNum] = "Глобальная переменная " + arrGlobalVar[i] + " - " + Count + " раз\n";
                        strNum++;
                    }
                }
                for (int i = 0; i < arrExempVar.length; i++) {
                    if (arrExempVar[i] != "") {
                        Count = countStringInString(arrExempVar[i], code);
                        ans[strNum] = "Переменная экземляра " + arrExempVar[i] + " - " + Count + " раз\n";
                        strNum++;
                    }
                }
                for (int i = 0; i < arrClassVar.length; i++) {
                    if (arrClassVar[i] != "") {
                        Count = countStringInString(arrClassVar[i], code);
                        ans[strNum] = "Переменная класса " + arrClassVar[i] + " - " + Count + " раз\n";
                        strNum++;
                    }
                }
                for (int i = 0; i < ans.length; i++) {
                    if (ans[i] != null) {
                        answerStr += ans[i];
                    }
                }
                outputAnswer(answerStr);
            }
        });
    }

    public static int countStringInString(String search, String text) {
        int count = 0;
        while (text.indexOf(search)>-1){
            text = text.replaceFirst(search, "");
            count++;
        }
        return count;
    }

    void setOutputLabel(String str) {
        outputLbl.setText(str);
    }

    void outputAnswer(String str) {
        outputLbl.setText(str);
    }
}