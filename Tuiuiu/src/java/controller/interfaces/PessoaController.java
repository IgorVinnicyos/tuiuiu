/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.interfaces;

import java.util.List;
import model.Pessoa;

/**
 *
 * @author 161095056
 */
public interface PessoaController {
    
    public List<Pessoa> listar();
    public List<Pessoa> pesquisar(String nome);
    public boolean alterarNome();
    public boolean alterarSexo();
    public boolean alterarEndereco();
    public boolean alterarDataNasc();
    public void excluir();
    
}
