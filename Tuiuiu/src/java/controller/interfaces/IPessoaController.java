/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.interfaces;

import dao.ContaDao;
import java.util.List;
import model.Pessoa;

/**
 *
 * @author 161095056
 */
public interface IPessoaController {
    
    public List<Pessoa> listar();
    public List<Pessoa> pesquisar(String nome);
    
    
}
