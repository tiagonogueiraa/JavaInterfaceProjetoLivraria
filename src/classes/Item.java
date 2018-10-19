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
public class Item {

    private Livro livro;
    private int quantidade;
    private float valorItem;

    public Item(Livro livro) {
        this.livro = livro;// acho que é pq ele quer criar um livro que já existe
    }

    public Item() {
    }

    public void calcularValorItem() {
        this.valorItem = quantidade * livro.getValorUnitario();

    }

    public String toString() {
        
        String str = "";
        str += "";
        str += "---------Livro de codigo " + livro.getCodigo() + " ------------";
        str += "\nTitulo: " + livro.getTitulo();
        str += "\nEditora: " + livro.getFornecedor();
        str += "\nValor Unitário: " + livro.getValorUnitario();
        str += "\n Quantidade = " + quantidade + " - Valor Item: R$" + valorItem;
        
        return str;
        
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorItem() {
        return valorItem;
    }

    public void setValorItem(float valorItem) {
        this.valorItem = valorItem;
    }
    
    

}
