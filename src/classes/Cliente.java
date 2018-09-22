/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author alunoces
 */
public class Cliente {
    
    private String cpf;
    private String nome;
    private String estadoCivil;
    private String telefone;
    private String email;
    public Endereco endereco;

    public Cliente() {
        endereco = new Endereco();
    }

    public Cliente(String cpf, String nome, String estadoCivil, String telefone, String email, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    @Override
    public String toString(){
        String str = "CPF: " + cpf;
        str += "\nNome: " + nome;
        str += "\nEmail: " + email;
        str += "\nTelefone: " + telefone;
        str += "\nEstado Civil: " + estadoCivil;
        str += "\n---------ENDEREÇO-----------";
        str += "\nLogradouro: " + endereco.getLogradouro();
        str += "\nCidade: " + endereco.getCidade();
        str += "\nEstado: " + endereco.getEstado();
        str += "\nCEP: " + endereco.getCep();
        
        return str;
        
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
}
