package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {

    @FXML
    private Label infoLabel;

    @FXML
    private Label infoLabelIncorrect;

    @FXML
    private TextField sourceLabel;

    public void guessEvent(ActionEvent event) {

        Random random = new Random();
        int randomNumb = random.nextInt(10) + 1;

        String g = sourceLabel.getText();

        try {

            int convetedAnswer = Integer.valueOf(g);
            if (randomNumb == convetedAnswer) {
                infoLabel.setText("Atspejai " + randomNumb);

            } else {
                infoLabelIncorrect.setText("Deja neatspejai " + randomNumb);
            }
        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Ivestas ne skaicius");
            sourceLabel.setText("");
            alert.show();
        }
    }
}
