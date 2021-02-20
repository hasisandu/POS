package controller;

import database.ThogaKade;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

public class CustomerFormController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField ttSalary;
    public TableView table;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colSalary;

    public void initialize(){

        colId.setCellValueFactory(new PropertyValueFactory("id"));
        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory("salary"));

        loadAllCustomers();
    }

    private void loadAllCustomers() {
        table.setItems(FXCollections.observableArrayList(ThogaKade.customerTable));
    }

    public void saveCustomerOnAction(ActionEvent actionEvent) {
        Customer customer = new Customer(
                txtId.getText(),
                txtName.getText(),
                txtAddress.getText(),
                Double.parseDouble(ttSalary.getText())
        );

        if (ThogaKade.customerTable.add(customer)){
           new Alert(Alert.AlertType.CONFIRMATION, "Success!", ButtonType.OK).show();
            System.out.println(ThogaKade.customerTable);
        }else{
            new Alert(Alert.AlertType.ERROR, "Try Again", ButtonType.CLOSE).show();
        }


    }
}
