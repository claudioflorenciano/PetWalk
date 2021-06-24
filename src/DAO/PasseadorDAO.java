/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Passeador;


/**
 *
 * @author MrMojoBr
 */
public class PasseadorDAO extends ConnectionDAO{
    
    PreparedStatement stman = null;
    ResultSet result = null;
    
    public int buscaIdPasseador(String email, String psw) {
        //busca no banco de dados o id do correntista
        String sql = "select * from Passeador where email = ? AND senha = ?;";
        int id = 0;
        try {
            getCon();
            stman = con.prepareStatement(sql);
            stman.setString(1, email);
            stman.setString(2, psw);
            result = stman.executeQuery();
            result.first();
            id = result.getInt("id_passeador");
            result.close();
            stman.close();
        } catch (SQLException e) {
            System.err.println("Erro!" + e.toString());
        } finally {
            closeCon();
        }
        return id;
    }
    
    public boolean verificaEmail(String mail){
        String sql = "select * from passeador where email = ?;";
        int id = 0;
        try {
            getCon();
            stman = con.prepareStatement(sql);
            stman.setString(1, mail);
            result = stman.executeQuery();
            result.first();
            id = result.getInt("id_passeador");
            
            result.close();
            stman.close();
        } catch (SQLException e) {
            System.err.println("Erro!" + e.toString());
        } finally {
            closeCon();
        }
        
        if(id >= 1){
            return false;
        }
        return true;
    }
    
    public Passeador buscaPasseador(int idPasseador){
        String sql = "select * from Passeador where id_passeador = ?;";
        Passeador passeador = new Passeador();
        try {
            
            getCon();
            stman = con.prepareStatement(sql);
            stman.setLong(1, idPasseador);
            result = stman.executeQuery();
            result.first();
            passeador.setId_passeador(result.getInt("id_passeador"));
            passeador.setNome(result.getString("nome"));
            passeador.setSexo(result.getString("sexo"));
            passeador.setCpf(result.getString("cpf"));
            passeador.setAvaliacao(result.getFloat("avaliacao"));
            passeador.setValorHora(result.getDouble("valor_hora"));
            passeador.setEndereco(result.getString("endereco"));
            passeador.setCelular(result.getString("celular"));
            passeador.setEmail(result.getString("email"));
            //passeador.setPsw(result.getString("senha"));
            passeador.setDescricao(result.getString("descricao"));
            
            
            result.close();
            stman.close(); 
        } catch (SQLException e){
            System.err.println("Erro!" + e.toString());
        } finally {
            closeCon();
        }
        return passeador;
    }
    
    public boolean cadastraPasseador(Passeador passeador){
        String sql = "insert into Passeador(nome, sexo, cpf, avaliacao, valor_hora, endereco, celular, email, senha, descricao) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try{
            getCon();
            stman = con.prepareStatement(sql);
            stman.setString(1, passeador.getNome());
            stman.setString(2, passeador.getSexo());
            stman.setString(3, passeador.getCpf());
            stman.setFloat(4, passeador.getAvaliacao());
            stman.setDouble(5, passeador.getValorHora());
            stman.setString(6, passeador.getEndereco());
            stman.setString(7, passeador.getCelular());
            stman.setString(8, passeador.getEmail());
            stman.setString(9, passeador.getPsw());
            stman.setString(10, passeador.getDescricao());
            
            stman.execute();
            
            stman.close();
            
            return true;
        }catch(SQLException e){
            System.err.println("Erro!" + e.toString());
        } finally {
            closeCon();
        }
        return false;
    }
    
    public List<Passeador> buscaPasseadores(){
        List<Passeador> pro = new ArrayList<>();
        String sql = "select * from passeador order by id_passeador asc;";
        try{
            getCon();
            stman = con.prepareStatement(sql);
            result = stman.executeQuery();
            result.first();
            do{
                Passeador passeador = new Passeador();
                

                passeador.setId_passeador(result.getInt("id_passeador"));
                passeador.setNome(result.getString("nome"));
                passeador.setSexo(result.getString("sexo"));
                passeador.setCpf(result.getString("cpf"));
                passeador.setAvaliacao(result.getFloat("avaliacao"));
                passeador.setValorHora(result.getDouble("valor_hora"));
                passeador.setEndereco(result.getString("endereco"));
                passeador.setCelular(result.getString("celular"));
                passeador.setEmail(result.getString("email"));
                passeador.setDescricao(result.getString("descricao"));
                
                pro.add(passeador);
            }while(result.next());
                
            stman.execute();
            
            stman.close();
            result.close();
            
            
        }catch(SQLException e){
            System.err.println("Erro!" + e.toString());
        } finally {
            closeCon();
        }
        return pro;
    }
    
    
    
}
