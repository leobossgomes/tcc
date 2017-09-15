/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dao.UsuarioDAO;

/**
 *
 * @author informatica
 */
public class TestaUsuarioDAO {
 
    public static void main(String[] args) {
        
        UsuarioDAO udao = new UsuarioDAO();
        System.out.println(udao.verificaLogin("jose", "123456"));
    }
    
}
