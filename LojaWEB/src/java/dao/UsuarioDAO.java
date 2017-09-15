package dao;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import modelo.ProdutoDTO;

import modelo.UsuarioDTO;

public class UsuarioDAO {

    public ArrayList<UsuarioDTO> carregaListaDeUsuario() {
        ArrayList<UsuarioDTO> usuarios = new ArrayList();
        try {
            FileInputStream fis = new FileInputStream("/local/home/informatica/Downloads/LojaWEB-20170915T130114Z-001/LojaWEB/usuario.xml");
            BufferedInputStream bis = new BufferedInputStream(fis);
            XMLDecoder xmldec = new XMLDecoder(bis);
            usuarios = (ArrayList<UsuarioDTO>) xmldec.readObject();
        } catch (Exception ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }
        return usuarios;
    }

    public boolean insereUsuario(UsuarioDTO item) {
        ArrayList<UsuarioDTO> usuarios = carregaListaDeUsuario();
        int maior = -1;
        for (UsuarioDTO usuario : usuarios) {
            if (usuario.getCodigo() > maior) {
                maior = usuario.getCodigo();
            }
        }
        item.setCodigo(maior + 1);
        usuarios.add(item);
        return salvaListaDeUsuarios(usuarios);
    }

    public boolean salvaListaDeUsuarios(ArrayList<UsuarioDTO> usuarios) {
        try{
            FileOutputStream fout = new FileOutputStream("/local/home/informatica/Downloads/LojaWEB-20170915T130114Z-001/LojaWEB/usuario.xml");
            BufferedOutputStream bos = new BufferedOutputStream(fout);
            XMLEncoder xmlenc = new XMLEncoder(bos);
            xmlenc.writeObject(usuarios);
            xmlenc.close();
            return true;
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return false;
        }
    }

    public void cadastraUsuario(UsuarioDTO u) {
        insereUsuario(u);

    }

    public ProdutoDTO carregaUsuarioComId(String id) {
        ArrayList<UsuarioDTO> usuarios = carregaListaDeUsuario();
        int codigo = Integer.parseInt(id);
        return null;
    }

    public void removeUsuario(int codigo) {

        ArrayList<UsuarioDTO> usuarios = carregaListaDeUsuario();

        for (UsuarioDTO u : usuarios) {
            // Encontrou uma pessoa cadastrada com nome "Pedro".
            // Remove.
            usuarios.remove(u);
            // Sai do loop.
            break;
        }
        salvaListaDeUsuarios(usuarios);
    }

    public boolean verificaLogin(String login, String senha) {

        // percorre todos os usuarios
        ArrayList<UsuarioDTO> usuarios = carregaListaDeUsuario();
        for (UsuarioDTO u : usuarios) {
            // se houver um usuario com login e senha iguais aos fornecidos, returna TRUE
            if ((u.getUsuario().equals(login)) && (u.getSenha().equals(senha))) {
                return true;
            }
        }
        // retorna false (se não retornou true antes, não achou ninguem válido)
        return false;
    }

}
