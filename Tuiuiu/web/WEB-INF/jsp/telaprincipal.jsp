<%-- 
    Document   : telaprincipal
    Created on : 28/11/2016, 15:09:12
    Author     : igor-vinicyos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
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
                width:20%;
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
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <header class="header"><p>Tuiuiu</p>
                <form class="login" action="login" method="post">
                    Usuario <input class="input" type="text" name="email">
                    Senha <input class="input"type="password" name="senha">
                    <input style="border-radius: 3px;"type="submit" value="Login">
                    <a style=" margin-left: 2px;color:white;"href="cadastro">Cadastre-se</a>
                </form>
            </header>
            <div class="nav">
                <br>
                <jsp:useBean id="dao" class="dao.TwitterDao"/>
                <jsp:useBean id="userdao" class="dao.ContaDao"/>
                <c:forEach var="twitters" items="${dao.listarTodosTwitters()}">
                   <div class='tweets'>
                       <span class='user'>Usuario </span>
                       <span class='text'>${twitters.texto}</span>
                       ${twitters.texto}
                   </div>
                </c:forEach>

                
            </div>
        </div>
    </body>
</html>
