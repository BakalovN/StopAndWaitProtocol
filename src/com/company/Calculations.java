package com.company;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class Calculations {
    public static void noErrors(int numberOfMessages, ScrollPane scrollPane){
        Group root = new Group();
        Label senderLabel = new Label("Sender");
        senderLabel.setTranslateX(20);
        senderLabel.setTranslateY(70);
        root.getChildren().add(senderLabel);
        Label receiverLabel = new Label("Receiver");
        receiverLabel.setTranslateX(320);
        receiverLabel.setTranslateY(70);
        root.getChildren().add(receiverLabel);


        Line senderLine = new Line();
        senderLine.setStartX(40);
        senderLine.setEndX(40);
        senderLine.setStartY(90);
        senderLine.setEndY(90+numberOfMessages*100);
        root.getChildren().add(senderLine);

        Line receiverLine = new Line();
        receiverLine.setStartX(340);
        receiverLine.setEndX(340);
        receiverLine.setStartY(90);
        receiverLine.setEndY(90+numberOfMessages*100);
        root.getChildren().add(receiverLine);

        int senderPixels = 0;
        int receiverPixels = 50;
        for (int i = 0; i < numberOfMessages; i++) {
            Line line = new Line();
            line.setStartX(40);
            line.setEndX(340);
            line.setStartY(90+senderPixels);
            line.setEndY(90+receiverPixels);
            line.setStroke(Color.BLUE);
            root.getChildren().add(line);

            senderPixels = senderPixels + 100;

            Line line1 = new Line();
            line1.setStartX(340);
            line1.setEndX(40);
            line1.setStartY(90+receiverPixels);
            line1.setEndY(90+senderPixels);
            line1.setStroke(Color.GREEN);
            root.getChildren().add(line1);

            receiverPixels = receiverPixels + 100;
        }
        scrollPane.setContent(root);
    }

    public static void lostData(int numberOfMessages, int indexOfLostMessage, ScrollPane scrollPane){
        Group root = new Group();
        Label senderLabel = new Label("Sender");
        senderLabel.setTranslateX(20);
        senderLabel.setTranslateY(70);
        root.getChildren().add(senderLabel);
        Label receiverLabel = new Label("Receiver");
        receiverLabel.setTranslateX(320);
        receiverLabel.setTranslateY(70);
        root.getChildren().add(receiverLabel);


        Line senderLine = new Line();
        senderLine.setStartX(40);
        senderLine.setEndX(40);
        senderLine.setStartY(90);
        senderLine.setEndY(90+numberOfMessages*100);
        root.getChildren().add(senderLine);

        Line receiverLine = new Line();
        receiverLine.setStartX(340);
        receiverLine.setEndX(340);
        receiverLine.setStartY(90);
        receiverLine.setEndY(90+numberOfMessages*100);
        root.getChildren().add(receiverLine);

        int senderPixels = 0;
        int receiverPixels = 50;

        for (int i = 1; i <= indexOfLostMessage; i++) {
            if (i==indexOfLostMessage){
                Line line = new Line();
                line.setStartX(40);
                line.setEndX(170);
                line.setStartY((90+senderPixels));
                line.setEndY((90+receiverPixels-25));
                line.setStroke(Color.RED);
                root.getChildren().add(line);
                Label label = new Label(String.format("Lost data. The message cannot be send%nand the receiver cannot send acknowledge."));
                label.setTranslateX(55);
                label.setTranslateY(90+receiverPixels);
                root.getChildren().add(label);
                break;
            }
            Line line = new Line();
            line.setStartX(40);
            line.setEndX(340);
            line.setStartY(90+senderPixels);
            line.setEndY(90+receiverPixels);
            line.setStroke(Color.BLUE);
            root.getChildren().add(line);

            senderPixels = senderPixels + 100;

            Line line1 = new Line();
            line1.setStartX(340);
            line1.setEndX(40);
            line1.setStartY(90+receiverPixels);
            line1.setEndY(90+senderPixels);
            line1.setStroke(Color.GREEN);
            root.getChildren().add(line1);

            receiverPixels = receiverPixels + 100;
        }

        scrollPane.setContent(root);
    }

    public static void lostAcknowledge(int numberOfMessages, int indexOfLostMessage, ScrollPane scrollPane){
        Group root = new Group();
        Label senderLabel = new Label("Sender");
        senderLabel.setTranslateX(20);
        senderLabel.setTranslateY(70);
        root.getChildren().add(senderLabel);
        Label receiverLabel = new Label("Receiver");
        receiverLabel.setTranslateX(320);
        receiverLabel.setTranslateY(70);
        root.getChildren().add(receiverLabel);


        Line senderLine = new Line();
        senderLine.setStartX(40);
        senderLine.setEndX(40);
        senderLine.setStartY(90);
        senderLine.setEndY(90+numberOfMessages*100);
        root.getChildren().add(senderLine);

        Line receiverLine = new Line();
        receiverLine.setStartX(340);
        receiverLine.setEndX(340);
        receiverLine.setStartY(90);
        receiverLine.setEndY(90+numberOfMessages*100);
        root.getChildren().add(receiverLine);

        int senderPixels = 0;
        int receiverPixels = 50;

        for (int i = 1; i <= indexOfLostMessage; i++) {

            Line line = new Line();
            line.setStartX(40);
            line.setEndX(340);
            line.setStartY(90+senderPixels);
            line.setEndY(90+receiverPixels);
            line.setStroke(Color.BLUE);
            root.getChildren().add(line);

            senderPixels = senderPixels + 100;
            if (i==indexOfLostMessage){
                Line line1 = new Line();
                line1.setStartX(340);
                line1.setEndX(190);
                line1.setStartY(90+receiverPixels);
                line1.setEndY(90+senderPixels-25);
                line1.setStroke(Color.RED);
                root.getChildren().add(line1);
                Label label = new Label(String.format("Lost acknowledge. The acknowledge cannot be send%nand the sender cannot send new message."));
                label.setTranslateX(55);
                label.setTranslateY(90+senderPixels);
                root.getChildren().add(label);
                break;
            }
            Line line1 = new Line();
            line1.setStartX(340);
            line1.setEndX(40);
            line1.setStartY(90+receiverPixels);
            line1.setEndY(90+senderPixels);
            line1.setStroke(Color.GREEN);
            root.getChildren().add(line1);

            receiverPixels = receiverPixels + 100;
        }

        scrollPane.setContent(root);
    }

    public static void delayedAcknowledge(int numberOfMessages, int indexOfLostMessage, ScrollPane scrollPane){
        Group root = new Group();
        Label senderLabel = new Label("Sender");
        senderLabel.setTranslateX(20);
        senderLabel.setTranslateY(70);
        root.getChildren().add(senderLabel);
        Label receiverLabel = new Label("Receiver");
        receiverLabel.setTranslateX(320);
        receiverLabel.setTranslateY(70);
        root.getChildren().add(receiverLabel);


        Line senderLine = new Line();
        senderLine.setStartX(40);
        senderLine.setEndX(40);
        senderLine.setStartY(90);
        senderLine.setEndY(90+numberOfMessages*100);
        root.getChildren().add(senderLine);

        Line receiverLine = new Line();
        receiverLine.setStartX(340);
        receiverLine.setEndX(340);
        receiverLine.setStartY(90);
        receiverLine.setEndY(90+numberOfMessages*100);
        root.getChildren().add(receiverLine);

        int senderPixels = 0;
        int receiverPixels = 50;

        for (int i = 1; i <= indexOfLostMessage; i++) {

            Line line = new Line();
            line.setStartX(40);
            line.setEndX(340);
            line.setStartY(90+senderPixels);
            line.setEndY(90+receiverPixels);
            line.setStroke(Color.BLUE);
            root.getChildren().add(line);

            senderPixels = senderPixels + 100;
            if (i==indexOfLostMessage){
                Line line1 = new Line();
                line1.setStartX(340);
                line1.setEndX(40);
                line1.setStartY(90+receiverPixels);
                line1.setEndY(90+senderPixels+90);
                line1.setStroke(Color.RED);
                root.getChildren().add(line1);
                Label label = new Label(String.format("Delayed acknowledge. The acknowledge is sent%ntoo late and the sender cannot send new message."));
                label.setTranslateX(55);
                label.setTranslateY(90+senderPixels+110);
                root.getChildren().add(label);
                break;
            }
            Line line1 = new Line();
            line1.setStartX(340);
            line1.setEndX(40);
            line1.setStartY(90+receiverPixels);
            line1.setEndY(90+senderPixels);
            line1.setStroke(Color.GREEN);
            root.getChildren().add(line1);

            receiverPixels = receiverPixels + 100;
        }

        scrollPane.setContent(root);
    }
}
