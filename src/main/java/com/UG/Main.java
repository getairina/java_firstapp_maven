package com.UG;

import com.UG.controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main_window.fxml"));

        primaryStage.setTitle("Java FX");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(600);

        controller = fxmlLoader.getController();

        primaryStage.setOnCloseRequest(event -> {
        });

        primaryStage.show(); // show the actual window
    }
    private static void stageLoader(){

    }
}
