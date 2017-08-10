package modelo;

public class Promo extends Produto {

    double desconto;  // por exemplo, pra promoção de 10%, desconto = 0.90  

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double getPreco() {
        return desconto * preco;
    }

    public static void main(String[] args) {
        Promo s = new Promo();
        s.setNome("Chuteira");
        s.setPreco(149.99);
        s.setQtdestoque(50);
        s.setDesconto(0.50);

        System.out.println("Produto " + s.getNome() + " em promocao: ");
        System.out.println(s.getPreco());

    }
}
