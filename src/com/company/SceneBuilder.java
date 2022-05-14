package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class SceneBuilder extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        List<Integer> data = new ArrayList<>();
        List<Integer> data1 = new ArrayList<>();
        List<Integer> data2 = new ArrayList<>();
        List<Integer> data3 = new ArrayList<>();

        ScrollPane noErrorsScrollPane = new ScrollPane();
        noErrorsScrollPane.setTranslateX(0);
        noErrorsScrollPane.setTranslateY(60);
        noErrorsScrollPane.setPrefWidth(380);
        noErrorsScrollPane.setPrefHeight(740);
        VBox vBox = new VBox();
        vBox.setTranslateX(0);
        vBox.setTranslateY(0);
        vBox.setPrefWidth(380);
        vBox.setPrefHeight(60);
        TextField numberOfMessagesTextField = new TextField();
        numberOfMessagesTextField.setPromptText("Number of messages");
        numberOfMessagesTextField.setTranslateX(0);
        numberOfMessagesTextField.setTranslateY(0);
        numberOfMessagesTextField.setPrefWidth(380);
        numberOfMessagesTextField.setPrefHeight(30);
        numberOfMessagesTextField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int numberOfMessages = Integer.parseInt(numberOfMessagesTextField.getText());
                data.add(0, numberOfMessages);
            }
        });
        Button startButton = new Button("Start stop and wait protocol");
        startButton.setPrefWidth(380);
        startButton.setPrefHeight(30);
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Calculations.noErrors(data.get(0), noErrorsScrollPane);
            }
        });
        vBox.getChildren().add(numberOfMessagesTextField);
        vBox.getChildren().add(startButton);
        root.getChildren().add(vBox);
        root.getChildren().add(noErrorsScrollPane);


        ScrollPane lostDataScrollPane = new ScrollPane();
        lostDataScrollPane.setTranslateX(380);
        lostDataScrollPane.setTranslateY(90);
        lostDataScrollPane.setPrefWidth(380);
        lostDataScrollPane.setPrefHeight(710);
        VBox vBox1 = new VBox();
        vBox1.setTranslateX(380);
        vBox1.setTranslateY(0);
        vBox1.setPrefWidth(380);
        vBox1.setPrefHeight(90);
        TextField numberOfMessagesTextField1 = new TextField();
        numberOfMessagesTextField1.setPromptText("Number of messages");
        numberOfMessagesTextField1.setTranslateX(0);
        numberOfMessagesTextField1.setTranslateY(0);
        numberOfMessagesTextField1.setPrefWidth(380);
        numberOfMessagesTextField1.setPrefHeight(30);
        numberOfMessagesTextField1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int numberOfMessages = Integer.parseInt(numberOfMessagesTextField1.getText());
                data1.add(0, numberOfMessages);
            }
        });
        TextField numberOfTheLostMessage = new TextField();
        numberOfTheLostMessage.setPromptText("Index of the message, that is going to be lost");
        numberOfTheLostMessage.setPrefWidth(380);
        numberOfTheLostMessage.setPrefHeight(30);
        numberOfTheLostMessage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int numberOfMessages = Integer.parseInt(numberOfTheLostMessage.getText());
                data1.add(1, numberOfMessages);
            }
        });
        Button startButton1 = new Button("Start stop and wait protocol with lost data");
        startButton1.setPrefWidth(380);
        startButton1.setPrefHeight(30);
        startButton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Calculations.lostData(data1.get(0), data1.get(1), lostDataScrollPane);
            }
        });
        vBox1.getChildren().add(numberOfMessagesTextField1);
        vBox1.getChildren().add(numberOfTheLostMessage);
        vBox1.getChildren().add(startButton1);
        root.getChildren().add(vBox1);
        root.getChildren().add(lostDataScrollPane);


        ScrollPane lostAckScrollPane = new ScrollPane();
        lostAckScrollPane.setTranslateX(380*2);
        lostAckScrollPane.setTranslateY(90);
        lostAckScrollPane.setPrefWidth(380);
        lostAckScrollPane.setPrefHeight(710);
        VBox vBox2 = new VBox();
        vBox2.setTranslateX(380*2);
        vBox2.setTranslateY(0);
        vBox2.setPrefWidth(380);
        vBox2.setPrefHeight(90);
        TextField numberOfMessagesTextField2 = new TextField();
        numberOfMessagesTextField2.setPromptText("Number of messages");
        numberOfMessagesTextField2.setTranslateX(0);
        numberOfMessagesTextField2.setTranslateY(0);
        numberOfMessagesTextField2.setPrefWidth(380);
        numberOfMessagesTextField2.setPrefHeight(30);
        numberOfMessagesTextField2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int numberOfMessages = Integer.parseInt(numberOfMessagesTextField2.getText());
                data2.add(0, numberOfMessages);
            }
        });
        TextField indexOfLostAck = new TextField();
        indexOfLostAck.setPromptText("Index of the message, that is going to be lost");
        indexOfLostAck.setTranslateX(0);
        indexOfLostAck.setTranslateY(0);
        indexOfLostAck.setPrefWidth(380);
        indexOfLostAck.setPrefHeight(30);
        indexOfLostAck.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int numberOfMessages = Integer.parseInt(indexOfLostAck.getText());
                data2.add(1, numberOfMessages);
            }
        });
        Button startButton2 = new Button("Start stop and wait protocol with lost acknowledge");
        startButton2.setPrefWidth(380);
        startButton2.setPrefHeight(30);
        startButton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Calculations.lostAcknowledge(data2.get(0), data2.get(1), lostAckScrollPane);
            }
        });
        vBox2.getChildren().add(numberOfMessagesTextField2);
        vBox2.getChildren().add(indexOfLostAck);
        vBox2.getChildren().add(startButton2);
        root.getChildren().add(vBox2);
        root.getChildren().add(lostAckScrollPane);


        ScrollPane delayedAckScrollPane = new ScrollPane();
        delayedAckScrollPane.setTranslateX(380*3);
        delayedAckScrollPane.setTranslateY(90);
        delayedAckScrollPane.setPrefWidth(380);
        delayedAckScrollPane.setPrefHeight(710);
        VBox vBox3 = new VBox();
        vBox3.setTranslateX(380*3);
        vBox3.setTranslateY(0);
        vBox3.setPrefWidth(380);
        vBox3.setPrefHeight(90);
        TextField numberOfMessagesTextField3 = new TextField();
        numberOfMessagesTextField3.setPromptText("Number of messages");
        numberOfMessagesTextField3.setTranslateX(0);
        numberOfMessagesTextField3.setTranslateY(0);
        numberOfMessagesTextField3.setPrefWidth(380);
        numberOfMessagesTextField3.setPrefHeight(30);
        numberOfMessagesTextField3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int numberOfMessages = Integer.parseInt(numberOfMessagesTextField3.getText());
                data3.add(0, numberOfMessages);
            }
        });
        TextField indexOfDelayedAck = new TextField();
        indexOfDelayedAck.setPromptText("Index of delayed acknowledge message");
        indexOfDelayedAck.setTranslateX(0);
        indexOfDelayedAck.setTranslateY(0);
        indexOfDelayedAck.setPrefWidth(380);
        indexOfDelayedAck.setPrefHeight(30);
        indexOfDelayedAck.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int numberOfMessages = Integer.parseInt(indexOfDelayedAck.getText());
                data3.add(1, numberOfMessages);
            }
        });
        Button startButton3 = new Button("Start stop and wait protocol with delayed acknowledge");
        startButton3.setPrefWidth(380);
        startButton3.setPrefHeight(30);
        startButton3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Calculations.delayedAcknowledge(data3.get(0), data3.get(1), delayedAckScrollPane);
            }
        });
        vBox3.getChildren().add(numberOfMessagesTextField3);
        vBox3.getChildren().add(indexOfDelayedAck);
        vBox3.getChildren().add(startButton3);
        root.getChildren().add(vBox3);
        root.getChildren().add(delayedAckScrollPane);

        Scene scene = new Scene(root, 1000, 800);
        stage.setTitle("Stop And Wait Protocol");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
}
