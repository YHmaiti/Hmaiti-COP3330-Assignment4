/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// class used to launch the gui of the hello to do list created by Yohan
public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        // set the stage to hello-view.fxml
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Welcome to the 'Hello' To Do List by Yohan!");
        stage.setScene(scene);
        stage.show();

    }

    // launch the app/GUI
    public static void main(String[] args) {
        launch();
    }
}