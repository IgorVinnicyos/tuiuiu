/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.interfaces;

import java.util.Date;
import model.Conta;
import model.Pessoa;

/**
 *
 * @author 161095056
 */
public interface IContaController {

    public boolean logar(String usuario, String senha);

    public boolean alterarUsuario(String senha, String novoUsuario);

    public boolean alterarSenha(String senha, String novaSenha);

    public boolean excluir(String senha);


    public boolean alterarNome(Conta conta, String nome);

    public boolean alterarSexo(Conta conta, boolean sexo);

    public boolean alterarEndereco(Conta conta, String endereco);

    public boolean alterarDataNasc(Conta conta, Date dataNasc);

}
