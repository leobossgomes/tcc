

<%@page import="dao.ProdutoDAO"%>
<%@page import="modelo.Produto"%>
<%@page import="java.util.Scanner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!DOCTYPE html>
<html>
    <head>
    <a href="#login" class="w3-bar-item w3-button w3-padding-large w3-hide-small w3-right"></a>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Produto</title>
    </head>
    <body> 
    background-color: black;
        <h1 class="w3-wide w3-center w3-black">Cadastro de Produtos</h1>
        <form action="controlador" method="get"> 
            <input type="hidden" name="operacao" value="cadastraProduto">
            Nome: <input class="w3-input w3-border w3-left" type="text" placeholder="Nome" required name="nome"><br>
            Preço: <input class="w3-input w3-border w3-left" type="text" placeholder="Preço" required name="preco"><br>
            Quantidade: <input class="w3-input w3-border w3-left" type="text" placeholder="Quantidade no Estoque" required name="qtdestoque"> <br>
            Url da Imagem: <input class="w3-input w3-border w3-left" type="text" placeholder="Imagem" required name="imagem"> <br>
            <button  class="w3-button w3-black w3-section w3-center " type="submit" value="Cadatrar">Cadastrar</button>
        </form>
    </body>
</html>
