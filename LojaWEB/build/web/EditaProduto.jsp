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
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" class="w3-black">
        <title>Edição de Produto</title>
    </head>
    <body>
       <div class="w3-white w3-center">
            <h1 class="w3-wide w3-center w3-black">Edição de Produtos</h1>
             <div class="w3-row-padding " style="margin:125px 160px 0px 160px">
                <form action="controlador" method="get"> 
            <%
                Produto p = (Produto) request.getAttribute("p");
                // 3.2 mostra os campos do livro, preenchendo-os com os valores do livro atual
%>

          <input type="hidden" name="operacao" value="cadastraProduto">
                    Nome: <input class="w3-input w3-border w3-left " type="text" placeholder="Nome" required name="nome"><br>
                    Preço: <input class="w3-input w3-border w3-left " type="text" placeholder="Preço" required name="preco"><br>
                    Quantidade: <input class="w3-input w3-border w3-left" type="text" placeholder="Quantidade no Estoque" required name="qtdestoque"> <br>
                    Url da Imagem: <input class="w3-input w3-border w3-left" type="text" placeholder="Imagem" required name="imagem"> <br>
                    <button  class="w3-button w3-black w3-section w3-center " type="submit" value="Cadatrar">Salvar Edição</button>

            <%
// 3.3 o botão "Salvar" chamará o controlador, informando a operação "alteraDadosLivro" e 
// o código do livro a ter os dados alterados (esse segundo campo é um campo escondido)
%>     
            <input type="hidden" name="operacao" value="atualizaProduto">
            <input type="hidden" name="codigo" value="<%=p.getCodigo()%>">

        </form>
    </body>
</html>