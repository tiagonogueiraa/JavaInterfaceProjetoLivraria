/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class Venda {

    private static int numero;
    private Cliente cliente;
    private List<Item> lista;
    private float valorTotal;
    private Date data;

    public Venda() {
        //toda vez que criar uma venda, instanciar a lista de venda
        lista = new ArrayList<Item>();
        numero++;
        data = new Date();

    }

    public void adicionarItem(Item item) {
        lista.add(item);

    }

    public Item buscarItem(int codigo) {

        Item it = null;

        for (Item i : lista) {
            if (codigo == i.getLivro().getCodigo()) {
                it = i;
            }
        }

        return it;
    }

    public void removeItem(int codigo) {
        Item i = buscarItem(codigo);
        if (i != null) {
            lista.remove(i);
        }
    }

    public void calcularTotal() {
        float soma = 0;
        for (Item i : lista) {
            soma += i.getValorItem();
        }
        this.valorTotal = soma;
    }

    @Override
    public String toString() {
        String str = "";
        str += "------- DADO DA VENDA N° " + numero + " ----------";
        str += "\nData Venda: " + getData();
        str += "\nCPF do Cliente: " + cliente.getNome();
        str += "\nNome do cliente: " + cliente.getNome();
        for (Item i : lista) {
            //pegando cada tostring que tem dos meus itens
            str += i.toString();
        }
        str +=  "\nValor Total = R$" + valorTotal;
        
        return str;

    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Venda.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    //vai retorna uma string e não um date
    public String getData() {
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyy");
        //para converter data em posix em string
        return fm.format(data);

    }

    //não tem setData pois não tem possibilidade de usuario colocar uma dat
}
