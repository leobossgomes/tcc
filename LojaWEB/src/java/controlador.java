
import dao.ProdutoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Produto;

@WebServlet(urlPatterns = {"/controlador"})
public class controlador extends HttpServlet {

    private RequestDispatcher rd = null;
    ProdutoDAO pdao = new ProdutoDAO();
    ArrayList<Produto> produtos = pdao.carregaListaDeProduto();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String operacao = request.getParameter("operacao");
            HttpSession ses = request.getSession(true);

            //INICIO DO LOGIN
            if (operacao.equals("loginAdmin")) {

                // pegar os dados
                String login = request.getParameter("usuario");
                String senha = request.getParameter("senha");

                // validar os dados: se o login estah certo...
                if (login.equals("admin") && senha.equals("123")) {

                    // botar a variavel administradorLogado na sessao,
                    // com o valor "verdadeiro"
                    HttpSession ss = request.getSession(true);
                    ses.setAttribute("administradorLogado", true);

                    // mostra que o administrador estah logado! show!
                    out.println("Admin, bem vindo! <a href=SiteWEB.jsp>Continuar</a>");

                    // se o login estah incorreto...
                } else {

                    // mostra que o login estah incorreto!
                    out.println("Login incorreto! <a href=\"SiteWEB.jsp\">Continuar</a>");
                }
            } else if (operacao.equals("logout")) {
                // tira a variavel administradorLogado da sessao
                HttpSession ss = request.getSession(true);
                ses.removeAttribute("administradorLogado");

                // volta pra tela principal
                RequestDispatcher rd = request.getRequestDispatcher("SiteWEB.jsp");
                rd.forward(request, response);

            } else if (operacao.equals("cadastraProduto")) {

                ProdutoDAO p = new ProdutoDAO();
                Produto w = new Produto();
                String nome = request.getParameter("nome");
                w.setNome(nome);
                String preco = request.getParameter("preco");
                w.setPreco(Double.valueOf(preco));
                String quantidade = request.getParameter("qtdestoque");
                w.setQtdestoque(Integer.parseInt(quantidade));
                String imagem = request.getParameter("imagem");
                w.setImagem(imagem);
                p.insereProduto(w);
                out.print("Produto Inserido !!! <a href=GerenciaProduto.jsp>Continuar</a>");

            } else if (operacao.equals("atualizaProduto")) {

                ProdutoDAO p = new ProdutoDAO();
                Produto w = new Produto();
                String nome = request.getParameter("nome");
                w.setNome(nome);
                String preco = request.getParameter("preco");
                w.setPreco(Double.valueOf(preco));
                String quantidade = request.getParameter("qtdestoque");
                w.setQtdestoque(Integer.parseInt(quantidade));
                String imagem = request.getParameter("imagem");
                w.setImagem(imagem);
                int codigo = Integer.parseInt(request.getParameter("codigo"));
                p.removeProduto(codigo);
                p.insereProduto(w);
                out.print("Produto Editado !!! <a href=GerenciaProduto.jsp>Continuar</a>");
            } else if (operacao.equals("formEdita")) {

                // pega o codigo do produto
                String id = request.getParameter("codigo");

                // carrega o produto do DAO
                Produto prod = pdao.carregaProdutoComId(id);

                // adiciona o produto no request
                request.setAttribute("p", prod);

                // encaminha pra pagina de edicao
                RequestDispatcher rd = request.getRequestDispatcher("EditaProduto.jsp");
                rd.forward(request, response);

            } else if (operacao.equals("edita")) {

                int codigo = Integer.parseInt(request.getParameter("codigo"));
                String nome = request.getParameter("nome");
                Double preco = Double.valueOf(request.getParameter("preco"));
                int quantidade = Integer.parseInt(request.getParameter("quantidade"));
                String imagem = request.getParameter("url");

                //4.2 cria um produto com os dados novos
                Produto novo = new Produto(codigo, nome, preco, quantidade, imagem);

                //4.3 solicita ao DAO que altere os dados do livro 
                //(será usado o id do livro, pelo DAO, para localizar o livro)
                ProdutoDAO pdao = new ProdutoDAO();
                pdao.cadastraProduto(novo);

                //4.4 mostra uma mensagem de que o livro foi alterado, e um link para continuar
                out.println("Produto atualizado. <a href=GerenciaProduto.jsp>Continuar</a>");

            } else if (operacao.equals("exclui")) {

                ProdutoDAO pdao = new ProdutoDAO();

                int codigo = Integer.parseInt(request.getParameter("codigo"));
                pdao.removeProduto(codigo);
                out.print("Produto Excluído com sucesso !!! <a href=GerenciaProduto.jsp>Voltar</a>");
                //FIM DO LOGIN
                // pega a operacao a ser executada
                // se a operacao for 'lista'
                // pede ao DAO a lista de produtos
                //ses.setAttribute("mensagem", pdao);
                //rd = request.getRequestDispatcher("sucesso.jsp");
                //rd.forward(request, response);

                // coloca a lista de produtos na sessao
                // encaminha a requisição para a pagina que lista produtos
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(controlador.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(controlador.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
