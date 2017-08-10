

<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProdutoDAO"%>
<%@page import="modelo.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerencia de Produtos</title>
    </head>
    <p class="w3-opacity "><i>Gerenciamento de Produtos</i></p>
  
        
        <a href="CadastroProduto.jsp">Incluir um Produto</a>
        <hr>
        <table id="keywords" cellspacing="3px" cellpadding="0">
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

                    Produto pr = (Produto) ses.getAttribute("Produto");
                    if (pr == null) {
                        pr = new Produto();
                        ProdutoDAO pd = new ProdutoDAO();
                        // pr.setProduto(pd.carregaListaDeProduto());

                        ArrayList<Produto> produtos = pd.carregaListaDeProduto();
                        //ses.setAttribute("Produto", pr);

                        for (Produto p : produtos) {
                %>

                <tr id="tabela">
                    <td class=center><%=p.getCodigo()%></td>
                    <td class=center><%=p.getNome()%></td> 
                    <td class=center><%=p.getPreco()%></td>
                    <td class=center><%=p.getQtdestoque()%></td>

                    <td>
                        <a href="controlador?operacao=formEdita&codigo=<%=p.getCodigo()%>">Editar</a>
                        <a href="controlador?operacao=exclui&codigo=<%=p.getCodigo()%>">Excluir</a>
                    </td>

                </tr>

                <%
                        }
                    }
                %>
            </tbody>
        </table>    
    </form>
</html>
