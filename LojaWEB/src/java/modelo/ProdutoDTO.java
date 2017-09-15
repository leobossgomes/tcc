package modelo;

public class ProdutoDTO {

    int codigo;
    String nome;
    double preco;
    int qtdestoque;
    String imagem;
    String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ProdutoDTO(int codigo, String nome, Double preco, int quantidade, String imagem, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.qtdestoque = quantidade;
        this.imagem = imagem;
        this.categoria = categoria;
    }

    public ProdutoDTO() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdestoque() {
        return qtdestoque;
    }

    public void setQtdestoque(int Qtdestoque) {
        this.qtdestoque = Qtdestoque;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public static void main(String[] args) {

    }

}
