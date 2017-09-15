package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import modelo.Produto;
import modelo.Produto;
import dao.ProdutoDAO;

public final class SiteWEB_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <title>Shoesnet</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/3/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lato\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <style>\n");
      out.write("        body {font-family: \"Lato\", sans-serif}\n");
      out.write("        .mySlides {display: none}\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Barra de Navegação -->\n");
      out.write("        <div class=\"w3-top\">\n");
      out.write("            <div class=\"w3-bar w3-black w3-card-2\">\n");
      out.write("                <a class=\"w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right\" href=\"javascript:void(0)\" onclick=\"myFunction()\" title=\"Toggle Navigation Menu\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Menu</a>\n");
      out.write("                <a href=\"#promo\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">Promoções</a>\n");
      out.write("                <a href=\"#emalta\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">Em Alta</a>\n");
      out.write("                <a href=\"#contato\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">Contato</a>\n");
      out.write("                <a href=\"#login\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">Login</a>\n");
      out.write("                <div class=\"w3-dropdown-hover w3-hide-small\">\n");
      out.write("                    <button class=\"w3-padding-large w3-button\" title=\"More\">Departamentos <i class=\"fa fa-caret-down\"></i></button>     \n");
      out.write("                    <div class=\"w3-dropdown-content w3-bar-block w3-card-4\">\n");
      out.write("                        <a href=\"#fut\" class=\"w3-bar-item w3-button\">Futebol</a>\n");
      out.write("                        <a href=\"#vol\" class=\"w3-bar-item w3-button\">Voleibol</a>\n");
      out.write("                        <a href=\"#basq\" class=\"w3-bar-item w3-button\">Basquetebol</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"http://www.eeeb.com.br/\" class=\"w3-padding-large w3-hover-red w3-hide-small w3-right\"><i class=\"fa fa-search\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <button  class=\"w3-button w3-black w3-section w3-right\" type=\"submit\" value=\"confirmacaomsg.html\">Entrar</button>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Barras de navegação  -->\n");
      out.write("<div id=\"navDemo\" class=\"w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top\" style=\"margin-top:46px\">\n");
      out.write("    <a href=\"#promo\" class=\"w3-bar-item w3-button w3-padding-large\">PROMOÇÕES</a>\n");
      out.write("    <a href=\"#chuteira\" class=\"w3-bar-item w3-button w3-padding-large\">CHUTEIRAS</a>\n");
      out.write("    <a href=\"#contato\" class=\"w3-bar-item w3-button w3-padding-large\">CONTATO</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Page content -->\n");
      out.write("<div class=\"w3-content\" style=\"max-width:2000px;margin-top:46px\">\n");
      out.write("\n");
      out.write("    <!-- Automatic Slideshow Images -->\n");
      out.write("    <div class=\"mySlides w3-display-container w3-center\">\n");
      out.write("        <img src=\"imagens/site.jpg\" style=\"width:100%\">\n");
      out.write("        <div class=\"w3-container w3-text-black w3-padding-32 w3-hide-small\">\n");
      out.write("            <h3>SHOESNET</h3>\n");
      out.write("            <p><b>OBRIGADO POR NOS ESCOLHER</b></p>    \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- The promo Section -->\n");
      out.write("    <div class=\"w3-black w3-container w3-content w3-center w3-padding-64\" style=\"max-width:100%\" id=\"promo\">\n");
      out.write("        <h2 class=\"w3-wide\">PROMOÇÕES</h2>\n");
      out.write("        <p class=\"w3-opacity\"><i></i></p>\n");
      out.write("        <p class=\"w3-justify\">Temos apenas esses produtos nessa sessão:</p><div class=\"w3-row w3-padding-32\">\n");
      out.write("              ");
 
                  
                    // criar um DAO
                    ProdutoDAO pdao = new ProdutoDAO();
              
                    // ler os produtos
                    ArrayList<Produto> produtos = pdao.carregaListaDeProduto();
                    
                    // percorrer os produtos
                    //for (int i = 0; i < 3; i++) {
                    for (Produto produto: produtos) {
                           
              
      out.write("\n");
      out.write("    <div class=\"w3-third\">\n");
      out.write("                <p><a href=\"https://www.google.com.br/?gws_rd=ssl\"target=\"_blank\"> ");
      out.print(produto.getNome());
      out.write(" </a></p>\n");
      out.write("                <img src=\"imagens/magista.jpg\" class=\"w3-round w3-margin-bottom\" alt=\"Random Name\" style=\"width:65%\">\n");
      out.write("            </div>\n");
      out.write("    ");
 }
    
      out.write("\n");
      out.write("            <div class=\"w3-third\">\n");
      out.write("                <p><a href=\"https://www.google.com.br/?gws_rd=ssl\"target=\"_blank\"> Magista </a></p>\n");
      out.write("                <img src=\"imagens/magista.jpg\" class=\"w3-round w3-margin-bottom\" alt=\"Random Name\" style=\"width:65%\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3-third\">\n");
      out.write("                <p><a href=\"https://www.google.com.br/?gws_rd=ssl\"target=\"_blank\">Uniforme Barcelona</a></p>\n");
      out.write("                <img src=\"imagens/barcelona.jpg\" class=\"w3-round w3-margin-bottom\" alt=\"Random Name\" style=\"width:90%\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3-third\">\n");
      out.write("                <p><a href=\"https://www.google.com.br/?gws_rd=ssl\"target=\"_blank\">Bola Futebol</a></p>\n");
      out.write("                <img src=\"imagens/bola.jpg\" class=\"w3-round\" alt=\"Random Name\" style=\"width:75%\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- the futebol section -->\n");
      out.write("    <div class=\"w3-container w3-content w3-padding-64 w3-center\" style=\"max-width:100%\" id=\"fut\">\n");
      out.write("        <h2 class=\"w3-wide\">FUTEBOL</h1>\n");
      out.write("            <p class=\"w3-opacity\"><i></i></p>\n");
      out.write("            <p class=\"w3-justify\">Esses são alguns desse departamento:</p><div class=\"w3-row w3-padding-32\">\n");
      out.write("                <div class=\"w3-third\">\n");
      out.write("                    <p><a href=\"https://www.google.com.br/?gws_rd=ssl\"target=\"_blank\">Chuteira</a></p>\n");
      out.write("                    <img src=\"imagens/chuteira.jpg\" class=\"w3-round w3-margin-bottom\" alt=\"Random Name\" style=\"width:65%\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w3-third\">\n");
      out.write("                    <p><a href=\"https://www.google.com.br/?gws_rd=ssl\"target=\"_blank\">Uniformes</a></p>\n");
      out.write("                    <img src=\"imagens/barcelona.jpg\" class=\"w3-round w3-margin-bottom\" alt=\"Random Name\" style=\"width:90%\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w3-third\">\n");
      out.write("                    <p><a href=\"https://www.google.com.br/?gws_rd=ssl\"target=\"_blank\">Bolas</a></p>\n");
      out.write("                    <img src=\"imagens/bola.jpg\" class=\"w3-round\" alt=\"Random Name\" style=\"width:75%\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <!--volei section -->\n");
      out.write("    <div class=\"w3-black w3-container w3-content w3-center w3-padding-64\" style=\"max-width:100%\" id=\"vol\">\n");
      out.write("        <h2 class=\"w3-wide\">Voleibol</h1>\n");
      out.write("            <p class=\"w3-opacity\"><i></i></p>\n");
      out.write("            <p class=\"w3-justify\">Esses são alguns desse departamento:</p><div class=\"w3-row w3-padding-32\">\n");
      out.write("                <div class=\"w3-third\">\n");
      out.write("                    <p><a href=\"https://www.google.com.br/?gws_rd=ssl\"target=\"_blank\">Tenis</a></p>\n");
      out.write("                    <img src=\"imagens/tenis.jpg\" class=\"w3-round w3-margin-bottom\" alt=\"Random Name\" style=\"width:70%\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w3-third\">\n");
      out.write("                    <p><a href=\"https://www.google.com.br/?gws_rd=ssl\"target=\"_blank\">Equipamentos</a></p>\n");
      out.write("                    <img src=\"imagens/joelheira.jpg\" class=\"w3-round w3-margin-bottom\" alt=\"Random Name\" style=\"width:70%\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w3-third\">\n");
      out.write("                    <p><a href=\"https://www.google.com.br/?gws_rd=ssl\"target=\"_blank\">Bolas</a></p>\n");
      out.write("                    <img src=\"imagens/bolav.jpg\" class=\"w3-round\" alt=\"Random Name\" style=\"width:70%\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <!--Basquetebol section -->\n");
      out.write("    <div class=\"w3-container w3-content w3-center w3-padding-64\" style=\"max-width:100%\" id=\"basq\">\n");
      out.write("        <h2 class=\"w3-wide\">Basquetebol</h1>\n");
      out.write("            <p class=\"w3-opacity\"><i></i></p>\n");
      out.write("            <p class=\"w3-justify\">Esses são alguns desse departamento:</p><div class=\"w3-row w3-padding-32\">\n");
      out.write("                <div class=\"w3-third\">\n");
      out.write("                    <p><a href=\"https://www.google.com.br/?gws_rd=ssl\"target=\"_blank\">Tenis</a></p>\n");
      out.write("                    <img src=\"imagens/tenisb.jpg\" class=\"w3-round w3-margin-bottom\" alt=\"Random Name\" style=\"width:70%\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w3-third\">\n");
      out.write("                    <p><a href=\"https://www.google.com.br/?gws_rd=ssl\"target=\"_blank\">Equipamentos</a></p>\n");
      out.write("                    <img src=\"imagens/bone.jpg\" class=\"w3-round w3-margin-bottom\" alt=\"Random Name\" style=\"width:70%\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w3-third\">\n");
      out.write("                    <p><a href=\"https://www.google.com.br/?gws_rd=ssl\"target=\"_blank\">Bolas</a></p>\n");
      out.write("                    <img src=\"imagens/bolab.jpg\" class=\"w3-round\" alt=\"Random Name\" style=\"width:70%\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- The emalta Section -->\n");
      out.write("    <div class=\"w3-black\" id=\"emalta\">\n");
      out.write("        <div class=\"w3-container w3-center w3-content w3-padding-64\" style=\"max-width\" id=\"alta\">\n");
      out.write("            <h2 class=\"w3-wide\">Em Alta!</h1>\n");
      out.write("                <p class=\"w3-opacity w3-center\"><i>SE LIGA NESSES PRODUTOS !</i></p><br>\n");
      out.write("\n");
      out.write("                <div class=\"w3-row-padding w3-padding-32\" style=\"margin:0 -16px\">\n");
      out.write("                    <div class=\"w3-third w3-margin-bottom\">\n");
      out.write("                        <img src=\"imagens/mercurial.jpg\" alt=\"chuteira\" style=\"width:100%\" class=\"w3-hover-opacity\">\n");
      out.write("                        <div class=\"w3-container w3-white\">\n");
      out.write("                            <p><b>Mercurial</b></p>          \n");
      out.write("                            <p>MODELO CAMPO</p>\n");
      out.write("                            <button class=\"w3-button w3-black w3-margin-bottom\" onclick=\"document.getElementById('ticketModal').style.display = 'block'\">COMPRAR JÁ</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w3-third w3-margin-bottom\">\n");
      out.write("                        <img src=\"imagens/joelheira2.jpg\" alt=\"joelheira\" style=\"width:100%\" class=\"w3-hover-opacity\">\n");
      out.write("                        <div class=\"w3-container w3-white\">\n");
      out.write("                            <p><b>ESPECIAIS</b></p>            \n");
      out.write("                            <p>BOA DURABILIDADE</p>\n");
      out.write("                            <button class=\"w3-button w3-black w3-margin-bottom\" onclick=\"document.getElementById('ticketModal').style.display = 'block'\">COMPRAR JÁ</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w3-third w3-margin-bottom\">\n");
      out.write("                        <img src=\"imagens/bolab.jpg\" alt=\"bola\" style=\"width:100%\" class=\"w3-hover-opacity\">\n");
      out.write("                        <div class=\"w3-container w3-white\">\n");
      out.write("                            <p><b>Spalding</b></p>\n");
      out.write("                            <p>BOLA OFICIAL DA NBA</p>\n");
      out.write("                            <button class=\"w3-button w3-black w3-margin-bottom\" onclick=\"document.getElementById('ticketModal').style.display = 'block'\">COMPRAR JÁ</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Ticket Modal -->\n");
      out.write("    <div id=\"ticketModal\" class=\"w3-modal\">\n");
      out.write("        <div class=\"w3-modal-content w3-animate-top w3-card-4\">\n");
      out.write("            <header class=\"w3-container w3-teal w3-center w3-padding-32\"> \n");
      out.write("                <span onclick=\"document.getElementById('ticketModal').style.display = 'none'\" \n");
      out.write("                      class=\"w3-button w3-teal w3-xlarge w3-display-topright\">X</span>\n");
      out.write("                <h2 class=\"w3-wide\"><i class=\"fa fa-suitcase w3-margin-right\"></i>Confirmação</h2>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"w3-container\">\n");
      out.write("                <p><label><i class=\"fa fa-shopping-cart\"></i> Quantidade</label></p>\n");
      out.write("                <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Quantos Pares?\">\n");
      out.write("                <p><label><i class=\"fa fa-user\"></i> Enviar para</label></p>\n");
      out.write("                <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Email\">\n");
      out.write("                <button class=\"w3-button w3-block w3-teal w3-padding-16 w3-section w3-right\">COMPRAR <i class=\"fa fa-check\"></i></button>\n");
      out.write("                <button class=\"w3-button w3-red w3-section\" onclick=\"document.getElementById('ticketModal').style.display = 'none'\">Cancelar <i class=\"fa fa-remove\"></i></button>\n");
      out.write("                <p class=\"w3-right\">Precisa de <a href=\"#\" class=\"w3-text-blue\">Ajuda?</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- The contato Section -->\n");
      out.write("    <div class=\"w3-container w3-content w3-padding-64 style\"max-width:800px id=\"contato\">\n");
      out.write("        <h2 class=\"w3-wide w3-center\">Contato</h2>\n");
      out.write("        <p class=\"w3-opacity w3-center\"><i>Deixe seu feedback</i></p>\n");
      out.write("        <div class=\"w3-row w3-padding-32\">\n");
      out.write("            <div class=\"w3-col m6 w3-large w3-margin-bottom\">\n");
      out.write("                <i class=\"fa fa-map-marker\" style=\"width:30px\"></i> Blumenau,SC (BR)<br>\n");
      out.write("                <i class=\"fa fa-phone\" style=\"width:30px\"></i> Telefone: +55 (047)992801204<br>\n");
      out.write("                <i class=\"fa fa-phone\" style=\"width:30px\"></i> Telefone: +55 (047)984628135<br>\n");
      out.write("                <i class=\"fa fa-envelope\" style=\"width:30px\"> </i> Email: leobossgomes@gmail.com<br>       \n");
      out.write("                <i class=\"fa fa-envelope\" style=\"width:30px\"> </i> Email: flasuski@gmail.com<br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3-col m6\">\n");
      out.write("                <form action=\"/action_page.php\" target=\"_blank\">\n");
      out.write("                    <div class=\"w3-row-padding\" style=\"margin:0 -16px 8px -16px\">\n");
      out.write("                        <div class=\"w3-half\">\n");
      out.write("                            <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Nome\" required name=\"Nome\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w3-half\">\n");
      out.write("                            <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Email\" required name=\"Email\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Mensagem\" required name=\"Mensagem\">\n");
      out.write("\n");
      out.write("                    <button  class=\"w3-button w3-black w3-section w3-right\" type=\"submit\" value=\"confirmacaomsg.html\">Enviar</button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- End Page Content -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<CENTER><iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3558.631585022754!2d-49.13569498491042!3d-26.883443783140166!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x37e3f4a354ae9b76!2sInstituto+Federal+Catarinense+-+Campus+Blumenau!5e0!3m2!1spt-BR!2sbr!4v1491933440043\" width=\"75%\" height=\"100%\" frameborder=\"0\" style=\"height:500px\" margin-top=\"10px\" allowfullscreen></iframe></CENTER>\n");
      out.write("<!--\n");
      out.write("To use this code on your website, get a free API key from Google.\n");
      out.write("Read more at: https://www.w3schools.com/graphics/google_maps_basic.asp\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"w3-container w3-padding-64 w3-center w3-opacity w3-light-grey w3-xlarge\">\n");
      out.write("    <i class=\"fa fa-facebook-official w3-hover-text-indigo\"></i>\n");
      out.write("    <i class=\"fa fa-instagram w3-hover-text-purple\"></i>\n");
      out.write("    <i class=\"fa fa-snapchat w3-hover-text-yellow\"></i>\n");
      out.write("    <i class=\"fa fa-pinterest-p w3-hover-text-red\"></i>\n");
      out.write("    <i class=\"fa fa-twitter w3-hover-text-light-blue\"></i>\n");
      out.write("    <i class=\"fa fa-linkedin w3-hover-text-indigo\"></i>\n");
      out.write("    <p class=\"w3-medium\">Feito por: Leonardo Boss e José Suski</a></p>\n");
      out.write("\n");
      out.write("    <div class=\"w3-container w3-content w3-padding-64 style\"max-width:800px id=\"login\">\n");
      out.write("        <h2 class=\"w3-wide w3-center\">Login</h2>\n");
      out.write("        <p class=\"w3-opacity w3-center\"><i>Faça seu login aqui!</i></p>\n");
      out.write("        <div class=\"w3-row w3-padding-32\">\n");
      out.write("\n");
      out.write("            <div class=\"w3-col m6\">\n");
      out.write("                <form action=\"/action_page.php\" target=\"_blank\">\n");
      out.write("                    <div class=\"w3-row-padding\" style=\"margin:0 -16px 8px -16px\">\n");
      out.write("                        <div class=\"w3-half\">\n");
      out.write("                            <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"E-mail\" required name=\"E-mail\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w3-half\">\n");
      out.write("                            <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Senha\" required name=\"Senha\">\n");
      out.write("                            <button  class=\"w3-button w3-black w3-section w3-right\" type=\"submit\" value=\"confirmacaomsg.html\">Enviar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                        // Automatic Slideshow - change image every 4 seconds\n");
      out.write("                        var myIndex = 0;\n");
      out.write("                        carousel();\n");
      out.write("\n");
      out.write("                        function carousel() {\n");
      out.write("                            var i;\n");
      out.write("                            var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("                            for (i = 0; i < x.length; i++) {\n");
      out.write("                                x[i].style.display = \"none\";\n");
      out.write("                            }\n");
      out.write("                            myIndex++;\n");
      out.write("                            if (myIndex > x.length) {\n");
      out.write("                                myIndex = 1;\n");
      out.write("                            }\n");
      out.write("                            x[myIndex - 1].style.display = \"block\";\n");
      out.write("                            setTimeout(carousel, 4000);\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        // Used to toggle the menu on small screens when clicking on the menu button\n");
      out.write("                        function myFunction() {\n");
      out.write("                            var x = document.getElementById(\"navDemo\");\n");
      out.write("                            if (x.className.indexOf(\"w3-show\") === -1) {\n");
      out.write("                                x.className += \" w3-show\";\n");
      out.write("                            } else {\n");
      out.write("                                x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        // When the user clicks anywhere outside of the modal, close it\n");
      out.write("                        var modal = document.getElementById('ticketModal');\n");
      out.write("                        window.onclick = function (event) {\n");
      out.write("                            if (event.target === modal) {\n");
      out.write("                                modal.style.display = \"none\";\n");
      out.write("                            }\n");
      out.write("                        };\n");
      out.write("\n");
      out.write("                    </script>\n");
      out.write("\n");
      out.write("                    </body>\n");
      out.write("                    </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
