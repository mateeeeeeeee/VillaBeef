/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.villabeef.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexaoBD {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://us-cdbr-east-06.cleardb.net:3306/heroku_b695d40b1c0e531";
    private static final String USUARIO = "b4ef7c73d61cc7";
    private static final String SENHA = "c101e0f6";
    
    public static Connection getConexao() throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        
        Class.forName(DRIVER);
        
        conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        
        return conexao;
    }
    
    public static void fecharConexao(Connection conexao, Statement comando) throws SQLException{
        if(comando != null)
            comando.close();
        
        if(conexao != null)
            conexao.close();
    }
    
    public static void fecharConexao(Connection conexao, Statement comando, ResultSet rs) throws SQLException {
        fecharConexao(conexao, comando);
        
        if(rs != null)
            rs.close();
    }
}
