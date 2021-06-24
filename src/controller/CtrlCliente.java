/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ClienteDAO;
import java.util.ArrayList;
import java.util.List;
import model.Animal;
import model.Cliente;
import model.Passeio;

/**
 *
 * @author MrMojoBr
 */
public class CtrlCliente {
    
    public int pesquisaId(String email, String psw){
        
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.buscaIdCliente(email, psw);
    }
    
    public Cliente pesquisaCliente(int idCliente){
        
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.buscaCliente(idCliente);
    }
    
    public boolean cadastroCliente(Cliente cliente){
        
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.cadastraCliente(cliente);
    }
    
    public boolean pesquisaEmail(String mail){
        
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.verificaEmail(mail);
    }
    
    public List<Animal> pesquisaAnimais(int idCliente){
        
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.buscaAnimais(idCliente);
    }
    
    public Animal pesquisaAnimal(int idCliente, int idAnimal){
        
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.buscaAnimal(idCliente, idAnimal);
    }
    
    public boolean cadastroAnimal(Animal animal, int idCliente){
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.cadastraAnimal(animal, idCliente);
    }
    
    public boolean mortePet(Cliente cliente, Animal animal){
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.obitoPet(cliente, animal);
    }
}
