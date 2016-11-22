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
        
        return "index";
    }
    @RequestMapping("/teste")
    public String oi(){
        return "oi";
    }
}
