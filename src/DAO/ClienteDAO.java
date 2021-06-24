/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.List;
import model.Animal;
import model.Cliente;
import model.Passeador;
import model.Passeio;

/**
 *
 * @author MrMojoBr
 */
public class ClienteDAO extends ConnectionDAO{
    
    PreparedStatement stman = null;
    ResultSet result = null;
    
    public int buscaIdCliente(String email, String psw) {
        //busca no banco de dados o id do correntista
        String sql = "select * from Cliente where email = ? AND senha = ?;";
        int id = 0;
        try {
            getCon();
            stman = con.prepareStatement(sql);
            stman.setString(1, email);
            stman.setString(2, psw);
            result = stman.executeQuery();
            result.first();
            id = result.getInt("id_cliente");
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
        String sql = "select * from Cliente where email = ?;";
        int id = 0;
        try {
            getCon();
            stman = con.prepareStatement(sql);
            stman.setString(1, mail);
            result = stman.executeQuery();
            result.first();
            id = result.getInt("id_cliente");
            
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
    
    public Cliente buscaCliente(int idCliente){
        String sql = "select * from Cliente where id_cliente = ?;";
        Cliente cliente = new Cliente();
        try {
            
            getCon();
            stman = con.prepareStatement(sql);
            stman.setLong(1, idCliente);
            result = stman.executeQuery();
            result.first();
            
            cliente.setId_cliente(result.getInt("id_cliente"));
            cliente.setNome(result.getString("nome"));
            cliente.setSexo(result.getString("sexo"));
            cliente.setCpf(result.getString("cpf"));
            cliente.setCelular(result.getString("celular"));
            cliente.setEndereco(result.getString("endereco"));
            //cliente.setPsw(result.getString("senha"));
            cliente.setEmail(result.getString("email"));
            
            result.close();
            stman.close(); 
        } catch (SQLException e){
            System.err.println("Erro!" + e.toString());
        } finally {
            closeCon();
        }
        return cliente;
    }
    
    public boolean cadastraCliente(Cliente cliente){
        String sql = "insert into Cliente(nome, sexo, cpf, celular, endereco, senha, email) values(?, ?, ?, ?, ?, ?, ?);";
        try{
            getCon();
            stman = con.prepareStatement(sql);
            
            stman.setString(1, cliente.getNome());
            stman.setString(2, cliente.getSexo());
            stman.setString(3, cliente.getCpf());
            stman.setString(4, cliente.getCelular());
            stman.setString(5, cliente.getEndereco());
            stman.setString(6, cliente.getPsw());
            stman.setString(7, cliente.getEmail());
            
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
    
    public boolean cadastraAnimal(Animal animal, int idCliente){
        String sql = "insert into animal(id_cliente, nome_animal, porte, sexo, data_nascimento, idade, observacao, raca) values(?, ?, ?, ?, ?, ?, ?, ?);";
 


        LocalDate data = LocalDate.parse(animal.getData_nascimento());
        Date date = Date.valueOf(data);
        try{            
            getCon();
            stman = con.prepareStatement(sql);
            
            stman.setInt(1, idCliente);
            stman.setString(2, animal.getNome());
            stman.setString(3, animal.getPorte());
            stman.setString(4, animal.getSexo());
            stman.setDate(5, date);
            stman.setInt(6, animal.getIdade());
            stman.setString(7, animal.getObservacao());
            stman.setString(8, animal.getRaca());
            
            
            
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
    
    public List<Animal> buscaAnimais(int idCliente){
        List<Animal> animais = new ArrayList<>();
        String sql = "select * from Animal where id_cliente = ? and data_obito is null order by id_animal asc;";
        try{
            getCon();
            stman = con.prepareStatement(sql);
            stman.setLong(1, idCliente);
            result = stman.executeQuery();
            result.first();
            do{
                Animal animal = new Animal();
                
                animal.setId_animal(result.getInt("id_animal"));
                animal.setNome(result.getString("nome_animal"));
                animal.setPorte(result.getString("porte"));
                animal.setSexo(result.getString("sexo"));
                animal.setData_nascimento(result.getDate("data_nascimento").toString());
                animal.setIdade(result.getInt("idade"));
                animal.setObservacao(result.getString("observacao"));
                animal.setRaca(result.getString("raca"));
                
                animais.add(animal);
            }while(result.next());
                
            stman.execute();
            
            stman.close();
            result.close();
            
            
        }catch(SQLException e){
            System.err.println("Erro!" + e.toString());
        } finally {
            closeCon();
        }
        return animais;
    }
    
    public Animal buscaAnimal(int id_cliente, int id_animal){
        String sql = "select * from Animal where id_cliente = ? and id_animal = ?;";
        Animal animal = new Animal();
        try {
            
            getCon();
            stman = con.prepareStatement(sql);
            stman.setLong(1, id_cliente);
            stman.setLong(2, id_animal);
            result = stman.executeQuery();
            result.first();
         
            animal.setId_animal(result.getInt("id_animal"));
            animal.setNome(result.getString("nome_animal"));
            animal.setPorte(result.getString("porte"));
            animal.setSexo(result.getString("sexo"));
            animal.setIdade(result.getInt("idade"));
            animal.setObservacao(result.getString("observacao"));
            animal.setRaca(result.getString("raca"));
            
            result.close();
            stman.close(); 
        } catch (SQLException e){
            System.err.println("Erro!" + e.toString());
        } finally {
            closeCon();
        }
        return animal;
    }
    
    
    public boolean obitoPet(Cliente cliente, Animal animal){
        
        String sql = "update animal set data_obito = ? where id_animal = ? and id_cliente = ?;";
        
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(animal.getData_obito());
        Date date = Date.valueOf(data);
        try{
            getCon();
            stman = con.prepareStatement(sql);
            
            stman.setDate(1, date);
            stman.setInt(2, animal.getId_animal());
            stman.setInt(3, cliente.getId_cliente());
            
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
    
}
