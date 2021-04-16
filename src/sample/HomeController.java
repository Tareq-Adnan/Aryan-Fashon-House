package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class HomeController {

    @FXML
    private BorderPane content;

    @FXML
    private Button dhashboard;

    @FXML
    private Button sale;

    @FXML
    private Button add;

    @FXML
    private Button bill;

    @FXML
    private Button customer;

    @FXML
    private Button logout;


    public void click(ActionEvent actionEvent) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("dhashboard.fxml"));
        content.setCenter(root);
    }

    public void addcus(ActionEvent actionEvent) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("add.fxml"));
        content.setCenter(root);
    }

    public void sale(ActionEvent actionEvent) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("sale.fxml"));
        content.setCenter(root);
    }
}
