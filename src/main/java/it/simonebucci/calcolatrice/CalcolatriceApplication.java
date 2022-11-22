package it.simonebucci.calcolatrice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalcolatriceApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalcolatriceApplication.class.getResource("calcolatrice-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 380);
        stage.setResizable(false);
        stage.setTitle("Calcolatrice di Simone Bucci");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}