/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import classes.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class LivroDAO {
    
    //COMO NÃO TEM BANCO, VAI CRIAR UM ATRIBUTO LISTA
    private List<Livro> lista = null;
    
    public LivroDAO() {
        
        lista = new ArrayList<Livro>();
    }
    
    public void adicionarLivro(Livro livro) {
        lista.add(livro);
    }
    
    public void removerLivro (int codigo) {
        
        Livro li = this.buscarLivro
        
    }
    
}
