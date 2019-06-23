
package br.edu.unifacear.projetointegrador3.main;

import com.jfoenix.controls.JFXButton;

import br.edu.unifacear.projetointegrador3.dao.UsuarioDao;
import br.edu.unifacear.projetointegrador3.entidade.Usuario;
import controller.CadastroProjetoController;

import java.net.Proxy;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

/**
 *
 * @author JISOO
 */
public class LoginController implements Initializable {

    @FXML
    private AnchorPane layersignup;
    @FXML
    private AnchorPane layer2;
    @FXML
    private JFXButton signin;
    @FXML
    private Label l1;
    @FXML
    private Label s1;
    @FXML
    private JFXButton signup;
    @FXML
    private Label a2;
    @FXML
    private Label b2;
    @FXML
    private JFXButton btnsignup;
    @FXML
    private JFXButton btnsignin;
    @FXML
    private TextField txtRegUsuario;
    @FXML
    private TextField txtRegEmail;
    @FXML
    private TextField txtRegSenha;
    @FXML
    private TextField txtLoginUsuario;
    @FXML
    private TextField txtLoginSenha;
    @FXML
    private AnchorPane layer1;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        s1.setVisible(false);
        signup.setVisible(false);
        b2.setVisible(false);
        btnsignin.setVisible(false);
        txtLoginUsuario.setVisible(false);
        txtLoginSenha.setVisible(false);
        txtRegUsuario.setVisible(true);
        txtRegEmail.setVisible(true);
        txtRegSenha.setVisible(true);
    }    

    @FXML
    private void btn(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.7));
        slide.setNode(layer2);
        slide.setToX(491);
        slide.play();
        layer1.setTranslateX(-309);
        btnsignin.setVisible(true);
        b2.setVisible(true);
        s1.setVisible(true);
        signup.setVisible(true);
        l1.setVisible(false);
        signin.setVisible(false);
        a2.setVisible(false);
        btnsignup.setVisible(false);
        txtLoginUsuario.setVisible(true);
        txtLoginSenha.setVisible(true);
        txtRegUsuario.setVisible(false);
        txtRegEmail.setVisible(false);
        txtRegSenha.setVisible(false);
        slide.setOnFinished((e->{ 
        }));
    }

    @FXML
    private void btn2(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.7));
        slide.setNode(layer2);
        slide.setToX(0);
        slide.play();
        layer1.setTranslateX(0);
        btnsignin.setVisible(false);
        b2.setVisible(false);
        s1.setVisible(false);
        signup.setVisible(false);
        l1.setVisible(true);
        signin.setVisible(true);
        a2.setVisible(true);
        btnsignup.setVisible(true);
        txtLoginUsuario.setVisible(false);
        txtLoginSenha.setVisible(false);
        txtRegUsuario.setVisible(true);
        txtRegEmail.setVisible(true);
        txtRegSenha.setVisible(true);
        slide.setOnFinished((e->{
        }));
    }

    @FXML
    private void btnsignup(MouseEvent event) {
    	System.out.println("registrar");
    	CadastroProjetoController cadastroProjetoController = new CadastroProjetoController();
    	cadastroProjetoController.inserirProjeto();
    }

    @FXML
    private void sign(MouseEvent event) {
    	System.out.println("logar");
    }
    }

