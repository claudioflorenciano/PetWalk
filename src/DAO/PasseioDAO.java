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
import java.sql.Timestamp;
import java.util.List;
import model.Animal;
import model.Cliente;
import model.Passeador;
import model.Passeio;

/**
 *
 * @author MrMojoBr
 */
public class PasseioDAO extends ConnectionDAO{
    
    PreparedStatement stman = null;
    ResultSet result = null;
    
    
    
    public List<Passeio> buscaPasseios(Cliente cliente){
        List<Passeio> passeios = new ArrayList<>();
        String sql = "select * from passeio where id_cliente = ? and status_passeio = 1;";
        try{
            getCon();
            stman = con.prepareStatement(sql);
            stman.setLong(1, cliente.getId_cliente());
            result = stman.executeQuery();
            result.first();
             
            do{
                Cliente cli = new Cliente();
                Passeador pro = new Passeador();
                Animal ani = new Animal();


                cli.setId_cliente(result.getInt("id_cliente"));
                pro.setId_passeador(result.getInt("id_passeador"));
                ani.setId_animal(result.getInt("id_animal"));
                
                Passeio passeio = new Passeio(cli, ani, pro);
                
                passeio.setIdPasseio(result.getInt("id_passeio"));
                passeio.setDuracaoPasseio(result.getInt("duracao_passeio"));
                passeio.setAgendamentoPasseio(result.getTimestamp("agendamento_passeio").toLocalDateTime());
                passeio.setAvaliacao(result.getFloat("avaliacao_passeio"));
                passeio.setPrecoPasseio(result.getFloat("preco_passeio"));

                passeios.add(passeio); 
            }while(result.next());
                
            stman.execute();
            
            stman.close();
            result.close();
            
            
        }catch(SQLException e){
            System.err.println("Erro!" + e.toString());
        } finally {
            closeCon();
        }
        return passeios;
    }
    
    public List<Passeio> buscaPasseios(Passeador passeador){
        List<Passeio> passeios = new ArrayList<>();
        String sql = "select * from passeio where id_passeador = ? and status_passeio = 1";
        try{
            getCon();
            stman = con.prepareStatement(sql);
            stman.setLong(1, passeador.getId_passeador());
            result = stman.executeQuery();
            result.first();
             
            do{
                Cliente cli = new Cliente();
                Passeador pro = new Passeador();
                Animal ani = new Animal();


                cli.setId_cliente(result.getInt("id_cliente"));
                pro.setId_passeador(result.getInt("id_passeador"));
                ani.setId_animal(result.getInt("id_animal"));
                
                Passeio passeio = new Passeio(cli, ani, pro);
                
                passeio.setIdPasseio(result.getInt("id_passeio"));
                passeio.setDuracaoPasseio(result.getInt("duracao_passeio"));
                passeio.setAgendamentoPasseio(result.getTimestamp("agendamento_passeio").toLocalDateTime());
                passeio.setAvaliacao(result.getFloat("avaliacao_passeio"));
                passeio.setPrecoPasseio(result.getFloat("preco_passeio"));

                passeios.add(passeio); 
            }while(result.next());
                
            stman.execute();
            
            stman.close();
            result.close();
            
            
        }catch(SQLException e){
            System.err.println("Erro!" + e.toString());
        } finally {
            closeCon();
        }
        return passeios;
    }
    
    public boolean cadastraPasseio(Passeio passeio){
        String sql = "insert into passeio(id_cliente, id_passeador, id_animal, duracao_passeio, preco_passeio, agendamento_passeio, status_passeio) values(?, ?, ?, ?, ?, ?, ?);";
 

        Timestamp data = Timestamp.valueOf(passeio.getAgendamentoPasseio());
        try{            
            getCon();
            stman = con.prepareStatement(sql);
            
            stman.setInt(1, passeio.getCliente().getId_cliente());
            stman.setInt(2, passeio.getPasseador().getId_passeador());
            stman.setInt(3, passeio.getAnimal().getId_animal());
            stman.setInt(4, passeio.getDuracaoPasseio());
            stman.setFloat(5, passeio.getPrecoPasseio());
            stman.setTimestamp(6, data);
            stman.setBoolean(7, passeio.getStatus());
            
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

    
    public float avaliaPasseador(int idPasseador){
        float nota = 0;
        int cont = 0;
        String sql = "select * from passeio where id_passeador = ? and status_passeio = 0";
        try{
            getCon();
            stman = con.prepareStatement(sql);
            stman.setLong(1, idPasseador);
            result = stman.executeQuery();
            result.first();
             
            do{
                nota += result.getFloat("avaliacao_passeio");
                cont++;
                //result.get
            }while(result.next());
                
            stman.execute();
            
            stman.close();
            result.close();
            
            
        }catch(SQLException e){
            System.err.println("Erro!" + e.toString());
        } finally {
            closeCon();
        }
        return nota/cont;
    }

        
    public boolean avaliaPasseio(Passeio passeio){
        String sql = "update passeio set avaliacao_passeio = ?, status_passeio = 0 where id_passeio = ?;";
 
        try{            
            
            getCon();
            stman = con.prepareStatement(sql);
            
            stman.setFloat(1, passeio.getAvaliacao());
            stman.setInt(2, passeio.getIdPasseio());
            
            
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
    
            
    public boolean atualizaAvaliacao(int idPasseador, float nota){
        
        String sql = "update passeador set avaliacao = ? where id_passeador = ?;";
        try{
            getCon();
            stman = con.prepareStatement(sql);
            stman.setFloat(1, nota);
            stman.setInt(2, idPasseador);
           
            
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
