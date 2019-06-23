package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class itemController {
	@FXML
    private Label lblNomeProjeto;
    @FXML
    private Label lblProductOwner;
    @FXML
    private Label lblTotPntFunc;
    @FXML
    private Label lblDiaCriacao;
    @FXML
    private Label lblMesCriacao;
    @FXML
    private Label lblAnoCriacao;
    @FXML
    private Label lblDiaTermino;
    @FXML
    private Label lblMesTermino;
    @FXML
    private Label lblAnoTermino;
    @FXML
    private Label lblID;
    @FXML
    private Label lblCustoProjeto;

    public void pegarDados() {
    	lblNomeProjeto.setText("projeto");
		lblProductOwner.setText("dono");
		lblTotPntFunc.setText("XX");
		lblDiaCriacao.setText("01");
		lblMesCriacao.setText("JUN");
		lblAnoCriacao.setText("2019");
		lblDiaTermino.setText("21");
		lblMesTermino.setText("JUN");
		lblAnoTermino.setText("2019");
		lblID.setText("01");
		lblCustoProjeto.setText("25,00");
    }
	

}
