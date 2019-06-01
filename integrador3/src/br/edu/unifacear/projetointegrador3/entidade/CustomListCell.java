package br.edu.unifacear.projetointegrador3.entidade;

import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class CustomListCell extends ListCell<TeamProjeto> {


    private HBox content;
    private Text name;
    private Text teste;

    public CustomListCell() {
        super();
        name = new Text();
        teste = new Text();
        VBox vBox = new VBox(name, teste);
        content = new HBox(new Label("[imagem]"), vBox);
        content.setSpacing(10);
    }

    @Override
    public void updateItem(TeamProjeto item, boolean empty) {
        super.updateItem(item, empty);
        if (item != null && !empty) { // <== test for null item and empty parameter
            name.setText(item.getNome());
            teste.setText(item.getFuncao());
            setGraphic(content);
        } else {
            setGraphic(null);
        }
    }
	
}
