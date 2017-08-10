<%-- 
    Document   : EditaProduto
    Created on : 06/07/2017, 08:26:11
    Author     : informatica
--%>

<%@page import="modelo.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edição de Produto</title>
    </head>
    <body>
        <h1>Edição de Produto</h1>
        <form action="controlador">

            <%
                Produto p = (Produto) request.getAttribute("p");
                // 3.2 mostra os campos do livro, preenchendo-os com os valores do livro atual
%>

            Nome: <input type="text" name="nome" value="<%=p.getNome()%>"> <br>
            Preço: <input type="text" name="preco" value="<%=p.getPreco()%>"> <br>
            Quantidade: <input type="text" name="qtdestoque" value="<%=p.getQtdestoque()%>"> <br>
            Url: <input type="text" name="url" value="<%=p.getImagem()%>"> <br>
            <input type="submit" value="Salvar">

            <%
// 3.3 o botão "Salvar" chamará o controlador, informando a operação "alteraDadosLivro" e 
// o código do livro a ter os dados alterados (esse segundo campo é um campo escondido)
%>     
            <input type="hidden" name="operacao" value="atualizaProduto">
            <input type="hidden" name="codigo" value="<%=p.getCodigo()%>">

        </form>
    </body>
</html>