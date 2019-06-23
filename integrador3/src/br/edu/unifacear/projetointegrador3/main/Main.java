package br.edu.unifacear.projetointegrador3.main;
	
import java.io.IOException;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Integrador 3");
		primaryStage.setMaximized(false);
        primaryStage.setMinHeight(630);
        primaryStage.setMinWidth(850.0);
		primaryStage.show();
		
	}	
	public static void main(String[] args) {
		launch(args);
		
	}
}
