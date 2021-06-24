/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author MrMojoBr
 */
public class ConnectionDAO {
    
    private String hostname;
    private int port;
    private String db;
    private String user;
    private String pass;
    
    Connection con;
    
    public ConnectionDAO(){
        //efetua a conexao com o banco de dados
        try{
            hostname = "localhost";
            port = 3306;
            db = "PetWalk_db";
            user = "root";
            pass = "usbw";
            
            String url = "jdbc:mysql://"+hostname+":"+port+"/"+db;
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            con = DriverManager.getConnection(url, user, pass);
        }catch(SQLException ex){
            System.err.println("Erro na Conexao!" + ex.getMessage());
        }catch(Exception ex){
            System.err.println("Erro!" + ex.getMessage());
        }
    }
    
    public Connection getCon(){
        //abre a conexao com o banco de dados
        return this.con;
    }
    
    public void closeCon(){
        //fecha a conexao com o banco de dados
        try{
            con.close();
        }catch(SQLException ex){
            System.err.println("Erro ao Desconectar!" + ex.getMessage());
        }
    }
}
