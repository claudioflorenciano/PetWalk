/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author MrMojoBr
 */
public class Passeio {
    
    private int idPasseio;
    private Cliente cliente;
    private Animal animal;
    private Passeador passeador;
    private int duracaoPasseio;
    private float precoPasseio;
    private LocalDateTime agendamentoPasseio;
    private float avaliacao;
    private boolean status;

    
    public Passeio(Cliente cliente, Animal animal, Passeador passeador) {
        this.cliente = cliente;
        this.animal = animal;
        this.passeador = passeador;
    }
        
    
    public int getIdPasseio() {
        return idPasseio;
    }

    public void setIdPasseio(int idPasseio) {
        this.idPasseio = idPasseio;
    }
    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Passeador getPasseador() {
        return passeador;
    }

    public void setPasseador(Passeador passeador) {
        this.passeador = passeador;
    }

    public int getDuracaoPasseio() {
        return duracaoPasseio;
    }

    public void setDuracaoPasseio(int duracaoPasseio) {
        this.duracaoPasseio = duracaoPasseio;
    }
    
    public float getPrecoPasseio(){
        return  precoPasseio;
    }
    
    public void setPrecoPasseio(float precoPasseio){
        this.precoPasseio = precoPasseio;
    }

    public LocalDateTime getAgendamentoPasseio() {
        return agendamentoPasseio;
    }

    public void setAgendamentoPasseio(LocalDateTime agendamentoPasseio) {
        this.agendamentoPasseio = agendamentoPasseio;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }
    
}
