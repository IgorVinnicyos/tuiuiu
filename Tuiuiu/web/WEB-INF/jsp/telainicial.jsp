<%-- 
    Document   : telaprincipal
    Created on : 28/11/2016, 15:09:12
    Author     : igor-vinicyos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .header{
                margin-top: 0%;
                position: fixed;
                width: 100%;
                height: 7%;
                left: 0%;
                top:0%;
                color: white;
                text-align: center;
                background-color: #2862FF;
                z-index: 2;
                
            }
            .login{
                
               margin-left: 63%;
               position: fixed;
               top: 2%
            }
            .input{
                border-radius: 5px;
                padding-right: 5px;
                padding-left: 5px;
            }
            .nav{
                margin-top: 3.6%;
                width: 100%;
                position: relative;
             
                
            }
            .tweets{
               background-color: #D9DCEC;
                width: 40%;
                padding-left: 3%;
                position: relative;
                margin-bottom: 1%;
                margin-left: 30%;
                border-radius: 5px;
            }
            .user{
                font-size: 25px;
                color: black;
                font-weight: bold;
            }
            .text{
                font-size: 15px;
                
                top: 0%;
                margin-left: 5%;
            }
            .usuario-logado{
                
                position: fixed;
                width: 25%;
                height: 100%;
                left: 0px;
                background-color: #576673;
            }
            .info-user{
               margin-top: 2%;
               margin-left: 2%;
               color: white;
            }
            .TextBox{
                margin-bottom: 0%;
                position: fixed;
                width: 100%;
                left: 25.1%;
                z-index: 2;
                background-color: white;
                border-bottom: 1px solid #ccc;
            }
            .formTwittar{
                margin-top: 2%;
               margin-left: 10%;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        <header class="header"><p>Tuiuiu</p>
            <form class="login" action="">
                <input class="input" type="text" placeholder="pesquisar" name="usuario">
                <input style="border-radius: 3px;"type="submit" value="Pesquisar">
            </form>
            <a style="color:white; margin-top: 1.2%; top: 0%; position: fixed;margin-left: 45%;" href="#">Sair</a>
        </header>
            <div class="usuario-logado">
                <div class="info-user">
                <span style="color:white;" class="user"> ${usuarioLogado.nome}</span><br>
                <span > ${usuarioLogado.email}</span><br>
                </div>
                <hr>
                <a href="deletar?id=${usuarioLogado.id}"><font color="white">Deletar conta</font></a>
            </div>   
            <div class="TextBox">
                <form class="formTwittar" action="enviarTwitter" method="post">
                    <textarea name="texto" class="input" rows="4" cols="50" placeholder="O que você está pensando?"></textarea>
                    <input name="idpessoa" type="hidden" value=${usuarioLogado.id}>
                    <input style="top:2%;"class="input" type="submit" value="Enviar"></textarea>
                </form>
            </div>
        <div class="nav">
            <br>
            <%
                for(int i= 0;i<30;i++){
                    out.println("<div class='tweets'><span class='user'>Usuario "+i+"</span><span class='text'>Teste de twitter</span></div>");
                }
            %>
            <div class="tweets"><span class="user">José</span><span class="text">Tweet 2</span></div>
            <!-- foreach com todos os twitters para cada um ele criar uma div-->
        </div>
        </div>
    </body>
</html>
