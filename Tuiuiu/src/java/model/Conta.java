/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author 161095056
 */
@Entity
@Table(name="Conta")
public class Conta implements Serializable{
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="nome",nullable=false)
    private String nome;
    @Column(name="senha",nullable=false)
    private String senha;
    @Column(name="email",unique = true, nullable=false)
    private String email;

    public Conta() {
    }

    public Conta(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    
}
