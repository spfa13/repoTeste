/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Aluno
 */
public class TableController implements Initializable{

    @FXML
    private TableView<ModelTable> table;
    @FXML
    private TableColumn<ModelTable, Integer> col_id;
    @FXML
    private TableColumn<ModelTable, Integer> col_idDepto;
    @FXML
    private TableColumn<ModelTable, String> col_nome;
    @FXML
    private TableColumn<ModelTable, Integer> col_horas;
    @FXML
    private TableColumn<ModelTable, String> col_modalidade;
    @FXML
    private TableColumn<ModelTable, Button> col_funcoes;
    @FXML
    private TableColumn<ModelTable, Button> col_funcoes1;
    @FXML
    private TableColumn<ModelTable, Button> col_funcoes2;
    
    

    ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        try {
            Connection con = DbConnector.getConnection();
            
            ResultSet rs = con.createStatement().executeQuery("select * from cursos");
            
            while(rs.next()){
                oblist.add(new ModelTable(rs.getString("id"),rs.getString("id-depto"),rs.getString("nome"),rs.getString("horas-total"),rs.getString("modalidade"),new Button("deleta"),new Button("insere"),new Button("info")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TableController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_idDepto.setCellValueFactory(new PropertyValueFactory<>("idDepto"));
        col_nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        col_horas.setCellValueFactory(new PropertyValueFactory<>("horas"));
        col_modalidade.setCellValueFactory(new PropertyValueFactory<>("modalidade"));
        col_funcoes.setCellValueFactory(new PropertyValueFactory<>("deleta"));
        col_funcoes1.setCellValueFactory(new PropertyValueFactory<>("insere"));
        col_funcoes2.setCellValueFactory(new PropertyValueFactory<>("info"));
        
        
        table.setItems(oblist);
        
    }
    
}
