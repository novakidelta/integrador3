package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.edu.unifacear.projetointegrador3.dao.CasosDeUsoDao;
import br.edu.unifacear.projetointegrador3.dao.FaseDao;
import br.edu.unifacear.projetointegrador3.dao.ProjetoDao;
import br.edu.unifacear.projetointegrador3.dao.TeamProjetoDao;
import br.edu.unifacear.projetointegrador3.entidade.CustomListCell;
import br.edu.unifacear.projetointegrador3.entidade.Projeto;
import br.edu.unifacear.projetointegrador3.entidade.TeamProjeto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Callback;

public class ProjetoController {

	
    private StackPane StackPaneLista;
    @FXML    
    final JFXListView<TeamProjeto> listViewTeam = new JFXListView<TeamProjeto>();
	
    
    public void calcularProjetos() {
    //	lblTotalProjetos.setText("19");
    }
	
	
	
	
	public void inserirFase() {
	//	String fase = textFieldNomeFase.getText();
		FaseDao faseDao = new FaseDao();
		//faseDao.inserirFaseBd(fase);
	}
	
	public void inserirCasoDeUso() {
	/*String nome = textFieldNomeCasoDeUso.getText();
		Integer prioridade = Integer.parseInt(textFieldPrioridadeCasoDeUso.getText());
		CasosDeUsoDao casosDeUsoDao = new CasosDeUsoDao();
		casosDeUsoDao.inserirCasoDeUsoBD(nome, prioridade);*/
	}
	
	public void excluirProjeto() {
		ProjetoDao projetoDao = new ProjetoDao();
		//passa objeto para exclusao no lugar de null
		Projeto  projeto = new Projeto();
		projeto.setIdProjeto(2);
		projeto.setNome("teste2");
		projetoDao.excluirProjetoBD(projeto);
	}
	
	public void excluirTeamProjeto() {
		TeamProjetoDao teamProjetoDao = new TeamProjetoDao();
		teamProjetoDao.excluirTeamProjeto(listViewTeam.getFocusModel().getFocusedItem());
		listarTeamProjeto();
		
	}
	
	public void listarProjeto() {
		ProjetoDao projetoDao = new ProjetoDao();
		for(int i=0; i< projetoDao.listarProjetoBD().size();i++) {
		System.out.println(projetoDao.listarProjetoBD().get(i).getNome());
		}
	}
	
	public void listarTeamProjeto() {
		TeamProjetoDao teamProjetoDao = new TeamProjetoDao();
		ObservableList<TeamProjeto> data = FXCollections.observableArrayList();
        for(int i=0; i< teamProjetoDao.listarTeamProjeto().size();i++) {
        	//data.add(new TeamProjeto(teamProjetoDao.listarTeamProjeto().get(i).getId(),teamProjetoDao.listarTeamProjeto().get(i).getNome(),teamProjetoDao.listarTeamProjeto().get(i).getFuncao(),teamProjetoDao.listarTeamProjeto().get(i).getProjeto()));
    		}
        listViewTeam.setItems(data);
        listViewTeam.setCellFactory(new Callback<ListView<TeamProjeto>, ListCell<TeamProjeto>>() {
            @Override
            public ListCell<TeamProjeto> call(ListView<TeamProjeto> listView) { 
                return new CustomListCell();
            }
        });
        StackPaneLista.getChildren().add(listViewTeam);
	}
	
}
