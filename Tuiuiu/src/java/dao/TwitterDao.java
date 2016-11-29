/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hibernate.Util;
import java.util.List;
import model.Twitter;
import org.hibernate.Session;

/**
 *
 * @author Matheus Barbosa
 */
public class TwitterDao {
    public boolean inserir(Twitter twitter){
        
        try {
            Session session = Util.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(twitter);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
        }
        return false;
    }
    public List<Twitter> listarTodosTwitters(){
         List<Twitter> lista = null;
         try {
            Session session = Util.getSessionFactory().openSession();
            session.beginTransaction();
            lista = session.createQuery("from twiters").list();
            session.getTransaction().commit();
            session.close();
            if(lista != null  && !lista.isEmpty()){
                return lista;
            }
        } catch (Exception e) {
        }
         return lista;
    }
}
