package controller;

import java.io.IOException;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class ApplicationController {
	
		@FXML
	    private AnchorPane acMain;
	    @FXML
	    private AnchorPane acDashBord;
	    @FXML
	    private ScrollPane leftSideBarScroolPan;
	    @FXML
	    private Button btnInicio;
	    @FXML
	    private ImageView imgInicioBtn;
	    @FXML
	    private Button btnProjetos;
	    @FXML
	    private ImageView imgProjetosBtn;
	    @FXML
	    private Button btnEquipe;
	    @FXML
	    private ImageView imgEquipeBtn;
	    @FXML
	    private Button btnteste;
	    @FXML
	    private ImageView imgTesteBtn;
	    @FXML
	    private Button btnConfiguraçoes;
	    @FXML
	    private ImageView imgConfigBtn;
	    @FXML
	    private Button btnConfiguracoes;
	    @FXML
	    private ImageView imgInformaçoesBtn;
	    @FXML
	    private BorderPane appContent;
	    @FXML
	    private AnchorPane acHead;
	    @FXML
	    private MenuButton mbtnUsrInfoBox;
	    @FXML
	    private MenuItem miPopOver;
	    @FXML
	    private Circle circuloImgUsr;
	    @FXML
	    private Label lblUsrNomePopOver;
	    @FXML
	    private Label lblNomeCompleto;
	    @FXML
	    private Label lblRoleAs;
	    @FXML
	    private Hyperlink hlEditUpdateAccount;
	    @FXML
	    private Button btnLogOut;
	    @FXML
	    private Circle imgUsuario;
	    @FXML
	    private Label lblUsrNome;
	    @FXML
	    private ToggleButton sideMenuToogleBtn;
	    @FXML
	    private ImageView imgMenuBtn;
	    @FXML
	    private Label lblUserId;
	    @FXML
	    private StackPane acContent;
	    
	    @FXML
	    private void btnhamburguer(ActionEvent event) throws IOException {
	        if (sideMenuToogleBtn.isSelected()) {
	            //imgMenuBtn.setImage(menuImageRed);
	            TranslateTransition sideMenu = new TranslateTransition(Duration.millis(200.0), acDashBord);
	            sideMenu.setByX(-130);
	            sideMenu.play();
	            acDashBord.getChildren().clear();
	        } else {
	            //imgMenuBtn.setImage(menuImage);
	            TranslateTransition sideMenu = new TranslateTransition(Duration.millis(200.0), acDashBord);
	            sideMenu.setByX(130);
	            sideMenu.play();
	            acDashBord.getChildren().add(leftSideBarScroolPan);
	        }
	    }
	    
	    @FXML
	    public void btnHomeOnClick(ActionEvent event){

	        FXMLLoader fxmlLoader = new FXMLLoader();
	        try {
	            fxmlLoader.load(getClass().getClassLoader().getResource("CadastroTeam.fxml").openStream());
	        } catch (IOException e) {
	            
	        }
	        AnchorPane root = fxmlLoader.getRoot();
	        acContent.getChildren().clear();
	        acContent.getChildren().add(root);

	    }
	    

}
