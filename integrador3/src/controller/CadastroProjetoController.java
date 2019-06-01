package controller;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.edu.unifacear.projetointegrador3.dao.ProjetoDao;
import br.edu.unifacear.projetointegrador3.dao.TeamProjetoDao;
import br.edu.unifacear.projetointegrador3.entidade.CustomListCell;
import br.edu.unifacear.projetointegrador3.entidade.Projeto;
import br.edu.unifacear.projetointegrador3.entidade.TeamProjeto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;



public class CadastroProjetoController {
    @FXML
    private TextField txtFieldNome;
    @FXML
    private TextField txtFieldFunc;
    @FXML
    private TextField txtFieldEmail;
    @FXML
    private JFXButton btnCadastrar;
    @FXML
    private JFXRadioButton radioMasc;
    @FXML
    private JFXRadioButton radioFem;
    @FXML
    private JFXDatePicker dateDtNasc;
    @FXML
    private JFXTextField txtNome;
    @FXML
    private JFXTextField txtEsfHr;
    @FXML
    private JFXTextField txtTotPntFunc;
    @FXML
    private JFXTextField txtEsfMes;
    @FXML
    private JFXTextField txtCusto;
    @FXML
    private JFXTextArea txtObj;
    @FXML
    private JFXDatePicker dateDtIni;
    @FXML
    private JFXDatePicker dateDtFim;
    @FXML
    private StackPane StackPaneLista;
    @FXML    
    final JFXListView<TeamProjeto> listViewTeam = new JFXListView<TeamProjeto>();
    Projeto projetopass = new  Projeto();
    
    public void inserirProjeto(){
		Projeto projeto = new Projeto();
		projeto.setNome(txtNome.getText());
		projeto.setCusto(Double.parseDouble(txtCusto.getText()));
		projeto.setEsfHoras(Integer.parseInt(txtEsfHr.getText()));
		projeto.setEsfMeses(Integer.parseInt(txtEsfMes.getText()));
		projeto.setTotPtFunc(Integer.parseInt(txtTotPntFunc.getText()));
		projeto.setObjetivo(txtObj.getText());
		projeto.setDtInicio((String)dateDtIni.getEditor().getText());
		projeto.setDtFim((String)dateDtFim.getEditor().getText());

		ProjetoDao projetoDao = new ProjetoDao();
		projetoDao.inserirProjetoBD(projeto);
		projetopass=projeto;
	}
    
    public void listarTeamProjeto() {
		TeamProjetoDao teamProjetoDao = new TeamProjetoDao();
		ObservableList<TeamProjeto> data = FXCollections.observableArrayList();
        for(int i=0; i< teamProjetoDao.listarTeamProjeto().size();i++) {
        	data.add(new TeamProjeto(
        			teamProjetoDao.listarTeamProjeto().get(i).getId(),
        			teamProjetoDao.listarTeamProjeto().get(i).getNome(),
        			teamProjetoDao.listarTeamProjeto().get(i).getFuncao(),
        			teamProjetoDao.listarTeamProjeto().get(i).getDataNasc(),
        			teamProjetoDao.listarTeamProjeto().get(i).getSexo(),
        			teamProjetoDao.listarTeamProjeto().get(i).getEmail(),
        			teamProjetoDao.listarTeamProjeto().get(i).getProjeto()
        			));
    		}
        listViewTeam.setItems(data);
        listViewTeam.setCellFactory(new Callback<ListView<TeamProjeto>, ListCell<TeamProjeto>>() {
            @Override
            public ListCell<TeamProjeto> call(ListView<TeamProjeto> listView) { 
                return new CustomListCell();
            }
        });
        StackPaneLista.getChildren().add(listViewTeam);
        listViewTeam.getEffect();
	}
    
    public void inserirTeam() {
		String nome = txtFieldNome.getText();
		String funcao = txtFieldFunc.getText();
		String email = txtFieldEmail.getText();
		String dataNascDate = ((String)dateDtNasc.getEditor().getText());
		Character sexo;
		if(radioFem.isSelected()) {
			sexo='f';
		}
		else {
			sexo='m';
		}
		ProjetoDao projetoDao = new ProjetoDao();
		projetoDao.inserirProjetoBD(projetopass);
		
		TeamProjetoDao teamProjetoDao = new TeamProjetoDao();
		teamProjetoDao.inserirTeamBD(nome, funcao, email, dataNascDate, sexo, projetopass);
	}
    
    
    public void limparCamposTeam() {
    	txtFieldEmail.clear();
    	txtFieldFunc.clear();
    	txtFieldNome.clear();
    	dateDtNasc.getEditor().clear();
    }
    
	public void Radio() {
		if(radioFem.isArmed()) {
			radioMasc.setSelected(false);
			radioFem.setSelected(true);
			//retorna sexo
		}
		if(radioMasc.isArmed()) {
			radioFem.setSelected(false);
			radioMasc.setSelected(true);
			//retorna sexo
		}	
	}
	
	public void TelaCadastroTeam() {
		
		try {
			FXMLLoader fxmlLoader = new FXMLLoader();
		  	fxmlLoader.setLocation(getClass().getResource("CadastroTeam.fxml"));
		  	Scene scene;
			scene = new Scene(fxmlLoader.load());
			Stage stage = new Stage();
			stage.initStyle(StageStyle.UNDECORATED);
		  	stage.setScene(scene);
		  	stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	
	}
	

}
