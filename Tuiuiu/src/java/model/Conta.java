/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author 161095056
 */
public class Conta {
    @Id
    @GeneratedValue
    @Column(name="idtupla")
    private int idtupla;
    @Column(name="usuario",nullable=false)
    private String usuario;
    @Column(name="senha",nullable=false)
    private String senha;
    @OneToOne
    private Pessoa pessoa;

    public Conta(String usuario, String senha, Pessoa pessoa) {
        this.usuario = usuario;
        this.senha = senha;
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }


    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
    
    
}
