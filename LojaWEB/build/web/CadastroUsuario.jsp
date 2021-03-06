<%@page import="dao.UsuarioDAO"%>
<%@page import="modelo.UsuarioDTO"%>
<%@page import="java.util.Scanner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" class="w3-black">
        <title>Cadastro de Usuario</title>
    </head>
    <body> 
        <div class="w3-white w3-center">
            <h1 class="w3-wide w3-center w3-black">Cadastro de Usuario</h1>
             <div class="w3-row-padding " style="margin:125px 160px 0px 160px">
                <form action="controlador" method="get"> 
                    <input type="hidden" name="operacao" value="cadastraUsuario">
                    Usuario: <input class="w3-input w3-border w3-left " type="text" placeholder="Usuario" required name="usuario"><br>
                    E-mail: <input class="w3-input w3-border w3-left " type="text" placeholder="Email" required name="email"><br>
                    Senha: <input class="w3-input w3-border w3-left" type="password" placeholder="Senha" required name="senha"> <br>
                    <button  class="w3-button w3-black w3-section w3-center " type="submit" value="Cadatrar">Cadastrar</button>
                </form>
            </div>
        </div>
    </body>
</html>

