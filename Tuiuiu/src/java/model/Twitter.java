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
@Table(name="twiters")
public class Twitter {
    @Id
    @GeneratedValue
    @Column(name="idpublicacao")
    private int idpublicacao;
    @Column(name="idpessoa",nullable=false)
    private int idpessoa;
    @Column(name="datapub",nullable=false)
    private Date datapub;
    @Column(name="texto",nullable=false)
    private String texto;

    public Twitter(int idpessoa, String texto) {
        this.idpessoa = idpessoa;
        this.datapub = new Date(System.currentTimeMillis());
        this.texto = texto;
    }
    

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getIdpublicacao() {
        return idpublicacao;
    }

    public int getIdpessoa() {
        return idpessoa;
    }

    public Date getDatapub() {
        return datapub;
    }
    
    
}
