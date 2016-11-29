/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.TwitterDao;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Matheus Barbosa
 */
@Controller
public class TwitterController {
    @RequestMapping("enviarTwitter")
    public String enviarTwitter(HttpServletRequest req){
        Twitter twitter = new Twitter(Integer.parseInt(req.getParameter("idpessoa")), req.getParameter("texto"));
        TwitterDao dao = new TwitterDao();
        dao.inserir(twitter);
        return "telainicial";
    }
}
