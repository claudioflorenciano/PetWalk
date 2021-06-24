/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.InputMismatchException;
import model.Animal;
import model.Cliente;
import model.Passeador;

/**
 *
 * @author MrMojoBr
 */
public class Valida {
    public static boolean isCPF(String CPF) {
// considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
// converte o i-esimo caractere do CPF em um numero:
// por exemplo, transforma o caractere '0' no inteiro 0         
// (48 eh a posicao de '0' na tabela ASCII)         
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
// Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

// Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    public static String imprimeCPF(String CPF) {
        return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "."
                + CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }
    
    public String retornaCPF(String CPF){
        CPF = CPF.replaceAll("\\.", "");
        CPF = CPF.replaceAll("-", "");
        
        return CPF;
    }
    
    public static boolean verificaNota(String nota){
        
        try{
            Integer n = Integer.parseInt(nota);
            return true;
        }catch(Exception e){
            return false;
        }

    }
    
    public String validaCliente(Cliente cliente) {
        String erros = "";
        if (cliente.getNome().isEmpty()) {
            erros += "Nome em branco.\n";
        }

        if (cliente.getEmail().isEmpty()) {
            erros += "E-mail em branco.\n";
        } else if (cliente.getEmail().indexOf(".") < 1
                || !cliente.getEmail().contains("@")
                || cliente.getEmail().length() < 5) {
            erros += "E-mail invalido.\n";
        }
        
        if (cliente.getPsw().isEmpty()) {
            erros += "Senha em branco.\n";
        } else if (cliente.getPsw().length() < 5) {
            erros += "Senha muito curta. Minimo de 5 caracteres.\n";
        } 
        
        if (retornaCPF(cliente.getCpf()).isEmpty()) {
            erros += "CPF em branco.\n";
        } else if (retornaCPF(cliente.getCpf()).length() != 11) {
            erros += "CPF com digitos errado.\n";
        } else if (!isCPF(retornaCPF(cliente.getCpf()))) {
            erros += "CPF invalido.\n";
        }
        
        return erros;
    }
    
    public String validaPet(Animal animal) {
        String erros = "";
        LocalDate nascimento = LocalDate.EPOCH;
                
        try{
            nascimento = LocalDate.parse(animal.getData_nascimento());
        }catch(DateTimeParseException e){
            animal.setData_nascimento("");
        }
        
        if(animal.getData_nascimento().isEmpty()){
            erros += "Data inválida.\n";
        }
        if (animal.getNome().isEmpty()) {
            erros += "Nome em branco.\n";
        }
        
        if (animal.getPorte().isEmpty()) {
            erros += "Porte em branco.\n";
        }
        
        if (animal.getRaca().isEmpty()) {
            erros += "Raça em branco.\n";
        }
        
        if(animal.getData_nascimento().equals("")){
            erros += "Data inválida.\n";
        }
        if(nascimento.isAfter(LocalDate.now())){
            erros += "Data inválida.\n";
        }
        if(nascimento.getYear() != (LocalDate.now().getYear() - animal.getIdade())){
            erros += "Data ou idade inválida.\n";
        }

        return erros;
    }
    
    public boolean validaDataObitoPet(String dataNasci, String dataObito){
        LocalDate nascimento = LocalDate.EPOCH;
        LocalDate obito = LocalDate.EPOCH;
        try{
            nascimento = LocalDate.parse(dataNasci);
            obito = LocalDate.parse(dataObito);
        }catch(DateTimeParseException e){
            return false;
        }
        if(obito.isBefore(nascimento)){
            return false;
        }else if(obito.isAfter(LocalDate.now())){
            return false;
        }
        return true;
    }
    
    public String validaLogin(String email, String senha) {
        String erros = "";

        if (email.isEmpty()) {
            erros += "E-mail em branco.\n";
        } else if (email.indexOf(".") < 1
                || !email.contains("@")
                || email.length() < 5) {
            erros += "E-mail invalido.\n";
        }
        
        if (senha.isEmpty()) {
            erros += "Senha em branco.\n";
        } 
        
        return erros;
    }
    
    public String validaPasseador(Passeador passeador) {
        String erros = "";
        if (passeador.getNome().isEmpty()) {
            erros += "Nome em branco.\n";
        }

        if (passeador.getEmail().isEmpty()) {
            erros += "E-mail em branco.\n";
        } else if (passeador.getEmail().indexOf(".") < 1
                || !passeador.getEmail().contains("@")
                || passeador.getEmail().length() < 5) {
            erros += "E-mail invalido.\n";
        }
        
        if (passeador.getPsw().isEmpty()) {
            erros += "Senha em branco.\n";
        } else if (passeador.getPsw().length() < 5) {
            erros += "Senha muito curta. Minimo de 5 caracteres.\n";
        } 
        
        if (retornaCPF(passeador.getCpf()).isEmpty()) {
            erros += "CPF em branco.\n";
        } else if (retornaCPF(passeador.getCpf()).length() != 11) {
            erros += "CPF com digitos errado.\n";
        } else if (!isCPF(retornaCPF(passeador.getCpf()))) {
            erros += "CPF invalido.\n";
        }
        
        return erros;
    }
}
