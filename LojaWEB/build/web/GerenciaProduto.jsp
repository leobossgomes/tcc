<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProdutoDAO"%>
<%@page import="modelo.ProdutoDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerencia de Produtos</title>
        <style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: center;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
    </head>
     <h1 class="w3-wide w3-center w3-black">Gerencia de Produtos</h1>
    <table id="keywords"  cellspacing="3px" cellpadding="0px">
       
        <thead>
            
            <tr>
                <th><span>Codigo</span></th>
                <th><span>Nome</span></th>
                <th><span>Preco</span></th>
                <th><span>Quantidade</span></th>   
                <th><span>Operações</span></th>
            </tr>
        </thead>
        <tbody>

            <%
                HttpSession ses = request.getSession(true);

                ProdutoDTO pr = (ProdutoDTO) ses.getAttribute("Produto");
                if (pr == null) {
                    pr = new ProdutoDTO();
                    ProdutoDAO pd = new ProdutoDAO();
                    // pr.setProduto(pd.carregaListaDeProduto());

                    ArrayList<ProdutoDTO> produtos = pd.carregaListaDeProduto();
                    //ses.setAttribute("Produto", pr);

                    for (ProdutoDTO p : produtos) {
            %>

            <tr id="tabela">
                <td class=center><%=p.getCodigo()%></td>
                <td class=center><%=p.getNome()%></td> 
                <td class=center><%=p.getPreco()%></td>
                <td class=center><%=p.getQtdestoque()%></td>

                <td>
                    <a class="w3-button w3-black w3-section w3-center " href="controlador?operacao=formEdita&codigo=<%=p.getCodigo()%>">Editar</a>
                    <a class="w3-button w3-black w3-section w3-center " href="controlador?operacao=exclui&codigo=<%=p.getCodigo()%>">Excluir</a>
                </td>

            </tr>

            <%
                    }
                }
            %>
        </tbody>
    </table> 
   
        <div> 
     <a  <button  class="w3-button w3-black w3-section w3-center "href="CadastroProduto.jsp" type="submit" value="Editar"> Incluir um Produto</a></button>
    <a  <button  class="w3-button w3-black w3-section w3-center "href="SiteWEB.jsp" type="submit" value="Editar"> Voltar ao Site</a></button>
    </div>
</form>
</html>