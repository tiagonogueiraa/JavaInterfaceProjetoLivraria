/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Cliente;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author alunoces
 */
public class ClienteDAO {
    
    //como não tem banco, vai criar um atributo lista
    private List<Cliente> lista = null;
    
    public ClienteDAO() {
        
            //só instanciar se criar objeto cliente
            new ArrayList<Cliente>();
    }

    public void adicionarCliente(Cliente cliente) {
        
        lista.add(cliente);
                
    }
    
    public void removerCliente(String cpf){
        
    }
    
    public void alterarCliente(Cliente cliente){
        
        
    }
    
    public Cliente buscarCliente(String cpf){
        
        return null;
    }

}
