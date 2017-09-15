package dao;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import static java.lang.System.out;
import java.util.ArrayList;
import modelo.ProdutoDTO;

public class ProdutoDAO {

    public ArrayList<ProdutoDTO> carregaListaDeProduto() {
        ArrayList<ProdutoDTO> produtos = new ArrayList();
        try {
            FileInputStream fis = new FileInputStream("/local/home/informatica/Downloads/LojaWEB/produto.xml");
            //FileInputStream fis = new FileInputStream("/local/home/informatica/tcc/LojaWEB/produto.xml");
            BufferedInputStream bis = new BufferedInputStream(fis);
            XMLDecoder xmldec = new XMLDecoder(bis);
            produtos = (ArrayList<ProdutoDTO>) xmldec.readObject();
        } catch (Exception ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }
        return produtos;
    }

    public boolean insereProduto(ProdutoDTO item) {
        ArrayList<ProdutoDTO> produtos = carregaListaDeProduto();
        int maior = -1;
        for (ProdutoDTO produto : produtos) {
            if (produto.getCodigo() > maior) {
                maior = produto.getCodigo();
            }
        }
        item.setCodigo(maior + 1);
        produtos.add(item);
        return salvaListaDeProdutos(produtos);
    }

    public boolean salvaListaDeProdutos(ArrayList<ProdutoDTO> produtos) {
        try {
            FileOutputStream fout = new FileOutputStream("/local/home/informatica/Downloads/LojaWEB/produto.xml");
            //FileOutputStream fout = new FileOutputStream("/local/home/informatica/tcc/LojaWEB/produto.xml");
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

    public void cadastraProduto(ProdutoDTO p) {
        insereProduto(p);

    }
    

    public ProdutoDTO carregaProdutoComId(String id) {        
        ArrayList<ProdutoDTO> produtos = carregaListaDeProduto();
        int codigo = Integer.parseInt(id);

        for (ProdutoDTO p : produtos) {

            if (p.getCodigo() == codigo) {
     
                return p;
               
            }
        }
        return null;
    }
    

    public void removeProduto(int codigo) {

        ArrayList<ProdutoDTO> produtos = carregaListaDeProduto();

        for (ProdutoDTO p : produtos) {

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
