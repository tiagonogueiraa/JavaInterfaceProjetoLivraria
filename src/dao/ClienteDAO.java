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
       lista = new ArrayList<Cliente>();
    }

    public void adicionarCliente(Cliente cliente) {

        lista.add(cliente);

    }

    public void removerCliente(String cpf) {

        Cliente cli = this.buscarCliente(cpf);
        if (cli != null) {

            lista.remove(cli);
        }
    }

    public void alterarCliente(Cliente cliente) {

        Cliente cli = buscarCliente(cliente.getCpf());
        int ind = lista.indexOf(cli);
        lista.set(ind, cliente);
    }

    public Cliente buscarCliente(String cpf) {

        Cliente cli = null;
        for (Cliente cliente : lista) {
            if (cliente.getCpf().equals(cpf)) {
                cli = cliente;

            }
        }

        return cli;
    }

    public List<Cliente> todosClientes() {
        return lista;
    }

}
