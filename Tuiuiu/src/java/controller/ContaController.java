/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ContaDao;
import hibernate.Util;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Conta;
import org.hibernate.Session;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Matheus Barbosa
 */
@Controller
public class ContaController {
    @RequestMapping("formCadastro")
    public String formCadastro(){
        return "cadastro";
    }
    @RequestMapping("cadastrar")
    public String cadastrar(Conta conta){
        ContaDao dao = new ContaDao();
        if(dao.inserir(conta)){
            return "redirect:telaprincipal";
        }
        return "redirect:oi";
    }
    @RequestMapping("formLogin")
    public String formLogin(){
        return "telaprincipal";
    }
    @RequestMapping("log")
    public String login(Conta conta, HttpSession cookie){
//        ContaDao dao = new ContaDao();
//        Conta user;
//        user = dao.logar(conta);
//        if(user != null){
//            cookie.setAttribute("usuarioLogado", user);
//            return "redirect:telainicial";
//        }
        return "telaprincipal";
    }
    @RequestMapping("login")
    public String login2(HttpServletRequest req, HttpSession cookie){
        ContaDao dao = new ContaDao();
        Conta user;
        user = dao.logar(req.getParameter("email"), req.getParameter("senha"));
        if(user != null){
            cookie.setAttribute("usuarioLogado", user);
            return "redirect:telainicial";
        }
        return "telaprincipal";
    }
    
}
