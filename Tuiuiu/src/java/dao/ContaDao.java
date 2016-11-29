/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hibernate.Util;
import java.util.Date;
import java.util.List;
import model.Conta;
import model.Pessoa;
import org.hibernate.Session;

/**
 *
 * @author 161095056
 */
public class ContaDao implements controller.interfaces.IContaController {

    public ContaDao() {

    }

    public boolean inserir(Conta conta) {

        try {
            Session session = Util.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(conta);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean alterarUsuario(String senha, String novoUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterarSenha(String senha, String novaSenha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterarNome(Conta conta, String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterarSexo(Conta conta, boolean sexo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterarEndereco(Conta conta, String endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterarDataNasc(Conta conta, Date dataNasc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Conta logar(String email, String senha) {
        List<Conta> lista;
        Session session = Util.getSessionFactory().openSession();
        session.beginTransaction();
        lista = session.createQuery("from Conta where email = :email and senha = :senha").setParameter("email", email).setParameter("senha", senha).list();
        session.getTransaction().commit();
        session.close();
        if (lista != null && !lista.isEmpty()) {
            Conta user = lista.get(0);
            return user;
        }

        return null;
    }
    
    public String retornaNomeByID(int id){
        List<Conta> lista;
        Session session = Util.getSessionFactory().openSession();
        session.beginTransaction();
        lista = session.createQuery("from Conta where id = :id").setParameter("id", id).list();
        session.getTransaction().commit();
        session.close();
        
        return lista.get(0).getNome();
    }

}
