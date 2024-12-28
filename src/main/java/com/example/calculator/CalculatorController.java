package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorController {
    public Button seven;
    public Button nine;
    public Button eight;
    public Button equal;
    public Button clear;
    public Button on;
    public TextField screenValue;
    public Label ansLabel;

    public void addition(ActionEvent event) {
        String num1 = screenValue.getText();
        screenValue.setText(num1 +"+");


    }

    public void division(ActionEvent event) {
        String num1 = screenValue.getText();
        screenValue.setText(num1 +"/");
    }

    public void multipilcation(ActionEvent event) {
        String num1 = screenValue.getText();
        screenValue.setText(num1 +"*");
    }

    public void subtraction(ActionEvent event) {
        String num1 = screenValue.getText();
        screenValue.setText(num1 +"-");

    }

    public void seven(ActionEvent event) {

        screenValue.setText(screenValue.getText()+ "7");
    }


    public void two(ActionEvent event) {

        screenValue.setText(screenValue.getText()+"2");
    }

    public void one(ActionEvent event) {
        screenValue.setText(screenValue.getText()+"1");
    }


    public void zero(ActionEvent event) {
        screenValue.setText(screenValue.getText()+"0");
    }
    public void six(ActionEvent event) {
        screenValue.setText(screenValue.getText()+"6");
    }

    public void five(ActionEvent event) {
        screenValue.setText(screenValue.getText()+"5");
    }

    public void four(ActionEvent event) {
        screenValue.setText(screenValue.getText()+"4");
    }

    public void nine(ActionEvent event) {
        screenValue.setText(screenValue.getText()+"9");
    }

    public void eight(ActionEvent event) {
        screenValue.setText(screenValue.getText()+"8");
    }

    public void three(ActionEvent event) {
        screenValue.setText(screenValue.getText()+"3");
    }

    public void equal(ActionEvent event) {
        String theStr= screenValue.getText();

        for( char c: theStr.toCharArray()){
            if (c == '+' ) {


                String[] parts = theStr.split("\\+");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);

                // Perform addition
                int result = num1 +num2;
                ansLabel.setText(String.valueOf(result));

                break; // Stop searching after finding the first operator
            } else if (c== '-') {
                String[] parts = theStr.split("\\-");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);

                // Perform addition
                int result = num1 -num2;
                ansLabel.setText(String.valueOf(result));

                break; // Stop searching after finding the first operator

            } else if (c=='*') {
                String[] parts = theStr.split("\\*");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);

                // Perform addition
                int result = num1 *num2;
                ansLabel.setText(String.valueOf(result));

                break; // Stop searching after finding the first operator

            } else if (c=='/') {
                String[] parts = theStr.split("\\+");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);

                // Perform addition
                int result = num1/num2;
                ansLabel.setText(String.valueOf(result));

                break; // Stop searching after finding the first operator

            }

        }
        screenValue.setText("");
    }

    public void clear(ActionEvent event) {
        ansLabel.setText("");
        screenValue.setText("");
    }

    public void on(ActionEvent event) {
        screenValue.setText("0");

    }

}
