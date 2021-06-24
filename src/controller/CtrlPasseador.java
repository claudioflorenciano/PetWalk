/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.PasseadorDAO;
import java.util.List;
import model.Passeador;

/**
 *
 * @author MrMojoBr
 */
public class CtrlPasseador {
    
    public int pesquisaId(String email, String psw){
        
        PasseadorDAO passeadorDAO = new PasseadorDAO();
        return passeadorDAO.buscaIdPasseador(email, psw);
    }
    
    public Passeador pesquisaPasseador(int idPasseador){
        
        PasseadorDAO passeadorDAO = new PasseadorDAO();
        return passeadorDAO.buscaPasseador(idPasseador);
    }
    
    public boolean pesquisaEmail(String mail){
        
        PasseadorDAO passeadorDAO = new PasseadorDAO();
        return passeadorDAO.verificaEmail(mail);
    }
    
    public boolean cadastroPasseador(Passeador passeador){
        
        PasseadorDAO passeadorDAO = new PasseadorDAO();
        return passeadorDAO.cadastraPasseador(passeador);
    }
    
    public List<Passeador> buscaProfissionais(){
        
        PasseadorDAO passeadorDAO = new PasseadorDAO();
        return passeadorDAO.buscaPasseadores();
    }
    
    
}
