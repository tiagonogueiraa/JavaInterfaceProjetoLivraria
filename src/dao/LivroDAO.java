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
    
    public Livro buscarLivro(int codigo)
    {
        Livro liv = null;
        for(Livro livro: lista)
        {
            if(livro.getCodigo() == codigo)
                liv = livro;
        }
        
        return liv;
    }
    
    public void removerLivro (int codigo) {
        
        Livro livro = this.buscarLivro(codigo);
        if(livro != null)
        {
            lista.remove(livro);
        }
        
    }
    
    public void alterarLivro(Livro livro)
    {
        if(livro != null)
        {
            int pos = lista.indexOf(livro);
            lista.set(pos, livro);
        }
    }
    
    public List<Livro> todosLivros()
    {
        return lista;
    }
    
    
    
}
