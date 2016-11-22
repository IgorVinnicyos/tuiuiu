/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.interfaces;

import model.Pessoa;

/**
 *
 * @author 161095056
 */
public interface Conta {

    public boolean logar(String usuario, String senha);

    public boolean alterarUsuario(String senha, String novoUsuario);

    public boolean alterarSenha(String senha, String novaSenha);

    public boolean excluir(String senha);
    
    public boolean permissao(String senha, Pessoa pessoa);

}
