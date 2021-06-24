/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.PasseioDAO;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Passeador;
import model.Passeio;

/**
 *
 * @author MrMojoBr
 */
public class CtrlPasseio {
    
    public List<Passeio> pesquisaPasseio(Cliente cliente){
        
        PasseioDAO passeioDAO = new PasseioDAO();
        return passeioDAO.buscaPasseios(cliente);
    }
    
    public List<Passeio> pesquisaPasseio(Passeador passeador){
        
        PasseioDAO passeioDAO = new PasseioDAO();
        return passeioDAO.buscaPasseios(passeador);
    }
    
    public boolean cadastraPasseio(Passeio passeio){
        PasseioDAO passeioDAO = new PasseioDAO();
        return passeioDAO.cadastraPasseio(passeio);
    }
    
    public float avaliacaoPasseador(int idPasseador){
        
        PasseioDAO passeioDAO = new PasseioDAO();
        return passeioDAO.avaliaPasseador(idPasseador);
    }
        
    public boolean avaliaPasseio(Passeio passeio){
        
        PasseioDAO passeioDAO = new PasseioDAO();
        return passeioDAO.avaliaPasseio(passeio);
    }
    
    public boolean atualizaAvaliacao(int idPasseador, float nota){
        
       PasseioDAO passeioDAO = new PasseioDAO();
       return passeioDAO.atualizaAvaliacao(idPasseador, nota);
    }
    
    public boolean avaliacao(Passeio passeio){
       
        if(avaliaPasseio(passeio)){
            float nota = avaliacaoPasseador(passeio.getPasseador().getId_passeador());
            if(atualizaAvaliacao(passeio.getPasseador().getId_passeador(), nota)){
                return true;
            }
        }
        return false;
    }
    
}
