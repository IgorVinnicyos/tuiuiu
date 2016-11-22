/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 161095056
 */
@Entity
@Table(name="seguindo")
public class Seguindo {
    @Id
    @GeneratedValue
    @Column(name="idtupla")
    private int idtupla;
    @OneToMany
    private Pessoa seguidor;
    @ManyToOne
    private Pessoa seguirPessoa;

    public Seguindo(Pessoa seguidor, Pessoa seguirPessoa) {
        this.seguidor = seguidor;
        this.seguirPessoa = seguirPessoa;
    }

    public Pessoa getSeguidor() {
        return seguidor;
    }

    public void setSeguidor(Pessoa seguidor) {
        this.seguidor = seguidor;
    }

    public Pessoa getSeguirPessoa() {
        return seguirPessoa;
    }

    public void setSeguirPessoa(Pessoa seguirPessoa) {
        this.seguirPessoa = seguirPessoa;
    }

    public int getIdtupla() {
        return idtupla;
    }

    
    
    
}
