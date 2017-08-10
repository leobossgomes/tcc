package dao;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import static java.lang.System.out;
import java.util.ArrayList;
import modelo.Produto;

public class ProdutoDAO {

    public ArrayList<Produto> carregaListaDeProduto() {
        ArrayList<Produto> produtos = new ArrayList();
        try {
            //FileInputStream fis = new FileInputStream("F:\\LojaWEB\\produto.xml");
            FileInputStream fis = new FileInputStream("/local/home/informatica/tcc/LojaWEB/produto.xml");
            BufferedInputStream bis = new BufferedInputStream(fis);
            XMLDecoder xmldec = new XMLDecoder(bis);
            produtos = (ArrayList<Produto>) xmldec.readObject();
        } catch (Exception ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }
        return produtos;
    }

    public boolean insereProduto(Produto item) {
        ArrayList<Produto> produtos = carregaListaDeProduto();
        int maior = -1;
        for (Produto produto : produtos) {
            if (produto.getCodigo() > maior) {
                maior = produto.getCodigo();
            }
        }
        item.setCodigo(maior + 1);
        produtos.add(item);
        return salvaListaDeProdutos(produtos);
    }

    public boolean salvaListaDeProdutos(ArrayList<Produto> produtos) {
        try {
            //FileOutputStream fout = new FileOutputStream("F:\\LojaWEB\\produto.xml");
            FileOutputStream fout = new FileOutputStream("/local/home/informatica/tcc/LojaWEB/produto.xml");
            BufferedOutputStream bos = new BufferedOutputStream(fout);
            XMLEncoder xmlenc = new XMLEncoder(bos);
            xmlenc.writeObject(produtos);
            xmlenc.close();
            return true;
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return false;
        }
    }

    public void cadastraProduto(Produto p) {
        insereProduto(p);

    }
    

    public Produto carregaProdutoComId(String id) {        
        ArrayList<Produto> produtos = carregaListaDeProduto();
        int codigo = Integer.parseInt(id);

        for (Produto p : produtos) {

            if (p.getCodigo() == codigo) {
     
                return p;
               
            }
        }
        return null;
    }
    

    public void removeProduto(int codigo) {

        ArrayList<Produto> produtos = carregaListaDeProduto();

        for (Produto p : produtos) {

            if (p.getCodigo() == codigo) {
                // Encontrou uma pessoa cadastrada com nome "Pedro".

                // Remove.
                produtos.remove(p);

                // Sai do loop.
                break;
            }
        }
        salvaListaDeProdutos(produtos);
    }
}
