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
            .email{
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
            .follow{
                margin-left: 37%;
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
            <a style="color:white; margin-top: 1.2%; top: 0%; position: fixed;margin-left: 40%;" href="#">Voltar</a>
            <a style="color:white; margin-top: 1.2%; top: 0%; position: fixed;margin-left: 45%;" href="#">Sair</a>
        </header>
            <div class="usuario-logado">
                <div class="info-user">
                <span style="color:white;" class="user">Nome</span><br>
                <span >teste@teste.com</span>
                </div>
                <hr>
            </div>   
        <div class="nav">
            <br>
            <%
                for(int i= 0;i<30;i++){
                    out.println("<div class='tweets'><span class='user'>Usuario "+i+"</span><span class='email'>Email@email.com</span><a class='follow' href='#'><button class='input'>Seguir</button></a></div>");
                }
            %>
            <div class="tweets"><span class="user">José</span><span class="email">Email@email.com</span></div>
            <!-- foreach com todos os twitters para cada um ele criar uma div-->
        </div>
        </div>
    </body>
</html>
