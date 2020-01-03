package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    public BorderPane borderP;

    private void changeSceneTo(String file){
        Stage stage = (Stage) borderP.getScene().getWindow();
        try{
            Parent root = FXMLLoader.load(getClass().getResource(file));
            double width = borderP.getWidth();
            double height = borderP.getHeight();
            Scene scene = new Scene(root, width, height);
            stage.setScene(scene);
            stage.show();
        }catch (IOException ignored){ }
    }

    @FXML
    public void createButton(){ changeSceneTo("/create.fxml"); }

    @FXML
    public void uploadButton(){ changeSceneTo("/upload.fxml"); }

    @FXML
    public void evaluateButton(){ changeSceneTo("/evaluate.fxml"); }
}
