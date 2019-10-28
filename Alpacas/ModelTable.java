/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import javafx.scene.control.Button;

/**
 *
 * @author Aluno
 */
public class ModelTable {
    String id,idDepto,nome,horas,modalidade;
    Button deleta,insere,info;

    public Button getDeleta() {
        return deleta;
    }

    public void setDeleta(Button deleta) {
        this.deleta = deleta;
    }

    public Button getInsere() {
        return insere;
    }

    public void setInsere(Button insere) {
        this.insere = insere;
    }

    public Button getInfo() {
        return info;
    }

    public void setInfo(Button info) {
        this.info = info;
    }

    public ModelTable(String id, String idDepto, String nome, String horas, String modalidade, Button deleta, Button insere,Button info){
        this.id = id;
        this.idDepto = idDepto;
        this.nome = nome;
        this.horas = horas;
        this.modalidade = modalidade;
        this.deleta = deleta;
        this.insere = insere;
        this.info = info;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(String idDepto) {
        this.idDepto = idDepto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
}
