package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.jfoenix.controls.JFXDrawer;

import br.edu.unifacear.projetointegrador3.dao.ProjetoDao;
import br.edu.unifacear.projetointegrador3.dao.TeamProjetoDao;
import br.edu.unifacear.projetointegrador3.entidade.TeamProjeto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class SampleController {
	
	@FXML
	ListView<TeamProjeto> listView = new ListView<>();
	List<TeamProjeto> listaTeam = new ArrayList<TeamProjeto>();
	ObservableList<TeamProjeto> listaObs = FXCollections.observableArrayList();
	
	@FXML
	private JFXDrawer Drawner;
	
    @FXML
    private AnchorPane AnchorFundo;
    
    @FXML
    private Button botao;
    
    @FXML
    private BorderPane borderpane;
    

   
    public void botao() throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("ListaBar.fxml"));
        VBox box = loader.load();
        Drawner.setSidePane(box);
    	if (Drawner.isOpened()) {
            Drawner.close();
        } else {
            Drawner.open();
        }
    }
    

    
    @FXML
    public void mostrarinicio(ActionEvent event) throws IOException {
    	Parent inicio = FXMLLoader.load(getClass().getResource("CadastroProjeto.fxml"));
    	borderpane.setCenter(inicio);
    }
    
    @FXML
    public void mostrarteste(ActionEvent event) throws IOException {
    	Parent teste = FXMLLoader.load(getClass().getResource("InicioProjetos.fxml"));
    	borderpane.setCenter(teste);
    }
    
    @FXML
    public void mostrarCadastroTeam(ActionEvent event) throws IOException {
    	Parent teste = FXMLLoader.load(getClass().getResource("CadastroTeamPrincipal.fxml"));
    	borderpane.setCenter(teste);
    } 
    
	
}
