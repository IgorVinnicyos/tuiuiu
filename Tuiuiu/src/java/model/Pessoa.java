/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 161095056
 */
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "sexo", nullable = false)
    private boolean sexo;
    @Column(name = "endereco", nullable = false)
    private String endereco;
    @Column(name = "dataNasc", nullable = false)
    private Date dataNasc;

    public Pessoa(String nome, boolean sexo, String endereco, Date dataNasc) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("\n Nome: " + getNome());
        if (isSexo()) {
            string.append("\n Sexo: Masculino");
        } else {
            string.append("\n Sexo: Feminino");
        }
        string.append("\n Data de nascimento: "+getDataNasc().toString());
        return string.toString();
    }

}
