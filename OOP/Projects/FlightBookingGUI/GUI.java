package com.example.demo1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        Flight myFlight = new Flight("251");
        Label passportNumberL = new Label("Passport number");
        Label nameL = new Label("Name");
        Label ageL = new Label("Age");
        TextField passportNumberTF = new TextField();
        TextField nameTF = new TextField();
        TextField ageTF = new TextField();
        Button btn = new Button("Add Passenger");
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10 ,20 , 10 ,10));
        pane.setVgap(10);
        pane.setHgap(10);
        pane.addColumn(0, passportNumberL, nameL, ageL, btn);
        pane.addColumn(1, passportNumberTF, nameTF, ageTF);

        btn.setOnAction(e -> Flight.addPassenger(new Passenger(passportNumberTF.getText(),nameTF.getText(),Integer.parseInt(ageTF.getText()))));

        Scene scene = new Scene(pane, 290,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("A passenger");
        primaryStage.show();
    }
}
