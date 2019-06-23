package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class TelaInicialController implements Initializable {
	@FXML
    private VBox pnl_scroll;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// recebe do banco de dados uma lista com os projetos
		pnl_scroll.getChildren().clear();
		for(int i=0;i<10;i++) {
	        try {
				pnl_scroll.getChildren().add(FXMLLoader.load(getClass().getResource("Item.fxml")));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

