package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 151091797
 */
@Controller
public class olaMundoController {
    @RequestMapping("/oi")
    public String HelloWorld(){
        
        return "oi";
    }
    @RequestMapping("/pesquisados")
    public String oi(){
        return "pesquisados";
    }
    @RequestMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }
    @RequestMapping("/telaprincipal")
    public String telaPrincipal(){
        return "telaprincipal";
    }
    
    @RequestMapping("/telainicial")
    public String telaInicial(){
        return "telainicial";
    }
}
