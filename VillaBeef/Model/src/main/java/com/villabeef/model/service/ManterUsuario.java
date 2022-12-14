/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.villabeef.model.service;

import com.villabeef.common.FuncionarioInexistenteException;
import com.villabeef.model.dao.EquipeDAO;
import com.villabeef.model.dao.UsuarioDAO;
import com.villabeef.model.dto.Funcionario;
import com.villabeef.model.dto.Usuario;
import java.sql.SQLException;


public class ManterUsuario {
    private ManterUsuario() {} 
    
    public static boolean login(String login, String senha) throws ClassNotFoundException, SQLException {
        Funcionario funcionario = ManterFuncionario.obterPorId(login);
        
        Usuario usuario = new Usuario(login, senha, funcionario);
        
        return UsuarioDAO.login(usuario);
    }
    
    public static void cadastrar(String login, String senha) throws ClassNotFoundException, SQLException, FuncionarioInexistenteException {
        if(EquipeDAO.obterPorId(login) == null)
            throw new FuncionarioInexistenteException("O funcionário deve ser registrado antes de possuir acesso ao sistema.");
        
        Usuario usuario = new Usuario(login, senha, null);
        
        UsuarioDAO.cadastrar(usuario);
    }
    
    public static boolean existeUsuario(String login) throws ClassNotFoundException, SQLException {
        return UsuarioDAO.existeUsuario(login);
    }
    
    public static void excluir(String login) throws ClassNotFoundException, SQLException {
        UsuarioDAO.excluir(login);
    }
}
