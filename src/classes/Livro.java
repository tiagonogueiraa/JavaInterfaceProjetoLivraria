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
public class Livro {

    private String codigo;
    private String titulo;
    private String fornecedor;
    private String qtdEstoque;
    private float valorUnitario;
    private String dataPublicacao;

    public Livro() {
    }

    public Livro(String codigo, String titulo, String fornecedor, String qtdEstoque, float valorUnitario, String dataPublicacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fornecedor = fornecedor;
        this.qtdEstoque = qtdEstoque;
        this.valorUnitario = valorUnitario;
        this.dataPublicacao = dataPublicacao;
    }

    public String toSring() {
        String str = "Código Livro: " + codigo;
        str += "\nTitulo livro: " + titulo;
        str += "\nFornecedor: " + fornecedor;
        str += "\nQuantidade em estoque: " + qtdEstoque;
        str += "\nValor Unitário: " + valorUnitario;
        str += "\nData Publicação: " + dataPublicacao;

        return str;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(String qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

}
