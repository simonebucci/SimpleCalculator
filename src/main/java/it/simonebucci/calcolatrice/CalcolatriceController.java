package it.simonebucci.calcolatrice;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Objects;

public class CalcolatriceController {

    private String symbol = "";
    private String first = "";
    private String second = "";

    @FXML
    private Label res;

    @FXML
    public void add() {
        if(Objects.equals(symbol, "")){
            res.setText(res.getText()+"+");
            symbol = "+";
        }
    }

    public void sub(){
        if(Objects.equals(symbol, "")){
            res.setText(res.getText()+"-");
            symbol = "-";
        }
    }

    public void div(){
        if(Objects.equals(symbol, "")){
            res.setText(res.getText()+":");
            symbol = "/";
        }
    }

    public void mult(){
        if(Objects.equals(symbol, "")){
            res.setText(res.getText()+"x");
            symbol = "*";
        }
    }

    public void perc(){
        if(Objects.equals(symbol, "")) {
            if (!res.getText().equals("ERROR")) {
                res.setText(String.valueOf(Double.parseDouble(res.getText()) / 100));
            }
        }
    }

    public void printEqual(){

        if(symbol != null){
            switch (symbol) {
                case "+":
                    if (first.indexOf('.') == -1 && second.indexOf('.') == -1) {
                        res.setText(String.valueOf(Integer.parseInt(first) + Integer.parseInt(second)));
                    } else if(first.indexOf('.') != -1 || second.indexOf('.') != -1){
                        res.setText(String.valueOf(Double.parseDouble(first) + Double.parseDouble(second)));
                    }
                    break;
                case "-":
                    if (first.indexOf('.') == -1 && second.indexOf('.') == -1) {
                        res.setText(String.valueOf(Integer.parseInt(first) - Integer.parseInt(second)));
                    } else if(first.indexOf('.') != -1 || second.indexOf('.') != -1){
                        res.setText(String.valueOf(Double.parseDouble(first) - Double.parseDouble(second)));
                    }
                    break;
                case "*":
                    if (first.indexOf('.') == -1 && second.indexOf('.') == -1) {
                        res.setText(String.valueOf(Integer.parseInt(first) * Integer.parseInt(second)));
                    } else if(first.indexOf('.') != -1 || second.indexOf('.') != -1){
                        res.setText(String.valueOf(Double.parseDouble(first) * Double.parseDouble(second)));
                    }
                    break;
                case "/":
                    if (second.equals("0")) {
                        res.setText("ERROR");
                    } else {
                            res.setText(String.valueOf(Double.parseDouble(first) / Double.parseDouble(second)));
                    }
                    break;
            }
        }
        symbol = "";
        if(res.getText().equals("ERROR")){
            first = "0";
        }else {
            first = res.getText();
        }
        second = "";
    }

    public void printZero(){
        int num0 = 0;
        if(Objects.equals(symbol, "")){
            first = first + num0;
        }else{
            second = second + num0;
        }
        res.setText(res.getText()+ num0);
    }

    public void printOne(){
        int num1 = 1;
        if(Objects.equals(symbol, "")){
            first = first + num1;
        }else{
            second = second + num1;
        }
        res.setText(res.getText()+ num1);
    }

    public void printTwo(){

        int num2 = 2;
        if(Objects.equals(symbol, "")){
            first = first + num2;
        }else{
            second = second + num2;
        }
        res.setText(res.getText()+ num2);
    }

    public void printThree(){
        int num3 = 3;
        if(Objects.equals(symbol, "")){
            first = first + num3;
        }else{
            second = second + num3;
        }
        res.setText(res.getText()+ num3);
    }

    public void printFour(){
        int num4 = 4;
        if(Objects.equals(symbol, "")){
            first = first + num4;
        }else{
            second = second + num4;
        }
        res.setText(res.getText()+ num4);
    }

    public void printFive(){
        int num5 = 5;
        if(Objects.equals(symbol, "")){
            first = first + num5;
        }else{
            second = second + num5;
        }
        res.setText(res.getText()+ num5);
    }

    public void printSix(){
        int num6 = 6;
        if(Objects.equals(symbol, "")){
            first = first + num6;
        }else{
            second = second + num6;
        }
        res.setText(res.getText()+ num6);
    }

    public void printSeven(){
        int num7 = 7;
        if(Objects.equals(symbol, "")){
            first = first + num7;
        }else{
            second = second + num7;
        }
        res.setText(res.getText()+ num7);
    }

    public void printEight(){
        int num8 = 8;
        if(Objects.equals(symbol, "")){
            first = first + num8;
        }else{
            second = second + num8;
        }
        res.setText(res.getText()+ num8);
    }

    public void printNine(){
        int num9 = 9;
        if(Objects.equals(symbol, "")){
            first = first + num9;
        }else{
            second = second + num9;
        }
        res.setText(res.getText()+ num9);
    }

    public void printDot(){
        if(Objects.equals(symbol, "")){
            first = first + ".";
        }else{
            second = second + ".";
        }
        res.setText(res.getText()+".");
    }

    public void changeSign(){
        if(!res.getText().equals("ERROR")) {
            if (first.indexOf('.') == -1 && second.indexOf('.') == -1) {
                if (Integer.signum(Integer.parseInt(res.getText())) == 1) {
                    res.setText("-" + res.getText());
                } else {
                    res.setText(res.getText().substring(1));
                }
            } else if (first.indexOf('.') != -1 || second.indexOf('.') != -1) {
                if (Math.signum(Double.parseDouble(res.getText())) == 1) {
                    res.setText("-" + res.getText());
                } else {
                    res.setText(res.getText().substring(1));
                }
            }
            first = res.getText();
        }
    }

    public void delete(){
        res.setText("");
        symbol = "";
        first = "";
        second = "";
    }
}