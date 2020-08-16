package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

    int operation = 0;
    int dateStored = 0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btnminus;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btnplus;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnmultiply;

    @FXML
    private Button btn0;

    @FXML
    private Button btnequal;

    @FXML
    private Button btnclear;

    @FXML
    private Button btndivide;

    @FXML
    private TextField output;

    @FXML
    public void btnaction(ActionEvent event) {

        if (event.getSource() == btn1) {
            output.setText(output.getText() + "1");
        }
        else if(event.getSource() == btn2) {
            output.setText(output.getText() + "2");
        }
        else if(event.getSource() == btn3) {
            output.setText(output.getText() + "3");
        }
        else if(event.getSource() == btn4) {
            output.setText(output.getText() + "4");
        }
        else if(event.getSource() == btn5) {
            output.setText(output.getText() + "5");
        }
        else if(event.getSource() == btn6) {
            output.setText(output.getText() + "6");
        }
        else if(event.getSource() == btn7) {
            output.setText(output.getText() + "7");
        }
        else if(event.getSource() == btn8) {
            output.setText(output.getText() + "8");
        }
        else if(event.getSource() == btn9) {
            output.setText(output.getText() + "9");
        }
        else if(event.getSource() == btn0) {
            output.setText(output.getText() + "0");
        }

        else if (event.getSource() == btnclear) {
            output.setText("");
        }

        else if (event.getSource() == btnplus) {
            dateStored = Integer.parseInt(output.getText());
            operation = 1;
            output.setText("");
        }
        else if (event.getSource() == btnminus) {
            dateStored = Integer.parseInt(output.getText());
            operation = 2;
            output.setText("");
        }
        else if (event.getSource() == btndivide) {
            dateStored = Integer.parseInt(output.getText());
            operation = 3;
            output.setText("");
        }
        else if (event.getSource() == btnmultiply) {
            dateStored = Integer.parseInt(output.getText());
            operation = 4;
            output.setText("");
        }

        else if (event.getSource() == btnequal) {
            int secondData = Integer.parseInt(output.getText());
            switch(operation) {

                case 1:
                    output.setText(String.valueOf(dateStored + secondData));
                    break;
                case 2:
                    output.setText(String.valueOf(dateStored - secondData));
                    break;
                case 3:
                    try {
                        output.setText(String.valueOf(dateStored / secondData));
                    }
                    catch (Exception e){
                        output.setText("ERROR");
                    }
                    break;
                case 4:
                    output.setText(String.valueOf(dateStored * secondData));
                    break;
            }
        }
    }
 }
