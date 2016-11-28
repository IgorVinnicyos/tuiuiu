<%-- 
    Document   : cadastro
    Created on : 28/11/2016, 14:59:15
    Author     : igor-vinicyos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center style="margin-top: 15%;">
        <h1>Cadastre-se!</h1>
        <form action="">
            Nome: <input style="width: 20%;"type="text" placeholder="insira seu nome" name="nome">
            <br><br>
            Email: <input style="width: 20%;" type="text" placeholder="insira seu email" name="email">
            <br><br>
            Senha: <input style="width: 20%;" type="password"placeholder="insira sua senha" name="senha">
            <br><br>
            <input style="margin-left: 2%;" type="submit" value="cadastrar">
        </form>
    </center>
    </body>
</html>
