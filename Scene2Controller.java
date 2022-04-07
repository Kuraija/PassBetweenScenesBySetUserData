package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene2Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button switchToScene1;

    @FXML
    private TextField myTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void switchToScene1(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {
        Stage stage = (Stage) myTextField.getScene().getWindow();
        if (stage==null){
            System.out.println("stage==null");
        }
        Pupil p = (Pupil) stage.getUserData();
        String name = p.getName();
        myTextField.setText(name);
}
    }
