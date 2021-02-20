package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class DashBoardFormController {


    public AnchorPane root;

    public void openCustomerForm(ActionEvent actionEvent) throws IOException {
        /*Window*/ Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.
                load(getClass().getResource("../view/CustomerForm.fxml"))));
        stage.centerOnScreen();
    }
}
