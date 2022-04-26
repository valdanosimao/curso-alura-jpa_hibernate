package br.com.alura.loja.dao;

import br.com.alura.loja.entidades.Categoria;
import br.com.alura.loja.entidades.Produto;

import javax.persistence.EntityManager;

public class CategoriaDao {

    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria categoria){
        this.em.persist(categoria);
    }

    public void atualizar (Categoria categoria){
        this.em.merge(categoria);
    }

    public void remover (Categoria categoria){
        this.em.remove(categoria);
    }

    public Produto buscarPorId(Long id){
        return em.find(Produto.class, id);
    }

}
