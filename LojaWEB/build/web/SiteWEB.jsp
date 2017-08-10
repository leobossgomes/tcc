<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Produto"%>
<%@page import="modelo.Produto"%>
<%@page import="dao.ProdutoDAO"%>
<!DOCTYPE html>
<html>
    <title>Shoesnet</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body {font-family: "Lato", sans-serif}
        .mySlides {display: none}
    </style>
    <body>

        <!-- Barra de Navegação -->
        <div class="w3-top">
            <div class="w3-bar w3-black w3-card-2">
                <a class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right" href="javascript:void(0)" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
                <a href="#" class="w3-bar-item w3-button w3-padding-large">Menu</a>
                <a href="#promo" class="w3-bar-item w3-button w3-padding-large w3-hide-small">Promoções</a>
                <a href="#emalta" class="w3-bar-item w3-button w3-padding-large w3-hide-small">Em Alta</a>
                <a href="#contato" class="w3-bar-item w3-button w3-padding-large w3-hide-small">Contato</a>
                <a href="http://www.eeeb.com.br/" class="w3-padding-large w3-hover-red w3-hide-small w3-right"><i class="fa fa-search"></i></a>
                <div class="w3-dropdown-hover w3-hide-small">
                    <button class="w3-padding-large w3-button" title="More">Departamentos <i class="fa fa-caret-down"></i></button>     
                    <div class="w3-dropdown-content w3-bar-block w3-card-4">
                        <a href="#fut" class="w3-bar-item w3-button">Futebol</a>
                        <a href="#vol" class="w3-bar-item w3-button">Voleibol</a>
                        <a href="#basq" class="w3-bar-item w3-button">Basquetebol</a>
                    </div>
                </div> 
                <%HttpSession ses = request.getSession(true);

                    Boolean administradorLogado
                            = (Boolean) ses.getAttribute("administradorLogado");

                    if ((administradorLogado != null)
                            && (administradorLogado)) {%>
                <div class="w3-dropdown-hover w3-hide-small w3-right">
                    <button class="w3-padding-large w3-button" title="More"> Administrador <i class="fa fa-caret-down"></i></button>     
                    <div class="w3-dropdown-content w3-bar-block w3-card-4">
                        <a href="" class="w3-bar-item w3-button">Perfil</a>
                        <a href="GerenciaProduto.jsp" class="w3-bar-item w3-button">Gerencia de Produtos</a>

                        <a href="controlador?operacao=logout" class="w3-bar-item w3-button">Logout</a>


                        <%} else {%>
                        <a href="#login" class="w3-bar-item w3-button w3-padding-large w3-hide-small w3-right">Login</a>
                        <%}%>

                    </div>
                </div>
            </div>
        </form>
    </div>
</div>


<!-- Barras de navegação  -->
<div id="navDemo" class="w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top" style="margin-top:46px">
    <a href="#promo" class="w3-bar-item w3-button w3-padding-large">PROMOÇÕES</a>
    <a href="#chuteira" class="w3-bar-item w3-button w3-padding-large">CHUTEIRAS</a>
    <a href="#contato" class="w3-bar-item w3-button w3-padding-large">CONTATO</a>
</div>

<!-- Page content -->
<div class="w3-content" style="max-width:2000px;margin-top:46px">

    <!-- Automatic Slideshow Images -->
    <div class="mySlides w3-display-container w3-center">
        <img src="imagens/site.jpg" style="width:100%">
        <div class="w3-container w3-text-black w3-padding-32 w3-hide-small">
            <h3>SHOESNET</h3>
            <p><b>OBRIGADO POR NOS ESCOLHER</b></p>    
        </div>
    </div>




    <!-- Seção de Promoção -->
    <div class="w3-black w3-container w3-content w3-center w3-padding-64" style="max-width:100%" id="promo">
        <h2 class="w3-wide">PROMOÇÕES</h2>
        <p class="w3-opacity"><i></i></p>
        <p class="w3-justify">Temos apenas esses produtos nessa sessão:</p><div class="w3-row w3-padding-32">
            <%                // criar um DAO
                ProdutoDAO pdao = new ProdutoDAO();

                // ler os produtos
                ArrayList<Produto> produtos = pdao.carregaListaDeProduto();

                // percorrer os produtos
                //for (int i = 0; i < 3; i++) {
                for (Produto produto : produtos) {

            %>
            <div class="w3-third">
                <p><a href="https://www.google.com.br/?gws_rd=ssl"target="_blank"> <%=produto.getNome()%> </a></p>
                <img src="<%=produto.getImagem()%>" class="w3-round w3-margin-bottom" alt="Random Name" style="width:65%">
            </div>
            <% }
            %>
            <div class="w3-third">
                <p><a href="https://www.google.com.br/?gws_rd=ssl"target="_blank"> Magista </a></p>
                <img src="imagens/magista.jpg" class="w3-round w3-margin-bottom" alt="Random Name" style="width:65%">
            </div>
            <div class="w3-third">
                <p><a href="https://www.google.com.br/?gws_rd=ssl"target="_blank">Uniforme Barcelona</a></p>
                <img src="imagens/barcelona.jpg" class="w3-round w3-margin-bottom" alt="Random Name" style="width:90%">
            </div>
            <div class="w3-third">
                <p><a href="https://www.google.com.br/?gws_rd=ssl"target="_blank">Bola Futebol</a></p>
                <img src="imagens/bola.jpg" class="w3-round" alt="Random Name" style="width:75%">
            </div>
        </div>
    </div>
    <!-- Seção de Futebol -->
    <div class="w3-container w3-content w3-padding-64 w3-center" style="max-width:100%" id="fut">
        <h2 class="w3-wide">FUTEBOL</h1>
            <p class="w3-opacity"><i></i></p>
            <p class="w3-justify">Esses são alguns desse departamento:</p><div class="w3-row w3-padding-32">
                <div class="w3-third">
                    <p><a href="https://www.google.com.br/?gws_rd=ssl"target="_blank">Chuteira</a></p>
                    <img src="imagens/chuteira.jpg" class="w3-round w3-margin-bottom" alt="Random Name" style="width:65%">
                </div>
                <div class="w3-third">
                    <p><a href="https://www.google.com.br/?gws_rd=ssl"target="_blank">Uniformes</a></p>
                    <img src="imagens/barcelona.jpg" class="w3-round w3-margin-bottom" alt="Random Name" style="width:90%">
                </div>
                <div class="w3-third">
                    <p><a href="https://www.google.com.br/?gws_rd=ssl"target="_blank">Bolas</a></p>
                    <img src="imagens/bola.jpg" class="w3-round" alt="Random Name" style="width:75%">
                </div>
            </div>
    </div>
    <!-- Seção de Vôleibol -->
    <div class="w3-black w3-container w3-content w3-center w3-padding-64" style="max-width:100%" id="vol">
        <h2 class="w3-wide">Voleibol</h1>
            <p class="w3-opacity"><i></i></p>
            <p class="w3-justify">Esses são alguns desse departamento:</p><div class="w3-row w3-padding-32">
                <div class="w3-third">
                    <p><a href="https://www.google.com.br/?gws_rd=ssl"target="_blank">Tenis</a></p>
                    <img src="imagens/tenis.jpg" class="w3-round w3-margin-bottom" alt="Random Name" style="width:70%">
                </div>
                <div class="w3-third">
                    <p><a href="https://www.google.com.br/?gws_rd=ssl"target="_blank">Equipamentos</a></p>
                    <img src="imagens/joelheira.jpg" class="w3-round w3-margin-bottom" alt="Random Name" style="width:70%">
                </div>
                <div class="w3-third">
                    <p><a href="https://www.google.com.br/?gws_rd=ssl"target="_blank">Bolas</a></p>
                    <img src="imagens/bolav.jpg" class="w3-round" alt="Random Name" style="width:70%">
                </div>
            </div>
    </div>
    <!-- Seção Basquetebol -->
    <div class="w3-container w3-content w3-center w3-padding-64" style="max-width:100%" id="basq">
        <h2 class="w3-wide">Basquetebol</h1>
            <p class="w3-opacity"><i></i></p>
            <p class="w3-justify">Esses são alguns desse departamento:</p><div class="w3-row w3-padding-32">
                <div class="w3-third">
                    <p><a href="https://www.google.com.br/?gws_rd=ssl"target="_blank">Tenis</a></p>
                    <img src="imagens/tenisb.jpg" class="w3-round w3-margin-bottom" alt="Random Name" style="width:70%">
                </div>
                <div class="w3-third">
                    <p><a href="https://www.google.com.br/?gws_rd=ssl"target="_blank">Equipamentos</a></p>
                    <img src="imagens/bone.jpg" class="w3-round w3-margin-bottom" alt="Random Name" style="width:70%">
                </div>
                <div class="w3-third">
                    <p><a href="https://www.google.com.br/?gws_rd=ssl"target="_blank">Bolas</a></p>
                    <img src="imagens/bolab.jpg" class="w3-round" alt="Random Name" style="width:70%">
                </div>
            </div>
    </div>


    <!-- Seção de Produtos em Alta -->
    <div class="w3-black" id="emalta">
        <div class="w3-container w3-center w3-content w3-padding-64" style="max-width" id="alta">
            <h2 class="w3-wide">Em Alta!</h1>
                <p class="w3-opacity w3-center"><i>SE LIGA NESSES PRODUTOS !</i></p><br>

                <div class="w3-row-padding w3-padding-32" style="margin:0 -16px">
                    <div class="w3-third w3-margin-bottom">
                        <img src="imagens/mercurial.jpg" alt="chuteira" style="width:100%" class="w3-hover-opacity">
                        <div class="w3-container w3-white">
                            <p><b>Mercurial</b></p>          
                            <p>MODELO CAMPO</p>
                            <button class="w3-button w3-black w3-margin-bottom" onclick="document.getElementById('ticketModal').style.display = 'block'">COMPRAR JÁ</button>
                        </div>
                    </div>
                    <div class="w3-third w3-margin-bottom">
                        <img src="imagens/joelheira2.jpg" alt="joelheira" style="width:100%" class="w3-hover-opacity">
                        <div class="w3-container w3-white">
                            <p><b>ESPECIAIS</b></p>            
                            <p>BOA DURABILIDADE</p>
                            <button class="w3-button w3-black w3-margin-bottom" onclick="document.getElementById('ticketModal').style.display = 'block'">COMPRAR JÁ</button>
                        </div>
                    </div>
                    <div class="w3-third w3-margin-bottom">
                        <img src="imagens/bolab.jpg" alt="bola" style="width:100%" class="w3-hover-opacity">
                        <div class="w3-container w3-white">
                            <p><b>Spalding</b></p>
                            <p>BOLA OFICIAL DA NBA</p>
                            <button class="w3-button w3-black w3-margin-bottom" onclick="document.getElementById('ticketModal').style.display = 'block'">COMPRAR JÁ</button>
                        </div>
                    </div>
                </div>
        </div>
    </div>

    <!-- Seção de Compra Rápida -->
    <div id="ticketModal" class="w3-modal">
        <div class="w3-modal-content w3-animate-top w3-card-4">
            <header class="w3-container w3-teal w3-center w3-padding-32"> 
                <span onclick="document.getElementById('ticketModal').style.display = 'none'" 
                      class="w3-button w3-teal w3-xlarge w3-display-topright">X</span>
                <h2 class="w3-wide"><i class="fa fa-suitcase w3-margin-right"></i>Confirmação</h2>
            </header>
            <div class="w3-container">
                <p><label><i class="fa fa-shopping-cart"></i> Quantidade</label></p>
                <input class="w3-input w3-border" type="text" placeholder="Quantos Pares?">
                <p><label><i class="fa fa-user"></i> Enviar para</label></p>
                <input class="w3-input w3-border" type="text" placeholder="Email">
                <button class="w3-button w3-block w3-teal w3-padding-16 w3-section w3-right">COMPRAR <i class="fa fa-check"></i></button>
                <button class="w3-button w3-red w3-section" onclick="document.getElementById('ticketModal').style.display = 'none'">Cancelar <i class="fa fa-remove"></i></button>
                <p class="w3-right">Precisa de <a href="#" class="w3-text-blue">Ajuda?</a></p>
            </div>
        </div>
    </div>

    <!-- Seção de Contatos -->
    <div class="w3-container w3-content w3-padding-64 style"max-width:800px id="contato">
        <h2 class="w3-wide w3-center">Contato</h2>
        <p class="w3-opacity w3-center"><i>Deixe seu feedback</i></p>
        <div class="w3-row w3-padding-32">
            <div class="w3-col m6 w3-large w3-margin-bottom">
                <i class="fa fa-map-marker" style="width:30px"></i> Blumenau,SC (BR)<br>
                <i class="fa fa-phone" style="width:30px"></i> Telefone: +55 (047)99280-1204<br>
                <i class="fa fa-phone" style="width:30px"></i> Telefone: +55 (047)98462-8135<br>
                <i class="fa fa-envelope" style="width:30px"> </i> Email: leobossgomes@gmail.com<br>       
                <i class="fa fa-envelope" style="width:30px"> </i> Email: flasuski@gmail.com<br>
            </div>
            <div class="w3-col m6">
                <form action="/action_page.php" target="_blank">
                    <div class="w3-row-padding" style="margin:0 -16px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Nome" required name="Nome">
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Email" required name="Email">
                        </div>
                    </div>
                    <input class="w3-input w3-border" type="text" placeholder="Mensagem" required name="Mensagem">

                    <button  class="w3-button w3-black w3-section w3-right" type="submit" value="confirmacaomsg.html">Enviar</button>

                </form>
            </div>
        </div>
    </div>



    <!-- Mapa de localização -->
</div>

<CENTER><iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3558.631585022754!2d-49.13569498491042!3d-26.883443783140166!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x37e3f4a354ae9b76!2sInstituto+Federal+Catarinense+-+Campus+Blumenau!5e0!3m2!1spt-BR!2sbr!4v1491933440043" width="75%" height="100%" frameborder="0" style="height:500px" margin-top="10px" allowfullscreen></iframe></CENTER>


<!-- Rodapé -->
<footer class="w3-container w3-padding-64 w3-center w3-opacity w3-light-grey w3-xlarge">
    <i class="fa fa-facebook-official w3-hover-text-indigo"></i>
    <i class="fa fa-instagram w3-hover-text-purple"></i>
    <i class="fa fa-snapchat w3-hover-text-yellow"></i>
    <i class="fa fa-pinterest-p w3-hover-text-red"></i>
    <i class="fa fa-twitter w3-hover-text-light-blue"></i>
    <i class="fa fa-linkedin w3-hover-text-indigo"></i>
    <p class="w3-medium">Feito por: Leonardo Boss e José Suski</a></p>


    <!-- Seção de Login -->
    <%if ((administradorLogado != null) && (administradorLogado == true)) {
        } else {
    %>
    <div class="w3-container w3-content w3-padding-64 " style="max-width:800px" id="login">
        <h2 class="w3-wide ">Login</h2>
        <p class="w3-opacity "><i>Faça seu login aqui!</i></p>
        <div class="w3-row w3-padding-32 ">
            <div class="w3-col m6 ">
                <form action="controlador">
                    <input type="hidden" name="operacao" value="loginAdmin">
                    <div class="w3-row-padding " style="margin:0 -16px 8px -16px">
                        <div class="w3-half ">
                            <input class="w3-input w3-border w3-left" type="text" placeholder="Usuario" required name="usuario">
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border w3-right " type="password" placeholder="Senha" required name="senha">
                            <button  class="w3-button w3-black w3-section w3-center " type="submit" value="Login">Enviar</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <%}%>    
</footer>
<script>
    // Troca de Slides
    var myIndex = 0;
    carousel();

    function carousel() {
        var i;
        var x = document.getElementsByClassName("mySlides");
        for (i = 0; i < x.length; i++) {
            x[i].style.display = "none";
        }
        myIndex++;
        if (myIndex > x.length) {
            myIndex = 1;
        }
        x[myIndex - 1].style.display = "block";
        setTimeout(carousel, 4000);
    }

    // Used to toggle the menu on small screens when clicking on the menu button
    function myFunction() {
        var x = document.getElementById("navDemo");
        if (x.className.indexOf("w3-show") === -1) {
            x.className += " w3-show";
        } else {
            x.className = x.className.replace(" w3-show", "");
        }
    }

    // When the user clicks anywhere outside of the modal, close it
    var modal = document.getElementById('ticketModal');
    window.onclick = function (event) {
        if (event.target === modal) {
            modal.style.display = "none";
        }
    };

</script>

</body>
</html>
