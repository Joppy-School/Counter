package com.jop.counter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    private int nums = 0;
    @FXML
    private TextField Result;

    @FXML
    protected void Plus() {
        this.nums = this.nums + 1;
        Result.setText(this.nums + " ");
    }
    @FXML
    protected void Reset() {
        this.nums = 0;
        Result.setText(this.nums + " ");
    }

}