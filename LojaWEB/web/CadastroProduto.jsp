

<%@page import="dao.ProdutoDAO"%>
<%@page import="modelo.Produto"%>
<%@page import="java.util.Scanner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Produto</title>
    </head>
    <body>    
        <form action="controlador" method="get"> 
            <input type="hidden" name="operacao" value="cadastraProduto">
            Nome: <input type="text" name="nome"> <br>
            Preço: <input type="text" name="preco"> <br>
            Quantidade: <input type="text" name="qtdestoque"> <br>
            Url da Imagem: <input type="text" name="imagem"> <br>
            <input type="submit" value="Cadastrar">
        </form>
    </body>
</html>
